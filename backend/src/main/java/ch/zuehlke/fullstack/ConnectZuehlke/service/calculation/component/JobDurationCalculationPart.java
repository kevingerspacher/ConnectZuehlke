package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class JobDurationCalculationPart implements CalculationPart {

    @Override
    public BigDecimal calculate(Employee employee) {
        // TODO calculate scores and set in employee object
        BigDecimal score = BigDecimal.ZERO;

        employee.setJobDurationScore(score);
        return score;
    }

    @Override
    public int getMaxPossibleScore() {
        return 1;
    }
}
