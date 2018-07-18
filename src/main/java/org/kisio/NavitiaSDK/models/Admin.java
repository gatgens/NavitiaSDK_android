/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.56.0-81-g74dda6e
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
import org.kisio.NavitiaSDK.models.Coord;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Admin
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-06-21T11:32:39.197+02:00")
public class Admin implements Parcelable {
  @SerializedName("insee")
  private String insee = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("coord")
  private Coord coord = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("zip_code")
  private String zipCode = null;

  public Admin insee(String insee) {
    this.insee = insee;
    return this;
  }

   /**
   * Get insee
   * @return insee
  **/
  @ApiModelProperty(value = "")
  public String getInsee() {
    return insee;
  }

  public void setInsee(String insee) {
    this.insee = insee;
  }

  public Admin name(String name) {
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

  public Admin level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Admin coord(Coord coord) {
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

  public Admin label(String label) {
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

  public Admin id(String id) {
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

  public Admin zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Admin admin = (Admin) o;
    return Objects.equals(this.insee, admin.insee) &&
        Objects.equals(this.name, admin.name) &&
        Objects.equals(this.level, admin.level) &&
        Objects.equals(this.coord, admin.coord) &&
        Objects.equals(this.label, admin.label) &&
        Objects.equals(this.id, admin.id) &&
        Objects.equals(this.zipCode, admin.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insee, name, level, coord, label, id, zipCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Admin {\n");
    
    sb.append("    insee: ").append(toIndentedString(insee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
     
    out.writeValue(insee);

    out.writeValue(name);

    out.writeValue(level);

    out.writeValue(coord);

    out.writeValue(label);

    out.writeValue(id);

    out.writeValue(zipCode);
  }

  public Admin() {
    super();
  }

  Admin(Parcel in) {
    
    insee = (String)in.readValue(null);
    name = (String)in.readValue(null);
    level = (Integer)in.readValue(null);
    coord = (Coord)in.readValue(Coord.class.getClassLoader());
    label = (String)in.readValue(null);
    id = (String)in.readValue(null);
    zipCode = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Admin> CREATOR = new Parcelable.Creator<Admin>() {
    public Admin createFromParcel(Parcel in) {
      return new Admin(in);
    }
    public Admin[] newArray(int size) {
      return new Admin[size];
    }
  };
}

