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
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.Line;
import org.kisio.NavitiaSDK.models.Network;
import org.kisio.NavitiaSDK.models.StopArea;
import org.kisio.NavitiaSDK.models.VehicleJourney;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * TrafficReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class TrafficReport implements Parcelable {
  @SerializedName("vehicle_journeys")
  private List<VehicleJourney> vehicleJourneys = null;

  @SerializedName("lines")
  private List<Line> lines = null;

  @SerializedName("network")
  private Network network = null;

  @SerializedName("stop_areas")
  private List<StopArea> stopAreas = null;

  public TrafficReport vehicleJourneys(List<VehicleJourney> vehicleJourneys) {
    this.vehicleJourneys = vehicleJourneys;
    return this;
  }

  public TrafficReport addVehicleJourneysItem(VehicleJourney vehicleJourneysItem) {
    if (this.vehicleJourneys == null) {
      this.vehicleJourneys = new ArrayList<VehicleJourney>();
    }
    this.vehicleJourneys.add(vehicleJourneysItem);
    return this;
  }

   /**
   * Get vehicleJourneys
   * @return vehicleJourneys
  **/
  @ApiModelProperty(value = "")
  public List<VehicleJourney> getVehicleJourneys() {
    return vehicleJourneys;
  }

  public void setVehicleJourneys(List<VehicleJourney> vehicleJourneys) {
    this.vehicleJourneys = vehicleJourneys;
  }

  public TrafficReport lines(List<Line> lines) {
    this.lines = lines;
    return this;
  }

  public TrafficReport addLinesItem(Line linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<Line>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<Line> getLines() {
    return lines;
  }

  public void setLines(List<Line> lines) {
    this.lines = lines;
  }

  public TrafficReport network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public TrafficReport stopAreas(List<StopArea> stopAreas) {
    this.stopAreas = stopAreas;
    return this;
  }

  public TrafficReport addStopAreasItem(StopArea stopAreasItem) {
    if (this.stopAreas == null) {
      this.stopAreas = new ArrayList<StopArea>();
    }
    this.stopAreas.add(stopAreasItem);
    return this;
  }

   /**
   * Get stopAreas
   * @return stopAreas
  **/
  @ApiModelProperty(value = "")
  public List<StopArea> getStopAreas() {
    return stopAreas;
  }

  public void setStopAreas(List<StopArea> stopAreas) {
    this.stopAreas = stopAreas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficReport trafficReport = (TrafficReport) o;
    return Objects.equals(this.vehicleJourneys, trafficReport.vehicleJourneys) &&
        Objects.equals(this.lines, trafficReport.lines) &&
        Objects.equals(this.network, trafficReport.network) &&
        Objects.equals(this.stopAreas, trafficReport.stopAreas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleJourneys, lines, network, stopAreas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficReport {\n");
    
    sb.append("    vehicleJourneys: ").append(toIndentedString(vehicleJourneys)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    stopAreas: ").append(toIndentedString(stopAreas)).append("\n");
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
     
    out.writeValue(vehicleJourneys);

    out.writeValue(lines);

    out.writeValue(network);

    out.writeValue(stopAreas);
  }

  public TrafficReport() {
    super();
  }

  TrafficReport(Parcel in) {
    
    vehicleJourneys = (List<VehicleJourney>)in.readValue(VehicleJourney.class.getClassLoader());
    lines = (List<Line>)in.readValue(Line.class.getClassLoader());
    network = (Network)in.readValue(Network.class.getClassLoader());
    stopAreas = (List<StopArea>)in.readValue(StopArea.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<TrafficReport> CREATOR = new Parcelable.Creator<TrafficReport>() {
    public TrafficReport createFromParcel(Parcel in) {
      return new TrafficReport(in);
    }
    public TrafficReport[] newArray(int size) {
      return new TrafficReport[size];
    }
  };
}

