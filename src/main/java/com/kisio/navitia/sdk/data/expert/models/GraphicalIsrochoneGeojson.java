/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.87.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * GraphicalIsrochoneGeojson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class GraphicalIsrochoneGeojson implements Parcelable {
  @SerializedName("coordinates")
  private List<List<List<List<Float>>>> coordinates = null;

  public GraphicalIsrochoneGeojson coordinates(List<List<List<List<Float>>>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public GraphicalIsrochoneGeojson addCoordinatesItem(List<List<List<Float>>> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<List<List<List<Float>>>>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<List<List<List<Float>>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<List<Float>>>> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicalIsrochoneGeojson graphicalIsrochoneGeojson = (GraphicalIsrochoneGeojson) o;
    return Objects.equals(this.coordinates, graphicalIsrochoneGeojson.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicalIsrochoneGeojson {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
     
    out.writeValue(coordinates);
  }

  public GraphicalIsrochoneGeojson() {
    super();
  }

  GraphicalIsrochoneGeojson(Parcel in) {
    
    coordinates = (List<List<List<List<Float>>>>)in.readValue(List.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<GraphicalIsrochoneGeojson> CREATOR = new Parcelable.Creator<GraphicalIsrochoneGeojson>() {
    public GraphicalIsrochoneGeojson createFromParcel(Parcel in) {
      return new GraphicalIsrochoneGeojson(in);
    }
    public GraphicalIsrochoneGeojson[] newArray(int size) {
      return new GraphicalIsrochoneGeojson[size];
    }
  };
}

