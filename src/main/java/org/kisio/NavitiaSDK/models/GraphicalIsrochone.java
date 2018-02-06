/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.49.0
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
import org.kisio.NavitiaSDK.models.GraphicalIsrochoneGeojson;
import org.kisio.NavitiaSDK.models.Place;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * GraphicalIsrochone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class GraphicalIsrochone implements Parcelable {
  @SerializedName("max_duration")
  private Integer maxDuration = null;

  @SerializedName("from")
  private Place from = null;

  @SerializedName("geojson")
  private GraphicalIsrochoneGeojson geojson = null;

  @SerializedName("min_duration")
  private Integer minDuration = null;

  @SerializedName("min_date_time")
  private String minDateTime = null;

  @SerializedName("to")
  private Place to = null;

  @SerializedName("requested_date_time")
  private String requestedDateTime = null;

  @SerializedName("max_date_time")
  private String maxDateTime = null;

  public GraphicalIsrochone maxDuration(Integer maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * Get maxDuration
   * @return maxDuration
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(Integer maxDuration) {
    this.maxDuration = maxDuration;
  }

  public GraphicalIsrochone from(Place from) {
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

  public GraphicalIsrochone geojson(GraphicalIsrochoneGeojson geojson) {
    this.geojson = geojson;
    return this;
  }

   /**
   * Get geojson
   * @return geojson
  **/
  @ApiModelProperty(value = "")
  public GraphicalIsrochoneGeojson getGeojson() {
    return geojson;
  }

  public void setGeojson(GraphicalIsrochoneGeojson geojson) {
    this.geojson = geojson;
  }

  public GraphicalIsrochone minDuration(Integer minDuration) {
    this.minDuration = minDuration;
    return this;
  }

   /**
   * Get minDuration
   * @return minDuration
  **/
  @ApiModelProperty(value = "")
  public Integer getMinDuration() {
    return minDuration;
  }

  public void setMinDuration(Integer minDuration) {
    this.minDuration = minDuration;
  }

  public GraphicalIsrochone minDateTime(String minDateTime) {
    this.minDateTime = minDateTime;
    return this;
  }

   /**
   * Get minDateTime
   * @return minDateTime
  **/
  @ApiModelProperty(value = "")
  public String getMinDateTime() {
    return minDateTime;
  }

  public void setMinDateTime(String minDateTime) {
    this.minDateTime = minDateTime;
  }

  public GraphicalIsrochone to(Place to) {
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

  public GraphicalIsrochone requestedDateTime(String requestedDateTime) {
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

  public GraphicalIsrochone maxDateTime(String maxDateTime) {
    this.maxDateTime = maxDateTime;
    return this;
  }

   /**
   * Get maxDateTime
   * @return maxDateTime
  **/
  @ApiModelProperty(value = "")
  public String getMaxDateTime() {
    return maxDateTime;
  }

  public void setMaxDateTime(String maxDateTime) {
    this.maxDateTime = maxDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicalIsrochone graphicalIsrochone = (GraphicalIsrochone) o;
    return Objects.equals(this.maxDuration, graphicalIsrochone.maxDuration) &&
        Objects.equals(this.from, graphicalIsrochone.from) &&
        Objects.equals(this.geojson, graphicalIsrochone.geojson) &&
        Objects.equals(this.minDuration, graphicalIsrochone.minDuration) &&
        Objects.equals(this.minDateTime, graphicalIsrochone.minDateTime) &&
        Objects.equals(this.to, graphicalIsrochone.to) &&
        Objects.equals(this.requestedDateTime, graphicalIsrochone.requestedDateTime) &&
        Objects.equals(this.maxDateTime, graphicalIsrochone.maxDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDuration, from, geojson, minDuration, minDateTime, to, requestedDateTime, maxDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicalIsrochone {\n");
    
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    geojson: ").append(toIndentedString(geojson)).append("\n");
    sb.append("    minDuration: ").append(toIndentedString(minDuration)).append("\n");
    sb.append("    minDateTime: ").append(toIndentedString(minDateTime)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    requestedDateTime: ").append(toIndentedString(requestedDateTime)).append("\n");
    sb.append("    maxDateTime: ").append(toIndentedString(maxDateTime)).append("\n");
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
     
    out.writeValue(maxDuration);

    out.writeValue(from);

    out.writeValue(geojson);

    out.writeValue(minDuration);

    out.writeValue(minDateTime);

    out.writeValue(to);

    out.writeValue(requestedDateTime);

    out.writeValue(maxDateTime);
  }

  public GraphicalIsrochone() {
    super();
  }

  GraphicalIsrochone(Parcel in) {
    
    maxDuration = (Integer)in.readValue(null);
    from = (Place)in.readValue(Place.class.getClassLoader());
    geojson = (GraphicalIsrochoneGeojson)in.readValue(GraphicalIsrochoneGeojson.class.getClassLoader());
    minDuration = (Integer)in.readValue(null);
    minDateTime = (String)in.readValue(null);
    to = (Place)in.readValue(Place.class.getClassLoader());
    requestedDateTime = (String)in.readValue(null);
    maxDateTime = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<GraphicalIsrochone> CREATOR = new Parcelable.Creator<GraphicalIsrochone>() {
    public GraphicalIsrochone createFromParcel(Parcel in) {
      return new GraphicalIsrochone(in);
    }
    public GraphicalIsrochone[] newArray(int size) {
      return new GraphicalIsrochone[size];
    }
  };
}
