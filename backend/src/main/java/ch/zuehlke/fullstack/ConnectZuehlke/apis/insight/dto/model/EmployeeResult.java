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
 * EmployeeResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class EmployeeResult {

    @JsonProperty("FirstName")

    private String firstName = null;

    @JsonProperty("LastName")

    private String lastName = null;

    @JsonProperty("Code")

    private String code = null;

    @JsonProperty("Superior")

    private EmployeeResult superior = null;

    @JsonProperty("JobProfile")

    private String jobProfile = null;

    @JsonProperty("Title")

    private String title = null;

    @JsonProperty("Percentage")

    private Double percentage = null;

    @JsonProperty("InternalRate")

    private Double internalRate = null;

    @JsonProperty("ExternalRate")

    private Double externalRate = null;

    @JsonProperty("BusinessPhone")

    private String businessPhone = null;

    @JsonProperty("MobilePhone")

    private String mobilePhone = null;

    @JsonProperty("IsManagement")

    private Boolean isManagement = null;

    @JsonProperty("Match")

    private Double match = null;
    @JsonProperty("Focus")

    private FocusEnum focus = null;
    @JsonProperty("Experience")

    private ExperienceEnum experience = null;
    @JsonProperty("ExperienceText")

    private String experienceText = null;
    @JsonProperty("EntryDate")

    private OffsetDateTime entryDate = null;
    @JsonProperty("EntryDateText")

    private String entryDateText = null;
    @JsonProperty("LeaveDate")

    private OffsetDateTime leaveDate = null;
    @JsonProperty("LeaveDateText")

    private String leaveDateText = null;
    @JsonProperty("DateOfBirth")

    private OffsetDateTime dateOfBirth = null;
    @JsonProperty("OrganisationUnit")

    private String organisationUnit = null;
    @JsonProperty("Team")

    private String team = null;
    @JsonProperty("Qualification")

    private String qualification = null;
    @JsonProperty("Grade")

    private String grade = null;
    @JsonProperty("GradeText")

    private String gradeText = null;
    @JsonProperty("Location")

    private String location = null;
    @JsonProperty("Company")

    private String company = null;
    @JsonProperty("PrivateAddressCity")

    private String privateAddressCity = null;
    @JsonProperty("PrivateAddressZip")

    private Integer privateAddressZip = null;
    @JsonProperty("Distance")

    private Double distance = null;
    @JsonProperty("LowUtilizationFrom")

    private OffsetDateTime lowUtilizationFrom = null;
    @JsonProperty("HomeLocation")

    private GeoLocation homeLocation = null;
    @JsonProperty("LowUtilizationFromMonth")

    private String lowUtilizationFromMonth = null;
    @JsonProperty("BankHours")

    private Double bankHours = null;
    @JsonProperty("FullName")

    private String fullName = null;
    @JsonProperty("Gender")

    private GenderEnum gender = null;
    @JsonProperty("Mail")

    private String mail = null;
    @JsonProperty("Id")

    private Long id = null;

    public EmployeeResult firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    @Schema(description = "")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public EmployeeResult lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    @Schema(description = "")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeResult code(String code) {
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

    public EmployeeResult superior(EmployeeResult superior) {
        this.superior = superior;
        return this;
    }

    /**
     * Get superior
     *
     * @return superior
     **/
    @Schema(description = "")
    public EmployeeResult getSuperior() {
        return superior;
    }

    public void setSuperior(EmployeeResult superior) {
        this.superior = superior;
    }

    public EmployeeResult jobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
        return this;
    }

    /**
     * Get jobProfile
     *
     * @return jobProfile
     **/
    @Schema(description = "")
    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public EmployeeResult title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @Schema(description = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EmployeeResult percentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     *
     * @return percentage
     **/
    @Schema(description = "")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public EmployeeResult internalRate(Double internalRate) {
        this.internalRate = internalRate;
        return this;
    }

    /**
     * Get internalRate
     *
     * @return internalRate
     **/
    @Schema(description = "")
    public Double getInternalRate() {
        return internalRate;
    }

    public void setInternalRate(Double internalRate) {
        this.internalRate = internalRate;
    }

    public EmployeeResult externalRate(Double externalRate) {
        this.externalRate = externalRate;
        return this;
    }

    /**
     * Get externalRate
     *
     * @return externalRate
     **/
    @Schema(description = "")
    public Double getExternalRate() {
        return externalRate;
    }

    public void setExternalRate(Double externalRate) {
        this.externalRate = externalRate;
    }

    public EmployeeResult businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    /**
     * Get businessPhone
     *
     * @return businessPhone
     **/
    @Schema(description = "")
    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public EmployeeResult mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Get mobilePhone
     *
     * @return mobilePhone
     **/
    @Schema(description = "")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public EmployeeResult isManagement(Boolean isManagement) {
        this.isManagement = isManagement;
        return this;
    }

    /**
     * Get isManagement
     *
     * @return isManagement
     **/
    @Schema(description = "")
    public Boolean isIsManagement() {
        return isManagement;
    }

    public void setIsManagement(Boolean isManagement) {
        this.isManagement = isManagement;
    }

    public EmployeeResult match(Double match) {
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

    public EmployeeResult focus(FocusEnum focus) {
        this.focus = focus;
        return this;
    }

    /**
     * Get focus
     *
     * @return focus
     **/
    @Schema(description = "")
    public FocusEnum getFocus() {
        return focus;
    }

    public void setFocus(FocusEnum focus) {
        this.focus = focus;
    }

    public EmployeeResult experience(ExperienceEnum experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get experience
     *
     * @return experience
     **/
    @Schema(description = "")
    public ExperienceEnum getExperience() {
        return experience;
    }

    public void setExperience(ExperienceEnum experience) {
        this.experience = experience;
    }

    /**
     * Get experienceText
     *
     * @return experienceText
     **/
    @Schema(description = "")
    public String getExperienceText() {
        return experienceText;
    }

    public EmployeeResult entryDate(OffsetDateTime entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    /**
     * Get entryDate
     *
     * @return entryDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(OffsetDateTime entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * Get entryDateText
     *
     * @return entryDateText
     **/
    @Schema(description = "")
    public String getEntryDateText() {
        return entryDateText;
    }

    public EmployeeResult leaveDate(OffsetDateTime leaveDate) {
        this.leaveDate = leaveDate;
        return this;
    }

    /**
     * Get leaveDate
     *
     * @return leaveDate
     **/
    @Schema(description = "")
    public OffsetDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(OffsetDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    /**
     * Get leaveDateText
     *
     * @return leaveDateText
     **/
    @Schema(description = "")
    public String getLeaveDateText() {
        return leaveDateText;
    }

    public EmployeeResult dateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Get dateOfBirth
     *
     * @return dateOfBirth
     **/
    @Schema(description = "")
    public OffsetDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public EmployeeResult organisationUnit(String organisationUnit) {
        this.organisationUnit = organisationUnit;
        return this;
    }

    /**
     * Get organisationUnit
     *
     * @return organisationUnit
     **/
    @Schema(description = "")
    public String getOrganisationUnit() {
        return organisationUnit;
    }

    public void setOrganisationUnit(String organisationUnit) {
        this.organisationUnit = organisationUnit;
    }

    public EmployeeResult team(String team) {
        this.team = team;
        return this;
    }

    /**
     * Get team
     *
     * @return team
     **/
    @Schema(description = "")
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public EmployeeResult qualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    /**
     * Get qualification
     *
     * @return qualification
     **/
    @Schema(description = "")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public EmployeeResult grade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Get grade
     *
     * @return grade
     **/
    @Schema(description = "")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Get gradeText
     *
     * @return gradeText
     **/
    @Schema(description = "")
    public String getGradeText() {
        return gradeText;
    }

    public EmployeeResult location(String location) {
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

    public EmployeeResult company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get company
     *
     * @return company
     **/
    @Schema(description = "")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public EmployeeResult privateAddressCity(String privateAddressCity) {
        this.privateAddressCity = privateAddressCity;
        return this;
    }

    /**
     * Get privateAddressCity
     *
     * @return privateAddressCity
     **/
    @Schema(description = "")
    public String getPrivateAddressCity() {
        return privateAddressCity;
    }

    public void setPrivateAddressCity(String privateAddressCity) {
        this.privateAddressCity = privateAddressCity;
    }

    public EmployeeResult privateAddressZip(Integer privateAddressZip) {
        this.privateAddressZip = privateAddressZip;
        return this;
    }

    /**
     * Get privateAddressZip
     *
     * @return privateAddressZip
     **/
    @Schema(description = "")
    public Integer getPrivateAddressZip() {
        return privateAddressZip;
    }

    public void setPrivateAddressZip(Integer privateAddressZip) {
        this.privateAddressZip = privateAddressZip;
    }

    public EmployeeResult distance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * Get distance
     *
     * @return distance
     **/
    @Schema(description = "")
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public EmployeeResult lowUtilizationFrom(OffsetDateTime lowUtilizationFrom) {
        this.lowUtilizationFrom = lowUtilizationFrom;
        return this;
    }

    /**
     * Get lowUtilizationFrom
     *
     * @return lowUtilizationFrom
     **/
    @Schema(description = "")
    public OffsetDateTime getLowUtilizationFrom() {
        return lowUtilizationFrom;
    }

    public void setLowUtilizationFrom(OffsetDateTime lowUtilizationFrom) {
        this.lowUtilizationFrom = lowUtilizationFrom;
    }

    public EmployeeResult homeLocation(GeoLocation homeLocation) {
        this.homeLocation = homeLocation;
        return this;
    }

    /**
     * Get homeLocation
     *
     * @return homeLocation
     **/
    @Schema(description = "")
    public GeoLocation getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(GeoLocation homeLocation) {
        this.homeLocation = homeLocation;
    }

    /**
     * Get lowUtilizationFromMonth
     *
     * @return lowUtilizationFromMonth
     **/
    @Schema(description = "")
    public String getLowUtilizationFromMonth() {
        return lowUtilizationFromMonth;
    }

    public EmployeeResult bankHours(Double bankHours) {
        this.bankHours = bankHours;
        return this;
    }

    /**
     * Get bankHours
     *
     * @return bankHours
     **/
    @Schema(description = "")
    public Double getBankHours() {
        return bankHours;
    }

    public void setBankHours(Double bankHours) {
        this.bankHours = bankHours;
    }

    /**
     * Get fullName
     *
     * @return fullName
     **/
    @Schema(description = "")
    public String getFullName() {
        return fullName;
    }

    public EmployeeResult gender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get gender
     *
     * @return gender
     **/
    @Schema(description = "")
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public EmployeeResult mail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get mail
     *
     * @return mail
     **/
    @Schema(description = "")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public EmployeeResult id(Long id) {
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
        EmployeeResult employeeResult = (EmployeeResult) o;
        return Objects.equals(this.firstName, employeeResult.firstName) &&
                Objects.equals(this.lastName, employeeResult.lastName) &&
                Objects.equals(this.code, employeeResult.code) &&
                Objects.equals(this.superior, employeeResult.superior) &&
                Objects.equals(this.jobProfile, employeeResult.jobProfile) &&
                Objects.equals(this.title, employeeResult.title) &&
                Objects.equals(this.percentage, employeeResult.percentage) &&
                Objects.equals(this.internalRate, employeeResult.internalRate) &&
                Objects.equals(this.externalRate, employeeResult.externalRate) &&
                Objects.equals(this.businessPhone, employeeResult.businessPhone) &&
                Objects.equals(this.mobilePhone, employeeResult.mobilePhone) &&
                Objects.equals(this.isManagement, employeeResult.isManagement) &&
                Objects.equals(this.match, employeeResult.match) &&
                Objects.equals(this.focus, employeeResult.focus) &&
                Objects.equals(this.experience, employeeResult.experience) &&
                Objects.equals(this.experienceText, employeeResult.experienceText) &&
                Objects.equals(this.entryDate, employeeResult.entryDate) &&
                Objects.equals(this.entryDateText, employeeResult.entryDateText) &&
                Objects.equals(this.leaveDate, employeeResult.leaveDate) &&
                Objects.equals(this.leaveDateText, employeeResult.leaveDateText) &&
                Objects.equals(this.dateOfBirth, employeeResult.dateOfBirth) &&
                Objects.equals(this.organisationUnit, employeeResult.organisationUnit) &&
                Objects.equals(this.team, employeeResult.team) &&
                Objects.equals(this.qualification, employeeResult.qualification) &&
                Objects.equals(this.grade, employeeResult.grade) &&
                Objects.equals(this.gradeText, employeeResult.gradeText) &&
                Objects.equals(this.location, employeeResult.location) &&
                Objects.equals(this.company, employeeResult.company) &&
                Objects.equals(this.privateAddressCity, employeeResult.privateAddressCity) &&
                Objects.equals(this.privateAddressZip, employeeResult.privateAddressZip) &&
                Objects.equals(this.distance, employeeResult.distance) &&
                Objects.equals(this.lowUtilizationFrom, employeeResult.lowUtilizationFrom) &&
                Objects.equals(this.homeLocation, employeeResult.homeLocation) &&
                Objects.equals(this.lowUtilizationFromMonth, employeeResult.lowUtilizationFromMonth) &&
                Objects.equals(this.bankHours, employeeResult.bankHours) &&
                Objects.equals(this.fullName, employeeResult.fullName) &&
                Objects.equals(this.gender, employeeResult.gender) &&
                Objects.equals(this.mail, employeeResult.mail) &&
                Objects.equals(this.id, employeeResult.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, code, superior, jobProfile, title, percentage, internalRate, externalRate, businessPhone, mobilePhone, isManagement, match, focus, experience, experienceText, entryDate, entryDateText, leaveDate, leaveDateText, dateOfBirth, organisationUnit, team, qualification, grade, gradeText, location, company, privateAddressCity, privateAddressZip, distance, lowUtilizationFrom, homeLocation, lowUtilizationFromMonth, bankHours, fullName, gender, mail, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeResult {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    superior: ").append(toIndentedString(superior)).append("\n");
        sb.append("    jobProfile: ").append(toIndentedString(jobProfile)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    internalRate: ").append(toIndentedString(internalRate)).append("\n");
        sb.append("    externalRate: ").append(toIndentedString(externalRate)).append("\n");
        sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    isManagement: ").append(toIndentedString(isManagement)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
        sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
        sb.append("    experienceText: ").append(toIndentedString(experienceText)).append("\n");
        sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
        sb.append("    entryDateText: ").append(toIndentedString(entryDateText)).append("\n");
        sb.append("    leaveDate: ").append(toIndentedString(leaveDate)).append("\n");
        sb.append("    leaveDateText: ").append(toIndentedString(leaveDateText)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
        sb.append("    organisationUnit: ").append(toIndentedString(organisationUnit)).append("\n");
        sb.append("    team: ").append(toIndentedString(team)).append("\n");
        sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
        sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
        sb.append("    gradeText: ").append(toIndentedString(gradeText)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    privateAddressCity: ").append(toIndentedString(privateAddressCity)).append("\n");
        sb.append("    privateAddressZip: ").append(toIndentedString(privateAddressZip)).append("\n");
        sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
        sb.append("    lowUtilizationFrom: ").append(toIndentedString(lowUtilizationFrom)).append("\n");
        sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
        sb.append("    lowUtilizationFromMonth: ").append(toIndentedString(lowUtilizationFromMonth)).append("\n");
        sb.append("    bankHours: ").append(toIndentedString(bankHours)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
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
     * Gets or Sets focus
     */
    public enum FocusEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2);

        private Integer value;

        FocusEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static FocusEnum fromValue(String text) {
            for (FocusEnum b : FocusEnum.values()) {
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
     * Gets or Sets experience
     */
    public enum ExperienceEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6);

        private Integer value;

        ExperienceEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static ExperienceEnum fromValue(String text) {
            for (ExperienceEnum b : ExperienceEnum.values()) {
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
     * Gets or Sets gender
     */
    public enum GenderEnum {
        NUMBER_0(0),
        NUMBER_1(1);

        private Integer value;

        GenderEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static GenderEnum fromValue(String text) {
            for (GenderEnum b : GenderEnum.values()) {
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
