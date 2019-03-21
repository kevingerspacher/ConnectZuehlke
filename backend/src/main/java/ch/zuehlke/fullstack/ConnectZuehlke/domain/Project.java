package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Column(name="MOOD")
    private Integer mood;

    public Project(){}

    public Project(Long id, String name, Integer mood) {
        this.id = id;
        this.name = name;
        this.mood = mood;
    }
}
