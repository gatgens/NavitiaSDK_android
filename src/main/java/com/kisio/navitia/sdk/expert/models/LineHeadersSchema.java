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
import com.kisio.navitia.sdk.expert.models.CellLatSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * LineHeadersSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class LineHeadersSchema implements Parcelable {
  @SerializedName("cell_lat")
  private CellLatSchema cellLat = null;

  public LineHeadersSchema cellLat(CellLatSchema cellLat) {
    this.cellLat = cellLat;
    return this;
  }

   /**
   * Get cellLat
   * @return cellLat
  **/
  @ApiModelProperty(required = true, value = "")
  public CellLatSchema getCellLat() {
    return cellLat;
  }

  public void setCellLat(CellLatSchema cellLat) {
    this.cellLat = cellLat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineHeadersSchema lineHeadersSchema = (LineHeadersSchema) o;
    return Objects.equals(this.cellLat, lineHeadersSchema.cellLat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellLat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineHeadersSchema {\n");
    
    sb.append("    cellLat: ").append(toIndentedString(cellLat)).append("\n");
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
     
    out.writeValue(cellLat);
  }

  public LineHeadersSchema() {
    super();
  }

  LineHeadersSchema(Parcel in) {
    
    cellLat = (CellLatSchema)in.readValue(CellLatSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LineHeadersSchema> CREATOR = new Parcelable.Creator<LineHeadersSchema>() {
    public LineHeadersSchema createFromParcel(Parcel in) {
      return new LineHeadersSchema(in);
    }
    public LineHeadersSchema[] newArray(int size) {
      return new LineHeadersSchema[size];
    }
  };
}

