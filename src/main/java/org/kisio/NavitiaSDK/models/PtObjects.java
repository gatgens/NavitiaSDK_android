/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.43.0-34-g30b0bcf
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
import org.kisio.NavitiaSDK.models.Disruption;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.PtObject;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PtObjects
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class PtObjects implements Parcelable {
  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("error")
  private Error error = null;

  @SerializedName("pt_objects")
  private List<PtObject> ptObjects = null;

  public PtObjects disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public PtObjects addDisruptionsItem(Disruption disruptionsItem) {
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

  public PtObjects feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public PtObjects addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public PtObjects error(Error error) {
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

  public PtObjects ptObjects(List<PtObject> ptObjects) {
    this.ptObjects = ptObjects;
    return this;
  }

  public PtObjects addPtObjectsItem(PtObject ptObjectsItem) {
    if (this.ptObjects == null) {
      this.ptObjects = new ArrayList<PtObject>();
    }
    this.ptObjects.add(ptObjectsItem);
    return this;
  }

   /**
   * Get ptObjects
   * @return ptObjects
  **/
  @ApiModelProperty(value = "")
  public List<PtObject> getPtObjects() {
    return ptObjects;
  }

  public void setPtObjects(List<PtObject> ptObjects) {
    this.ptObjects = ptObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtObjects ptObjects = (PtObjects) o;
    return Objects.equals(this.disruptions, ptObjects.disruptions) &&
        Objects.equals(this.feedPublishers, ptObjects.feedPublishers) &&
        Objects.equals(this.error, ptObjects.error) &&
        Objects.equals(this.ptObjects, ptObjects.ptObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, feedPublishers, error, ptObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtObjects {\n");
    
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ptObjects: ").append(toIndentedString(ptObjects)).append("\n");
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

    out.writeValue(feedPublishers);

    out.writeValue(error);

    out.writeValue(ptObjects);
  }

  public PtObjects() {
    super();
  }

  PtObjects(Parcel in) {
    
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    ptObjects = (List<PtObject>)in.readValue(PtObject.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PtObjects> CREATOR = new Parcelable.Creator<PtObjects>() {
    public PtObjects createFromParcel(Parcel in) {
      return new PtObjects(in);
    }
    public PtObjects[] newArray(int size) {
      return new PtObjects[size];
    }
  };
}

