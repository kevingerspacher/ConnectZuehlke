package ch.zuehlke.fullstack.ConnectZuehlke.services.employee;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectCoworkerServiceImpl implements ProjectCoworkerService {

    private final EmployeeService employeeService;

    public ProjectCoworkerServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<String> getCoworkers(String code) {
        Employee employee = this.employeeService.getEmployee(code);
        if (employee != null) {

        }
        return null;
    }
}
