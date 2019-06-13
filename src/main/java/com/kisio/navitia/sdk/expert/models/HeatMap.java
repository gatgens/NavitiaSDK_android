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
import com.kisio.navitia.sdk.expert.models.HeatMatrixSchema;
import com.kisio.navitia.sdk.expert.models.Place;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * HeatMap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class HeatMap implements Parcelable {
  @SerializedName("to")
  private Place to = null;

  @SerializedName("requested_date_time")
  private String requestedDateTime = null;

  @SerializedName("from")
  private Place from = null;

  @SerializedName("heat_matrix")
  private HeatMatrixSchema heatMatrix = null;

  public HeatMap to(Place to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public Place getTo() {
    return to;
  }

  public void setTo(Place to) {
    this.to = to;
  }

  public HeatMap requestedDateTime(String requestedDateTime) {
    this.requestedDateTime = requestedDateTime;
    return this;
  }

   /**
   * Get requestedDateTime
   * @return requestedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getRequestedDateTime() {
    return requestedDateTime;
  }

  public void setRequestedDateTime(String requestedDateTime) {
    this.requestedDateTime = requestedDateTime;
  }

  public HeatMap from(Place from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public Place getFrom() {
    return from;
  }

  public void setFrom(Place from) {
    this.from = from;
  }

  public HeatMap heatMatrix(HeatMatrixSchema heatMatrix) {
    this.heatMatrix = heatMatrix;
    return this;
  }

   /**
   * Get heatMatrix
   * @return heatMatrix
  **/
  @ApiModelProperty(value = "")
  public HeatMatrixSchema getHeatMatrix() {
    return heatMatrix;
  }

  public void setHeatMatrix(HeatMatrixSchema heatMatrix) {
    this.heatMatrix = heatMatrix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatMap heatMap = (HeatMap) o;
    return Objects.equals(this.to, heatMap.to) &&
        Objects.equals(this.requestedDateTime, heatMap.requestedDateTime) &&
        Objects.equals(this.from, heatMap.from) &&
        Objects.equals(this.heatMatrix, heatMap.heatMatrix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, requestedDateTime, from, heatMatrix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatMap {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    requestedDateTime: ").append(toIndentedString(requestedDateTime)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    heatMatrix: ").append(toIndentedString(heatMatrix)).append("\n");
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
     
    out.writeValue(to);

    out.writeValue(requestedDateTime);

    out.writeValue(from);

    out.writeValue(heatMatrix);
  }

  public HeatMap() {
    super();
  }

  HeatMap(Parcel in) {
    
    to = (Place)in.readValue(Place.class.getClassLoader());
    requestedDateTime = (String)in.readValue(null);
    from = (Place)in.readValue(Place.class.getClassLoader());
    heatMatrix = (HeatMatrixSchema)in.readValue(HeatMatrixSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<HeatMap> CREATOR = new Parcelable.Creator<HeatMap>() {
    public HeatMap createFromParcel(Parcel in) {
      return new HeatMap(in);
    }
    public HeatMap[] newArray(int size) {
      return new HeatMap[size];
    }
  };
}

