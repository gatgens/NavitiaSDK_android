/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.82.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.data.expert.models.CoverageError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Coverage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Coverage implements Parcelable {
  @SerializedName("status")
  private String status = null;

  @SerializedName("dataset_created_at")
  private String datasetCreatedAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start_production_date")
  private String startProductionDate = null;

  @SerializedName("shape")
  private String shape = null;

  @SerializedName("end_production_date")
  private String endProductionDate = null;

  @SerializedName("error")
  private CoverageError error = null;

  @SerializedName("last_load_at")
  private String lastLoadAt = null;

  @SerializedName("id")
  private String id = null;

  public Coverage status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Coverage datasetCreatedAt(String datasetCreatedAt) {
    this.datasetCreatedAt = datasetCreatedAt;
    return this;
  }

   /**
   * Creation date of the dataset
   * @return datasetCreatedAt
  **/
  @ApiModelProperty(value = "Creation date of the dataset")
  public String getDatasetCreatedAt() {
    return datasetCreatedAt;
  }

  public void setDatasetCreatedAt(String datasetCreatedAt) {
    this.datasetCreatedAt = datasetCreatedAt;
  }

  public Coverage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the coverage
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the coverage")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Coverage startProductionDate(String startProductionDate) {
    this.startProductionDate = startProductionDate;
    return this;
  }

   /**
   * Beginning of the production period. We only have data on this production period
   * @return startProductionDate
  **/
  @ApiModelProperty(value = "Beginning of the production period. We only have data on this production period")
  public String getStartProductionDate() {
    return startProductionDate;
  }

  public void setStartProductionDate(String startProductionDate) {
    this.startProductionDate = startProductionDate;
  }

  public Coverage shape(String shape) {
    this.shape = shape;
    return this;
  }

   /**
   * GeoJSON of the shape of the coverage
   * @return shape
  **/
  @ApiModelProperty(required = true, value = "GeoJSON of the shape of the coverage")
  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public Coverage endProductionDate(String endProductionDate) {
    this.endProductionDate = endProductionDate;
    return this;
  }

   /**
   * End of the production period. We only have data on this production period
   * @return endProductionDate
  **/
  @ApiModelProperty(value = "End of the production period. We only have data on this production period")
  public String getEndProductionDate() {
    return endProductionDate;
  }

  public void setEndProductionDate(String endProductionDate) {
    this.endProductionDate = endProductionDate;
  }

  public Coverage error(CoverageError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public CoverageError getError() {
    return error;
  }

  public void setError(CoverageError error) {
    this.error = error;
  }

  public Coverage lastLoadAt(String lastLoadAt) {
    this.lastLoadAt = lastLoadAt;
    return this;
  }

   /**
   * Datetime of the last data loading
   * @return lastLoadAt
  **/
  @ApiModelProperty(value = "Datetime of the last data loading")
  public String getLastLoadAt() {
    return lastLoadAt;
  }

  public void setLastLoadAt(String lastLoadAt) {
    this.lastLoadAt = lastLoadAt;
  }

  public Coverage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the coverage
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the coverage")
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
    Coverage coverage = (Coverage) o;
    return Objects.equals(this.status, coverage.status) &&
        Objects.equals(this.datasetCreatedAt, coverage.datasetCreatedAt) &&
        Objects.equals(this.name, coverage.name) &&
        Objects.equals(this.startProductionDate, coverage.startProductionDate) &&
        Objects.equals(this.shape, coverage.shape) &&
        Objects.equals(this.endProductionDate, coverage.endProductionDate) &&
        Objects.equals(this.error, coverage.error) &&
        Objects.equals(this.lastLoadAt, coverage.lastLoadAt) &&
        Objects.equals(this.id, coverage.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, datasetCreatedAt, name, startProductionDate, shape, endProductionDate, error, lastLoadAt, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coverage {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    datasetCreatedAt: ").append(toIndentedString(datasetCreatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startProductionDate: ").append(toIndentedString(startProductionDate)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    endProductionDate: ").append(toIndentedString(endProductionDate)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    lastLoadAt: ").append(toIndentedString(lastLoadAt)).append("\n");
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
     
    out.writeValue(status);

    out.writeValue(datasetCreatedAt);

    out.writeValue(name);

    out.writeValue(startProductionDate);

    out.writeValue(shape);

    out.writeValue(endProductionDate);

    out.writeValue(error);

    out.writeValue(lastLoadAt);

    out.writeValue(id);
  }

  public Coverage() {
    super();
  }

  Coverage(Parcel in) {
    
    status = (String)in.readValue(null);
    datasetCreatedAt = (String)in.readValue(null);
    name = (String)in.readValue(null);
    startProductionDate = (String)in.readValue(null);
    shape = (String)in.readValue(null);
    endProductionDate = (String)in.readValue(null);
    error = (CoverageError)in.readValue(CoverageError.class.getClassLoader());
    lastLoadAt = (String)in.readValue(null);
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Coverage> CREATOR = new Parcelable.Creator<Coverage>() {
    public Coverage createFromParcel(Parcel in) {
      return new Coverage(in);
    }
    public Coverage[] newArray(int size) {
      return new Coverage[size];
    }
  };
}

