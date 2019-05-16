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


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.EquipmentDetails;
import com.kisio.navitia.sdk.expert.models.StopArea;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * StopAreaEquipments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-16T14:17:49.415+02:00")
public class StopAreaEquipments implements Parcelable {
  @SerializedName("stop_area")
  private StopArea stopArea = null;

  @SerializedName("equipment_details")
  private List<EquipmentDetails> equipmentDetails = null;

  public StopAreaEquipments stopArea(StopArea stopArea) {
    this.stopArea = stopArea;
    return this;
  }

   /**
   * Get stopArea
   * @return stopArea
  **/
  @ApiModelProperty(value = "")
  public StopArea getStopArea() {
    return stopArea;
  }

  public void setStopArea(StopArea stopArea) {
    this.stopArea = stopArea;
  }

  public StopAreaEquipments equipmentDetails(List<EquipmentDetails> equipmentDetails) {
    this.equipmentDetails = equipmentDetails;
    return this;
  }

  public StopAreaEquipments addEquipmentDetailsItem(EquipmentDetails equipmentDetailsItem) {
    if (this.equipmentDetails == null) {
      this.equipmentDetails = new ArrayList<EquipmentDetails>();
    }
    this.equipmentDetails.add(equipmentDetailsItem);
    return this;
  }

   /**
   * Get equipmentDetails
   * @return equipmentDetails
  **/
  @ApiModelProperty(value = "")
  public List<EquipmentDetails> getEquipmentDetails() {
    return equipmentDetails;
  }

  public void setEquipmentDetails(List<EquipmentDetails> equipmentDetails) {
    this.equipmentDetails = equipmentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopAreaEquipments stopAreaEquipments = (StopAreaEquipments) o;
    return Objects.equals(this.stopArea, stopAreaEquipments.stopArea) &&
        Objects.equals(this.equipmentDetails, stopAreaEquipments.equipmentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopArea, equipmentDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopAreaEquipments {\n");
    
    sb.append("    stopArea: ").append(toIndentedString(stopArea)).append("\n");
    sb.append("    equipmentDetails: ").append(toIndentedString(equipmentDetails)).append("\n");
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
     
    out.writeValue(stopArea);

    out.writeValue(equipmentDetails);
  }

  public StopAreaEquipments() {
    super();
  }

  StopAreaEquipments(Parcel in) {
    
    stopArea = (StopArea)in.readValue(StopArea.class.getClassLoader());
    equipmentDetails = (List<EquipmentDetails>)in.readValue(EquipmentDetails.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<StopAreaEquipments> CREATOR = new Parcelable.Creator<StopAreaEquipments>() {
    public StopAreaEquipments createFromParcel(Parcel in) {
      return new StopAreaEquipments(in);
    }
    public StopAreaEquipments[] newArray(int size) {
      return new StopAreaEquipments[size];
    }
  };
}

