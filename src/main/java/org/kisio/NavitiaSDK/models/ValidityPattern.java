/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.75.0
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
 * ValidityPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-04-08T11:54:38.551+02:00")
public class ValidityPattern implements Parcelable {
  @SerializedName("beginning_date")
  private String beginningDate = null;

  @SerializedName("days")
  private String days = null;

  public ValidityPattern beginningDate(String beginningDate) {
    this.beginningDate = beginningDate;
    return this;
  }

   /**
   * Get beginningDate
   * @return beginningDate
  **/
  @ApiModelProperty(value = "")
  public String getBeginningDate() {
    return beginningDate;
  }

  public void setBeginningDate(String beginningDate) {
    this.beginningDate = beginningDate;
  }

  public ValidityPattern days(String days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(value = "")
  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidityPattern validityPattern = (ValidityPattern) o;
    return Objects.equals(this.beginningDate, validityPattern.beginningDate) &&
        Objects.equals(this.days, validityPattern.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginningDate, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidityPattern {\n");
    
    sb.append("    beginningDate: ").append(toIndentedString(beginningDate)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
     
    out.writeValue(beginningDate);

    out.writeValue(days);
  }

  public ValidityPattern() {
    super();
  }

  ValidityPattern(Parcel in) {
    
    beginningDate = (String)in.readValue(null);
    days = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ValidityPattern> CREATOR = new Parcelable.Creator<ValidityPattern>() {
    public ValidityPattern createFromParcel(Parcel in) {
      return new ValidityPattern(in);
    }
    public ValidityPattern[] newArray(int size) {
      return new ValidityPattern[size];
    }
  };
}

