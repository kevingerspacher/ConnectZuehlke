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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Training
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class Training {

    @JsonProperty("_date")

    private OffsetDateTime _date = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("ShortDescription")

    private String shortDescription = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("Url")

    private String url = null;

    @JsonProperty("UrlHint")

    private String urlHint = null;

    @JsonProperty("ISBN")

    private String ISBN = null;

    @JsonProperty("Trainer")

    private String trainer = null;

    @JsonProperty("Location")

    private String location = null;

    @JsonProperty("Deprecated")

    private Boolean deprecated = null;
    @JsonProperty("Type")

    private TypeEnum type = null;
    @JsonProperty("TypeText")

    private String typeText = null;
    @JsonProperty("Level")

    private LevelEnum level = null;
    @JsonProperty("LevelText")

    private String levelText = null;
    @JsonProperty("AverageRating")

    private Double averageRating = null;
    @JsonProperty("NumberOfRatings")

    private Integer numberOfRatings = null;
    @JsonProperty("Participants")

    private Double participants = null;
    @JsonProperty("Costs")

    private Double costs = null;
    @JsonProperty("Match")

    private Double match = null;
    @JsonProperty("Participations")

    private List<TrainingParticipation> participations = null;
    @JsonProperty("Skills")

    private List<Skill> skills = null;
    @JsonProperty("Sources")

    private List<TrainingParticipation> sources = null;
    @JsonProperty("Attachment")

    private Attachment attachment = null;
    @JsonProperty("Date")

    private OffsetDateTime date = null;
    @JsonProperty("SortDate")

    private OffsetDateTime sortDate = null;
    @JsonProperty("Id")

    private Long id = null;

    public Training _date(OffsetDateTime _date) {
        this._date = _date;
        return this;
    }

    /**
     * Get _date
     *
     * @return _date
     **/
    @Schema(description = "")
    public OffsetDateTime getDate() {
        return _date;
    }

    public void setDate(OffsetDateTime _date) {
        this._date = _date;
    }

    public Training name(String name) {
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

    public Training shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get shortDescription
     *
     * @return shortDescription
     **/
    @Schema(description = "")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Training description(String description) {
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

    public Training url(String url) {
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

    /**
     * Get urlHint
     *
     * @return urlHint
     **/
    @Schema(description = "")
    public String getUrlHint() {
        return urlHint;
    }

    public Training ISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    /**
     * Get ISBN
     *
     * @return ISBN
     **/
    @Schema(description = "")
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Training trainer(String trainer) {
        this.trainer = trainer;
        return this;
    }

    /**
     * Get trainer
     *
     * @return trainer
     **/
    @Schema(description = "")
    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Training location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     *
     * @return location
     **/
    @Schema(description = "")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Training deprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * Get deprecated
     *
     * @return deprecated
     **/
    @Schema(description = "")
    public Boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Training type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get typeText
     *
     * @return typeText
     **/
    @Schema(description = "")
    public String getTypeText() {
        return typeText;
    }

    public Training level(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     **/
    @Schema(description = "")
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    /**
     * Get levelText
     *
     * @return levelText
     **/
    @Schema(description = "")
    public String getLevelText() {
        return levelText;
    }

    public Training averageRating(Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    /**
     * Get averageRating
     *
     * @return averageRating
     **/
    @Schema(description = "")
    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Training numberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
        return this;
    }

    /**
     * Get numberOfRatings
     *
     * @return numberOfRatings
     **/
    @Schema(description = "")
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public Training participants(Double participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get participants
     *
     * @return participants
     **/
    @Schema(description = "")
    public Double getParticipants() {
        return participants;
    }

    public void setParticipants(Double participants) {
        this.participants = participants;
    }

    public Training costs(Double costs) {
        this.costs = costs;
        return this;
    }

    /**
     * Get costs
     *
     * @return costs
     **/
    @Schema(description = "")
    public Double getCosts() {
        return costs;
    }

    public void setCosts(Double costs) {
        this.costs = costs;
    }

    public Training match(Double match) {
        this.match = match;
        return this;
    }

    /**
     * Get match
     *
     * @return match
     **/
    @Schema(description = "")
    public Double getMatch() {
        return match;
    }

    public void setMatch(Double match) {
        this.match = match;
    }

    public Training participations(List<TrainingParticipation> participations) {
        this.participations = participations;
        return this;
    }

    public Training addParticipationsItem(TrainingParticipation participationsItem) {
        if (this.participations == null) {
            this.participations = new ArrayList<TrainingParticipation>();
        }
        this.participations.add(participationsItem);
        return this;
    }

    /**
     * Get participations
     *
     * @return participations
     **/
    @Schema(description = "")
    public List<TrainingParticipation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<TrainingParticipation> participations) {
        this.participations = participations;
    }

    public Training skills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }

    public Training addSkillsItem(Skill skillsItem) {
        if (this.skills == null) {
            this.skills = new ArrayList<Skill>();
        }
        this.skills.add(skillsItem);
        return this;
    }

    /**
     * Get skills
     *
     * @return skills
     **/
    @Schema(description = "")
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Training sources(List<TrainingParticipation> sources) {
        this.sources = sources;
        return this;
    }

    public Training addSourcesItem(TrainingParticipation sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<TrainingParticipation>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    /**
     * Get sources
     *
     * @return sources
     **/
    @Schema(description = "")
    public List<TrainingParticipation> getSources() {
        return sources;
    }

    public void setSources(List<TrainingParticipation> sources) {
        this.sources = sources;
    }

    public Training attachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * Get attachment
     *
     * @return attachment
     **/
    @Schema(description = "")
    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Training date(OffsetDateTime date) {
        this.date = date;
        return this;
    }


    /**
     * Get sortDate
     *
     * @return sortDate
     **/
    @Schema(description = "")
    public OffsetDateTime getSortDate() {
        return sortDate;
    }

    public Training id(Long id) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Training training = (Training) o;
        return Objects.equals(this._date, training._date) &&
                Objects.equals(this.name, training.name) &&
                Objects.equals(this.shortDescription, training.shortDescription) &&
                Objects.equals(this.description, training.description) &&
                Objects.equals(this.url, training.url) &&
                Objects.equals(this.urlHint, training.urlHint) &&
                Objects.equals(this.ISBN, training.ISBN) &&
                Objects.equals(this.trainer, training.trainer) &&
                Objects.equals(this.location, training.location) &&
                Objects.equals(this.deprecated, training.deprecated) &&
                Objects.equals(this.type, training.type) &&
                Objects.equals(this.typeText, training.typeText) &&
                Objects.equals(this.level, training.level) &&
                Objects.equals(this.levelText, training.levelText) &&
                Objects.equals(this.averageRating, training.averageRating) &&
                Objects.equals(this.numberOfRatings, training.numberOfRatings) &&
                Objects.equals(this.participants, training.participants) &&
                Objects.equals(this.costs, training.costs) &&
                Objects.equals(this.match, training.match) &&
                Objects.equals(this.participations, training.participations) &&
                Objects.equals(this.skills, training.skills) &&
                Objects.equals(this.sources, training.sources) &&
                Objects.equals(this.attachment, training.attachment) &&
                Objects.equals(this.date, training.date) &&
                Objects.equals(this.sortDate, training.sortDate) &&
                Objects.equals(this.id, training.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(_date, name, shortDescription, description, url, urlHint, ISBN, trainer, location, deprecated, type, typeText, level, levelText, averageRating, numberOfRatings, participants, costs, match, participations, skills, sources, attachment, date, sortDate, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Training {\n");

        sb.append("    _date: ").append(toIndentedString(_date)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    urlHint: ").append(toIndentedString(urlHint)).append("\n");
        sb.append("    ISBN: ").append(toIndentedString(ISBN)).append("\n");
        sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeText: ").append(toIndentedString(typeText)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    levelText: ").append(toIndentedString(levelText)).append("\n");
        sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
        sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    participations: ").append(toIndentedString(participations)).append("\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    sortDate: ").append(toIndentedString(sortDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
     * Gets or Sets type
     */
    public enum TypeEnum {
        NUMBER_0(0),
        NUMBER_2(2),
        NUMBER_3(3),
        NUMBER_5(5),
        NUMBER_7(7),
        NUMBER_8(8);

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
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

    /**
     * Gets or Sets level
     */
    public enum LevelEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6);

        private Integer value;

        LevelEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static LevelEnum fromValue(String text) {
            for (LevelEnum b : LevelEnum.values()) {
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
