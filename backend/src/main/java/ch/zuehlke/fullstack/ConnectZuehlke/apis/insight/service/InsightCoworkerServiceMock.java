package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Profile({"ci", "default"})
public class InsightCoworkerServiceMock implements InsightCoworkerService {
    public static final List<Employee> EMPLOYEES = asList(
            new Employee("Klaus", "Mustermann", 1, "kmu", false),
            new Employee("Magda", "Müller", 2, "mmu", false),
            new Employee("Kurt", "Peters", 3, "kpe", false)
    );

    @Override
    public List<Employee> getCoworkers(String employeeCode) {
        return EMPLOYEES.stream().filter(employee -> employee.getCode().equals(employeeCode)).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getLeavers(List<Employee> employees) {
        return null;
    }

}
