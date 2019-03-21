package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.component;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

public interface CalculationPart {

    int calculate(Employee employee);

    int getMaxPossibleScore();

}
