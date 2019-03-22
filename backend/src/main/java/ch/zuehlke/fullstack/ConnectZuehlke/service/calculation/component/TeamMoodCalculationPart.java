package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class TeamMoodCalculationPart implements CalculationPart {

    @Autowired
    private ProjectService projectService;

    @Override
    public BigDecimal calculate(Employee employee) {

        List<Project> currentProjects = projectService.getCurrentProjectsOfEmployee(employee.getCode());
        Integer totalMood = 0;
        for (Project p : currentProjects) {
            Integer mood = p.getMood();
            totalMood = totalMood + mood;
        }

        if (currentProjects.size() == 0) {
            // avoid division by zero
            employee.setTeamMoodScore(BigDecimal.ZERO);
            return employee.getTeamMoodScore();
        }

        BigDecimal score = new BigDecimal(totalMood)
                .divide(new BigDecimal(currentProjects.size()), 2, RoundingMode.HALF_UP);

        employee.setTeamMoodScore(score);
        return score;
    }

    @Override
    public int getMaxPossibleScore() {
        return 1;
    }
}
