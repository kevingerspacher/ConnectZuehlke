package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.List;

public interface InsightCoworkerService {

    List<Employee> getCoworkers(String employeeCode);

    List<Employee> getLeavers(List<Employee> employees);
}
