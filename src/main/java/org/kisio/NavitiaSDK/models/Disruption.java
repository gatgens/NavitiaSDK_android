/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.43.0-34-g30b0bcf
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kisio.NavitiaSDK.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.Impacted;
import org.kisio.NavitiaSDK.models.Message;
import org.kisio.NavitiaSDK.models.Period;
import org.kisio.NavitiaSDK.models.Severity;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Disruption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class Disruption implements Parcelable {
  @SerializedName("disruption_id")
  private String disruptionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("past")
    PAST("past"),
    
    @SerializedName("active")
    ACTIVE("active"),
    
    @SerializedName("future")
    FUTURE("future");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("severity")
  private Severity severity = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("application_periods")
  private List<Period> applicationPeriods = null;

  @SerializedName("impact_id")
  private String impactId = null;

  @SerializedName("messages")
  private List<Message> messages = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("impacted_objects")
  private List<Impacted> impactedObjects = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("contributor")
  private String contributor = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("cause")
  private String cause = null;

  @SerializedName("disruption_uri")
  private String disruptionUri = null;

  public Disruption disruptionId(String disruptionId) {
    this.disruptionId = disruptionId;
    return this;
  }

   /**
   * Get disruptionId
   * @return disruptionId
  **/
  @ApiModelProperty(value = "")
  public String getDisruptionId() {
    return disruptionId;
  }

  public void setDisruptionId(String disruptionId) {
    this.disruptionId = disruptionId;
  }

  public Disruption status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Disruption severity(Severity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")
  public Severity getSeverity() {
    return severity;
  }

  public void setSeverity(Severity severity) {
    this.severity = severity;
  }

  public Disruption tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Disruption addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Disruption applicationPeriods(List<Period> applicationPeriods) {
    this.applicationPeriods = applicationPeriods;
    return this;
  }

  public Disruption addApplicationPeriodsItem(Period applicationPeriodsItem) {
    if (this.applicationPeriods == null) {
      this.applicationPeriods = new ArrayList<Period>();
    }
    this.applicationPeriods.add(applicationPeriodsItem);
    return this;
  }

   /**
   * Get applicationPeriods
   * @return applicationPeriods
  **/
  @ApiModelProperty(value = "")
  public List<Period> getApplicationPeriods() {
    return applicationPeriods;
  }

  public void setApplicationPeriods(List<Period> applicationPeriods) {
    this.applicationPeriods = applicationPeriods;
  }

  public Disruption impactId(String impactId) {
    this.impactId = impactId;
    return this;
  }

   /**
   * Get impactId
   * @return impactId
  **/
  @ApiModelProperty(value = "")
  public String getImpactId() {
    return impactId;
  }

  public void setImpactId(String impactId) {
    this.impactId = impactId;
  }

  public Disruption messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public Disruption addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public Disruption updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Disruption uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Disruption impactedObjects(List<Impacted> impactedObjects) {
    this.impactedObjects = impactedObjects;
    return this;
  }

  public Disruption addImpactedObjectsItem(Impacted impactedObjectsItem) {
    if (this.impactedObjects == null) {
      this.impactedObjects = new ArrayList<Impacted>();
    }
    this.impactedObjects.add(impactedObjectsItem);
    return this;
  }

   /**
   * Get impactedObjects
   * @return impactedObjects
  **/
  @ApiModelProperty(value = "")
  public List<Impacted> getImpactedObjects() {
    return impactedObjects;
  }

  public void setImpactedObjects(List<Impacted> impactedObjects) {
    this.impactedObjects = impactedObjects;
  }

  public Disruption id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Disruption contributor(String contributor) {
    this.contributor = contributor;
    return this;
  }

   /**
   * Get contributor
   * @return contributor
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContributor() {
    return contributor;
  }

  public void setContributor(String contributor) {
    this.contributor = contributor;
  }

  public Disruption category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Disruption cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public Disruption disruptionUri(String disruptionUri) {
    this.disruptionUri = disruptionUri;
    return this;
  }

   /**
   * Get disruptionUri
   * @return disruptionUri
  **/
  @ApiModelProperty(value = "")
  public String getDisruptionUri() {
    return disruptionUri;
  }

  public void setDisruptionUri(String disruptionUri) {
    this.disruptionUri = disruptionUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disruption disruption = (Disruption) o;
    return Objects.equals(this.disruptionId, disruption.disruptionId) &&
        Objects.equals(this.status, disruption.status) &&
        Objects.equals(this.severity, disruption.severity) &&
        Objects.equals(this.tags, disruption.tags) &&
        Objects.equals(this.applicationPeriods, disruption.applicationPeriods) &&
        Objects.equals(this.impactId, disruption.impactId) &&
        Objects.equals(this.messages, disruption.messages) &&
        Objects.equals(this.updatedAt, disruption.updatedAt) &&
        Objects.equals(this.uri, disruption.uri) &&
        Objects.equals(this.impactedObjects, disruption.impactedObjects) &&
        Objects.equals(this.id, disruption.id) &&
        Objects.equals(this.contributor, disruption.contributor) &&
        Objects.equals(this.category, disruption.category) &&
        Objects.equals(this.cause, disruption.cause) &&
        Objects.equals(this.disruptionUri, disruption.disruptionUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionId, status, severity, tags, applicationPeriods, impactId, messages, updatedAt, uri, impactedObjects, id, contributor, category, cause, disruptionUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disruption {\n");
    
    sb.append("    disruptionId: ").append(toIndentedString(disruptionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicationPeriods: ").append(toIndentedString(applicationPeriods)).append("\n");
    sb.append("    impactId: ").append(toIndentedString(impactId)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    impactedObjects: ").append(toIndentedString(impactedObjects)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contributor: ").append(toIndentedString(contributor)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    disruptionUri: ").append(toIndentedString(disruptionUri)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(disruptionId);

    out.writeValue(status);

    out.writeValue(severity);

    out.writeValue(tags);

    out.writeValue(applicationPeriods);

    out.writeValue(impactId);

    out.writeValue(messages);

    out.writeValue(updatedAt);

    out.writeValue(uri);

    out.writeValue(impactedObjects);

    out.writeValue(id);

    out.writeValue(contributor);

    out.writeValue(category);

    out.writeValue(cause);

    out.writeValue(disruptionUri);
  }

  public Disruption() {
    super();
  }

  Disruption(Parcel in) {
    
    disruptionId = (String)in.readValue(null);
    status = (StatusEnum)in.readValue(null);
    severity = (Severity)in.readValue(Severity.class.getClassLoader());
    tags = (List<String>)in.readValue(null);
    applicationPeriods = (List<Period>)in.readValue(Period.class.getClassLoader());
    impactId = (String)in.readValue(null);
    messages = (List<Message>)in.readValue(Message.class.getClassLoader());
    updatedAt = (String)in.readValue(null);
    uri = (String)in.readValue(null);
    impactedObjects = (List<Impacted>)in.readValue(Impacted.class.getClassLoader());
    id = (String)in.readValue(null);
    contributor = (String)in.readValue(null);
    category = (String)in.readValue(null);
    cause = (String)in.readValue(null);
    disruptionUri = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Disruption> CREATOR = new Parcelable.Creator<Disruption>() {
    public Disruption createFromParcel(Parcel in) {
      return new Disruption(in);
    }
    public Disruption[] newArray(int size) {
      return new Disruption[size];
    }
  };
}

