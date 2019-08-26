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
import com.kisio.navitia.sdk.data.expert.models.Address;
import com.kisio.navitia.sdk.data.expert.models.Admin;
import com.kisio.navitia.sdk.data.expert.models.CarPark;
import com.kisio.navitia.sdk.data.expert.models.Coord;
import com.kisio.navitia.sdk.data.expert.models.PoiType;
import com.kisio.navitia.sdk.data.expert.models.Stands;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Poi
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Poi implements Parcelable {
  @SerializedName("poi_type")
  private PoiType poiType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("car_park")
  private CarPark carPark = null;

  @SerializedName("coord")
  private Coord coord = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("administrative_regions")
  private List<Admin> administrativeRegions = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("stands")
  private Stands stands = null;

  public Poi poiType(PoiType poiType) {
    this.poiType = poiType;
    return this;
  }

   /**
   * Get poiType
   * @return poiType
  **/
  @ApiModelProperty(value = "")
  public PoiType getPoiType() {
    return poiType;
  }

  public void setPoiType(PoiType poiType) {
    this.poiType = poiType;
  }

  public Poi name(String name) {
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

  public Poi carPark(CarPark carPark) {
    this.carPark = carPark;
    return this;
  }

   /**
   * Get carPark
   * @return carPark
  **/
  @ApiModelProperty(value = "")
  public CarPark getCarPark() {
    return carPark;
  }

  public void setCarPark(CarPark carPark) {
    this.carPark = carPark;
  }

  public Poi coord(Coord coord) {
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

  public Poi label(String label) {
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

  public Poi administrativeRegions(List<Admin> administrativeRegions) {
    this.administrativeRegions = administrativeRegions;
    return this;
  }

  public Poi addAdministrativeRegionsItem(Admin administrativeRegionsItem) {
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

  public Poi address(Address address) {
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

  public Poi id(String id) {
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

  public Poi properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Poi putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Poi stands(Stands stands) {
    this.stands = stands;
    return this;
  }

   /**
   * Get stands
   * @return stands
  **/
  @ApiModelProperty(value = "")
  public Stands getStands() {
    return stands;
  }

  public void setStands(Stands stands) {
    this.stands = stands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poi poi = (Poi) o;
    return Objects.equals(this.poiType, poi.poiType) &&
        Objects.equals(this.name, poi.name) &&
        Objects.equals(this.carPark, poi.carPark) &&
        Objects.equals(this.coord, poi.coord) &&
        Objects.equals(this.label, poi.label) &&
        Objects.equals(this.administrativeRegions, poi.administrativeRegions) &&
        Objects.equals(this.address, poi.address) &&
        Objects.equals(this.id, poi.id) &&
        Objects.equals(this.properties, poi.properties) &&
        Objects.equals(this.stands, poi.stands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiType, name, carPark, coord, label, administrativeRegions, address, id, properties, stands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poi {\n");
    
    sb.append("    poiType: ").append(toIndentedString(poiType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    carPark: ").append(toIndentedString(carPark)).append("\n");
    sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    administrativeRegions: ").append(toIndentedString(administrativeRegions)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    stands: ").append(toIndentedString(stands)).append("\n");
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
     
    out.writeValue(poiType);

    out.writeValue(name);

    out.writeValue(carPark);

    out.writeValue(coord);

    out.writeValue(label);

    out.writeValue(administrativeRegions);

    out.writeValue(address);

    out.writeValue(id);

    out.writeValue(properties);

    out.writeValue(stands);
  }

  public Poi() {
    super();
  }

  Poi(Parcel in) {
    
    poiType = (PoiType)in.readValue(PoiType.class.getClassLoader());
    name = (String)in.readValue(null);
    carPark = (CarPark)in.readValue(CarPark.class.getClassLoader());
    coord = (Coord)in.readValue(Coord.class.getClassLoader());
    label = (String)in.readValue(null);
    administrativeRegions = (List<Admin>)in.readValue(Admin.class.getClassLoader());
    address = (Address)in.readValue(Address.class.getClassLoader());
    id = (String)in.readValue(null);
    properties = (Map<String, String>)in.readValue(null);
    stands = (Stands)in.readValue(Stands.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Poi> CREATOR = new Parcelable.Creator<Poi>() {
    public Poi createFromParcel(Parcel in) {
      return new Poi(in);
    }
    public Poi[] newArray(int size) {
      return new Poi[size];
    }
  };
}

