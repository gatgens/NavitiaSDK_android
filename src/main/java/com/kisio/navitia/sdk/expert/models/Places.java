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
import com.kisio.navitia.sdk.expert.models.Context;
import com.kisio.navitia.sdk.expert.models.Disruption;
import com.kisio.navitia.sdk.expert.models.Error;
import com.kisio.navitia.sdk.expert.models.FeedPublisher;
import com.kisio.navitia.sdk.expert.models.LinkSchema;
import com.kisio.navitia.sdk.expert.models.Place;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Places
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class Places implements Parcelable {
  @SerializedName("places")
  private List<Place> places = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  public Places places(List<Place> places) {
    this.places = places;
    return this;
  }

  public Places addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<Place>();
    }
    this.places.add(placesItem);
    return this;
  }

   /**
   * Get places
   * @return places
  **/
  @ApiModelProperty(value = "")
  public List<Place> getPlaces() {
    return places;
  }

  public void setPlaces(List<Place> places) {
    this.places = places;
  }

  public Places links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Places addLinksItem(LinkSchema linksItem) {
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

  public Places disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public Places addDisruptionsItem(Disruption disruptionsItem) {
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

  public Places feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public Places addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public Places context(Context context) {
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

  public Places error(Error error) {
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
    Places places = (Places) o;
    return Objects.equals(this.places, places.places) &&
        Objects.equals(this.links, places.links) &&
        Objects.equals(this.disruptions, places.disruptions) &&
        Objects.equals(this.feedPublishers, places.feedPublishers) &&
        Objects.equals(this.context, places.context) &&
        Objects.equals(this.error, places.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(places, links, disruptions, feedPublishers, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Places {\n");
    
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
     
    out.writeValue(places);

    out.writeValue(links);

    out.writeValue(disruptions);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(error);
  }

  public Places() {
    super();
  }

  Places(Parcel in) {
    
    places = (List<Place>)in.readValue(Place.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Places> CREATOR = new Parcelable.Creator<Places>() {
    public Places createFromParcel(Parcel in) {
      return new Places(in);
    }
    public Places[] newArray(int size) {
      return new Places[size];
    }
  };
}

