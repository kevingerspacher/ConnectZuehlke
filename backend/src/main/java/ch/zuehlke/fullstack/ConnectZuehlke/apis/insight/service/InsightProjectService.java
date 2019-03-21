package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.util.List;

public interface InsightProjectService {

    List<Employee> getCoworkers(String employeeCode);

    List<Project> listProjects();
}
