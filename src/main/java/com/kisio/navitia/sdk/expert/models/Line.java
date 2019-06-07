/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.Code;
import com.kisio.navitia.sdk.expert.models.Comment;
import com.kisio.navitia.sdk.expert.models.CommercialMode;
import com.kisio.navitia.sdk.expert.models.LineGroup;
import com.kisio.navitia.sdk.expert.models.LinkSchema;
import com.kisio.navitia.sdk.expert.models.MultiLineStringSchema;
import com.kisio.navitia.sdk.expert.models.Network;
import com.kisio.navitia.sdk.expert.models.PhysicalMode;
import com.kisio.navitia.sdk.expert.models.Property;
import com.kisio.navitia.sdk.expert.models.Route;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Line
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-07T13:38:35.470+02:00")
public class Line implements Parcelable {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("properties")
  private List<Property> properties = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("network")
  private Network network = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("color")
  private String color = null;

  @SerializedName("routes")
  private List<Route> routes = null;

  @SerializedName("geojson")
  private MultiLineStringSchema geojson = null;

  @SerializedName("text_color")
  private String textColor = null;

  @SerializedName("physical_modes")
  private List<PhysicalMode> physicalModes = null;

  @SerializedName("codes")
  private List<Code> codes = null;

  @SerializedName("comments")
  private List<Comment> comments = null;

  @SerializedName("closing_time")
  private String closingTime = null;

  @SerializedName("opening_time")
  private String openingTime = null;

  @SerializedName("commercial_mode")
  private CommercialMode commercialMode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("line_groups")
  private List<LineGroup> lineGroups = null;

  @SerializedName("name")
  private String name = null;

  public Line comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Line properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Line addPropertiesItem(Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<Property>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public Line code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Line network(Network network) {
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

  public Line links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Line addLinksItem(LinkSchema linksItem) {
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

  public Line color(String color) {
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

  public Line routes(List<Route> routes) {
    this.routes = routes;
    return this;
  }

  public Line addRoutesItem(Route routesItem) {
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

  public Line geojson(MultiLineStringSchema geojson) {
    this.geojson = geojson;
    return this;
  }

   /**
   * Get geojson
   * @return geojson
  **/
  @ApiModelProperty(value = "")
  public MultiLineStringSchema getGeojson() {
    return geojson;
  }

  public void setGeojson(MultiLineStringSchema geojson) {
    this.geojson = geojson;
  }

  public Line textColor(String textColor) {
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

  public Line physicalModes(List<PhysicalMode> physicalModes) {
    this.physicalModes = physicalModes;
    return this;
  }

  public Line addPhysicalModesItem(PhysicalMode physicalModesItem) {
    if (this.physicalModes == null) {
      this.physicalModes = new ArrayList<PhysicalMode>();
    }
    this.physicalModes.add(physicalModesItem);
    return this;
  }

   /**
   * Get physicalModes
   * @return physicalModes
  **/
  @ApiModelProperty(value = "")
  public List<PhysicalMode> getPhysicalModes() {
    return physicalModes;
  }

  public void setPhysicalModes(List<PhysicalMode> physicalModes) {
    this.physicalModes = physicalModes;
  }

  public Line codes(List<Code> codes) {
    this.codes = codes;
    return this;
  }

  public Line addCodesItem(Code codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<Code>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * Get codes
   * @return codes
  **/
  @ApiModelProperty(value = "")
  public List<Code> getCodes() {
    return codes;
  }

  public void setCodes(List<Code> codes) {
    this.codes = codes;
  }

  public Line comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Line addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public Line closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

   /**
   * Get closingTime
   * @return closingTime
  **/
  @ApiModelProperty(value = "")
  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }

  public Line openingTime(String openingTime) {
    this.openingTime = openingTime;
    return this;
  }

   /**
   * Get openingTime
   * @return openingTime
  **/
  @ApiModelProperty(value = "")
  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public Line commercialMode(CommercialMode commercialMode) {
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

  public Line id(String id) {
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

  public Line lineGroups(List<LineGroup> lineGroups) {
    this.lineGroups = lineGroups;
    return this;
  }

  public Line addLineGroupsItem(LineGroup lineGroupsItem) {
    if (this.lineGroups == null) {
      this.lineGroups = new ArrayList<LineGroup>();
    }
    this.lineGroups.add(lineGroupsItem);
    return this;
  }

   /**
   * Get lineGroups
   * @return lineGroups
  **/
  @ApiModelProperty(value = "")
  public List<LineGroup> getLineGroups() {
    return lineGroups;
  }

  public void setLineGroups(List<LineGroup> lineGroups) {
    this.lineGroups = lineGroups;
  }

  public Line name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Line line = (Line) o;
    return Objects.equals(this.comment, line.comment) &&
        Objects.equals(this.properties, line.properties) &&
        Objects.equals(this.code, line.code) &&
        Objects.equals(this.network, line.network) &&
        Objects.equals(this.links, line.links) &&
        Objects.equals(this.color, line.color) &&
        Objects.equals(this.routes, line.routes) &&
        Objects.equals(this.geojson, line.geojson) &&
        Objects.equals(this.textColor, line.textColor) &&
        Objects.equals(this.physicalModes, line.physicalModes) &&
        Objects.equals(this.codes, line.codes) &&
        Objects.equals(this.comments, line.comments) &&
        Objects.equals(this.closingTime, line.closingTime) &&
        Objects.equals(this.openingTime, line.openingTime) &&
        Objects.equals(this.commercialMode, line.commercialMode) &&
        Objects.equals(this.id, line.id) &&
        Objects.equals(this.lineGroups, line.lineGroups) &&
        Objects.equals(this.name, line.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, properties, code, network, links, color, routes, geojson, textColor, physicalModes, codes, comments, closingTime, openingTime, commercialMode, id, lineGroups, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    geojson: ").append(toIndentedString(geojson)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    physicalModes: ").append(toIndentedString(physicalModes)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    commercialMode: ").append(toIndentedString(commercialMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lineGroups: ").append(toIndentedString(lineGroups)).append("\n");
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
     
    out.writeValue(comment);

    out.writeValue(properties);

    out.writeValue(code);

    out.writeValue(network);

    out.writeValue(links);

    out.writeValue(color);

    out.writeValue(routes);

    out.writeValue(geojson);

    out.writeValue(textColor);

    out.writeValue(physicalModes);

    out.writeValue(codes);

    out.writeValue(comments);

    out.writeValue(closingTime);

    out.writeValue(openingTime);

    out.writeValue(commercialMode);

    out.writeValue(id);

    out.writeValue(lineGroups);

    out.writeValue(name);
  }

  public Line() {
    super();
  }

  Line(Parcel in) {
    
    comment = (String)in.readValue(null);
    properties = (List<Property>)in.readValue(Property.class.getClassLoader());
    code = (String)in.readValue(null);
    network = (Network)in.readValue(Network.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    color = (String)in.readValue(null);
    routes = (List<Route>)in.readValue(Route.class.getClassLoader());
    geojson = (MultiLineStringSchema)in.readValue(MultiLineStringSchema.class.getClassLoader());
    textColor = (String)in.readValue(null);
    physicalModes = (List<PhysicalMode>)in.readValue(PhysicalMode.class.getClassLoader());
    codes = (List<Code>)in.readValue(Code.class.getClassLoader());
    comments = (List<Comment>)in.readValue(Comment.class.getClassLoader());
    closingTime = (String)in.readValue(null);
    openingTime = (String)in.readValue(null);
    commercialMode = (CommercialMode)in.readValue(CommercialMode.class.getClassLoader());
    id = (String)in.readValue(null);
    lineGroups = (List<LineGroup>)in.readValue(LineGroup.class.getClassLoader());
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Line> CREATOR = new Parcelable.Creator<Line>() {
    public Line createFromParcel(Parcel in) {
      return new Line(in);
    }
    public Line[] newArray(int size) {
      return new Line[size];
    }
  };
}

