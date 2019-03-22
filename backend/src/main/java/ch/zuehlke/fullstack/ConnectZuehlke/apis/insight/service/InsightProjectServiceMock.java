package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.context.annotation.Profile;

import java.util.List;

import static java.util.Arrays.asList;

@Profile({"ci", "default"})
public class InsightProjectServiceMock implements InsightProjectService {

    private static final List<Project> PROJECTS = asList(
            new Project(1L, "A", "Project A", 0),
            new Project(2L, "B", "Project B", 0),
            new Project(3L, "C", "Project C", 1)
    );

    @Override
    public List<Project> listProjects() {
        return PROJECTS;
    }

    @Override
    public List<Project> listCurrentProject(String employeeCode) {
        return PROJECTS;
    }
}
