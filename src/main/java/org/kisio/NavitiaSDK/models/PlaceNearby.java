/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.78.0
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
import org.kisio.NavitiaSDK.models.Address;
import org.kisio.NavitiaSDK.models.Admin;
import org.kisio.NavitiaSDK.models.Poi;
import org.kisio.NavitiaSDK.models.StopArea;
import org.kisio.NavitiaSDK.models.StopPoint;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PlaceNearby
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T18:38:06.279+02:00")
public class PlaceNearby implements Parcelable {
  /**
   * Gets or Sets embeddedType
   */
  public enum EmbeddedTypeEnum {
    @SerializedName("line")
    LINE("line"),
    
    @SerializedName("journey_pattern")
    JOURNEY_PATTERN("journey_pattern"),
    
    @SerializedName("vehicle_journey")
    VEHICLE_JOURNEY("vehicle_journey"),
    
    @SerializedName("stop_point")
    STOP_POINT("stop_point"),
    
    @SerializedName("stop_area")
    STOP_AREA("stop_area"),
    
    @SerializedName("network")
    NETWORK("network"),
    
    @SerializedName("physical_mode")
    PHYSICAL_MODE("physical_mode"),
    
    @SerializedName("commercial_mode")
    COMMERCIAL_MODE("commercial_mode"),
    
    @SerializedName("connection")
    CONNECTION("connection"),
    
    @SerializedName("journey_pattern_point")
    JOURNEY_PATTERN_POINT("journey_pattern_point"),
    
    @SerializedName("company")
    COMPANY("company"),
    
    @SerializedName("route")
    ROUTE("route"),
    
    @SerializedName("poi")
    POI("poi"),
    
    @SerializedName("contributor")
    CONTRIBUTOR("contributor"),
    
    @SerializedName("address")
    ADDRESS("address"),
    
    @SerializedName("poitype")
    POITYPE("poitype"),
    
    @SerializedName("administrative_region")
    ADMINISTRATIVE_REGION("administrative_region"),
    
    @SerializedName("calendar")
    CALENDAR("calendar"),
    
    @SerializedName("line_group")
    LINE_GROUP("line_group"),
    
    @SerializedName("impact")
    IMPACT("impact"),
    
    @SerializedName("dataset")
    DATASET("dataset"),
    
    @SerializedName("trip")
    TRIP("trip");

    private String value;

    EmbeddedTypeEnum(String value) {
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

  @SerializedName("embedded_type")
  private EmbeddedTypeEnum embeddedType = null;

  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("administrative_region")
  private Admin administrativeRegion = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("distance")
  private String distance = null;

  @SerializedName("poi")
  private Poi poi = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("quality")
  private Integer quality = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("stop_area")
  private StopArea stopArea = null;

  public PlaceNearby embeddedType(EmbeddedTypeEnum embeddedType) {
    this.embeddedType = embeddedType;
    return this;
  }

   /**
   * Get embeddedType
   * @return embeddedType
  **/
  @ApiModelProperty(required = true, value = "")
  public EmbeddedTypeEnum getEmbeddedType() {
    return embeddedType;
  }

  public void setEmbeddedType(EmbeddedTypeEnum embeddedType) {
    this.embeddedType = embeddedType;
  }

  public PlaceNearby stopPoint(StopPoint stopPoint) {
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

  public PlaceNearby administrativeRegion(Admin administrativeRegion) {
    this.administrativeRegion = administrativeRegion;
    return this;
  }

   /**
   * Get administrativeRegion
   * @return administrativeRegion
  **/
  @ApiModelProperty(value = "")
  public Admin getAdministrativeRegion() {
    return administrativeRegion;
  }

  public void setAdministrativeRegion(Admin administrativeRegion) {
    this.administrativeRegion = administrativeRegion;
  }

  public PlaceNearby name(String name) {
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

  public PlaceNearby distance(String distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Distance to the object in meters
   * @return distance
  **/
  @ApiModelProperty(value = "Distance to the object in meters")
  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public PlaceNearby poi(Poi poi) {
    this.poi = poi;
    return this;
  }

   /**
   * Get poi
   * @return poi
  **/
  @ApiModelProperty(value = "")
  public Poi getPoi() {
    return poi;
  }

  public void setPoi(Poi poi) {
    this.poi = poi;
  }

  public PlaceNearby address(Address address) {
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

  public PlaceNearby quality(Integer quality) {
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

  public PlaceNearby id(String id) {
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

  public PlaceNearby stopArea(StopArea stopArea) {
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
    PlaceNearby placeNearby = (PlaceNearby) o;
    return Objects.equals(this.embeddedType, placeNearby.embeddedType) &&
        Objects.equals(this.stopPoint, placeNearby.stopPoint) &&
        Objects.equals(this.administrativeRegion, placeNearby.administrativeRegion) &&
        Objects.equals(this.name, placeNearby.name) &&
        Objects.equals(this.distance, placeNearby.distance) &&
        Objects.equals(this.poi, placeNearby.poi) &&
        Objects.equals(this.address, placeNearby.address) &&
        Objects.equals(this.quality, placeNearby.quality) &&
        Objects.equals(this.id, placeNearby.id) &&
        Objects.equals(this.stopArea, placeNearby.stopArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedType, stopPoint, administrativeRegion, name, distance, poi, address, quality, id, stopArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceNearby {\n");
    
    sb.append("    embeddedType: ").append(toIndentedString(embeddedType)).append("\n");
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    administrativeRegion: ").append(toIndentedString(administrativeRegion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    poi: ").append(toIndentedString(poi)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
     
    out.writeValue(embeddedType);

    out.writeValue(stopPoint);

    out.writeValue(administrativeRegion);

    out.writeValue(name);

    out.writeValue(distance);

    out.writeValue(poi);

    out.writeValue(address);

    out.writeValue(quality);

    out.writeValue(id);

    out.writeValue(stopArea);
  }

  public PlaceNearby() {
    super();
  }

  PlaceNearby(Parcel in) {
    
    embeddedType = (EmbeddedTypeEnum)in.readValue(null);
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    administrativeRegion = (Admin)in.readValue(Admin.class.getClassLoader());
    name = (String)in.readValue(null);
    distance = (String)in.readValue(null);
    poi = (Poi)in.readValue(Poi.class.getClassLoader());
    address = (Address)in.readValue(Address.class.getClassLoader());
    quality = (Integer)in.readValue(null);
    id = (String)in.readValue(null);
    stopArea = (StopArea)in.readValue(StopArea.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlaceNearby> CREATOR = new Parcelable.Creator<PlaceNearby>() {
    public PlaceNearby createFromParcel(Parcel in) {
      return new PlaceNearby(in);
    }
    public PlaceNearby[] newArray(int size) {
      return new PlaceNearby[size];
    }
  };
}

