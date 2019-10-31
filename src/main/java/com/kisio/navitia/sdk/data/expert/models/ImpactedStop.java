/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.87.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.data.expert.models.StopPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * ImpactedStop
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class ImpactedStop implements Parcelable {
  @SerializedName("amended_arrival_time")
  private String amendedArrivalTime = null;

  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  /**
   * Gets or Sets stopTimeEffect
   */
  public enum StopTimeEffectEnum {
    @SerializedName("delayed")
    DELAYED("delayed"),
    
    @SerializedName("added")
    ADDED("added"),
    
    @SerializedName("deleted")
    DELETED("deleted"),
    
    @SerializedName("unchanged")
    UNCHANGED("unchanged");

    private String value;

    StopTimeEffectEnum(String value) {
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

  @SerializedName("stop_time_effect")
  private StopTimeEffectEnum stopTimeEffect = null;

  @SerializedName("departure_status")
  private String departureStatus = null;

  @SerializedName("is_detour")
  private Boolean isDetour = null;

  @SerializedName("amended_departure_time")
  private String amendedDepartureTime = null;

  @SerializedName("base_arrival_time")
  private String baseArrivalTime = null;

  @SerializedName("cause")
  private String cause = null;

  @SerializedName("base_departure_time")
  private String baseDepartureTime = null;

  @SerializedName("arrival_status")
  private String arrivalStatus = null;

  public ImpactedStop amendedArrivalTime(String amendedArrivalTime) {
    this.amendedArrivalTime = amendedArrivalTime;
    return this;
  }

   /**
   * Get amendedArrivalTime
   * @return amendedArrivalTime
  **/
  @ApiModelProperty(value = "")
  public String getAmendedArrivalTime() {
    return amendedArrivalTime;
  }

  public void setAmendedArrivalTime(String amendedArrivalTime) {
    this.amendedArrivalTime = amendedArrivalTime;
  }

  public ImpactedStop stopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
    return this;
  }

   /**
   * Get stopPoint
   * @return stopPoint
  **/
  @ApiModelProperty(value = "")
  public StopPoint getStopPoint() {
    return stopPoint;
  }

  public void setStopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
  }

  public ImpactedStop stopTimeEffect(StopTimeEffectEnum stopTimeEffect) {
    this.stopTimeEffect = stopTimeEffect;
    return this;
  }

   /**
   * Get stopTimeEffect
   * @return stopTimeEffect
  **/
  @ApiModelProperty(value = "")
  public StopTimeEffectEnum getStopTimeEffect() {
    return stopTimeEffect;
  }

  public void setStopTimeEffect(StopTimeEffectEnum stopTimeEffect) {
    this.stopTimeEffect = stopTimeEffect;
  }

  public ImpactedStop departureStatus(String departureStatus) {
    this.departureStatus = departureStatus;
    return this;
  }

   /**
   * Get departureStatus
   * @return departureStatus
  **/
  @ApiModelProperty(value = "")
  public String getDepartureStatus() {
    return departureStatus;
  }

  public void setDepartureStatus(String departureStatus) {
    this.departureStatus = departureStatus;
  }

  public ImpactedStop isDetour(Boolean isDetour) {
    this.isDetour = isDetour;
    return this;
  }

   /**
   * Get isDetour
   * @return isDetour
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsDetour() {
    return isDetour;
  }

  public void setIsDetour(Boolean isDetour) {
    this.isDetour = isDetour;
  }

  public ImpactedStop amendedDepartureTime(String amendedDepartureTime) {
    this.amendedDepartureTime = amendedDepartureTime;
    return this;
  }

   /**
   * Get amendedDepartureTime
   * @return amendedDepartureTime
  **/
  @ApiModelProperty(value = "")
  public String getAmendedDepartureTime() {
    return amendedDepartureTime;
  }

  public void setAmendedDepartureTime(String amendedDepartureTime) {
    this.amendedDepartureTime = amendedDepartureTime;
  }

  public ImpactedStop baseArrivalTime(String baseArrivalTime) {
    this.baseArrivalTime = baseArrivalTime;
    return this;
  }

   /**
   * Get baseArrivalTime
   * @return baseArrivalTime
  **/
  @ApiModelProperty(value = "")
  public String getBaseArrivalTime() {
    return baseArrivalTime;
  }

  public void setBaseArrivalTime(String baseArrivalTime) {
    this.baseArrivalTime = baseArrivalTime;
  }

  public ImpactedStop cause(String cause) {
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

  public ImpactedStop baseDepartureTime(String baseDepartureTime) {
    this.baseDepartureTime = baseDepartureTime;
    return this;
  }

   /**
   * Get baseDepartureTime
   * @return baseDepartureTime
  **/
  @ApiModelProperty(value = "")
  public String getBaseDepartureTime() {
    return baseDepartureTime;
  }

  public void setBaseDepartureTime(String baseDepartureTime) {
    this.baseDepartureTime = baseDepartureTime;
  }

  public ImpactedStop arrivalStatus(String arrivalStatus) {
    this.arrivalStatus = arrivalStatus;
    return this;
  }

   /**
   * Get arrivalStatus
   * @return arrivalStatus
  **/
  @ApiModelProperty(value = "")
  public String getArrivalStatus() {
    return arrivalStatus;
  }

  public void setArrivalStatus(String arrivalStatus) {
    this.arrivalStatus = arrivalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactedStop impactedStop = (ImpactedStop) o;
    return Objects.equals(this.amendedArrivalTime, impactedStop.amendedArrivalTime) &&
        Objects.equals(this.stopPoint, impactedStop.stopPoint) &&
        Objects.equals(this.stopTimeEffect, impactedStop.stopTimeEffect) &&
        Objects.equals(this.departureStatus, impactedStop.departureStatus) &&
        Objects.equals(this.isDetour, impactedStop.isDetour) &&
        Objects.equals(this.amendedDepartureTime, impactedStop.amendedDepartureTime) &&
        Objects.equals(this.baseArrivalTime, impactedStop.baseArrivalTime) &&
        Objects.equals(this.cause, impactedStop.cause) &&
        Objects.equals(this.baseDepartureTime, impactedStop.baseDepartureTime) &&
        Objects.equals(this.arrivalStatus, impactedStop.arrivalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amendedArrivalTime, stopPoint, stopTimeEffect, departureStatus, isDetour, amendedDepartureTime, baseArrivalTime, cause, baseDepartureTime, arrivalStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactedStop {\n");
    
    sb.append("    amendedArrivalTime: ").append(toIndentedString(amendedArrivalTime)).append("\n");
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    stopTimeEffect: ").append(toIndentedString(stopTimeEffect)).append("\n");
    sb.append("    departureStatus: ").append(toIndentedString(departureStatus)).append("\n");
    sb.append("    isDetour: ").append(toIndentedString(isDetour)).append("\n");
    sb.append("    amendedDepartureTime: ").append(toIndentedString(amendedDepartureTime)).append("\n");
    sb.append("    baseArrivalTime: ").append(toIndentedString(baseArrivalTime)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    baseDepartureTime: ").append(toIndentedString(baseDepartureTime)).append("\n");
    sb.append("    arrivalStatus: ").append(toIndentedString(arrivalStatus)).append("\n");
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
     
    out.writeValue(amendedArrivalTime);

    out.writeValue(stopPoint);

    out.writeValue(stopTimeEffect);

    out.writeValue(departureStatus);

    out.writeValue(isDetour);

    out.writeValue(amendedDepartureTime);

    out.writeValue(baseArrivalTime);

    out.writeValue(cause);

    out.writeValue(baseDepartureTime);

    out.writeValue(arrivalStatus);
  }

  public ImpactedStop() {
    super();
  }

  ImpactedStop(Parcel in) {
    
    amendedArrivalTime = (String)in.readValue(null);
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    stopTimeEffect = (StopTimeEffectEnum)in.readValue(null);
    departureStatus = (String)in.readValue(null);
    isDetour = (Boolean)in.readValue(null);
    amendedDepartureTime = (String)in.readValue(null);
    baseArrivalTime = (String)in.readValue(null);
    cause = (String)in.readValue(null);
    baseDepartureTime = (String)in.readValue(null);
    arrivalStatus = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ImpactedStop> CREATOR = new Parcelable.Creator<ImpactedStop>() {
    public ImpactedStop createFromParcel(Parcel in) {
      return new ImpactedStop(in);
    }
    public ImpactedStop[] newArray(int size) {
      return new ImpactedStop[size];
    }
  };
}
