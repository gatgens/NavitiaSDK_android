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
import org.kisio.NavitiaSDK.models.Admin;
import org.kisio.NavitiaSDK.models.Coord;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-14T10:20:26.501+01:00")
public class Address implements Parcelable {
  @SerializedName("name")
  private String name = null;

  @SerializedName("house_number")
  private Integer houseNumber = null;

  @SerializedName("coord")
  private Coord coord = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("administrative_regions")
  private List<Admin> administrativeRegions = null;

  @SerializedName("id")
  private String id = null;

  public Address name(String name) {
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

  public Address houseNumber(Integer houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * Get houseNumber
   * @return houseNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(Integer houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address coord(Coord coord) {
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

  public Address label(String label) {
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

  public Address administrativeRegions(List<Admin> administrativeRegions) {
    this.administrativeRegions = administrativeRegions;
    return this;
  }

  public Address addAdministrativeRegionsItem(Admin administrativeRegionsItem) {
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

  public Address id(String id) {
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
    Address address = (Address) o;
    return Objects.equals(this.name, address.name) &&
        Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.coord, address.coord) &&
        Objects.equals(this.label, address.label) &&
        Objects.equals(this.administrativeRegions, address.administrativeRegions) &&
        Objects.equals(this.id, address.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, houseNumber, coord, label, administrativeRegions, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    administrativeRegions: ").append(toIndentedString(administrativeRegions)).append("\n");
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
     
    out.writeValue(name);

    out.writeValue(houseNumber);

    out.writeValue(coord);

    out.writeValue(label);

    out.writeValue(administrativeRegions);

    out.writeValue(id);
  }

  public Address() {
    super();
  }

  Address(Parcel in) {
    
    name = (String)in.readValue(null);
    houseNumber = (Integer)in.readValue(null);
    coord = (Coord)in.readValue(Coord.class.getClassLoader());
    label = (String)in.readValue(null);
    administrativeRegions = (List<Admin>)in.readValue(Admin.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Address> CREATOR = new Parcelable.Creator<Address>() {
    public Address createFromParcel(Parcel in) {
      return new Address(in);
    }
    public Address[] newArray(int size) {
      return new Address[size];
    }
  };
}

