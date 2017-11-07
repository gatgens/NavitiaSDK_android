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
import org.kisio.NavitiaSDK.models.Note;
import org.kisio.NavitiaSDK.models.Pagination;
import org.kisio.NavitiaSDK.models.PoiType;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PoiTypes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class PoiTypes implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("notes")
  private List<Note> notes = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("error")
  private Error error = null;

  @SerializedName("poi_types")
  private List<PoiType> poiTypes = null;

  public PoiTypes pagination(Pagination pagination) {
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

  public PoiTypes disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public PoiTypes addDisruptionsItem(Disruption disruptionsItem) {
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

  public PoiTypes notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public PoiTypes addNotesItem(Note notesItem) {
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

  public PoiTypes feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public PoiTypes addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public PoiTypes error(Error error) {
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

  public PoiTypes poiTypes(List<PoiType> poiTypes) {
    this.poiTypes = poiTypes;
    return this;
  }

  public PoiTypes addPoiTypesItem(PoiType poiTypesItem) {
    if (this.poiTypes == null) {
      this.poiTypes = new ArrayList<PoiType>();
    }
    this.poiTypes.add(poiTypesItem);
    return this;
  }

   /**
   * Get poiTypes
   * @return poiTypes
  **/
  @ApiModelProperty(value = "")
  public List<PoiType> getPoiTypes() {
    return poiTypes;
  }

  public void setPoiTypes(List<PoiType> poiTypes) {
    this.poiTypes = poiTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiTypes poiTypes = (PoiTypes) o;
    return Objects.equals(this.pagination, poiTypes.pagination) &&
        Objects.equals(this.disruptions, poiTypes.disruptions) &&
        Objects.equals(this.notes, poiTypes.notes) &&
        Objects.equals(this.feedPublishers, poiTypes.feedPublishers) &&
        Objects.equals(this.error, poiTypes.error) &&
        Objects.equals(this.poiTypes, poiTypes.poiTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, disruptions, notes, feedPublishers, error, poiTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiTypes {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    poiTypes: ").append(toIndentedString(poiTypes)).append("\n");
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

    out.writeValue(disruptions);

    out.writeValue(notes);

    out.writeValue(feedPublishers);

    out.writeValue(error);

    out.writeValue(poiTypes);
  }

  public PoiTypes() {
    super();
  }

  PoiTypes(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    poiTypes = (List<PoiType>)in.readValue(PoiType.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PoiTypes> CREATOR = new Parcelable.Creator<PoiTypes>() {
    public PoiTypes createFromParcel(Parcel in) {
      return new PoiTypes(in);
    }
    public PoiTypes[] newArray(int size) {
      return new PoiTypes[size];
    }
  };
}

