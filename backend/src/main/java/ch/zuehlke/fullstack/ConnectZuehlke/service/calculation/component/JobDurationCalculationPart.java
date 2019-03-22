package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.Future;

@Component
public class JobDurationCalculationPart implements CalculationPart {
    private static Logger LOG = LoggerFactory.getLogger(JobDurationCalculationPart.class);

    @Override
    public Future<BigDecimal> calculate(Employee employee) {
        LOG.info("calculating job duration score");
        // TODO calculate scores and set in employee object
        BigDecimal score = BigDecimal.ZERO;

        employee.setJobDurationScore(score);
        return new AsyncResult<>(score);
    }

    @Override
    public int getMaxPossibleScore() {
        return 0;
    }
}
