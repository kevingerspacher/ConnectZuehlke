package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.util.List;

/**
 * Service for retrieving and saving {@link Project}s.
 */
public interface ProjectService {

    /**
     * Get the projects.
     *
     * @return list of available projects
     */
    List<Project> getProjectList();

    /**
     * Get project by id.
     *
     * @param id id.
     * @return project
     */
    Project getById(Long id);

    /**
     * Find projects by name containing search term.
     *
     * @param searchTerm search term
     * @return projects matching search
     */
    List<Project> findByTitle(String searchTerm);

    /**
     * Save a project (persist to db)
     *
     * @param project project to save
     */
    void saveProject(Project project);

    List<Project> getCurrentProjectsOfEmployee(String employeeCode);
}
