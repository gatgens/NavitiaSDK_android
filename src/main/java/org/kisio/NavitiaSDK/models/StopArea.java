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
import org.kisio.NavitiaSDK.models.Admin;
import org.kisio.NavitiaSDK.models.Code;
import org.kisio.NavitiaSDK.models.Comment;
import org.kisio.NavitiaSDK.models.CommercialMode;
import org.kisio.NavitiaSDK.models.Coord;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.PhysicalMode;
import org.kisio.NavitiaSDK.models.StopPoint;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * StopArea
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class StopArea implements Parcelable {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("codes")
  private List<Code> codes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("physical_modes")
  private List<PhysicalMode> physicalModes = null;

  @SerializedName("comments")
  private List<Comment> comments = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("commercial_modes")
  private List<CommercialMode> commercialModes = null;

  @SerializedName("coord")
  private Coord coord = null;

  @SerializedName("administrative_regions")
  private List<Admin> administrativeRegions = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("stop_points")
  private List<StopPoint> stopPoints = null;

  @SerializedName("id")
  private String id = null;

  public StopArea comment(String comment) {
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

  public StopArea codes(List<Code> codes) {
    this.codes = codes;
    return this;
  }

  public StopArea addCodesItem(Code codesItem) {
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

  public StopArea name(String name) {
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

  public StopArea links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public StopArea addLinksItem(LinkSchema linksItem) {
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

  public StopArea physicalModes(List<PhysicalMode> physicalModes) {
    this.physicalModes = physicalModes;
    return this;
  }

  public StopArea addPhysicalModesItem(PhysicalMode physicalModesItem) {
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

  public StopArea comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public StopArea addCommentsItem(Comment commentsItem) {
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

  public StopArea label(String label) {
    this.label = label;
    return this;
  }

   /**
   *  Label of the stop area. The name is directly taken from the data whereas the label is  something we compute for better traveler information. If you don't know what to display, display the label. 
   * @return label
  **/
  @ApiModelProperty(value = " Label of the stop area. The name is directly taken from the data whereas the label is  something we compute for better traveler information. If you don't know what to display, display the label. ")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public StopArea commercialModes(List<CommercialMode> commercialModes) {
    this.commercialModes = commercialModes;
    return this;
  }

  public StopArea addCommercialModesItem(CommercialMode commercialModesItem) {
    if (this.commercialModes == null) {
      this.commercialModes = new ArrayList<CommercialMode>();
    }
    this.commercialModes.add(commercialModesItem);
    return this;
  }

   /**
   * Get commercialModes
   * @return commercialModes
  **/
  @ApiModelProperty(value = "")
  public List<CommercialMode> getCommercialModes() {
    return commercialModes;
  }

  public void setCommercialModes(List<CommercialMode> commercialModes) {
    this.commercialModes = commercialModes;
  }

  public StopArea coord(Coord coord) {
    this.coord = coord;
    return this;
  }

   /**
   * Get coord
   * @return coord
  **/
  @ApiModelProperty(value = "")
  public Coord getCoord() {
    return coord;
  }

  public void setCoord(Coord coord) {
    this.coord = coord;
  }

  public StopArea administrativeRegions(List<Admin> administrativeRegions) {
    this.administrativeRegions = administrativeRegions;
    return this;
  }

  public StopArea addAdministrativeRegionsItem(Admin administrativeRegionsItem) {
    if (this.administrativeRegions == null) {
      this.administrativeRegions = new ArrayList<Admin>();
    }
    this.administrativeRegions.add(administrativeRegionsItem);
    return this;
  }

   /**
   * Get administrativeRegions
   * @return administrativeRegions
  **/
  @ApiModelProperty(value = "")
  public List<Admin> getAdministrativeRegions() {
    return administrativeRegions;
  }

  public void setAdministrativeRegions(List<Admin> administrativeRegions) {
    this.administrativeRegions = administrativeRegions;
  }

  public StopArea timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public StopArea stopPoints(List<StopPoint> stopPoints) {
    this.stopPoints = stopPoints;
    return this;
  }

  public StopArea addStopPointsItem(StopPoint stopPointsItem) {
    if (this.stopPoints == null) {
      this.stopPoints = new ArrayList<StopPoint>();
    }
    this.stopPoints.add(stopPointsItem);
    return this;
  }

   /**
   * Get stopPoints
   * @return stopPoints
  **/
  @ApiModelProperty(value = "")
  public List<StopPoint> getStopPoints() {
    return stopPoints;
  }

  public void setStopPoints(List<StopPoint> stopPoints) {
    this.stopPoints = stopPoints;
  }

  public StopArea id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopArea stopArea = (StopArea) o;
    return Objects.equals(this.comment, stopArea.comment) &&
        Objects.equals(this.codes, stopArea.codes) &&
        Objects.equals(this.name, stopArea.name) &&
        Objects.equals(this.links, stopArea.links) &&
        Objects.equals(this.physicalModes, stopArea.physicalModes) &&
        Objects.equals(this.comments, stopArea.comments) &&
        Objects.equals(this.label, stopArea.label) &&
        Objects.equals(this.commercialModes, stopArea.commercialModes) &&
        Objects.equals(this.coord, stopArea.coord) &&
        Objects.equals(this.administrativeRegions, stopArea.administrativeRegions) &&
        Objects.equals(this.timezone, stopArea.timezone) &&
        Objects.equals(this.stopPoints, stopArea.stopPoints) &&
        Objects.equals(this.id, stopArea.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, codes, name, links, physicalModes, comments, label, commercialModes, coord, administrativeRegions, timezone, stopPoints, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopArea {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    physicalModes: ").append(toIndentedString(physicalModes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    commercialModes: ").append(toIndentedString(commercialModes)).append("\n");
    sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
    sb.append("    administrativeRegions: ").append(toIndentedString(administrativeRegions)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    stopPoints: ").append(toIndentedString(stopPoints)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    out.writeValue(codes);

    out.writeValue(name);

    out.writeValue(links);

    out.writeValue(physicalModes);

    out.writeValue(comments);

    out.writeValue(label);

    out.writeValue(commercialModes);

    out.writeValue(coord);

    out.writeValue(administrativeRegions);

    out.writeValue(timezone);

    out.writeValue(stopPoints);

    out.writeValue(id);
  }

  public StopArea() {
    super();
  }

  StopArea(Parcel in) {
    
    comment = (String)in.readValue(null);
    codes = (List<Code>)in.readValue(Code.class.getClassLoader());
    name = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    physicalModes = (List<PhysicalMode>)in.readValue(PhysicalMode.class.getClassLoader());
    comments = (List<Comment>)in.readValue(Comment.class.getClassLoader());
    label = (String)in.readValue(null);
    commercialModes = (List<CommercialMode>)in.readValue(CommercialMode.class.getClassLoader());
    coord = (Coord)in.readValue(Coord.class.getClassLoader());
    administrativeRegions = (List<Admin>)in.readValue(Admin.class.getClassLoader());
    timezone = (String)in.readValue(null);
    stopPoints = (List<StopPoint>)in.readValue(StopPoint.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<StopArea> CREATOR = new Parcelable.Creator<StopArea>() {
    public StopArea createFromParcel(Parcel in) {
      return new StopArea(in);
    }
    public StopArea[] newArray(int size) {
      return new StopArea[size];
    }
  };
}

