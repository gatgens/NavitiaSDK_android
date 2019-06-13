/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * WeekPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class WeekPattern implements Parcelable {
  @SerializedName("monday")
  private Boolean monday = null;

  @SerializedName("tuesday")
  private Boolean tuesday = null;

  @SerializedName("friday")
  private Boolean friday = null;

  @SerializedName("wednesday")
  private Boolean wednesday = null;

  @SerializedName("thursday")
  private Boolean thursday = null;

  @SerializedName("sunday")
  private Boolean sunday = null;

  @SerializedName("saturday")
  private Boolean saturday = null;

  public WeekPattern monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @ApiModelProperty(value = "")
  public Boolean getMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public WeekPattern tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @ApiModelProperty(value = "")
  public Boolean getTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public WeekPattern friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @ApiModelProperty(value = "")
  public Boolean getFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public WeekPattern wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @ApiModelProperty(value = "")
  public Boolean getWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public WeekPattern thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @ApiModelProperty(value = "")
  public Boolean getThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public WeekPattern sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @ApiModelProperty(value = "")
  public Boolean getSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public WeekPattern saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @ApiModelProperty(value = "")
  public Boolean getSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekPattern weekPattern = (WeekPattern) o;
    return Objects.equals(this.monday, weekPattern.monday) &&
        Objects.equals(this.tuesday, weekPattern.tuesday) &&
        Objects.equals(this.friday, weekPattern.friday) &&
        Objects.equals(this.wednesday, weekPattern.wednesday) &&
        Objects.equals(this.thursday, weekPattern.thursday) &&
        Objects.equals(this.sunday, weekPattern.sunday) &&
        Objects.equals(this.saturday, weekPattern.saturday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, friday, wednesday, thursday, sunday, saturday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekPattern {\n");
    
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
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
     
    out.writeValue(monday);

    out.writeValue(tuesday);

    out.writeValue(friday);

    out.writeValue(wednesday);

    out.writeValue(thursday);

    out.writeValue(sunday);

    out.writeValue(saturday);
  }

  public WeekPattern() {
    super();
  }

  WeekPattern(Parcel in) {
    
    monday = (Boolean)in.readValue(null);
    tuesday = (Boolean)in.readValue(null);
    friday = (Boolean)in.readValue(null);
    wednesday = (Boolean)in.readValue(null);
    thursday = (Boolean)in.readValue(null);
    sunday = (Boolean)in.readValue(null);
    saturday = (Boolean)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<WeekPattern> CREATOR = new Parcelable.Creator<WeekPattern>() {
    public WeekPattern createFromParcel(Parcel in) {
      return new WeekPattern(in);
    }
    public WeekPattern[] newArray(int size) {
      return new WeekPattern[size];
    }
  };
}

