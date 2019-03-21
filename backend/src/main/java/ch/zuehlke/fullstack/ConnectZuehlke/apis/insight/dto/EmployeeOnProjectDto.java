package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.EmployeeOnProject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class EmployeeOnProjectDto {

    @JsonProperty("Project")
    private ProjectDto project;

    @JsonProperty("FromEffective")
    private LocalDateTime from;

    @JsonProperty("ToEffective")
    private LocalDateTime to;

    public EmployeeOnProject toProject() {
        return new EmployeeOnProject(project.getCode(), project.getTitle(), from, to);
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

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
}
