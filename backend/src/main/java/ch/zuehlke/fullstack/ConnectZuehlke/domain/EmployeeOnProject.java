package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.time.LocalDateTime;

public class EmployeeOnProject {

    private final String projectCode;
    private final String projectName;
    private final LocalDateTime from;
    private final LocalDateTime to;

    public EmployeeOnProject(String projectCode, String projectName, LocalDateTime from, LocalDateTime to) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.from = from;
        this.to = to;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
