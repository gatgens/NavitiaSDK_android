/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2-3-g25474e0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.JourneyPatternPoint;
import com.kisio.navitia.sdk.expert.models.StopPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * StopTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class StopTime implements Parcelable {
  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("utc_arrival_time")
  private String utcArrivalTime = null;

  @SerializedName("utc_departure_time")
  private String utcDepartureTime = null;

  @SerializedName("headsign")
  private String headsign = null;

  @SerializedName("arrival_time")
  private String arrivalTime = null;

  @SerializedName("journey_pattern_point")
  private JourneyPatternPoint journeyPatternPoint = null;

  @SerializedName("departure_time")
  private String departureTime = null;

  public StopTime stopPoint(StopPoint stopPoint) {
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

  public StopTime utcArrivalTime(String utcArrivalTime) {
    this.utcArrivalTime = utcArrivalTime;
    return this;
  }

   /**
   * Get utcArrivalTime
   * @return utcArrivalTime
  **/
  @ApiModelProperty(value = "")
  public String getUtcArrivalTime() {
    return utcArrivalTime;
  }

  public void setUtcArrivalTime(String utcArrivalTime) {
    this.utcArrivalTime = utcArrivalTime;
  }

  public StopTime utcDepartureTime(String utcDepartureTime) {
    this.utcDepartureTime = utcDepartureTime;
    return this;
  }

   /**
   * Get utcDepartureTime
   * @return utcDepartureTime
  **/
  @ApiModelProperty(value = "")
  public String getUtcDepartureTime() {
    return utcDepartureTime;
  }

  public void setUtcDepartureTime(String utcDepartureTime) {
    this.utcDepartureTime = utcDepartureTime;
  }

  public StopTime headsign(String headsign) {
    this.headsign = headsign;
    return this;
  }

   /**
   * Get headsign
   * @return headsign
  **/
  @ApiModelProperty(value = "")
  public String getHeadsign() {
    return headsign;
  }

  public void setHeadsign(String headsign) {
    this.headsign = headsign;
  }

  public StopTime arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * Get arrivalTime
   * @return arrivalTime
  **/
  @ApiModelProperty(value = "")
  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public StopTime journeyPatternPoint(JourneyPatternPoint journeyPatternPoint) {
    this.journeyPatternPoint = journeyPatternPoint;
    return this;
  }

   /**
   * Get journeyPatternPoint
   * @return journeyPatternPoint
  **/
  @ApiModelProperty(value = "")
  public JourneyPatternPoint getJourneyPatternPoint() {
    return journeyPatternPoint;
  }

  public void setJourneyPatternPoint(JourneyPatternPoint journeyPatternPoint) {
    this.journeyPatternPoint = journeyPatternPoint;
  }

  public StopTime departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Get departureTime
   * @return departureTime
  **/
  @ApiModelProperty(value = "")
  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopTime stopTime = (StopTime) o;
    return Objects.equals(this.stopPoint, stopTime.stopPoint) &&
        Objects.equals(this.utcArrivalTime, stopTime.utcArrivalTime) &&
        Objects.equals(this.utcDepartureTime, stopTime.utcDepartureTime) &&
        Objects.equals(this.headsign, stopTime.headsign) &&
        Objects.equals(this.arrivalTime, stopTime.arrivalTime) &&
        Objects.equals(this.journeyPatternPoint, stopTime.journeyPatternPoint) &&
        Objects.equals(this.departureTime, stopTime.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPoint, utcArrivalTime, utcDepartureTime, headsign, arrivalTime, journeyPatternPoint, departureTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopTime {\n");
    
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    utcArrivalTime: ").append(toIndentedString(utcArrivalTime)).append("\n");
    sb.append("    utcDepartureTime: ").append(toIndentedString(utcDepartureTime)).append("\n");
    sb.append("    headsign: ").append(toIndentedString(headsign)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    journeyPatternPoint: ").append(toIndentedString(journeyPatternPoint)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
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
     
    out.writeValue(stopPoint);

    out.writeValue(utcArrivalTime);

    out.writeValue(utcDepartureTime);

    out.writeValue(headsign);

    out.writeValue(arrivalTime);

    out.writeValue(journeyPatternPoint);

    out.writeValue(departureTime);
  }

  public StopTime() {
    super();
  }

  StopTime(Parcel in) {
    
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    utcArrivalTime = (String)in.readValue(null);
    utcDepartureTime = (String)in.readValue(null);
    headsign = (String)in.readValue(null);
    arrivalTime = (String)in.readValue(null);
    journeyPatternPoint = (JourneyPatternPoint)in.readValue(JourneyPatternPoint.class.getClassLoader());
    departureTime = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<StopTime> CREATOR = new Parcelable.Creator<StopTime>() {
    public StopTime createFromParcel(Parcel in) {
      return new StopTime(in);
    }
    public StopTime[] newArray(int size) {
      return new StopTime[size];
    }
  };
}

