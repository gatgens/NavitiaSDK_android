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
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.Context;
import org.kisio.NavitiaSDK.models.Disruption;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.Exception;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.Note;
import org.kisio.NavitiaSDK.models.Pagination;
import org.kisio.NavitiaSDK.models.Passage;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Departures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class Departures implements Parcelable {
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

  @SerializedName("departures")
  private List<Passage> departures = new ArrayList<Passage>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("exceptions")
  private List<Exception> exceptions = null;

  public Departures pagination(Pagination pagination) {
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

  public Departures links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Departures addLinksItem(LinkSchema linksItem) {
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

  public Departures disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public Departures addDisruptionsItem(Disruption disruptionsItem) {
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

  public Departures notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public Departures addNotesItem(Note notesItem) {
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

  public Departures feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public Departures addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public Departures departures(List<Passage> departures) {
    this.departures = departures;
    return this;
  }

  public Departures addDeparturesItem(Passage departuresItem) {
    this.departures.add(departuresItem);
    return this;
  }

   /**
   * Get departures
   * @return departures
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Passage> getDepartures() {
    return departures;
  }

  public void setDepartures(List<Passage> departures) {
    this.departures = departures;
  }

  public Departures context(Context context) {
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

  public Departures error(Error error) {
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

  public Departures exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Departures addExceptionsItem(Exception exceptionsItem) {
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
    Departures departures = (Departures) o;
    return Objects.equals(this.pagination, departures.pagination) &&
        Objects.equals(this.links, departures.links) &&
        Objects.equals(this.disruptions, departures.disruptions) &&
        Objects.equals(this.notes, departures.notes) &&
        Objects.equals(this.feedPublishers, departures.feedPublishers) &&
        Objects.equals(this.departures, departures.departures) &&
        Objects.equals(this.context, departures.context) &&
        Objects.equals(this.error, departures.error) &&
        Objects.equals(this.exceptions, departures.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, disruptions, notes, feedPublishers, departures, context, error, exceptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Departures {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
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

    out.writeValue(feedPublishers);

    out.writeValue(departures);

    out.writeValue(context);

    out.writeValue(error);

    out.writeValue(exceptions);
  }

  public Departures() {
    super();
  }

  Departures(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    departures = (List<Passage>)in.readValue(Passage.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    exceptions = (List<Exception>)in.readValue(Exception.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Departures> CREATOR = new Parcelable.Creator<Departures>() {
    public Departures createFromParcel(Parcel in) {
      return new Departures(in);
    }
    public Departures[] newArray(int size) {
      return new Departures[size];
    }
  };
}

