package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.util.List;

public interface InsightProjectService {

    List<Project> listProjects();

    List<Project> listCurrentProject(String employeeCode);
}
