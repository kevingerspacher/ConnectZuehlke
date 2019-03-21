package ch.zuehlke.fullstack.ConnectZuehlke.service.calculation;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.List;

/**
 * Service for calculating leaver scores for employees.
 */
public interface ScoreCalculationService {

    /**
     * Calculate the leaver score for all given employees and persist
     * the final leaver score as well as the partial scores to the
     * {@link Employee} entity in the db.
     *
     * @param employees employees to be calculated
     */
    void calculateEmployees(List<Employee> employees);
}
