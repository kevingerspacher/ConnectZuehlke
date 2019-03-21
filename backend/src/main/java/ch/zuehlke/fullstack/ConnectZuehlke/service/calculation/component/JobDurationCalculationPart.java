package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class JobDurationCalculationPart implements CalculationPart {

    @Override
    public int calculate(Employee employee) {
        // TODO calculate scores and set in employee object
        int score = 1;

        employee.setJobDurationScore(score);
        return score;
    }

    @Override
    public int getMaxPossibleScore() {
        return 1;
    }
}
