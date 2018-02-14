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
import org.kisio.NavitiaSDK.models.CommercialMode;
import org.kisio.NavitiaSDK.models.Line;
import org.kisio.NavitiaSDK.models.Network;
import org.kisio.NavitiaSDK.models.Route;
import org.kisio.NavitiaSDK.models.StopArea;
import org.kisio.NavitiaSDK.models.StopPoint;
import org.kisio.NavitiaSDK.models.Trip;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PtObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-14T10:20:26.501+01:00")
public class PtObject implements Parcelable {
  @SerializedName("embedded_type")
  private String embeddedType = null;

  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("stop_area")
  private StopArea stopArea = null;

  @SerializedName("commercial_mode")
  private CommercialMode commercialMode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("line")
  private Line line = null;

  @SerializedName("quality")
  private Integer quality = null;

  @SerializedName("trip")
  private Trip trip = null;

  @SerializedName("network")
  private Network network = null;

  public PtObject embeddedType(String embeddedType) {
    this.embeddedType = embeddedType;
    return this;
  }

   /**
   * Get embeddedType
   * @return embeddedType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmbeddedType() {
    return embeddedType;
  }

  public void setEmbeddedType(String embeddedType) {
    this.embeddedType = embeddedType;
  }

  public PtObject stopPoint(StopPoint stopPoint) {
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

  public PtObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtObject route(Route route) {
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

  public PtObject stopArea(StopArea stopArea) {
    this.stopArea = stopArea;
    return this;
  }

   /**
   * Get stopArea
   * @return stopArea
  **/
  @ApiModelProperty(value = "")
  public StopArea getStopArea() {
    return stopArea;
  }

  public void setStopArea(StopArea stopArea) {
    this.stopArea = stopArea;
  }

  public PtObject commercialMode(CommercialMode commercialMode) {
    this.commercialMode = commercialMode;
    return this;
  }

   /**
   * Get commercialMode
   * @return commercialMode
  **/
  @ApiModelProperty(value = "")
  public CommercialMode getCommercialMode() {
    return commercialMode;
  }

  public void setCommercialMode(CommercialMode commercialMode) {
    this.commercialMode = commercialMode;
  }

  public PtObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the object
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtObject line(Line line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(value = "")
  public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public PtObject quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public PtObject trip(Trip trip) {
    this.trip = trip;
    return this;
  }

   /**
   * Get trip
   * @return trip
  **/
  @ApiModelProperty(value = "")
  public Trip getTrip() {
    return trip;
  }

  public void setTrip(Trip trip) {
    this.trip = trip;
  }

  public PtObject network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtObject ptObject = (PtObject) o;
    return Objects.equals(this.embeddedType, ptObject.embeddedType) &&
        Objects.equals(this.stopPoint, ptObject.stopPoint) &&
        Objects.equals(this.name, ptObject.name) &&
        Objects.equals(this.route, ptObject.route) &&
        Objects.equals(this.stopArea, ptObject.stopArea) &&
        Objects.equals(this.commercialMode, ptObject.commercialMode) &&
        Objects.equals(this.id, ptObject.id) &&
        Objects.equals(this.line, ptObject.line) &&
        Objects.equals(this.quality, ptObject.quality) &&
        Objects.equals(this.trip, ptObject.trip) &&
        Objects.equals(this.network, ptObject.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedType, stopPoint, name, route, stopArea, commercialMode, id, line, quality, trip, network);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtObject {\n");
    
    sb.append("    embeddedType: ").append(toIndentedString(embeddedType)).append("\n");
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    stopArea: ").append(toIndentedString(stopArea)).append("\n");
    sb.append("    commercialMode: ").append(toIndentedString(commercialMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
     
    out.writeValue(embeddedType);

    out.writeValue(stopPoint);

    out.writeValue(name);

    out.writeValue(route);

    out.writeValue(stopArea);

    out.writeValue(commercialMode);

    out.writeValue(id);

    out.writeValue(line);

    out.writeValue(quality);

    out.writeValue(trip);

    out.writeValue(network);
  }

  public PtObject() {
    super();
  }

  PtObject(Parcel in) {
    
    embeddedType = (String)in.readValue(null);
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    name = (String)in.readValue(null);
    route = (Route)in.readValue(Route.class.getClassLoader());
    stopArea = (StopArea)in.readValue(StopArea.class.getClassLoader());
    commercialMode = (CommercialMode)in.readValue(CommercialMode.class.getClassLoader());
    id = (String)in.readValue(null);
    line = (Line)in.readValue(Line.class.getClassLoader());
    quality = (Integer)in.readValue(null);
    trip = (Trip)in.readValue(Trip.class.getClassLoader());
    network = (Network)in.readValue(Network.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PtObject> CREATOR = new Parcelable.Creator<PtObject>() {
    public PtObject createFromParcel(Parcel in) {
      return new PtObject(in);
    }
    public PtObject[] newArray(int size) {
      return new PtObject[size];
    }
  };
}

