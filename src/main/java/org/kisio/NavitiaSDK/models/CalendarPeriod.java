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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * CalendarPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T11:47:49.806+02:00")
public class CalendarPeriod implements Parcelable {
  @SerializedName("begin")
  private String begin = null;

  @SerializedName("end")
  private String end = null;

  public CalendarPeriod begin(String begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Get begin
   * @return begin
  **/
  @ApiModelProperty(value = "")
  public String getBegin() {
    return begin;
  }

  public void setBegin(String begin) {
    this.begin = begin;
  }

  public CalendarPeriod end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarPeriod calendarPeriod = (CalendarPeriod) o;
    return Objects.equals(this.begin, calendarPeriod.begin) &&
        Objects.equals(this.end, calendarPeriod.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarPeriod {\n");
    
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
     
    out.writeValue(begin);

    out.writeValue(end);
  }

  public CalendarPeriod() {
    super();
  }

  CalendarPeriod(Parcel in) {
    
    begin = (String)in.readValue(null);
    end = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CalendarPeriod> CREATOR = new Parcelable.Creator<CalendarPeriod>() {
    public CalendarPeriod createFromParcel(Parcel in) {
      return new CalendarPeriod(in);
    }
    public CalendarPeriod[] newArray(int size) {
      return new CalendarPeriod[size];
    }
  };
}

