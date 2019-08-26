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
import com.kisio.navitia.sdk.data.expert.models.Context;
import com.kisio.navitia.sdk.data.expert.models.Disruption;
import com.kisio.navitia.sdk.data.expert.models.Error;
import com.kisio.navitia.sdk.data.expert.models.FeedPublisher;
import com.kisio.navitia.sdk.data.expert.models.JourneyPattern;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Note;
import com.kisio.navitia.sdk.data.expert.models.Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * JourneyPatterns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class JourneyPatterns implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("context")
  private Context context = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("notes")
  private List<Note> notes = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("journey_patterns")
  private List<JourneyPattern> journeyPatterns = null;

  @SerializedName("error")
  private Error error = null;

  public JourneyPatterns pagination(Pagination pagination) {
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

  public JourneyPatterns context(Context context) {
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

  public JourneyPatterns links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public JourneyPatterns addLinksItem(LinkSchema linksItem) {
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

  public JourneyPatterns disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public JourneyPatterns addDisruptionsItem(Disruption disruptionsItem) {
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

  public JourneyPatterns notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public JourneyPatterns addNotesItem(Note notesItem) {
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

  public JourneyPatterns feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public JourneyPatterns addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public JourneyPatterns journeyPatterns(List<JourneyPattern> journeyPatterns) {
    this.journeyPatterns = journeyPatterns;
    return this;
  }

  public JourneyPatterns addJourneyPatternsItem(JourneyPattern journeyPatternsItem) {
    if (this.journeyPatterns == null) {
      this.journeyPatterns = new ArrayList<JourneyPattern>();
    }
    this.journeyPatterns.add(journeyPatternsItem);
    return this;
  }

   /**
   * Get journeyPatterns
   * @return journeyPatterns
  **/
  @ApiModelProperty(value = "")
  public List<JourneyPattern> getJourneyPatterns() {
    return journeyPatterns;
  }

  public void setJourneyPatterns(List<JourneyPattern> journeyPatterns) {
    this.journeyPatterns = journeyPatterns;
  }

  public JourneyPatterns error(Error error) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyPatterns journeyPatterns = (JourneyPatterns) o;
    return Objects.equals(this.pagination, journeyPatterns.pagination) &&
        Objects.equals(this.context, journeyPatterns.context) &&
        Objects.equals(this.links, journeyPatterns.links) &&
        Objects.equals(this.disruptions, journeyPatterns.disruptions) &&
        Objects.equals(this.notes, journeyPatterns.notes) &&
        Objects.equals(this.feedPublishers, journeyPatterns.feedPublishers) &&
        Objects.equals(this.journeyPatterns, journeyPatterns.journeyPatterns) &&
        Objects.equals(this.error, journeyPatterns.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, context, links, disruptions, notes, feedPublishers, journeyPatterns, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPatterns {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    journeyPatterns: ").append(toIndentedString(journeyPatterns)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    out.writeValue(context);

    out.writeValue(links);

    out.writeValue(disruptions);

    out.writeValue(notes);

    out.writeValue(feedPublishers);

    out.writeValue(journeyPatterns);

    out.writeValue(error);
  }

  public JourneyPatterns() {
    super();
  }

  JourneyPatterns(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    journeyPatterns = (List<JourneyPattern>)in.readValue(JourneyPattern.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<JourneyPatterns> CREATOR = new Parcelable.Creator<JourneyPatterns>() {
    public JourneyPatterns createFromParcel(Parcel in) {
      return new JourneyPatterns(in);
    }
    public JourneyPatterns[] newArray(int size) {
      return new JourneyPatterns[size];
    }
  };
}

