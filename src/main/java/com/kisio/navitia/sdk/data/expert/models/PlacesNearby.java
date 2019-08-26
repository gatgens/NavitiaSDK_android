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
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Note;
import com.kisio.navitia.sdk.data.expert.models.Pagination;
import com.kisio.navitia.sdk.data.expert.models.PlaceNearby;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PlacesNearby
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class PlacesNearby implements Parcelable {
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

  @SerializedName("places_nearby")
  private List<PlaceNearby> placesNearby = null;

  public PlacesNearby pagination(Pagination pagination) {
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

  public PlacesNearby links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public PlacesNearby addLinksItem(LinkSchema linksItem) {
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

  public PlacesNearby disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public PlacesNearby addDisruptionsItem(Disruption disruptionsItem) {
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

  public PlacesNearby notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public PlacesNearby addNotesItem(Note notesItem) {
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

  public PlacesNearby feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public PlacesNearby addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public PlacesNearby context(Context context) {
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

  public PlacesNearby error(Error error) {
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

  public PlacesNearby placesNearby(List<PlaceNearby> placesNearby) {
    this.placesNearby = placesNearby;
    return this;
  }

  public PlacesNearby addPlacesNearbyItem(PlaceNearby placesNearbyItem) {
    if (this.placesNearby == null) {
      this.placesNearby = new ArrayList<PlaceNearby>();
    }
    this.placesNearby.add(placesNearbyItem);
    return this;
  }

   /**
   * Get placesNearby
   * @return placesNearby
  **/
  @ApiModelProperty(value = "")
  public List<PlaceNearby> getPlacesNearby() {
    return placesNearby;
  }

  public void setPlacesNearby(List<PlaceNearby> placesNearby) {
    this.placesNearby = placesNearby;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacesNearby placesNearby = (PlacesNearby) o;
    return Objects.equals(this.pagination, placesNearby.pagination) &&
        Objects.equals(this.links, placesNearby.links) &&
        Objects.equals(this.disruptions, placesNearby.disruptions) &&
        Objects.equals(this.notes, placesNearby.notes) &&
        Objects.equals(this.feedPublishers, placesNearby.feedPublishers) &&
        Objects.equals(this.context, placesNearby.context) &&
        Objects.equals(this.error, placesNearby.error) &&
        Objects.equals(this.placesNearby, placesNearby.placesNearby);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, disruptions, notes, feedPublishers, context, error, placesNearby);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacesNearby {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    placesNearby: ").append(toIndentedString(placesNearby)).append("\n");
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

    out.writeValue(placesNearby);
  }

  public PlacesNearby() {
    super();
  }

  PlacesNearby(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    placesNearby = (List<PlaceNearby>)in.readValue(PlaceNearby.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlacesNearby> CREATOR = new Parcelable.Creator<PlacesNearby>() {
    public PlacesNearby createFromParcel(Parcel in) {
      return new PlacesNearby(in);
    }
    public PlacesNearby[] newArray(int size) {
      return new PlacesNearby[size];
    }
  };
}

