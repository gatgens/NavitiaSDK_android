/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.75.0
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
import org.kisio.NavitiaSDK.models.Address;
import org.kisio.NavitiaSDK.models.Admin;
import org.kisio.NavitiaSDK.models.Code;
import org.kisio.NavitiaSDK.models.Comment;
import org.kisio.NavitiaSDK.models.CommercialMode;
import org.kisio.NavitiaSDK.models.Coord;
import org.kisio.NavitiaSDK.models.FareZone;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.PhysicalMode;
import org.kisio.NavitiaSDK.models.StopArea;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * StopPoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class StopPoint implements Parcelable {
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

  @SerializedName("coord")
  private Coord coord = null;

  @SerializedName("label")
  private String label = null;

  /**
   * Gets or Sets equipments
   */
  public enum EquipmentsEnum {
    @SerializedName("has_wheelchair_accessibility")
    WHEELCHAIR_ACCESSIBILITY("has_wheelchair_accessibility"),
    
    @SerializedName("has_bike_accepted")
    BIKE_ACCEPTED("has_bike_accepted"),
    
    @SerializedName("has_air_conditioned")
    AIR_CONDITIONED("has_air_conditioned"),
    
    @SerializedName("has_visual_announcement")
    VISUAL_ANNOUNCEMENT("has_visual_announcement"),
    
    @SerializedName("has_audible_announcement")
    AUDIBLE_ANNOUNCEMENT("has_audible_announcement"),
    
    @SerializedName("has_appropriate_escort")
    APPROPRIATE_ESCORT("has_appropriate_escort"),
    
    @SerializedName("has_appropriate_signage")
    APPROPRIATE_SIGNAGE("has_appropriate_signage"),
    
    @SerializedName("has_school_vehicle")
    SCHOOL_VEHICLE("has_school_vehicle"),
    
    @SerializedName("has_wheelchair_boarding")
    WHEELCHAIR_BOARDING("has_wheelchair_boarding"),
    
    @SerializedName("has_sheltered")
    SHELTERED("has_sheltered"),
    
    @SerializedName("has_elevator")
    ELEVATOR("has_elevator"),
    
    @SerializedName("has_escalator")
    ESCALATOR("has_escalator"),
    
    @SerializedName("has_bike_depot")
    BIKE_DEPOT("has_bike_depot");

    private String value;

    EquipmentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("equipments")
  private List<EquipmentsEnum> equipments = new ArrayList<EquipmentsEnum>();

  @SerializedName("commercial_modes")
  private List<CommercialMode> commercialModes = null;

  @SerializedName("comments")
  private List<Comment> comments = null;

  @SerializedName("administrative_regions")
  private List<Admin> administrativeRegions = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("fare_zone")
  private FareZone fareZone = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("stop_area")
  private StopArea stopArea = null;

  public StopPoint comment(String comment) {
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

  public StopPoint codes(List<Code> codes) {
    this.codes = codes;
    return this;
  }

  public StopPoint addCodesItem(Code codesItem) {
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

  public StopPoint name(String name) {
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

  public StopPoint links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public StopPoint addLinksItem(LinkSchema linksItem) {
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

  public StopPoint physicalModes(List<PhysicalMode> physicalModes) {
    this.physicalModes = physicalModes;
    return this;
  }

  public StopPoint addPhysicalModesItem(PhysicalMode physicalModesItem) {
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

  public StopPoint coord(Coord coord) {
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

  public StopPoint label(String label) {
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

  public StopPoint equipments(List<EquipmentsEnum> equipments) {
    this.equipments = equipments;
    return this;
  }

  public StopPoint addEquipmentsItem(EquipmentsEnum equipmentsItem) {
    this.equipments.add(equipmentsItem);
    return this;
  }

   /**
   * Get equipments
   * @return equipments
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EquipmentsEnum> getEquipments() {
    return equipments;
  }

  public void setEquipments(List<EquipmentsEnum> equipments) {
    this.equipments = equipments;
  }

  public StopPoint commercialModes(List<CommercialMode> commercialModes) {
    this.commercialModes = commercialModes;
    return this;
  }

  public StopPoint addCommercialModesItem(CommercialMode commercialModesItem) {
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

  public StopPoint comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public StopPoint addCommentsItem(Comment commentsItem) {
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

  public StopPoint administrativeRegions(List<Admin> administrativeRegions) {
    this.administrativeRegions = administrativeRegions;
    return this;
  }

  public StopPoint addAdministrativeRegionsItem(Admin administrativeRegionsItem) {
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

  public StopPoint address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public StopPoint fareZone(FareZone fareZone) {
    this.fareZone = fareZone;
    return this;
  }

   /**
   * Get fareZone
   * @return fareZone
  **/
  @ApiModelProperty(value = "")
  public FareZone getFareZone() {
    return fareZone;
  }

  public void setFareZone(FareZone fareZone) {
    this.fareZone = fareZone;
  }

  public StopPoint id(String id) {
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

  public StopPoint stopArea(StopArea stopArea) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopPoint stopPoint = (StopPoint) o;
    return Objects.equals(this.comment, stopPoint.comment) &&
        Objects.equals(this.codes, stopPoint.codes) &&
        Objects.equals(this.name, stopPoint.name) &&
        Objects.equals(this.links, stopPoint.links) &&
        Objects.equals(this.physicalModes, stopPoint.physicalModes) &&
        Objects.equals(this.coord, stopPoint.coord) &&
        Objects.equals(this.label, stopPoint.label) &&
        Objects.equals(this.equipments, stopPoint.equipments) &&
        Objects.equals(this.commercialModes, stopPoint.commercialModes) &&
        Objects.equals(this.comments, stopPoint.comments) &&
        Objects.equals(this.administrativeRegions, stopPoint.administrativeRegions) &&
        Objects.equals(this.address, stopPoint.address) &&
        Objects.equals(this.fareZone, stopPoint.fareZone) &&
        Objects.equals(this.id, stopPoint.id) &&
        Objects.equals(this.stopArea, stopPoint.stopArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, codes, name, links, physicalModes, coord, label, equipments, commercialModes, comments, administrativeRegions, address, fareZone, id, stopArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopPoint {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    physicalModes: ").append(toIndentedString(physicalModes)).append("\n");
    sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    equipments: ").append(toIndentedString(equipments)).append("\n");
    sb.append("    commercialModes: ").append(toIndentedString(commercialModes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    administrativeRegions: ").append(toIndentedString(administrativeRegions)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fareZone: ").append(toIndentedString(fareZone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stopArea: ").append(toIndentedString(stopArea)).append("\n");
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

    out.writeValue(coord);

    out.writeValue(label);

    out.writeValue(equipments);

    out.writeValue(commercialModes);

    out.writeValue(comments);

    out.writeValue(administrativeRegions);

    out.writeValue(address);

    out.writeValue(fareZone);

    out.writeValue(id);

    out.writeValue(stopArea);
  }

  public StopPoint() {
    super();
  }

  StopPoint(Parcel in) {
    
    comment = (String)in.readValue(null);
    codes = (List<Code>)in.readValue(Code.class.getClassLoader());
    name = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    physicalModes = (List<PhysicalMode>)in.readValue(PhysicalMode.class.getClassLoader());
    coord = (Coord)in.readValue(Coord.class.getClassLoader());
    label = (String)in.readValue(null);
    equipments = (List<EquipmentsEnum>)in.readValue(null);
    commercialModes = (List<CommercialMode>)in.readValue(CommercialMode.class.getClassLoader());
    comments = (List<Comment>)in.readValue(Comment.class.getClassLoader());
    administrativeRegions = (List<Admin>)in.readValue(Admin.class.getClassLoader());
    address = (Address)in.readValue(Address.class.getClassLoader());
    fareZone = (FareZone)in.readValue(FareZone.class.getClassLoader());
    id = (String)in.readValue(null);
    stopArea = (StopArea)in.readValue(StopArea.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<StopPoint> CREATOR = new Parcelable.Creator<StopPoint>() {
    public StopPoint createFromParcel(Parcel in) {
      return new StopPoint(in);
    }
    public StopPoint[] newArray(int size) {
      return new StopPoint[size];
    }
  };
}

