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
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.MultiLineStringSchema;
import org.kisio.NavitiaSDK.models.RouteDisplayInformation;
import org.kisio.NavitiaSDK.models.Table;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * RouteSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T18:38:06.279+02:00")
public class RouteSchedule implements Parcelable {
  @SerializedName("display_informations")
  private RouteDisplayInformation displayInformations = null;

  @SerializedName("table")
  private Table table = null;

  @SerializedName("additional_informations")
  private String additionalInformations = null;

  @SerializedName("geojson")
  private MultiLineStringSchema geojson = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  public RouteSchedule displayInformations(RouteDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
    return this;
  }

   /**
   * Get displayInformations
   * @return displayInformations
  **/
  @ApiModelProperty(value = "")
  public RouteDisplayInformation getDisplayInformations() {
    return displayInformations;
  }

  public void setDisplayInformations(RouteDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
  }

  public RouteSchedule table(Table table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @ApiModelProperty(value = "")
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }

  public RouteSchedule additionalInformations(String additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(String additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public RouteSchedule geojson(MultiLineStringSchema geojson) {
    this.geojson = geojson;
    return this;
  }

   /**
   * Get geojson
   * @return geojson
  **/
  @ApiModelProperty(value = "")
  public MultiLineStringSchema getGeojson() {
    return geojson;
  }

  public void setGeojson(MultiLineStringSchema geojson) {
    this.geojson = geojson;
  }

  public RouteSchedule links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public RouteSchedule addLinksItem(LinkSchema linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<LinkSchema>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteSchedule routeSchedule = (RouteSchedule) o;
    return Objects.equals(this.displayInformations, routeSchedule.displayInformations) &&
        Objects.equals(this.table, routeSchedule.table) &&
        Objects.equals(this.additionalInformations, routeSchedule.additionalInformations) &&
        Objects.equals(this.geojson, routeSchedule.geojson) &&
        Objects.equals(this.links, routeSchedule.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayInformations, table, additionalInformations, geojson, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteSchedule {\n");
    
    sb.append("    displayInformations: ").append(toIndentedString(displayInformations)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    geojson: ").append(toIndentedString(geojson)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
     
    out.writeValue(displayInformations);

    out.writeValue(table);

    out.writeValue(additionalInformations);

    out.writeValue(geojson);

    out.writeValue(links);
  }

  public RouteSchedule() {
    super();
  }

  RouteSchedule(Parcel in) {
    
    displayInformations = (RouteDisplayInformation)in.readValue(RouteDisplayInformation.class.getClassLoader());
    table = (Table)in.readValue(Table.class.getClassLoader());
    additionalInformations = (String)in.readValue(null);
    geojson = (MultiLineStringSchema)in.readValue(MultiLineStringSchema.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<RouteSchedule> CREATOR = new Parcelable.Creator<RouteSchedule>() {
    public RouteSchedule createFromParcel(Parcel in) {
      return new RouteSchedule(in);
    }
    public RouteSchedule[] newArray(int size) {
      return new RouteSchedule[size];
    }
  };
}

