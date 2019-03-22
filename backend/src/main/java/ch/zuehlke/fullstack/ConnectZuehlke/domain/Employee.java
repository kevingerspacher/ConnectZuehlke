package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

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
    private BigDecimal leaverScore;

    @Column(name="SCORE_JOB_DURATION")
    private BigDecimal jobDurationScore;

    @Column(name="SCORE_TEAM_MOOD")
    private BigDecimal teamMoodScore;

    @Column(name="SCORE_COLLEAGUE_LEAVERS")
    private BigDecimal colleagueLeaversScore;

    @Column(name="LEFT_ZE")
    private Boolean leftZE;

    private Employee() {
    }

    public Employee(String firstName, String lastName, int id) {
        this(firstName, lastName, id, firstName.substring(0, 1) + lastName.substring(0, 2), false);
    }

    public Employee(String firstName, String lastName, int id, String code, Boolean leftZE) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.code = code.toLowerCase();
        this.leftZE = leftZE;
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

    public BigDecimal getLeaverScore() {
        return leaverScore;
    }

    public void setLeaverScore(BigDecimal leaverScore) {
        this.leaverScore = leaverScore;
    }

    public BigDecimal getJobDurationScore() {
        return jobDurationScore;
    }

    public void setJobDurationScore(BigDecimal jobDurationScore) {
        this.jobDurationScore = jobDurationScore;
    }

    public BigDecimal getTeamMoodScore() {
        return teamMoodScore;
    }

    public void setTeamMoodScore(BigDecimal teamMoodScore) {
        this.teamMoodScore = teamMoodScore;
    }

    public BigDecimal getColleagueLeaversScore() {
        return colleagueLeaversScore;
    }

    public void setColleagueLeaversScore(BigDecimal colleagueLeaversScore) {
        this.colleagueLeaversScore = colleagueLeaversScore;
    }

    public BigDecimal getLeavingPropability() {
        return leavingPropability;
    }

    public void setLeavingPropability(BigDecimal leavingPropability) {
        this.leavingPropability = leavingPropability;
    }

    public Boolean getLeftZE() {
        return leftZE;
    }

    public void setLeftZE(Boolean leftZE) {
        this.leftZE = leftZE;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(code, employee.code) &&
                Objects.equals(leavingPropability, employee.leavingPropability) &&
                Objects.equals(leaverScore, employee.leaverScore) &&
                Objects.equals(jobDurationScore, employee.jobDurationScore) &&
                Objects.equals(teamMoodScore, employee.teamMoodScore) &&
                Objects.equals(colleagueLeaversScore, employee.colleagueLeaversScore) &&
                Objects.equals(leftZE, employee.leftZE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, code, leavingPropability, leaverScore, jobDurationScore, teamMoodScore, colleagueLeaversScore, leftZE);
    }
}
