package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.EmployeeOnProject;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    byte[] getEmployeePicture(int id) throws IOException;

    Employee getEmployee(String code);

    List<EmployeeOnProject> getProjects(String code);
}
