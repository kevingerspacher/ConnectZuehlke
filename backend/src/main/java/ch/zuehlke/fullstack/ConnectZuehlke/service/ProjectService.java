package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.util.List;

/**
 * Service for retrieving and saving {@link Project}s.
 */
public interface ProjectService {

    /**
     * Get the projects.
     * @return list of available projects
     */
    List<Project> getProjectList();

    /**
     * Get project by id.
     * @param projectId id.
     * @return project
     */
    Project getById(Long projectId);

    /**
     * Save a project (persist to db)
     * @param project project to save
     */
    void saveProject(Project project);
}
