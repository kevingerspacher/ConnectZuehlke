package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation;

import ch.zuehlke.fullstack.ConnectZuehlke.common.exceptionHandling.ApplicationException;
import ch.zuehlke.fullstack.ConnectZuehlke.dao.EmployeeRepository;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component.CalculationPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Service for calculating leaver scores for employees.
 */
@Service
public class ScoreCalculationServiceImpl implements ScoreCalculationService {

    private static Logger LOG = LoggerFactory.getLogger(ScoreCalculationServiceImpl.class);

    @Autowired
    private List<CalculationPart> calculationParts;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> calculateEmployees(List<Employee> employees) {
        if (CollectionUtils.isEmpty(employees)) {
            LOG.warn("ScoreCalculationServiceImpl.calculateEmployees called but no employees were passed to calculate!");
            return Collections.emptyList();
        }

        // calculate all given employees
        for (Employee employee : employees) {
            calculateSingleEmployee(employee);
        }

        // save employees with calculations in db
        employeeRepository.saveAll(employees);

        return employees;
    }

    /**
     * Calculate a single employee score by calling all calculation parts
     * and then calculating the final score by summing up the part scores.
     * Does not persist to db.
     *
     * @param employee {@link Employee} to calculate
     */
    private void calculateSingleEmployee(final Employee employee) {

        try {
            // calculate score using calculationParts
            BigDecimal leaverScore;
            int maxScorePossible = 0;
            List<Future<BigDecimal>> calculationResults = new ArrayList<>();

            for (CalculationPart part : calculationParts) {

                // get the maximum score from the part
                maxScorePossible += part.getMaxPossibleScore();

                // get the score for the employee from the part
                calculationResults.add(part.calculate(employee));
            }

            leaverScore = calculationResults.parallelStream()
                    .map(result -> {
                        try {
                            return result.get(1, TimeUnit.MINUTES);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return BigDecimal.ZERO;
                        }
                    })
                    .reduce(BigDecimal::add)
                    .orElse(BigDecimal.ZERO);

            // validate: is the score higher than the maximum?
            if (leaverScore.compareTo(new BigDecimal(maxScorePossible)) > 0) {
                throw new ApplicationException("Score returned from CalculationPart is higher than the specified maximum score!");
            }

            employee.setLeaverScore(leaverScore);
            employee.setLeavingPropability(calcLeavingProbability(leaverScore, maxScorePossible));

        } catch (ApplicationException e) {
            LOG.error("Error while calculating employee: ", employee);
            LOG.error(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LOG.error("This will never happen!", e);
        }

    }

    /**
     * Calculate the probability for a leave
     *
     * @param leaverScore      added leaver score from all parts for this employee
     * @param maxScorePossible max possible score from all parts
     * @return the propability, rounded to two decimals
     */
    private BigDecimal calcLeavingProbability(BigDecimal leaverScore, int maxScorePossible) {
        return leaverScore.divide(new BigDecimal(maxScorePossible), 2, RoundingMode.HALF_UP);
    }

}
