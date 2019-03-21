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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * CommunityActivity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class CommunityActivity {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("NameDe")

    private String nameDe = null;

    @JsonProperty("Url")

    private String url = null;

    @JsonProperty("Date")

    private OffsetDateTime date = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("DescriptionDe")

    private String descriptionDe = null;
    @JsonProperty("ActivityType")

    private ActivityTypeEnum activityType = null;
    @JsonProperty("IsHidden")

    private Boolean isHidden = null;
    @JsonProperty("IsUserGenerated")

    private Boolean isUserGenerated = null;
    @JsonProperty("ActivityTypeText")

    private String activityTypeText = null;

    public CommunityActivity id(Long id) {
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

    public CommunityActivity name(String name) {
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

    public CommunityActivity nameDe(String nameDe) {
        this.nameDe = nameDe;
        return this;
    }

    /**
     * Get nameDe
     *
     * @return nameDe
     **/
    @Schema(description = "")
    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public CommunityActivity url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @Schema(description = "")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CommunityActivity date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     **/
    @Schema(description = "")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CommunityActivity description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommunityActivity descriptionDe(String descriptionDe) {
        this.descriptionDe = descriptionDe;
        return this;
    }

    /**
     * Get descriptionDe
     *
     * @return descriptionDe
     **/
    @Schema(description = "")
    public String getDescriptionDe() {
        return descriptionDe;
    }

    public void setDescriptionDe(String descriptionDe) {
        this.descriptionDe = descriptionDe;
    }

    public CommunityActivity activityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * Get activityType
     *
     * @return activityType
     **/
    @Schema(description = "")
    public ActivityTypeEnum getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
    }

    public CommunityActivity isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
     * Get isHidden
     *
     * @return isHidden
     **/
    @Schema(description = "")
    public Boolean isIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public CommunityActivity isUserGenerated(Boolean isUserGenerated) {
        this.isUserGenerated = isUserGenerated;
        return this;
    }

    /**
     * Get isUserGenerated
     *
     * @return isUserGenerated
     **/
    @Schema(description = "")
    public Boolean isIsUserGenerated() {
        return isUserGenerated;
    }

    public void setIsUserGenerated(Boolean isUserGenerated) {
        this.isUserGenerated = isUserGenerated;
    }

    /**
     * Get activityTypeText
     *
     * @return activityTypeText
     **/
    @Schema(description = "")
    public String getActivityTypeText() {
        return activityTypeText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommunityActivity communityActivity = (CommunityActivity) o;
        return Objects.equals(this.id, communityActivity.id) &&
                Objects.equals(this.name, communityActivity.name) &&
                Objects.equals(this.nameDe, communityActivity.nameDe) &&
                Objects.equals(this.url, communityActivity.url) &&
                Objects.equals(this.date, communityActivity.date) &&
                Objects.equals(this.description, communityActivity.description) &&
                Objects.equals(this.descriptionDe, communityActivity.descriptionDe) &&
                Objects.equals(this.activityType, communityActivity.activityType) &&
                Objects.equals(this.isHidden, communityActivity.isHidden) &&
                Objects.equals(this.isUserGenerated, communityActivity.isUserGenerated) &&
                Objects.equals(this.activityTypeText, communityActivity.activityTypeText);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, nameDe, url, date, description, descriptionDe, activityType, isHidden, isUserGenerated, activityTypeText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommunityActivity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameDe: ").append(toIndentedString(nameDe)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionDe: ").append(toIndentedString(descriptionDe)).append("\n");
        sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    isUserGenerated: ").append(toIndentedString(isUserGenerated)).append("\n");
        sb.append("    activityTypeText: ").append(toIndentedString(activityTypeText)).append("\n");
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

    /**
     * Gets or Sets activityType
     */
    public enum ActivityTypeEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_3(3),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6),
        NUMBER_7(7),
        NUMBER_8(8);

        private Integer value;

        ActivityTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static ActivityTypeEnum fromValue(String text) {
            for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

    }

}