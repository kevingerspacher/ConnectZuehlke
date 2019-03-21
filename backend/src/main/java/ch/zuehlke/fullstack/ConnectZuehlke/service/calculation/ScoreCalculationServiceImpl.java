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
import java.util.List;

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
    public void calculateEmployees(List<Employee> employees) {
        if (CollectionUtils.isEmpty(employees)) {
            LOG.warn("ScoreCalculationServiceImpl.calculateEmployees called but no employees were passed to calculate!");
            return;
        }

        // calculate all given employees
        for (Employee employee : employees) {
            calculateSingleEmployee(employee);
        }

        // save employees with calculations in db
        employeeRepository.saveAll(employees);
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
            int leaverScore = 0;
            int maxScorePossible = 0;
            for (CalculationPart part : calculationParts) {

                // get the maximum score from the part
                int maxPossibleScore = part.getMaxPossibleScore();

                // get the score for the employee from the part
                int partScore = part.calculate(employee);

                // validate: is the score higher than the maximum?
                if (partScore > maxPossibleScore) {
                    throw new ApplicationException("Score returned from CalculationPart is higher than the specified maximum score!");
                }

                // increase the leaver score of the employee
                leaverScore = leaverScore + partScore;

                // increase the maximum score possible from all parts
                maxScorePossible = maxScorePossible + maxPossibleScore;
            }

            employee.setLeaverScore(leaverScore);
            employee.setLeavingPropability(calcLeavingProbability(leaverScore, maxScorePossible));

        } catch (Exception e) {
            LOG.error("Error while calculating employee: ", employee);
            LOG.error(e.getMessage(), e);

            if (e instanceof ApplicationException) {
                // re-throw ApplicationExceptions, as these indicate a algorithm implementation error and must break the
                // overall calculation
                throw e;
            }
        }

    }

    /**
     * Calculate the probability for a leave
     *
     * @param leaverScore      added leaver score from all parts for this employee
     * @param maxScorePossible max possible score from all parts
     * @return the propability, rounded to two decimals
     */
    private BigDecimal calcLeavingProbability(int leaverScore, int maxScorePossible) {
        return new BigDecimal(leaverScore).divide(new BigDecimal(maxScorePossible), RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);
    }

}