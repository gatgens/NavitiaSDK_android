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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * CarPark
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T11:47:49.806+02:00")
public class CarPark implements Parcelable {
  @SerializedName("available")
  private Integer available = null;

  @SerializedName("total_places")
  private Integer totalPlaces = null;

  @SerializedName("occupied_PRM")
  private Integer occupiedPRM = null;

  @SerializedName("occupied")
  private Integer occupied = null;

  @SerializedName("available_PRM")
  private Integer availablePRM = null;

  public CarPark available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public CarPark totalPlaces(Integer totalPlaces) {
    this.totalPlaces = totalPlaces;
    return this;
  }

   /**
   * Get totalPlaces
   * @return totalPlaces
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPlaces() {
    return totalPlaces;
  }

  public void setTotalPlaces(Integer totalPlaces) {
    this.totalPlaces = totalPlaces;
  }

  public CarPark occupiedPRM(Integer occupiedPRM) {
    this.occupiedPRM = occupiedPRM;
    return this;
  }

   /**
   * Get occupiedPRM
   * @return occupiedPRM
  **/
  @ApiModelProperty(value = "")
  public Integer getOccupiedPRM() {
    return occupiedPRM;
  }

  public void setOccupiedPRM(Integer occupiedPRM) {
    this.occupiedPRM = occupiedPRM;
  }

  public CarPark occupied(Integer occupied) {
    this.occupied = occupied;
    return this;
  }

   /**
   * Get occupied
   * @return occupied
  **/
  @ApiModelProperty(value = "")
  public Integer getOccupied() {
    return occupied;
  }

  public void setOccupied(Integer occupied) {
    this.occupied = occupied;
  }

  public CarPark availablePRM(Integer availablePRM) {
    this.availablePRM = availablePRM;
    return this;
  }

   /**
   * Get availablePRM
   * @return availablePRM
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailablePRM() {
    return availablePRM;
  }

  public void setAvailablePRM(Integer availablePRM) {
    this.availablePRM = availablePRM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarPark carPark = (CarPark) o;
    return Objects.equals(this.available, carPark.available) &&
        Objects.equals(this.totalPlaces, carPark.totalPlaces) &&
        Objects.equals(this.occupiedPRM, carPark.occupiedPRM) &&
        Objects.equals(this.occupied, carPark.occupied) &&
        Objects.equals(this.availablePRM, carPark.availablePRM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, totalPlaces, occupiedPRM, occupied, availablePRM);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarPark {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    totalPlaces: ").append(toIndentedString(totalPlaces)).append("\n");
    sb.append("    occupiedPRM: ").append(toIndentedString(occupiedPRM)).append("\n");
    sb.append("    occupied: ").append(toIndentedString(occupied)).append("\n");
    sb.append("    availablePRM: ").append(toIndentedString(availablePRM)).append("\n");
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
     
    out.writeValue(available);

    out.writeValue(totalPlaces);

    out.writeValue(occupiedPRM);

    out.writeValue(occupied);

    out.writeValue(availablePRM);
  }

  public CarPark() {
    super();
  }

  CarPark(Parcel in) {
    
    available = (Integer)in.readValue(null);
    totalPlaces = (Integer)in.readValue(null);
    occupiedPRM = (Integer)in.readValue(null);
    occupied = (Integer)in.readValue(null);
    availablePRM = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CarPark> CREATOR = new Parcelable.Creator<CarPark>() {
    public CarPark createFromParcel(Parcel in) {
      return new CarPark(in);
    }
    public CarPark[] newArray(int size) {
      return new CarPark[size];
    }
  };
}

