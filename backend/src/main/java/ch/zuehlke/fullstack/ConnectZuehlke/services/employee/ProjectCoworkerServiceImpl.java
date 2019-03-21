package ch.zuehlke.fullstack.ConnectZuehlke.services.employee;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeDto;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectCoworkerServiceImpl implements ProjectCoworkerService {

    private final InsightEmployeeService insightEmployeeService;

    public ProjectCoworkerServiceImpl(InsightEmployeeService insightEmployeeService) {
        this.insightEmployeeService = insightEmployeeService;
    }

    @Override
    public List<String> getCoworkers(String code) {
        Employee employee = this.insightEmployeeService.getEmployee(code);
        if (employee != null) {

        }
        return null;
    }
}
