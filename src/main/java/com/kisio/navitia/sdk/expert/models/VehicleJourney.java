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
import com.kisio.navitia.sdk.expert.models.Calendar;
import com.kisio.navitia.sdk.expert.models.Code;
import com.kisio.navitia.sdk.expert.models.Comment;
import com.kisio.navitia.sdk.expert.models.JourneyPattern;
import com.kisio.navitia.sdk.expert.models.LinkSchema;
import com.kisio.navitia.sdk.expert.models.StopTime;
import com.kisio.navitia.sdk.expert.models.Trip;
import com.kisio.navitia.sdk.expert.models.ValidityPattern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * VehicleJourney
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class VehicleJourney implements Parcelable {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("codes")
  private List<Code> codes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("journey_pattern")
  private JourneyPattern journeyPattern = null;

  @SerializedName("disruptions")
  private List<LinkSchema> disruptions = new ArrayList<LinkSchema>();

  @SerializedName("calendars")
  private List<Calendar> calendars = null;

  @SerializedName("stop_times")
  private List<StopTime> stopTimes = null;

  @SerializedName("comments")
  private List<Comment> comments = null;

  @SerializedName("validity_pattern")
  private ValidityPattern validityPattern = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("trip")
  private Trip trip = null;

  public VehicleJourney comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public VehicleJourney codes(List<Code> codes) {
    this.codes = codes;
    return this;
  }

  public VehicleJourney addCodesItem(Code codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<Code>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * Get codes
   * @return codes
  **/
  @ApiModelProperty(value = "")
  public List<Code> getCodes() {
    return codes;
  }

  public void setCodes(List<Code> codes) {
    this.codes = codes;
  }

  public VehicleJourney name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleJourney journeyPattern(JourneyPattern journeyPattern) {
    this.journeyPattern = journeyPattern;
    return this;
  }

   /**
   * Get journeyPattern
   * @return journeyPattern
  **/
  @ApiModelProperty(value = "")
  public JourneyPattern getJourneyPattern() {
    return journeyPattern;
  }

  public void setJourneyPattern(JourneyPattern journeyPattern) {
    this.journeyPattern = journeyPattern;
  }

  public VehicleJourney disruptions(List<LinkSchema> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public VehicleJourney addDisruptionsItem(LinkSchema disruptionsItem) {
    this.disruptions.add(disruptionsItem);
    return this;
  }

   /**
   * Get disruptions
   * @return disruptions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LinkSchema> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(List<LinkSchema> disruptions) {
    this.disruptions = disruptions;
  }

  public VehicleJourney calendars(List<Calendar> calendars) {
    this.calendars = calendars;
    return this;
  }

  public VehicleJourney addCalendarsItem(Calendar calendarsItem) {
    if (this.calendars == null) {
      this.calendars = new ArrayList<Calendar>();
    }
    this.calendars.add(calendarsItem);
    return this;
  }

   /**
   * Get calendars
   * @return calendars
  **/
  @ApiModelProperty(value = "")
  public List<Calendar> getCalendars() {
    return calendars;
  }

  public void setCalendars(List<Calendar> calendars) {
    this.calendars = calendars;
  }

  public VehicleJourney stopTimes(List<StopTime> stopTimes) {
    this.stopTimes = stopTimes;
    return this;
  }

  public VehicleJourney addStopTimesItem(StopTime stopTimesItem) {
    if (this.stopTimes == null) {
      this.stopTimes = new ArrayList<StopTime>();
    }
    this.stopTimes.add(stopTimesItem);
    return this;
  }

   /**
   * Get stopTimes
   * @return stopTimes
  **/
  @ApiModelProperty(value = "")
  public List<StopTime> getStopTimes() {
    return stopTimes;
  }

  public void setStopTimes(List<StopTime> stopTimes) {
    this.stopTimes = stopTimes;
  }

  public VehicleJourney comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public VehicleJourney addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public VehicleJourney validityPattern(ValidityPattern validityPattern) {
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

  public VehicleJourney id(String id) {
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

  public VehicleJourney trip(Trip trip) {
    this.trip = trip;
    return this;
  }

   /**
   * Get trip
   * @return trip
  **/
  @ApiModelProperty(value = "")
  public Trip getTrip() {
    return trip;
  }

  public void setTrip(Trip trip) {
    this.trip = trip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleJourney vehicleJourney = (VehicleJourney) o;
    return Objects.equals(this.comment, vehicleJourney.comment) &&
        Objects.equals(this.codes, vehicleJourney.codes) &&
        Objects.equals(this.name, vehicleJourney.name) &&
        Objects.equals(this.journeyPattern, vehicleJourney.journeyPattern) &&
        Objects.equals(this.disruptions, vehicleJourney.disruptions) &&
        Objects.equals(this.calendars, vehicleJourney.calendars) &&
        Objects.equals(this.stopTimes, vehicleJourney.stopTimes) &&
        Objects.equals(this.comments, vehicleJourney.comments) &&
        Objects.equals(this.validityPattern, vehicleJourney.validityPattern) &&
        Objects.equals(this.id, vehicleJourney.id) &&
        Objects.equals(this.trip, vehicleJourney.trip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, codes, name, journeyPattern, disruptions, calendars, stopTimes, comments, validityPattern, id, trip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleJourney {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    journeyPattern: ").append(toIndentedString(journeyPattern)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    calendars: ").append(toIndentedString(calendars)).append("\n");
    sb.append("    stopTimes: ").append(toIndentedString(stopTimes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    validityPattern: ").append(toIndentedString(validityPattern)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
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
     
    out.writeValue(comment);

    out.writeValue(codes);

    out.writeValue(name);

    out.writeValue(journeyPattern);

    out.writeValue(disruptions);

    out.writeValue(calendars);

    out.writeValue(stopTimes);

    out.writeValue(comments);

    out.writeValue(validityPattern);

    out.writeValue(id);

    out.writeValue(trip);
  }

  public VehicleJourney() {
    super();
  }

  VehicleJourney(Parcel in) {
    
    comment = (String)in.readValue(null);
    codes = (List<Code>)in.readValue(Code.class.getClassLoader());
    name = (String)in.readValue(null);
    journeyPattern = (JourneyPattern)in.readValue(JourneyPattern.class.getClassLoader());
    disruptions = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    calendars = (List<Calendar>)in.readValue(Calendar.class.getClassLoader());
    stopTimes = (List<StopTime>)in.readValue(StopTime.class.getClassLoader());
    comments = (List<Comment>)in.readValue(Comment.class.getClassLoader());
    validityPattern = (ValidityPattern)in.readValue(ValidityPattern.class.getClassLoader());
    id = (String)in.readValue(null);
    trip = (Trip)in.readValue(Trip.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<VehicleJourney> CREATOR = new Parcelable.Creator<VehicleJourney>() {
    public VehicleJourney createFromParcel(Parcel in) {
      return new VehicleJourney(in);
    }
    public VehicleJourney[] newArray(int size) {
      return new VehicleJourney[size];
    }
  };
}

