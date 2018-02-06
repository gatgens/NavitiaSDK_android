/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.49.0
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
import org.kisio.NavitiaSDK.models.CalendarException;
import org.kisio.NavitiaSDK.models.CalendarPeriod;
import org.kisio.NavitiaSDK.models.ValidityPattern;
import org.kisio.NavitiaSDK.models.WeekPattern;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Calendar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class Calendar implements Parcelable {
  @SerializedName("active_periods")
  private List<CalendarPeriod> activePeriods = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("validity_pattern")
  private ValidityPattern validityPattern = null;

  @SerializedName("exceptions")
  private List<CalendarException> exceptions = null;

  @SerializedName("week_pattern")
  private WeekPattern weekPattern = null;

  @SerializedName("id")
  private String id = null;

  public Calendar activePeriods(List<CalendarPeriod> activePeriods) {
    this.activePeriods = activePeriods;
    return this;
  }

  public Calendar addActivePeriodsItem(CalendarPeriod activePeriodsItem) {
    if (this.activePeriods == null) {
      this.activePeriods = new ArrayList<CalendarPeriod>();
    }
    this.activePeriods.add(activePeriodsItem);
    return this;
  }

   /**
   * Get activePeriods
   * @return activePeriods
  **/
  @ApiModelProperty(value = "")
  public List<CalendarPeriod> getActivePeriods() {
    return activePeriods;
  }

  public void setActivePeriods(List<CalendarPeriod> activePeriods) {
    this.activePeriods = activePeriods;
  }

  public Calendar name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Calendar validityPattern(ValidityPattern validityPattern) {
    this.validityPattern = validityPattern;
    return this;
  }

   /**
   * Get validityPattern
   * @return validityPattern
  **/
  @ApiModelProperty(value = "")
  public ValidityPattern getValidityPattern() {
    return validityPattern;
  }

  public void setValidityPattern(ValidityPattern validityPattern) {
    this.validityPattern = validityPattern;
  }

  public Calendar exceptions(List<CalendarException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Calendar addExceptionsItem(CalendarException exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<CalendarException>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
  @ApiModelProperty(value = "")
  public List<CalendarException> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<CalendarException> exceptions) {
    this.exceptions = exceptions;
  }

  public Calendar weekPattern(WeekPattern weekPattern) {
    this.weekPattern = weekPattern;
    return this;
  }

   /**
   * Get weekPattern
   * @return weekPattern
  **/
  @ApiModelProperty(value = "")
  public WeekPattern getWeekPattern() {
    return weekPattern;
  }

  public void setWeekPattern(WeekPattern weekPattern) {
    this.weekPattern = weekPattern;
  }

  public Calendar id(String id) {
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
    Calendar calendar = (Calendar) o;
    return Objects.equals(this.activePeriods, calendar.activePeriods) &&
        Objects.equals(this.name, calendar.name) &&
        Objects.equals(this.validityPattern, calendar.validityPattern) &&
        Objects.equals(this.exceptions, calendar.exceptions) &&
        Objects.equals(this.weekPattern, calendar.weekPattern) &&
        Objects.equals(this.id, calendar.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activePeriods, name, validityPattern, exceptions, weekPattern, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calendar {\n");
    
    sb.append("    activePeriods: ").append(toIndentedString(activePeriods)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validityPattern: ").append(toIndentedString(validityPattern)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    weekPattern: ").append(toIndentedString(weekPattern)).append("\n");
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
     
    out.writeValue(activePeriods);

    out.writeValue(name);

    out.writeValue(validityPattern);

    out.writeValue(exceptions);

    out.writeValue(weekPattern);

    out.writeValue(id);
  }

  public Calendar() {
    super();
  }

  Calendar(Parcel in) {
    
    activePeriods = (List<CalendarPeriod>)in.readValue(CalendarPeriod.class.getClassLoader());
    name = (String)in.readValue(null);
    validityPattern = (ValidityPattern)in.readValue(ValidityPattern.class.getClassLoader());
    exceptions = (List<CalendarException>)in.readValue(CalendarException.class.getClassLoader());
    weekPattern = (WeekPattern)in.readValue(WeekPattern.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Calendar> CREATOR = new Parcelable.Creator<Calendar>() {
    public Calendar createFromParcel(Parcel in) {
      return new Calendar(in);
    }
    public Calendar[] newArray(int size) {
      return new Calendar[size];
    }
  };
}

