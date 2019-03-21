package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.dao.ProjectRepository;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for retrieving and saving {@link Project}s.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    private List<Project> projects = new ArrayList<>();


    @Override
    public List<Project> getProjectList() {
        // TODO: get projects from db or Insight?
        projects.add(new Project(1L, "Tesproject A", 0));
        projects.add(new Project(2L, "Tesproject B", 1));
        projects.add(new Project(3L, "Tesproject C", 0));
        projects.add(new Project(4L, "Tesproject D", 0));
        projects.add(new Project(5L, "Tesproject E", 1));

        return projects;
    }

    @Override
    public Project getById(Long projectId) {
        for (Project project : projects) {
            if (project.getId().equals(projectId)) {
                return project;
            }
        }
        return null;
    }

    @Override
    public void saveProject(Project project) {
        projectRepository.save(project);
    }
}
