package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.math.BigDecimal;

public interface CalculationPart {

    BigDecimal calculate(Employee employee);

    int getMaxPossibleScore();

}
