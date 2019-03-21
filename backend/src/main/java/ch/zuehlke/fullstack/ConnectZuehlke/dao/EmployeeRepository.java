package ch.zuehlke.fullstack.ConnectZuehlke.dao;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
