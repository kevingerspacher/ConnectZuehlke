package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.ProjectDto;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.ProjectWrapperDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Service
@Profile({"prod", "staging", "dev"})
public class InsightProjectServiceImpl implements InsightProjectService {

    private final RestTemplate insightRestTemplate;

    @Autowired
    public InsightProjectServiceImpl(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<Project> listProjects() {
        ResponseEntity<ProjectDto[]> response = this.insightRestTemplate
                .getForEntity("/projects", ProjectDto[].class);

        return Stream.of(response.getBody())
                .map(ProjectDto::toProject)
                .collect(toList());
    }

    @Override
    public List<Project> listCurrentProject(String employeeCode) {
        ResponseEntity<ProjectWrapperDto[]> response = this.insightRestTemplate
                .getForEntity("/employees/" + employeeCode + "/projects/current", ProjectWrapperDto[].class);

        return Stream.of(response.getBody())
                .map(ProjectWrapperDto::toProject)
                .collect(toList());
    }

}
