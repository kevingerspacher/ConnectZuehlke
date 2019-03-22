package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Project {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MOOD")
    private Integer mood;

    public Project() {
    }

    public Project(Long id, String code, String name, Integer mood) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.mood = mood;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(code, project.code) &&
                Objects.equals(name, project.name) &&
                Objects.equals(mood, project.mood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, mood);
    }
}
