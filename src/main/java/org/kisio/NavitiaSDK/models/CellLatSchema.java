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
 * CellLatSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class CellLatSchema implements Parcelable {
  @SerializedName("min_lat")
  private Float minLat = null;

  @SerializedName("max_lat")
  private Float maxLat = null;

  @SerializedName("center_lat")
  private Float centerLat = null;

  public CellLatSchema minLat(Float minLat) {
    this.minLat = minLat;
    return this;
  }

   /**
   * Get minLat
   * @return minLat
  **/
  @ApiModelProperty(value = "")
  public Float getMinLat() {
    return minLat;
  }

  public void setMinLat(Float minLat) {
    this.minLat = minLat;
  }

  public CellLatSchema maxLat(Float maxLat) {
    this.maxLat = maxLat;
    return this;
  }

   /**
   * Get maxLat
   * @return maxLat
  **/
  @ApiModelProperty(value = "")
  public Float getMaxLat() {
    return maxLat;
  }

  public void setMaxLat(Float maxLat) {
    this.maxLat = maxLat;
  }

  public CellLatSchema centerLat(Float centerLat) {
    this.centerLat = centerLat;
    return this;
  }

   /**
   * Get centerLat
   * @return centerLat
  **/
  @ApiModelProperty(value = "")
  public Float getCenterLat() {
    return centerLat;
  }

  public void setCenterLat(Float centerLat) {
    this.centerLat = centerLat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellLatSchema cellLatSchema = (CellLatSchema) o;
    return Objects.equals(this.minLat, cellLatSchema.minLat) &&
        Objects.equals(this.maxLat, cellLatSchema.maxLat) &&
        Objects.equals(this.centerLat, cellLatSchema.centerLat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLat, maxLat, centerLat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellLatSchema {\n");
    
    sb.append("    minLat: ").append(toIndentedString(minLat)).append("\n");
    sb.append("    maxLat: ").append(toIndentedString(maxLat)).append("\n");
    sb.append("    centerLat: ").append(toIndentedString(centerLat)).append("\n");
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
     
    out.writeValue(minLat);

    out.writeValue(maxLat);

    out.writeValue(centerLat);
  }

  public CellLatSchema() {
    super();
  }

  CellLatSchema(Parcel in) {
    
    minLat = (Float)in.readValue(null);
    maxLat = (Float)in.readValue(null);
    centerLat = (Float)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CellLatSchema> CREATOR = new Parcelable.Creator<CellLatSchema>() {
    public CellLatSchema createFromParcel(Parcel in) {
      return new CellLatSchema(in);
    }
    public CellLatSchema[] newArray(int size) {
      return new CellLatSchema[size];
    }
  };
}

