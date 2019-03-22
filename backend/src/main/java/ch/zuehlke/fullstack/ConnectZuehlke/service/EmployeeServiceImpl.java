package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.dao.EmployeeRepository;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.EmployeeOnProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private InsightEmployeeService insightEmployeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {

        Map<Integer, Employee> map = getDbEmployeesAsMap();

        List<Employee> insightEmployees = insightEmployeeService.getEmployees();
        insightEmployees.forEach(e -> {
            Employee fromMap = map.get(e.getId());
            setScores(e, fromMap);
        });

        return insightEmployees;
    }

    @Override
    public byte[] getEmployeePicture(int id) throws IOException {
        return insightEmployeeService.getEmployeePicture(id);
    }

    @Override
    public Employee getEmployee(String code) {

        Map<Integer, Employee> map = getDbEmployeesAsMap();

        Employee e = insightEmployeeService.getEmployee(code);
        Employee fromMap = map.get(e.getId());
        setScores(e, fromMap);

        return e;
    }

    @Override
    public List<EmployeeOnProject> getProjects(String code) {
        return insightEmployeeService.getProjects(code);
    }

    private Map<Integer, Employee> getDbEmployeesAsMap() {
        Iterable<Employee> localEmployees = employeeRepository.findAll();
        return StreamSupport.stream(localEmployees.spliterator(), false)
                .collect(Collectors.toMap(p -> p.getId(), p -> p));
    }

    private void setScores(Employee e, Employee fromMap) {
        if (fromMap != null) {
            e.setLeavingPropability(fromMap.getLeavingPropability());
            e.setColleagueLeaversScore(fromMap.getColleagueLeaversScore());
            e.setJobDurationScore(fromMap.getJobDurationScore());
            e.setLeaverScore(fromMap.getLeaverScore());
            e.setTeamMoodScore(fromMap.getTeamMoodScore());
        }
    }
}
