/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.78.0
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
import org.kisio.NavitiaSDK.models.Contributor;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Dataset
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T11:47:49.806+02:00")
public class Dataset implements Parcelable {
  @SerializedName("realtime_level")
  private String realtimeLevel = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("system")
  private String system = null;

  @SerializedName("start_validation_date")
  private String startValidationDate = null;

  @SerializedName("end_validation_date")
  private String endValidationDate = null;

  @SerializedName("contributor")
  private Contributor contributor = null;

  @SerializedName("id")
  private String id = null;

  public Dataset realtimeLevel(String realtimeLevel) {
    this.realtimeLevel = realtimeLevel;
    return this;
  }

   /**
   * Get realtimeLevel
   * @return realtimeLevel
  **/
  @ApiModelProperty(value = "")
  public String getRealtimeLevel() {
    return realtimeLevel;
  }

  public void setRealtimeLevel(String realtimeLevel) {
    this.realtimeLevel = realtimeLevel;
  }

  public Dataset description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dataset system(String system) {
    this.system = system;
    return this;
  }

   /**
   * Type of dataset provided (GTFS, Chouette, ...)
   * @return system
  **/
  @ApiModelProperty(value = "Type of dataset provided (GTFS, Chouette, ...)")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public Dataset startValidationDate(String startValidationDate) {
    this.startValidationDate = startValidationDate;
    return this;
  }

   /**
   * Start of the validity period for the dataset
   * @return startValidationDate
  **/
  @ApiModelProperty(value = "Start of the validity period for the dataset")
  public String getStartValidationDate() {
    return startValidationDate;
  }

  public void setStartValidationDate(String startValidationDate) {
    this.startValidationDate = startValidationDate;
  }

  public Dataset endValidationDate(String endValidationDate) {
    this.endValidationDate = endValidationDate;
    return this;
  }

   /**
   * End of the validity period for the dataset
   * @return endValidationDate
  **/
  @ApiModelProperty(value = "End of the validity period for the dataset")
  public String getEndValidationDate() {
    return endValidationDate;
  }

  public void setEndValidationDate(String endValidationDate) {
    this.endValidationDate = endValidationDate;
  }

  public Dataset contributor(Contributor contributor) {
    this.contributor = contributor;
    return this;
  }

   /**
   * Contributor providing the dataset
   * @return contributor
  **/
  @ApiModelProperty(value = "Contributor providing the dataset")
  public Contributor getContributor() {
    return contributor;
  }

  public void setContributor(Contributor contributor) {
    this.contributor = contributor;
  }

  public Dataset id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the object
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
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
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.realtimeLevel, dataset.realtimeLevel) &&
        Objects.equals(this.description, dataset.description) &&
        Objects.equals(this.system, dataset.system) &&
        Objects.equals(this.startValidationDate, dataset.startValidationDate) &&
        Objects.equals(this.endValidationDate, dataset.endValidationDate) &&
        Objects.equals(this.contributor, dataset.contributor) &&
        Objects.equals(this.id, dataset.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realtimeLevel, description, system, startValidationDate, endValidationDate, contributor, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    
    sb.append("    realtimeLevel: ").append(toIndentedString(realtimeLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    startValidationDate: ").append(toIndentedString(startValidationDate)).append("\n");
    sb.append("    endValidationDate: ").append(toIndentedString(endValidationDate)).append("\n");
    sb.append("    contributor: ").append(toIndentedString(contributor)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(realtimeLevel);

    out.writeValue(description);

    out.writeValue(system);

    out.writeValue(startValidationDate);

    out.writeValue(endValidationDate);

    out.writeValue(contributor);

    out.writeValue(id);
  }

  public Dataset() {
    super();
  }

  Dataset(Parcel in) {
    
    realtimeLevel = (String)in.readValue(null);
    description = (String)in.readValue(null);
    system = (String)in.readValue(null);
    startValidationDate = (String)in.readValue(null);
    endValidationDate = (String)in.readValue(null);
    contributor = (Contributor)in.readValue(Contributor.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Dataset> CREATOR = new Parcelable.Creator<Dataset>() {
    public Dataset createFromParcel(Parcel in) {
      return new Dataset(in);
    }
    public Dataset[] newArray(int size) {
      return new Dataset[size];
    }
  };
}

