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
import org.kisio.NavitiaSDK.models.Journey;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.Note;
import org.kisio.NavitiaSDK.models.Ticket;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Journeys
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class Journeys implements Parcelable {
  @SerializedName("tickets")
  private List<Ticket> tickets = new ArrayList<Ticket>();

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("journeys")
  private List<Journey> journeys = null;

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

  public Journeys tickets(List<Ticket> tickets) {
    this.tickets = tickets;
    return this;
  }

  public Journeys addTicketsItem(Ticket ticketsItem) {
    this.tickets.add(ticketsItem);
    return this;
  }

   /**
   * Get tickets
   * @return tickets
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Ticket> getTickets() {
    return tickets;
  }

  public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }

  public Journeys links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Journeys addLinksItem(LinkSchema linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }

  public Journeys journeys(List<Journey> journeys) {
    this.journeys = journeys;
    return this;
  }

  public Journeys addJourneysItem(Journey journeysItem) {
    if (this.journeys == null) {
      this.journeys = new ArrayList<Journey>();
    }
    this.journeys.add(journeysItem);
    return this;
  }

   /**
   * Get journeys
   * @return journeys
  **/
  @ApiModelProperty(value = "")
  public List<Journey> getJourneys() {
    return journeys;
  }

  public void setJourneys(List<Journey> journeys) {
    this.journeys = journeys;
  }

  public Journeys disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public Journeys addDisruptionsItem(Disruption disruptionsItem) {
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

  public Journeys notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public Journeys addNotesItem(Note notesItem) {
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

  public Journeys feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public Journeys addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public Journeys context(Context context) {
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

  public Journeys error(Error error) {
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

  public Journeys exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Journeys addExceptionsItem(Exception exceptionsItem) {
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
    Journeys journeys = (Journeys) o;
    return Objects.equals(this.tickets, journeys.tickets) &&
        Objects.equals(this.links, journeys.links) &&
        Objects.equals(this.journeys, journeys.journeys) &&
        Objects.equals(this.disruptions, journeys.disruptions) &&
        Objects.equals(this.notes, journeys.notes) &&
        Objects.equals(this.feedPublishers, journeys.feedPublishers) &&
        Objects.equals(this.context, journeys.context) &&
        Objects.equals(this.error, journeys.error) &&
        Objects.equals(this.exceptions, journeys.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickets, links, journeys, disruptions, notes, feedPublishers, context, error, exceptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journeys {\n");
    
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    journeys: ").append(toIndentedString(journeys)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
     
    out.writeValue(tickets);

    out.writeValue(links);

    out.writeValue(journeys);

    out.writeValue(disruptions);

    out.writeValue(notes);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(error);

    out.writeValue(exceptions);
  }

  public Journeys() {
    super();
  }

  Journeys(Parcel in) {
    
    tickets = (List<Ticket>)in.readValue(Ticket.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    journeys = (List<Journey>)in.readValue(Journey.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    exceptions = (List<Exception>)in.readValue(Exception.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Journeys> CREATOR = new Parcelable.Creator<Journeys>() {
    public Journeys createFromParcel(Parcel in) {
      return new Journeys(in);
    }
    public Journeys[] newArray(int size) {
      return new Journeys[size];
    }
  };
}

