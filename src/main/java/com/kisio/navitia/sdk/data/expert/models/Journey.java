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
import com.kisio.navitia.sdk.data.expert.models.Amount;
import com.kisio.navitia.sdk.data.expert.models.Calendar;
import com.kisio.navitia.sdk.data.expert.models.Distances;
import com.kisio.navitia.sdk.data.expert.models.Durations;
import com.kisio.navitia.sdk.data.expert.models.Fare;
import com.kisio.navitia.sdk.data.expert.models.JourneyDebug;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Place;
import com.kisio.navitia.sdk.data.expert.models.Section;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Journey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Journey implements Parcelable {
  @SerializedName("status")
  private String status = null;

  @SerializedName("distances")
  private Distances distances = null;

  @SerializedName("from")
  private Place from = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("nb_transfers")
  private Integer nbTransfers = null;

  @SerializedName("durations")
  private Durations durations = null;

  @SerializedName("arrival_date_time")
  private String arrivalDateTime = null;

  @SerializedName("calendars")
  private List<Calendar> calendars = null;

  @SerializedName("departure_date_time")
  private String departureDateTime = null;

  @SerializedName("to")
  private Place to = null;

  @SerializedName("requested_date_time")
  private String requestedDateTime = null;

  @SerializedName("fare")
  private Fare fare = null;

  @SerializedName("co2_emission")
  private Amount co2Emission = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("sections")
  private List<Section> sections = null;

  @SerializedName("debug")
  private JourneyDebug debug = null;

  public Journey status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status from the whole journey taking into account the most disturbing information retrieved on every object used (can be \"NO_SERVICE\", \"SIGNIFICANT_DELAYS\", ...
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status from the whole journey taking into account the most disturbing information retrieved on every object used (can be \"NO_SERVICE\", \"SIGNIFICANT_DELAYS\", ...")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Journey distances(Distances distances) {
    this.distances = distances;
    return this;
  }

   /**
   * Get distances
   * @return distances
  **/
  @ApiModelProperty(value = "")
  public Distances getDistances() {
    return distances;
  }

  public void setDistances(Distances distances) {
    this.distances = distances;
  }

  public Journey from(Place from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public Place getFrom() {
    return from;
  }

  public void setFrom(Place from) {
    this.from = from;
  }

  public Journey links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Journey addLinksItem(LinkSchema linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<LinkSchema>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }

  public Journey tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Journey addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Journey nbTransfers(Integer nbTransfers) {
    this.nbTransfers = nbTransfers;
    return this;
  }

   /**
   * Number of transfers along the journey
   * @return nbTransfers
  **/
  @ApiModelProperty(required = true, value = "Number of transfers along the journey")
  public Integer getNbTransfers() {
    return nbTransfers;
  }

  public void setNbTransfers(Integer nbTransfers) {
    this.nbTransfers = nbTransfers;
  }

  public Journey durations(Durations durations) {
    this.durations = durations;
    return this;
  }

   /**
   * Get durations
   * @return durations
  **/
  @ApiModelProperty(value = "")
  public Durations getDurations() {
    return durations;
  }

  public void setDurations(Durations durations) {
    this.durations = durations;
  }

  public Journey arrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    return this;
  }

   /**
   * Arrival date and time of the journey
   * @return arrivalDateTime
  **/
  @ApiModelProperty(value = "Arrival date and time of the journey")
  public String getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public Journey calendars(List<Calendar> calendars) {
    this.calendars = calendars;
    return this;
  }

  public Journey addCalendarsItem(Calendar calendarsItem) {
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

  public Journey departureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
  }

   /**
   * Departure date and time of the journey
   * @return departureDateTime
  **/
  @ApiModelProperty(value = "Departure date and time of the journey")
  public String getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public Journey to(Place to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public Place getTo() {
    return to;
  }

  public void setTo(Place to) {
    this.to = to;
  }

  public Journey requestedDateTime(String requestedDateTime) {
    this.requestedDateTime = requestedDateTime;
    return this;
  }

   /**
   * Get requestedDateTime
   * @return requestedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getRequestedDateTime() {
    return requestedDateTime;
  }

  public void setRequestedDateTime(String requestedDateTime) {
    this.requestedDateTime = requestedDateTime;
  }

  public Journey fare(Fare fare) {
    this.fare = fare;
    return this;
  }

   /**
   * Get fare
   * @return fare
  **/
  @ApiModelProperty(required = true, value = "")
  public Fare getFare() {
    return fare;
  }

  public void setFare(Fare fare) {
    this.fare = fare;
  }

  public Journey co2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
    return this;
  }

   /**
   * Get co2Emission
   * @return co2Emission
  **/
  @ApiModelProperty(required = true, value = "")
  public Amount getCo2Emission() {
    return co2Emission;
  }

  public void setCo2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
  }

  public Journey type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Used to qualify the journey (can be \"best\", \"comfort\", \"non_pt_walk\", ...
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Used to qualify the journey (can be \"best\", \"comfort\", \"non_pt_walk\", ...")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Journey duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the journey (seconds)
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Duration of the journey (seconds)")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Journey sections(List<Section> sections) {
    this.sections = sections;
    return this;
  }

  public Journey addSectionsItem(Section sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<Section>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(value = "")
  public List<Section> getSections() {
    return sections;
  }

  public void setSections(List<Section> sections) {
    this.sections = sections;
  }

  public Journey debug(JourneyDebug debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @ApiModelProperty(value = "")
  public JourneyDebug getDebug() {
    return debug;
  }

  public void setDebug(JourneyDebug debug) {
    this.debug = debug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journey journey = (Journey) o;
    return Objects.equals(this.status, journey.status) &&
        Objects.equals(this.distances, journey.distances) &&
        Objects.equals(this.from, journey.from) &&
        Objects.equals(this.links, journey.links) &&
        Objects.equals(this.tags, journey.tags) &&
        Objects.equals(this.nbTransfers, journey.nbTransfers) &&
        Objects.equals(this.durations, journey.durations) &&
        Objects.equals(this.arrivalDateTime, journey.arrivalDateTime) &&
        Objects.equals(this.calendars, journey.calendars) &&
        Objects.equals(this.departureDateTime, journey.departureDateTime) &&
        Objects.equals(this.to, journey.to) &&
        Objects.equals(this.requestedDateTime, journey.requestedDateTime) &&
        Objects.equals(this.fare, journey.fare) &&
        Objects.equals(this.co2Emission, journey.co2Emission) &&
        Objects.equals(this.type, journey.type) &&
        Objects.equals(this.duration, journey.duration) &&
        Objects.equals(this.sections, journey.sections) &&
        Objects.equals(this.debug, journey.debug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, distances, from, links, tags, nbTransfers, durations, arrivalDateTime, calendars, departureDateTime, to, requestedDateTime, fare, co2Emission, type, duration, sections, debug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journey {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    distances: ").append(toIndentedString(distances)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    nbTransfers: ").append(toIndentedString(nbTransfers)).append("\n");
    sb.append("    durations: ").append(toIndentedString(durations)).append("\n");
    sb.append("    arrivalDateTime: ").append(toIndentedString(arrivalDateTime)).append("\n");
    sb.append("    calendars: ").append(toIndentedString(calendars)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    requestedDateTime: ").append(toIndentedString(requestedDateTime)).append("\n");
    sb.append("    fare: ").append(toIndentedString(fare)).append("\n");
    sb.append("    co2Emission: ").append(toIndentedString(co2Emission)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
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

    out.writeValue(distances);

    out.writeValue(from);

    out.writeValue(links);

    out.writeValue(tags);

    out.writeValue(nbTransfers);

    out.writeValue(durations);

    out.writeValue(arrivalDateTime);

    out.writeValue(calendars);

    out.writeValue(departureDateTime);

    out.writeValue(to);

    out.writeValue(requestedDateTime);

    out.writeValue(fare);

    out.writeValue(co2Emission);

    out.writeValue(type);

    out.writeValue(duration);

    out.writeValue(sections);

    out.writeValue(debug);
  }

  public Journey() {
    super();
  }

  Journey(Parcel in) {
    
    status = (String)in.readValue(null);
    distances = (Distances)in.readValue(Distances.class.getClassLoader());
    from = (Place)in.readValue(Place.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    tags = (List<String>)in.readValue(null);
    nbTransfers = (Integer)in.readValue(null);
    durations = (Durations)in.readValue(Durations.class.getClassLoader());
    arrivalDateTime = (String)in.readValue(null);
    calendars = (List<Calendar>)in.readValue(Calendar.class.getClassLoader());
    departureDateTime = (String)in.readValue(null);
    to = (Place)in.readValue(Place.class.getClassLoader());
    requestedDateTime = (String)in.readValue(null);
    fare = (Fare)in.readValue(Fare.class.getClassLoader());
    co2Emission = (Amount)in.readValue(Amount.class.getClassLoader());
    type = (String)in.readValue(null);
    duration = (Integer)in.readValue(null);
    sections = (List<Section>)in.readValue(Section.class.getClassLoader());
    debug = (JourneyDebug)in.readValue(JourneyDebug.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Journey> CREATOR = new Parcelable.Creator<Journey>() {
    public Journey createFromParcel(Parcel in) {
      return new Journey(in);
    }
    public Journey[] newArray(int size) {
      return new Journey[size];
    }
  };
}

