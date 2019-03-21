package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
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

    public static final List<Project> PROJECTS = asList(
            new Project(1L, "A", "Project A", 0),
            new Project(2L, "B", "Project B", 0),
            new Project(3L, "C", "Project C", 1)
    );

    @Override
    public List<Employee> getCoworkers(String employeeCode) {
        return EMPLOYEES.stream().filter(employee -> employee.getCode().equals(employeeCode)).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getLeavers(List<Employee> employees) {
        return null;
    }

    @Override
    public List<Project> listProjects() {
        return PROJECTS;
    }
}
