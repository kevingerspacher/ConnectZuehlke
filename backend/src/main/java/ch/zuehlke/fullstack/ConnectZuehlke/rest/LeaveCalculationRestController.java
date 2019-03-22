package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.service.calculation.ScoreCalculationService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaveCalculationRestController {
    private final ScoreCalculationService scoreCalculationService;

    public LeaveCalculationRestController(ScoreCalculationService scoreCalculationService){
        this.scoreCalculationService = scoreCalculationService;
    }

    @PutMapping("/api/employee/calculate")
    public List<Employee> getAllCalculatedEmployees(@RequestBody List<Employee> employees) {
        return scoreCalculationService.calculateEmployees(employees);
    }
}
