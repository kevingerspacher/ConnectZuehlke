package ch.zuehlke.fullstack.ConnectZuehlke.rest.admin;


import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectAdminRestController {
    private final ProjectService projectService;

    public ProjectAdminRestController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/api/admin/projects")
    public List<Project> projectList() {
        return projectService.getProjectList();
    }

    @GetMapping("/api/admin/projects/{id}")
    public Project project(@PathVariable(value = "id") Long id) {
        return projectService.getById(id);
    }

    @GetMapping("/api/admin/projects/search/{searchTerm}")
    public List<Project> project(@PathVariable(value = "searchTerm") String searchTerm) {
        return projectService.findByTitle(searchTerm);
    }

    @PutMapping("/api/admin/projects/{id}")
    public Project updateMood(@RequestBody Project savedProject, @PathVariable Long id) {

        Project projectFromDb = projectService.getById(id);
        projectFromDb.setMood(savedProject.getMood());
        projectService.saveProject(projectFromDb);
        return projectFromDb;
    }
}
