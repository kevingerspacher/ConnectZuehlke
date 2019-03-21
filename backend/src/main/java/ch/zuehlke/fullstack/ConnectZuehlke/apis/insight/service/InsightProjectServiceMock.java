package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Profile({"ci", "default"})
public class InsightProjectServiceMock implements InsightProjectService {
    public static final List<Employee> EMPLOYEES = asList(
            new Employee("Klaus", "Mustermann", 1, "kmu"),
            new Employee("Magda", "Müller", 2, "mmu"),
            new Employee("Kurt", "Peters", 3, "kpe")
    );

    @Override
    public List<Employee> getCoworkers(String employeeCode) {
        return EMPLOYEES.stream().filter(employee -> employee.getCode().equals(employeeCode)).collect(Collectors.toList());
    }
}
