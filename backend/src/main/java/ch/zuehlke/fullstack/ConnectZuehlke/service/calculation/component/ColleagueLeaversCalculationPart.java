package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightCoworkerService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class ColleagueLeaversCalculationPart implements CalculationPart {

    private static final int MAX_SCORE = 2;
    // leavers are more important than other factors
    private static final BigDecimal WEIGHT = new BigDecimal(2);

    @Autowired
    private InsightCoworkerService coworkerService;

    @Override
    public BigDecimal calculate(Employee employee) {
        List<Employee> coworkers = coworkerService.getCoworkers(employee.getCode());
        List<Employee> leavers = coworkerService.getLeavers(coworkers);

        if (coworkers.size() == 0) {
            // avoid division by zero
            employee.setColleagueLeaversScore(BigDecimal.ZERO);
            return employee.getColleagueLeaversScore();
        }

        BigDecimal score = new BigDecimal(leavers.size())
                .divide(new BigDecimal(coworkers.size()), 2, RoundingMode.HALF_UP)
                .multiply(WEIGHT);
        employee.setColleagueLeaversScore(score);

        return employee.getColleagueLeaversScore();
    }

    @Override
    public int getMaxPossibleScore() {
        return MAX_SCORE;
    }
}
