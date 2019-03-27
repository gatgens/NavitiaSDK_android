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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * SeatsDescription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class SeatsDescription implements Parcelable {
  @SerializedName("available")
  private Integer available = null;

  @SerializedName("total")
  private Integer total = null;

  public SeatsDescription available(Integer available) {
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

  public SeatsDescription total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
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
    SeatsDescription seatsDescription = (SeatsDescription) o;
    return Objects.equals(this.available, seatsDescription.available) &&
        Objects.equals(this.total, seatsDescription.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatsDescription {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
     
    out.writeValue(available);

    out.writeValue(total);
  }

  public SeatsDescription() {
    super();
  }

  SeatsDescription(Parcel in) {
    
    available = (Integer)in.readValue(null);
    total = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SeatsDescription> CREATOR = new Parcelable.Creator<SeatsDescription>() {
    public SeatsDescription createFromParcel(Parcel in) {
      return new SeatsDescription(in);
    }
    public SeatsDescription[] newArray(int size) {
      return new SeatsDescription[size];
    }
  };
}

