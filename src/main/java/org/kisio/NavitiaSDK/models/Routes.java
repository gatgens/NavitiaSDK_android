/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.50.0
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
import org.kisio.NavitiaSDK.models.Note;
import org.kisio.NavitiaSDK.models.Pagination;
import org.kisio.NavitiaSDK.models.Route;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Routes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-14T10:20:26.501+01:00")
public class Routes implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

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

  @SerializedName("routes")
  private List<Route> routes = null;

  public Routes pagination(Pagination pagination) {
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

  public Routes disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public Routes addDisruptionsItem(Disruption disruptionsItem) {
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

  public Routes notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public Routes addNotesItem(Note notesItem) {
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

  public Routes feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public Routes addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public Routes context(Context context) {
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

  public Routes error(Error error) {
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

  public Routes routes(List<Route> routes) {
    this.routes = routes;
    return this;
  }

  public Routes addRoutesItem(Route routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<Route>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @ApiModelProperty(value = "")
  public List<Route> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Route> routes) {
    this.routes = routes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routes routes = (Routes) o;
    return Objects.equals(this.pagination, routes.pagination) &&
        Objects.equals(this.disruptions, routes.disruptions) &&
        Objects.equals(this.notes, routes.notes) &&
        Objects.equals(this.feedPublishers, routes.feedPublishers) &&
        Objects.equals(this.context, routes.context) &&
        Objects.equals(this.error, routes.error) &&
        Objects.equals(this.routes, routes.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, disruptions, notes, feedPublishers, context, error, routes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routes {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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

    out.writeValue(context);

    out.writeValue(error);

    out.writeValue(routes);
  }

  public Routes() {
    super();
  }

  Routes(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    routes = (List<Route>)in.readValue(Route.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Routes> CREATOR = new Parcelable.Creator<Routes>() {
    public Routes createFromParcel(Parcel in) {
      return new Routes(in);
    }
    public Routes[] newArray(int size) {
      return new Routes[size];
    }
  };
}

