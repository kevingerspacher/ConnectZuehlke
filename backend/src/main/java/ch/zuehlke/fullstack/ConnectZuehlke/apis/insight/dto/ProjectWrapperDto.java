package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.Project;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectWrapperDto {

    @JsonProperty("Project")
    private Project project;

    public ProjectWrapperDto(){};

    public ProjectWrapperDto(Project project){
        this.project = project;
    };

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ch.zuehlke.fullstack.ConnectZuehlke.domain.Project toProject() {
        return new ch.zuehlke.fullstack.ConnectZuehlke.domain.Project(project.getId(), project.getCode(), project.getName(), 0);
    }
}
