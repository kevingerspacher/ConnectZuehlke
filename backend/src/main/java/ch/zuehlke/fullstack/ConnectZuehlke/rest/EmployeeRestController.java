package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightCoworkerService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.ScoreCalculationService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeRestController {
    private final InsightEmployeeService employeeService;
    private final InsightCoworkerService coworkerService;
    private final ScoreCalculationService scoreCalculationService;

    public EmployeeRestController(InsightEmployeeService employeeService, InsightCoworkerService coworkerService, ScoreCalculationService scoreCalculationService) {
        this.employeeService = employeeService;
        this.coworkerService = coworkerService;
        this.scoreCalculationService = scoreCalculationService;
    }

    @GetMapping("/api/employees")
    public List<Employee> employeeList() {
        return employeeService.getEmployees();
    }

    @GetMapping("/api/employee/{code}")
    public Employee employee(@PathVariable(value = "code") String code) {
        return employeeService.getEmployee(code);
    }

    @GetMapping(value = "/api/employee/{id}/picture",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getEmployeePicture(@PathVariable(value = "id") int id) throws IOException {
        return employeeService.getEmployeePicture(id);
    }

    @GetMapping("/api/employee/{code}/network")
    public List<Employee> network(@PathVariable(value = "code") String code) {
        return coworkerService.getCoworkers(code);
    }

    @GetMapping("/api/employee/score")
    public List<Employee> score(@RequestParam(value = "employeeCodes") List<String> codes) {
        List<Employee> employeesToCheck = codes.stream().map(employeeService::getEmployee).collect(Collectors.toList());
        return scoreCalculationService.calculateEmployees(employeesToCheck);
    }

}