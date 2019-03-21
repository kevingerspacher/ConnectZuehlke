package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Employee {

    @Id
    @Column(name="ID")
    private int id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="CODE")
    private String code;

    @Column(name="LEAVING_PROPABILITY")
    private BigDecimal leavingPropability;

    @Column(name="SCORE_TOTAL")
    private Integer leaverScore;

    @Column(name="SCORE_JOB_DURATION")
    private Integer jobDurationScore;

    @Column(name="SCORE_TEAM_MOOD")
    private Integer teamMoodScore;

    @Column(name="SCORE_COLLEAGUE_LEAVERS")
    private Integer colleagueLeaversScore;

    private Employee() {
    }

    public Employee(String firstName, String lastName, int id) {
        this(firstName, lastName, id, firstName.substring(0, 1) + lastName.substring(0, 2));
    }

    public Employee(String firstName, String lastName, int id, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.code = code.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLeaverScore() {
        return leaverScore;
    }

    public void setLeaverScore(Integer leaverScore) {
        this.leaverScore = leaverScore;
    }

    public Integer getJobDurationScore() {
        return jobDurationScore;
    }

    public void setJobDurationScore(Integer jobDurationScore) {
        this.jobDurationScore = jobDurationScore;
    }

    public Integer getTeamMoodScore() {
        return teamMoodScore;
    }

    public void setTeamMoodScore(Integer teamMoodScore) {
        this.teamMoodScore = teamMoodScore;
    }

    public Integer getColleagueLeaversScore() {
        return colleagueLeaversScore;
    }

    public void setColleagueLeaversScore(Integer colleagueLeaversScore) {
        this.colleagueLeaversScore = colleagueLeaversScore;
    }

    public BigDecimal getLeavingPropability() {
        return leavingPropability;
    }

    public void setLeavingPropability(BigDecimal leavingPropability) {
        this.leavingPropability = leavingPropability;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", code='" + code + '\'' +
                ", leaverScore=" + leaverScore +
                ", jobDurationScore=" + jobDurationScore +
                ", teamMoodScore=" + teamMoodScore +
                ", colleagueLeaversScore=" + colleagueLeaversScore +
                '}';
    }
}
