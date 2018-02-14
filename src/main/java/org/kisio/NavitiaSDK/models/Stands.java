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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Stands
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-14T10:20:26.501+01:00")
public class Stands implements Parcelable {
  @SerializedName("available_places")
  private Integer availablePlaces = null;

  @SerializedName("available_bikes")
  private Integer availableBikes = null;

  @SerializedName("total_stands")
  private Integer totalStands = null;

  public Stands availablePlaces(Integer availablePlaces) {
    this.availablePlaces = availablePlaces;
    return this;
  }

   /**
   * Get availablePlaces
   * @return availablePlaces
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailablePlaces() {
    return availablePlaces;
  }

  public void setAvailablePlaces(Integer availablePlaces) {
    this.availablePlaces = availablePlaces;
  }

  public Stands availableBikes(Integer availableBikes) {
    this.availableBikes = availableBikes;
    return this;
  }

   /**
   * Get availableBikes
   * @return availableBikes
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableBikes() {
    return availableBikes;
  }

  public void setAvailableBikes(Integer availableBikes) {
    this.availableBikes = availableBikes;
  }

  public Stands totalStands(Integer totalStands) {
    this.totalStands = totalStands;
    return this;
  }

   /**
   * Get totalStands
   * @return totalStands
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalStands() {
    return totalStands;
  }

  public void setTotalStands(Integer totalStands) {
    this.totalStands = totalStands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stands stands = (Stands) o;
    return Objects.equals(this.availablePlaces, stands.availablePlaces) &&
        Objects.equals(this.availableBikes, stands.availableBikes) &&
        Objects.equals(this.totalStands, stands.totalStands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePlaces, availableBikes, totalStands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stands {\n");
    
    sb.append("    availablePlaces: ").append(toIndentedString(availablePlaces)).append("\n");
    sb.append("    availableBikes: ").append(toIndentedString(availableBikes)).append("\n");
    sb.append("    totalStands: ").append(toIndentedString(totalStands)).append("\n");
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
     
    out.writeValue(availablePlaces);

    out.writeValue(availableBikes);

    out.writeValue(totalStands);
  }

  public Stands() {
    super();
  }

  Stands(Parcel in) {
    
    availablePlaces = (Integer)in.readValue(null);
    availableBikes = (Integer)in.readValue(null);
    totalStands = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Stands> CREATOR = new Parcelable.Creator<Stands>() {
    public Stands createFromParcel(Parcel in) {
      return new Stands(in);
    }
    public Stands[] newArray(int size) {
      return new Stands[size];
    }
  };
}

