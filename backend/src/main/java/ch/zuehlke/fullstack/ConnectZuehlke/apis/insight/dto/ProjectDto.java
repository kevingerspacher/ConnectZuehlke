package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectDto {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Id")
    private Long id;


    public Project toProject() {
        return new Project(getId(), getCode(), getTitle(), 0);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
