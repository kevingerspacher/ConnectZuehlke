package ch.zuehlke.fullstack.ConnectZuehlke.services.employee;

import java.util.List;

public interface ProjectCoworkerService {

    List<String> getCoworkers(String code);
}
