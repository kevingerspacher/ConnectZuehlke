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

import java.util.Objects;

/**
 * SkillCategory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class SkillCategory {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("Code")

    private String code = null;

    @JsonProperty("CssClass")

    private String cssClass = null;

    public SkillCategory id(Long id) {
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

    public SkillCategory name(String name) {
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

    public SkillCategory code(String code) {
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

    /**
     * Get cssClass
     *
     * @return cssClass
     **/
    @Schema(description = "")
    public String getCssClass() {
        return cssClass;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillCategory skillCategory = (SkillCategory) o;
        return Objects.equals(this.id, skillCategory.id) &&
                Objects.equals(this.name, skillCategory.name) &&
                Objects.equals(this.code, skillCategory.code) &&
                Objects.equals(this.cssClass, skillCategory.cssClass);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, code, cssClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillCategory {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    cssClass: ").append(toIndentedString(cssClass)).append("\n");
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