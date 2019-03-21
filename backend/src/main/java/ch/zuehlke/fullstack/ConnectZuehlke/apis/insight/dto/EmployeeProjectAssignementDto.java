package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class EmployeeProjectAssignementDto {

    @JsonProperty("FromEffective")
    private LocalDateTime from;

    @JsonProperty("ToEffective")
    private LocalDateTime to;

    @JsonProperty("Employee")
    private EmployeeDto employee;

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public Employee toEmployee() {
        return new Employee(employee.getFirstName(), employee.getLastName(), employee.getId(), employee.getCode());
    }
}
