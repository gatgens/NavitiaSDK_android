/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Durations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class Durations implements Parcelable {
  @SerializedName("taxi")
  private Integer taxi = null;

  @SerializedName("walking")
  private Integer walking = null;

  @SerializedName("car")
  private Integer car = null;

  @SerializedName("ridesharing")
  private Integer ridesharing = null;

  @SerializedName("bike")
  private Integer bike = null;

  @SerializedName("total")
  private Integer total = null;

  public Durations taxi(Integer taxi) {
    this.taxi = taxi;
    return this;
  }

   /**
   * Total duration by taxi of the journey (seconds)
   * @return taxi
  **/
  @ApiModelProperty(required = true, value = "Total duration by taxi of the journey (seconds)")
  public Integer getTaxi() {
    return taxi;
  }

  public void setTaxi(Integer taxi) {
    this.taxi = taxi;
  }

  public Durations walking(Integer walking) {
    this.walking = walking;
    return this;
  }

   /**
   * Total walking duration of the journey (seconds)
   * @return walking
  **/
  @ApiModelProperty(required = true, value = "Total walking duration of the journey (seconds)")
  public Integer getWalking() {
    return walking;
  }

  public void setWalking(Integer walking) {
    this.walking = walking;
  }

  public Durations car(Integer car) {
    this.car = car;
    return this;
  }

   /**
   * Total duration by car of the journey (seconds)
   * @return car
  **/
  @ApiModelProperty(required = true, value = "Total duration by car of the journey (seconds)")
  public Integer getCar() {
    return car;
  }

  public void setCar(Integer car) {
    this.car = car;
  }

  public Durations ridesharing(Integer ridesharing) {
    this.ridesharing = ridesharing;
    return this;
  }

   /**
   * Total duration by ridesharing of the journey (seconds)
   * @return ridesharing
  **/
  @ApiModelProperty(required = true, value = "Total duration by ridesharing of the journey (seconds)")
  public Integer getRidesharing() {
    return ridesharing;
  }

  public void setRidesharing(Integer ridesharing) {
    this.ridesharing = ridesharing;
  }

  public Durations bike(Integer bike) {
    this.bike = bike;
    return this;
  }

   /**
   * Total duration by bike of the journey (seconds)
   * @return bike
  **/
  @ApiModelProperty(required = true, value = "Total duration by bike of the journey (seconds)")
  public Integer getBike() {
    return bike;
  }

  public void setBike(Integer bike) {
    this.bike = bike;
  }

  public Durations total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total duration of the journey (seconds)
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total duration of the journey (seconds)")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Durations durations = (Durations) o;
    return Objects.equals(this.taxi, durations.taxi) &&
        Objects.equals(this.walking, durations.walking) &&
        Objects.equals(this.car, durations.car) &&
        Objects.equals(this.ridesharing, durations.ridesharing) &&
        Objects.equals(this.bike, durations.bike) &&
        Objects.equals(this.total, durations.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxi, walking, car, ridesharing, bike, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Durations {\n");
    
    sb.append("    taxi: ").append(toIndentedString(taxi)).append("\n");
    sb.append("    walking: ").append(toIndentedString(walking)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    ridesharing: ").append(toIndentedString(ridesharing)).append("\n");
    sb.append("    bike: ").append(toIndentedString(bike)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
     
    out.writeValue(taxi);

    out.writeValue(walking);

    out.writeValue(car);

    out.writeValue(ridesharing);

    out.writeValue(bike);

    out.writeValue(total);
  }

  public Durations() {
    super();
  }

  Durations(Parcel in) {
    
    taxi = (Integer)in.readValue(null);
    walking = (Integer)in.readValue(null);
    car = (Integer)in.readValue(null);
    ridesharing = (Integer)in.readValue(null);
    bike = (Integer)in.readValue(null);
    total = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Durations> CREATOR = new Parcelable.Creator<Durations>() {
    public Durations createFromParcel(Parcel in) {
      return new Durations(in);
    }
    public Durations[] newArray(int size) {
      return new Durations[size];
    }
  };
}
