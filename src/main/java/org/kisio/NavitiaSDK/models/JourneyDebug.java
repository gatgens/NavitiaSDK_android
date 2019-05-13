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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * JourneyDebug
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T11:47:49.806+02:00")
public class JourneyDebug implements Parcelable {
  @SerializedName("nb_vj_extentions")
  private Integer nbVjExtentions = null;

  @SerializedName("nb_sections")
  private Integer nbSections = null;

  @SerializedName("internal_id")
  private String internalId = null;

  @SerializedName("streetnetwork_duration")
  private Integer streetnetworkDuration = null;

  @SerializedName("transfer_duration")
  private Integer transferDuration = null;

  @SerializedName("min_waiting_duration")
  private Integer minWaitingDuration = null;

  public JourneyDebug nbVjExtentions(Integer nbVjExtentions) {
    this.nbVjExtentions = nbVjExtentions;
    return this;
  }

   /**
   * Number of stay-in
   * @return nbVjExtentions
  **/
  @ApiModelProperty(required = true, value = "Number of stay-in")
  public Integer getNbVjExtentions() {
    return nbVjExtentions;
  }

  public void setNbVjExtentions(Integer nbVjExtentions) {
    this.nbVjExtentions = nbVjExtentions;
  }

  public JourneyDebug nbSections(Integer nbSections) {
    this.nbSections = nbSections;
    return this;
  }

   /**
   * Number of sections
   * @return nbSections
  **/
  @ApiModelProperty(required = true, value = "Number of sections")
  public Integer getNbSections() {
    return nbSections;
  }

  public void setNbSections(Integer nbSections) {
    this.nbSections = nbSections;
  }

  public JourneyDebug internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public JourneyDebug streetnetworkDuration(Integer streetnetworkDuration) {
    this.streetnetworkDuration = streetnetworkDuration;
    return this;
  }

   /**
   * Total duration of streetnetwork use (seconds)
   * @return streetnetworkDuration
  **/
  @ApiModelProperty(required = true, value = "Total duration of streetnetwork use (seconds)")
  public Integer getStreetnetworkDuration() {
    return streetnetworkDuration;
  }

  public void setStreetnetworkDuration(Integer streetnetworkDuration) {
    this.streetnetworkDuration = streetnetworkDuration;
  }

  public JourneyDebug transferDuration(Integer transferDuration) {
    this.transferDuration = transferDuration;
    return this;
  }

   /**
   * Total duration of transfers (seconds)
   * @return transferDuration
  **/
  @ApiModelProperty(required = true, value = "Total duration of transfers (seconds)")
  public Integer getTransferDuration() {
    return transferDuration;
  }

  public void setTransferDuration(Integer transferDuration) {
    this.transferDuration = transferDuration;
  }

  public JourneyDebug minWaitingDuration(Integer minWaitingDuration) {
    this.minWaitingDuration = minWaitingDuration;
    return this;
  }

   /**
   * Minimum on all waiting durations (seconds)
   * @return minWaitingDuration
  **/
  @ApiModelProperty(required = true, value = "Minimum on all waiting durations (seconds)")
  public Integer getMinWaitingDuration() {
    return minWaitingDuration;
  }

  public void setMinWaitingDuration(Integer minWaitingDuration) {
    this.minWaitingDuration = minWaitingDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyDebug journeyDebug = (JourneyDebug) o;
    return Objects.equals(this.nbVjExtentions, journeyDebug.nbVjExtentions) &&
        Objects.equals(this.nbSections, journeyDebug.nbSections) &&
        Objects.equals(this.internalId, journeyDebug.internalId) &&
        Objects.equals(this.streetnetworkDuration, journeyDebug.streetnetworkDuration) &&
        Objects.equals(this.transferDuration, journeyDebug.transferDuration) &&
        Objects.equals(this.minWaitingDuration, journeyDebug.minWaitingDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbVjExtentions, nbSections, internalId, streetnetworkDuration, transferDuration, minWaitingDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyDebug {\n");
    
    sb.append("    nbVjExtentions: ").append(toIndentedString(nbVjExtentions)).append("\n");
    sb.append("    nbSections: ").append(toIndentedString(nbSections)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    streetnetworkDuration: ").append(toIndentedString(streetnetworkDuration)).append("\n");
    sb.append("    transferDuration: ").append(toIndentedString(transferDuration)).append("\n");
    sb.append("    minWaitingDuration: ").append(toIndentedString(minWaitingDuration)).append("\n");
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
     
    out.writeValue(nbVjExtentions);

    out.writeValue(nbSections);

    out.writeValue(internalId);

    out.writeValue(streetnetworkDuration);

    out.writeValue(transferDuration);

    out.writeValue(minWaitingDuration);
  }

  public JourneyDebug() {
    super();
  }

  JourneyDebug(Parcel in) {
    
    nbVjExtentions = (Integer)in.readValue(null);
    nbSections = (Integer)in.readValue(null);
    internalId = (String)in.readValue(null);
    streetnetworkDuration = (Integer)in.readValue(null);
    transferDuration = (Integer)in.readValue(null);
    minWaitingDuration = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<JourneyDebug> CREATOR = new Parcelable.Creator<JourneyDebug>() {
    public JourneyDebug createFromParcel(Parcel in) {
      return new JourneyDebug(in);
    }
    public JourneyDebug[] newArray(int size) {
      return new JourneyDebug[size];
    }
  };
}

