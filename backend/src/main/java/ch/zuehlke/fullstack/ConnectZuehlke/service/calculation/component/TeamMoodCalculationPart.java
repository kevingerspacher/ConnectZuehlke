package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.Future;

@Component
public class TeamMoodCalculationPart implements CalculationPart {
    private static Logger LOG = LoggerFactory.getLogger(TeamMoodCalculationPart.class);

    @Autowired
    private ProjectService projectService;

    @Override
    public Future<BigDecimal> calculate(Employee employee) {
        LOG.info("calculating team mood score");

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
        return new AsyncResult<>(score);
    }

    @Override
    public int getMaxPossibleScore() {
        return 1;
    }
}
