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
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * RouteDisplayInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class RouteDisplayInformation implements Parcelable {
  @SerializedName("direction")
  private String direction = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("color")
  private String color = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("commercial_mode")
  private String commercialMode = null;

  @SerializedName("text_color")
  private String textColor = null;

  @SerializedName("name")
  private String name = null;

  public RouteDisplayInformation direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public RouteDisplayInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RouteDisplayInformation network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public RouteDisplayInformation links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public RouteDisplayInformation addLinksItem(LinkSchema linksItem) {
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

  public RouteDisplayInformation color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public RouteDisplayInformation label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RouteDisplayInformation commercialMode(String commercialMode) {
    this.commercialMode = commercialMode;
    return this;
  }

   /**
   * Get commercialMode
   * @return commercialMode
  **/
  @ApiModelProperty(value = "")
  public String getCommercialMode() {
    return commercialMode;
  }

  public void setCommercialMode(String commercialMode) {
    this.commercialMode = commercialMode;
  }

  public RouteDisplayInformation textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

   /**
   * Get textColor
   * @return textColor
  **/
  @ApiModelProperty(value = "")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public RouteDisplayInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteDisplayInformation routeDisplayInformation = (RouteDisplayInformation) o;
    return Objects.equals(this.direction, routeDisplayInformation.direction) &&
        Objects.equals(this.code, routeDisplayInformation.code) &&
        Objects.equals(this.network, routeDisplayInformation.network) &&
        Objects.equals(this.links, routeDisplayInformation.links) &&
        Objects.equals(this.color, routeDisplayInformation.color) &&
        Objects.equals(this.label, routeDisplayInformation.label) &&
        Objects.equals(this.commercialMode, routeDisplayInformation.commercialMode) &&
        Objects.equals(this.textColor, routeDisplayInformation.textColor) &&
        Objects.equals(this.name, routeDisplayInformation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, code, network, links, color, label, commercialMode, textColor, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteDisplayInformation {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    commercialMode: ").append(toIndentedString(commercialMode)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
     
    out.writeValue(direction);

    out.writeValue(code);

    out.writeValue(network);

    out.writeValue(links);

    out.writeValue(color);

    out.writeValue(label);

    out.writeValue(commercialMode);

    out.writeValue(textColor);

    out.writeValue(name);
  }

  public RouteDisplayInformation() {
    super();
  }

  RouteDisplayInformation(Parcel in) {
    
    direction = (String)in.readValue(null);
    code = (String)in.readValue(null);
    network = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    color = (String)in.readValue(null);
    label = (String)in.readValue(null);
    commercialMode = (String)in.readValue(null);
    textColor = (String)in.readValue(null);
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<RouteDisplayInformation> CREATOR = new Parcelable.Creator<RouteDisplayInformation>() {
    public RouteDisplayInformation createFromParcel(Parcel in) {
      return new RouteDisplayInformation(in);
    }
    public RouteDisplayInformation[] newArray(int size) {
      return new RouteDisplayInformation[size];
    }
  };
}

