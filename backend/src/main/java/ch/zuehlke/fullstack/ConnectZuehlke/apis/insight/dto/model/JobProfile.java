/*
 * WebApi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JobProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class JobProfile {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Code")

    private String code = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("Discipline")

    private String discipline = null;

    @JsonProperty("Abbreviation")

    private String abbreviation = null;

    @JsonProperty("CareerPath")

    private CareerPath careerPath = null;

    @JsonProperty("Children")

    private List<JobProfile> children = null;

    @JsonProperty("IsGroup")

    private Boolean isGroup = null;

    public JobProfile id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobProfile code(String code) {
        this.code = code;
        return this;
    }


    /**
     * Get code
     *
     * @return code
     **/
    @Schema(description = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JobProfile name(String name) {
        this.name = name;
        return this;
    }


    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobProfile discipline(String discipline) {
        this.discipline = discipline;
        return this;
    }


    /**
     * Get discipline
     *
     * @return discipline
     **/
    @Schema(description = "")
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public JobProfile abbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }


    /**
     * Get abbreviation
     *
     * @return abbreviation
     **/
    @Schema(description = "")
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public JobProfile careerPath(CareerPath careerPath) {
        this.careerPath = careerPath;
        return this;
    }


    /**
     * Get careerPath
     *
     * @return careerPath
     **/
    @Schema(description = "")
    public CareerPath getCareerPath() {
        return careerPath;
    }

    public void setCareerPath(CareerPath careerPath) {
        this.careerPath = careerPath;
    }

    public JobProfile children(List<JobProfile> children) {
        this.children = children;
        return this;
    }

    public JobProfile addChildrenItem(JobProfile childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<JobProfile>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * Get children
     *
     * @return children
     **/
    @Schema(description = "")
    public List<JobProfile> getChildren() {
        return children;
    }

    public void setChildren(List<JobProfile> children) {
        this.children = children;
    }

    public JobProfile isGroup(Boolean isGroup) {
        this.isGroup = isGroup;
        return this;
    }


    /**
     * Get isGroup
     *
     * @return isGroup
     **/
    @Schema(description = "")
    public Boolean isIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobProfile jobProfile = (JobProfile) o;
        return Objects.equals(this.id, jobProfile.id) &&
                Objects.equals(this.code, jobProfile.code) &&
                Objects.equals(this.name, jobProfile.name) &&
                Objects.equals(this.discipline, jobProfile.discipline) &&
                Objects.equals(this.abbreviation, jobProfile.abbreviation) &&
                Objects.equals(this.careerPath, jobProfile.careerPath) &&
                Objects.equals(this.children, jobProfile.children) &&
                Objects.equals(this.isGroup, jobProfile.isGroup);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, code, name, discipline, abbreviation, careerPath, children, isGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobProfile {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
        sb.append("    careerPath: ").append(toIndentedString(careerPath)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}