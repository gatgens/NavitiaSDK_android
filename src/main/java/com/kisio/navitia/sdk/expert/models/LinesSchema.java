/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2-3-g25474e0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.CellLonSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * LinesSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class LinesSchema implements Parcelable {
  @SerializedName("duration")
  private List<Integer> duration = null;

  @SerializedName("cell_lon")
  private CellLonSchema cellLon = null;

  public LinesSchema duration(List<Integer> duration) {
    this.duration = duration;
    return this;
  }

  public LinesSchema addDurationItem(Integer durationItem) {
    if (this.duration == null) {
      this.duration = new ArrayList<Integer>();
    }
    this.duration.add(durationItem);
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getDuration() {
    return duration;
  }

  public void setDuration(List<Integer> duration) {
    this.duration = duration;
  }

  public LinesSchema cellLon(CellLonSchema cellLon) {
    this.cellLon = cellLon;
    return this;
  }

   /**
   * Get cellLon
   * @return cellLon
  **/
  @ApiModelProperty(required = true, value = "")
  public CellLonSchema getCellLon() {
    return cellLon;
  }

  public void setCellLon(CellLonSchema cellLon) {
    this.cellLon = cellLon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinesSchema linesSchema = (LinesSchema) o;
    return Objects.equals(this.duration, linesSchema.duration) &&
        Objects.equals(this.cellLon, linesSchema.cellLon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, cellLon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinesSchema {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    cellLon: ").append(toIndentedString(cellLon)).append("\n");
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
     
    out.writeValue(duration);

    out.writeValue(cellLon);
  }

  public LinesSchema() {
    super();
  }

  LinesSchema(Parcel in) {
    
    duration = (List<Integer>)in.readValue(null);
    cellLon = (CellLonSchema)in.readValue(CellLonSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LinesSchema> CREATOR = new Parcelable.Creator<LinesSchema>() {
    public LinesSchema createFromParcel(Parcel in) {
      return new LinesSchema(in);
    }
    public LinesSchema[] newArray(int size) {
      return new LinesSchema[size];
    }
  };
}

