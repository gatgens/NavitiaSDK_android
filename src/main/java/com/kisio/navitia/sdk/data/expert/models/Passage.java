/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.87.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Route;
import com.kisio.navitia.sdk.data.expert.models.StopDateTime;
import com.kisio.navitia.sdk.data.expert.models.StopPoint;
import com.kisio.navitia.sdk.data.expert.models.VJDisplayInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Passage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class Passage implements Parcelable {
  @SerializedName("display_informations")
  private VJDisplayInformation displayInformations = null;

  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("stop_date_time")
  private StopDateTime stopDateTime = null;

  public Passage displayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
    return this;
  }

   /**
   * Get displayInformations
   * @return displayInformations
  **/
  @ApiModelProperty(value = "")
  public VJDisplayInformation getDisplayInformations() {
    return displayInformations;
  }

  public void setDisplayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
  }

  public Passage stopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
    return this;
  }

   /**
   * Get stopPoint
   * @return stopPoint
  **/
  @ApiModelProperty(value = "")
  public StopPoint getStopPoint() {
    return stopPoint;
  }

  public void setStopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
  }

  public Passage route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public Passage links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Passage addLinksItem(LinkSchema linksItem) {
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

  public Passage stopDateTime(StopDateTime stopDateTime) {
    this.stopDateTime = stopDateTime;
    return this;
  }

   /**
   * Get stopDateTime
   * @return stopDateTime
  **/
  @ApiModelProperty(value = "")
  public StopDateTime getStopDateTime() {
    return stopDateTime;
  }

  public void setStopDateTime(StopDateTime stopDateTime) {
    this.stopDateTime = stopDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passage passage = (Passage) o;
    return Objects.equals(this.displayInformations, passage.displayInformations) &&
        Objects.equals(this.stopPoint, passage.stopPoint) &&
        Objects.equals(this.route, passage.route) &&
        Objects.equals(this.links, passage.links) &&
        Objects.equals(this.stopDateTime, passage.stopDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayInformations, stopPoint, route, links, stopDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passage {\n");
    
    sb.append("    displayInformations: ").append(toIndentedString(displayInformations)).append("\n");
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    stopDateTime: ").append(toIndentedString(stopDateTime)).append("\n");
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
     
    out.writeValue(displayInformations);

    out.writeValue(stopPoint);

    out.writeValue(route);

    out.writeValue(links);

    out.writeValue(stopDateTime);
  }

  public Passage() {
    super();
  }

  Passage(Parcel in) {
    
    displayInformations = (VJDisplayInformation)in.readValue(VJDisplayInformation.class.getClassLoader());
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    route = (Route)in.readValue(Route.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    stopDateTime = (StopDateTime)in.readValue(StopDateTime.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Passage> CREATOR = new Parcelable.Creator<Passage>() {
    public Passage createFromParcel(Parcel in) {
      return new Passage(in);
    }
    public Passage[] newArray(int size) {
      return new Passage[size];
    }
  };
}

