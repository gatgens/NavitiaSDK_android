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
import com.kisio.navitia.sdk.expert.models.DateTimeType;
import com.kisio.navitia.sdk.expert.models.StopPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Row
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class Row implements Parcelable {
  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("date_times")
  private List<DateTimeType> dateTimes = new ArrayList<DateTimeType>();

  public Row stopPoint(StopPoint stopPoint) {
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

  public Row dateTimes(List<DateTimeType> dateTimes) {
    this.dateTimes = dateTimes;
    return this;
  }

  public Row addDateTimesItem(DateTimeType dateTimesItem) {
    this.dateTimes.add(dateTimesItem);
    return this;
  }

   /**
   * Get dateTimes
   * @return dateTimes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DateTimeType> getDateTimes() {
    return dateTimes;
  }

  public void setDateTimes(List<DateTimeType> dateTimes) {
    this.dateTimes = dateTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.stopPoint, row.stopPoint) &&
        Objects.equals(this.dateTimes, row.dateTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPoint, dateTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    dateTimes: ").append(toIndentedString(dateTimes)).append("\n");
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

    out.writeValue(dateTimes);
  }

  public Row() {
    super();
  }

  Row(Parcel in) {
    
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    dateTimes = (List<DateTimeType>)in.readValue(DateTimeType.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Row> CREATOR = new Parcelable.Creator<Row>() {
    public Row createFromParcel(Parcel in) {
      return new Row(in);
    }
    public Row[] newArray(int size) {
      return new Row[size];
    }
  };
}

