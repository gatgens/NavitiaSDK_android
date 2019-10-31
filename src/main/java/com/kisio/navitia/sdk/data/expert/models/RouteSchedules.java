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
import com.kisio.navitia.sdk.data.expert.models.Context;
import com.kisio.navitia.sdk.data.expert.models.Disruption;
import com.kisio.navitia.sdk.data.expert.models.Error;
import com.kisio.navitia.sdk.data.expert.models.Exception;
import com.kisio.navitia.sdk.data.expert.models.FeedPublisher;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Note;
import com.kisio.navitia.sdk.data.expert.models.Pagination;
import com.kisio.navitia.sdk.data.expert.models.RouteSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * RouteSchedules
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class RouteSchedules implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("notes")
  private List<Note> notes = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("exceptions")
  private List<Exception> exceptions = null;

  @SerializedName("route_schedules")
  private List<RouteSchedule> routeSchedules = new ArrayList<RouteSchedule>();

  public RouteSchedules pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public RouteSchedules links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public RouteSchedules addLinksItem(LinkSchema linksItem) {
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

  public RouteSchedules disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public RouteSchedules addDisruptionsItem(Disruption disruptionsItem) {
    this.disruptions.add(disruptionsItem);
    return this;
  }

   /**
   * Get disruptions
   * @return disruptions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public RouteSchedules notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public RouteSchedules addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }

  public RouteSchedules feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public RouteSchedules addFeedPublishersItem(FeedPublisher feedPublishersItem) {
    this.feedPublishers.add(feedPublishersItem);
    return this;
  }

   /**
   * Get feedPublishers
   * @return feedPublishers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FeedPublisher> getFeedPublishers() {
    return feedPublishers;
  }

  public void setFeedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
  }

  public RouteSchedules context(Context context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public RouteSchedules error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public RouteSchedules exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public RouteSchedules addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<Exception>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
  @ApiModelProperty(value = "")
  public List<Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public RouteSchedules routeSchedules(List<RouteSchedule> routeSchedules) {
    this.routeSchedules = routeSchedules;
    return this;
  }

  public RouteSchedules addRouteSchedulesItem(RouteSchedule routeSchedulesItem) {
    this.routeSchedules.add(routeSchedulesItem);
    return this;
  }

   /**
   * Get routeSchedules
   * @return routeSchedules
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RouteSchedule> getRouteSchedules() {
    return routeSchedules;
  }

  public void setRouteSchedules(List<RouteSchedule> routeSchedules) {
    this.routeSchedules = routeSchedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteSchedules routeSchedules = (RouteSchedules) o;
    return Objects.equals(this.pagination, routeSchedules.pagination) &&
        Objects.equals(this.links, routeSchedules.links) &&
        Objects.equals(this.disruptions, routeSchedules.disruptions) &&
        Objects.equals(this.notes, routeSchedules.notes) &&
        Objects.equals(this.feedPublishers, routeSchedules.feedPublishers) &&
        Objects.equals(this.context, routeSchedules.context) &&
        Objects.equals(this.error, routeSchedules.error) &&
        Objects.equals(this.exceptions, routeSchedules.exceptions) &&
        Objects.equals(this.routeSchedules, routeSchedules.routeSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, disruptions, notes, feedPublishers, context, error, exceptions, routeSchedules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteSchedules {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    routeSchedules: ").append(toIndentedString(routeSchedules)).append("\n");
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
     
    out.writeValue(pagination);

    out.writeValue(links);

    out.writeValue(disruptions);

    out.writeValue(notes);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(error);

    out.writeValue(exceptions);

    out.writeValue(routeSchedules);
  }

  public RouteSchedules() {
    super();
  }

  RouteSchedules(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    exceptions = (List<Exception>)in.readValue(Exception.class.getClassLoader());
    routeSchedules = (List<RouteSchedule>)in.readValue(RouteSchedule.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<RouteSchedules> CREATOR = new Parcelable.Creator<RouteSchedules>() {
    public RouteSchedules createFromParcel(Parcel in) {
      return new RouteSchedules(in);
    }
    public RouteSchedules[] newArray(int size) {
      return new RouteSchedules[size];
    }
  };
}

