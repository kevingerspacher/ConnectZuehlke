package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeOnProject that = (EmployeeOnProject) o;
        return Objects.equals(projectCode, that.projectCode) &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(from, that.from) &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectCode, projectName, from, to);
    }
}
