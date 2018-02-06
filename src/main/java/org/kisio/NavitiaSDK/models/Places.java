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
import org.kisio.NavitiaSDK.models.Context;
import org.kisio.NavitiaSDK.models.Disruption;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.Place;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Places
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class Places implements Parcelable {
  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("error")
  private Error error = null;

  @SerializedName("context")
  private Context context = null;

  @SerializedName("places")
  private List<Place> places = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Places places = (Places) o;
    return Objects.equals(this.disruptions, places.disruptions) &&
        Objects.equals(this.error, places.error) &&
        Objects.equals(this.context, places.context) &&
        Objects.equals(this.places, places.places) &&
        Objects.equals(this.feedPublishers, places.feedPublishers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, error, context, places, feedPublishers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Places {\n");
    
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
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
     
    out.writeValue(disruptions);

    out.writeValue(error);

    out.writeValue(context);

    out.writeValue(places);

    out.writeValue(feedPublishers);
  }

  public Places() {
    super();
  }

  Places(Parcel in) {
    
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    places = (List<Place>)in.readValue(Place.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
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
