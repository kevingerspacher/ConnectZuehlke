package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.scheduling.annotation.Async;

import java.math.BigDecimal;
import java.util.concurrent.Future;

public interface CalculationPart {

    @Async
    Future<BigDecimal> calculate(Employee employee);

    int getMaxPossibleScore();

}
