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


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.Context;
import com.kisio.navitia.sdk.expert.models.Disruption;
import com.kisio.navitia.sdk.expert.models.Error;
import com.kisio.navitia.sdk.expert.models.Exception;
import com.kisio.navitia.sdk.expert.models.FeedPublisher;
import com.kisio.navitia.sdk.expert.models.LinkSchema;
import com.kisio.navitia.sdk.expert.models.Note;
import com.kisio.navitia.sdk.expert.models.Pagination;
import com.kisio.navitia.sdk.expert.models.Passage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Arrivals
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-16T14:17:49.415+02:00")
public class Arrivals implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("notes")
  private List<Note> notes = null;

  @SerializedName("arrivals")
  private List<Passage> arrivals = new ArrayList<Passage>();

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("exceptions")
  private List<Exception> exceptions = null;

  public Arrivals pagination(Pagination pagination) {
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

  public Arrivals links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Arrivals addLinksItem(LinkSchema linksItem) {
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

  public Arrivals disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public Arrivals addDisruptionsItem(Disruption disruptionsItem) {
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

  public Arrivals notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public Arrivals addNotesItem(Note notesItem) {
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

  public Arrivals arrivals(List<Passage> arrivals) {
    this.arrivals = arrivals;
    return this;
  }

  public Arrivals addArrivalsItem(Passage arrivalsItem) {
    this.arrivals.add(arrivalsItem);
    return this;
  }

   /**
   * Get arrivals
   * @return arrivals
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Passage> getArrivals() {
    return arrivals;
  }

  public void setArrivals(List<Passage> arrivals) {
    this.arrivals = arrivals;
  }

  public Arrivals feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public Arrivals addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public Arrivals context(Context context) {
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

  public Arrivals error(Error error) {
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

  public Arrivals exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Arrivals addExceptionsItem(Exception exceptionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arrivals arrivals = (Arrivals) o;
    return Objects.equals(this.pagination, arrivals.pagination) &&
        Objects.equals(this.links, arrivals.links) &&
        Objects.equals(this.disruptions, arrivals.disruptions) &&
        Objects.equals(this.notes, arrivals.notes) &&
        Objects.equals(this.arrivals, arrivals.arrivals) &&
        Objects.equals(this.feedPublishers, arrivals.feedPublishers) &&
        Objects.equals(this.context, arrivals.context) &&
        Objects.equals(this.error, arrivals.error) &&
        Objects.equals(this.exceptions, arrivals.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, disruptions, notes, arrivals, feedPublishers, context, error, exceptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arrivals {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    arrivals: ").append(toIndentedString(arrivals)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

    out.writeValue(arrivals);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(error);

    out.writeValue(exceptions);
  }

  public Arrivals() {
    super();
  }

  Arrivals(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    arrivals = (List<Passage>)in.readValue(Passage.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    exceptions = (List<Exception>)in.readValue(Exception.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Arrivals> CREATOR = new Parcelable.Creator<Arrivals>() {
    public Arrivals createFromParcel(Parcel in) {
      return new Arrivals(in);
    }
    public Arrivals[] newArray(int size) {
      return new Arrivals[size];
    }
  };
}

