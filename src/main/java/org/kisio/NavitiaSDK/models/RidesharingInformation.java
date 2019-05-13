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
import org.kisio.NavitiaSDK.models.IndividualInformation;
import org.kisio.NavitiaSDK.models.SeatsDescription;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * RidesharingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T18:38:06.279+02:00")
public class RidesharingInformation implements Parcelable {
  @SerializedName("operator")
  private String operator = null;

  @SerializedName("driver")
  private IndividualInformation driver = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("seats")
  private SeatsDescription seats = null;

  public RidesharingInformation operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public RidesharingInformation driver(IndividualInformation driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @ApiModelProperty(value = "")
  public IndividualInformation getDriver() {
    return driver;
  }

  public void setDriver(IndividualInformation driver) {
    this.driver = driver;
  }

  public RidesharingInformation network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public RidesharingInformation seats(SeatsDescription seats) {
    this.seats = seats;
    return this;
  }

   /**
   * Get seats
   * @return seats
  **/
  @ApiModelProperty(value = "")
  public SeatsDescription getSeats() {
    return seats;
  }

  public void setSeats(SeatsDescription seats) {
    this.seats = seats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RidesharingInformation ridesharingInformation = (RidesharingInformation) o;
    return Objects.equals(this.operator, ridesharingInformation.operator) &&
        Objects.equals(this.driver, ridesharingInformation.driver) &&
        Objects.equals(this.network, ridesharingInformation.network) &&
        Objects.equals(this.seats, ridesharingInformation.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, driver, network, seats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RidesharingInformation {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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
     
    out.writeValue(operator);

    out.writeValue(driver);

    out.writeValue(network);

    out.writeValue(seats);
  }

  public RidesharingInformation() {
    super();
  }

  RidesharingInformation(Parcel in) {
    
    operator = (String)in.readValue(null);
    driver = (IndividualInformation)in.readValue(IndividualInformation.class.getClassLoader());
    network = (String)in.readValue(null);
    seats = (SeatsDescription)in.readValue(SeatsDescription.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<RidesharingInformation> CREATOR = new Parcelable.Creator<RidesharingInformation>() {
    public RidesharingInformation createFromParcel(Parcel in) {
      return new RidesharingInformation(in);
    }
    public RidesharingInformation[] newArray(int size) {
      return new RidesharingInformation[size];
    }
  };
}

