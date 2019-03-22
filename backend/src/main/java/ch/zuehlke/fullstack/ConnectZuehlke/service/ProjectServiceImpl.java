package ch.zuehlke.fullstack.ConnectZuehlke.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.dao.ProjectRepository;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Service for retrieving and saving {@link Project}s.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    private static Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    InsightProjectService insightProjectService;

    private List<Project> projects = new ArrayList<>();

    @PostConstruct
    public void postConstruct() {
        LOG.info("Loading projects from Insight...");
        getProjectList();
        LOG.info("Projects loaded!");
    }


    @Override
    @Cacheable("getProjects")
    public List<Project> getProjectList() {
        if (projects.size() > 0) {
            LOG.info("Returning projects from cache...");
            return projects;
        }
        LOG.info("Retrieving projects fresh from Insight!");
        projects = insightProjectService.listProjects();

        // enrich projects from insight with locally saved mood values
        Iterable<Project> allFromDb = projectRepository.findAll();
        enrichWithMood(allFromDb);

        return projects;
    }

    private void enrichWithMood(Iterable<Project> givenProjects) {
        Map<Long, Project> map = StreamSupport.stream(givenProjects.spliterator(), false)
                .collect(Collectors.toMap(p -> p.getId(), p -> p));
        this.projects.forEach(p -> p.setMood(map.getOrDefault(p.getId(), new Project(0L,"","",0)).getMood()));
    }

    @Override
    @Cacheable("projectById")
    public Project getById(Long id) {
        for (Project project : projects) {
            if (project.getId().equals(id)) {
                return project;
            }
        }
        return null;
    }

    @Override
    public List<Project> findByTitle(String searchTerm) {
        LOG.info("###### Find projects by title containing: " + searchTerm);
        List<Project> resultList = new ArrayList<>();
        for (Project p : projects) {
            if (p.getName() != null && p.getName().contains(searchTerm)) {
                resultList.add(p);
            }
        }
        return resultList;
    }

    @Override
    public void saveProject(Project project) {
        projectRepository.save(project);
        // find project in local variable and update it

        Map<Long, Project> map = projects.stream().collect(Collectors.toMap(p -> p.getId(), p -> p));
        map.get(project.getId()).setMood(project.getMood());
    }

    @Override
    public List<Project> getCurrentProjectsOfEmployee(String employeeCode) {
        List<Project> projectsFromInsight = insightProjectService.listCurrentProject(employeeCode);

        Map<Long, Project> map = this.projects.stream().collect(Collectors.toMap(p -> p.getId(), p -> p));
        projectsFromInsight.forEach(p -> p.setMood(map.getOrDefault(p.getId(), new Project(0L,"","",0)).getMood()));

        return projectsFromInsight;
    }
}
