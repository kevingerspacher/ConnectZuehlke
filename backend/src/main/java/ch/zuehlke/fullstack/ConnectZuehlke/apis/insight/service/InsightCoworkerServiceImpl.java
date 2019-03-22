package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeOnProjectDto;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeProjectAssignementDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Profile({"prod", "staging", "dev"})
public class InsightCoworkerServiceImpl implements InsightCoworkerService {

    private final RestTemplate insightRestTemplate;
    private final InsightEmployeeService insightEmployeeService;

    @Autowired
    public InsightCoworkerServiceImpl(RestTemplate insightRestTemplate, InsightEmployeeService insightEmployeeService) {
        this.insightRestTemplate = insightRestTemplate;
        this.insightEmployeeService = insightEmployeeService;
    }

    @Override
    @Cacheable("coworkers")
    public List<Employee> getCoworkers(String employeeCode) {
        Objects.requireNonNull(employeeCode);

        ResponseEntity<EmployeeOnProjectDto[]> response = this.insightRestTemplate
                .getForEntity("/employees/" + employeeCode + "/projects/history", EmployeeOnProjectDto[].class);

        List<Employee> coworkersFromCurrent = Stream.of(Objects.requireNonNull(response.getBody()))
                .map(employeeOnProjectDto -> getCurrent(employeeOnProjectDto.getProject().getCode(), employeeOnProjectDto.getFrom(), employeeOnProjectDto.getTo()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<Employee> coworkersFromPrev = Stream.of(Objects.requireNonNull(response.getBody()))
                .map(employeeOnProjectDto -> getPrevious(employeeOnProjectDto.getProject().getCode(), employeeOnProjectDto.getFrom(), employeeOnProjectDto.getTo()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        coworkersFromCurrent.addAll(coworkersFromPrev);

        return coworkersFromCurrent.stream()
                .filter(distinctByKey(Employee::getCode))
                .filter(item -> !item.getCode().equals(employeeCode))
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("leavers")
    public List<Employee> getLeavers(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> this.insightEmployeeService.getEmployee(employee.getCode()).getLeftZE())
                .collect(Collectors.toList());
    }

    private List<Employee> getCurrent(String projectCode, LocalDateTime from, LocalDateTime to) {

        ResponseEntity<EmployeeProjectAssignementDto[]> response = this.insightRestTemplate
                .getForEntity("/projects/" + projectCode + "/team/current", EmployeeProjectAssignementDto[].class);

        return filterAssignments(response.getBody(), from, to);

    }

    private List<Employee> filterAssignments(EmployeeProjectAssignementDto[] body, LocalDateTime from, LocalDateTime to) {
        if (body.length > 0) {
            return Stream.of(body)
                    .filter(assignemntDto -> assignemntDto.getTo() != null && assignemntDto.getFrom() != null)
                    .filter(assignementDto -> {
                        if (assignementDto.getTo().isBefore(from)) return false;
                        if (assignementDto.getFrom().isAfter(to)) return false;
                        return true;
                    })
                    .map(EmployeeProjectAssignementDto::toEmployee)
                    .collect(Collectors.toList());

        }
        return Collections.emptyList();
    }

    private List<Employee> getPrevious(String projectCode, LocalDateTime from, LocalDateTime to) {
        ResponseEntity<EmployeeProjectAssignementDto[]> response = this.insightRestTemplate
                .getForEntity("/projects/" + projectCode + "/team/previous", EmployeeProjectAssignementDto[].class);

        return filterAssignments(response.getBody(), from, to);
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
