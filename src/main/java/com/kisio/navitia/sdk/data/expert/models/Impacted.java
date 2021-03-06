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
import com.kisio.navitia.sdk.data.expert.models.ImpactedSection;
import com.kisio.navitia.sdk.data.expert.models.ImpactedStop;
import com.kisio.navitia.sdk.data.expert.models.PtObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Impacted
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class Impacted implements Parcelable {
  @SerializedName("impacted_stops")
  private List<ImpactedStop> impactedStops = null;

  @SerializedName("pt_object")
  private PtObject ptObject = null;

  @SerializedName("impacted_section")
  private ImpactedSection impactedSection = null;

  public Impacted impactedStops(List<ImpactedStop> impactedStops) {
    this.impactedStops = impactedStops;
    return this;
  }

  public Impacted addImpactedStopsItem(ImpactedStop impactedStopsItem) {
    if (this.impactedStops == null) {
      this.impactedStops = new ArrayList<ImpactedStop>();
    }
    this.impactedStops.add(impactedStopsItem);
    return this;
  }

   /**
   * Get impactedStops
   * @return impactedStops
  **/
  @ApiModelProperty(value = "")
  public List<ImpactedStop> getImpactedStops() {
    return impactedStops;
  }

  public void setImpactedStops(List<ImpactedStop> impactedStops) {
    this.impactedStops = impactedStops;
  }

  public Impacted ptObject(PtObject ptObject) {
    this.ptObject = ptObject;
    return this;
  }

   /**
   * Get ptObject
   * @return ptObject
  **/
  @ApiModelProperty(value = "")
  public PtObject getPtObject() {
    return ptObject;
  }

  public void setPtObject(PtObject ptObject) {
    this.ptObject = ptObject;
  }

  public Impacted impactedSection(ImpactedSection impactedSection) {
    this.impactedSection = impactedSection;
    return this;
  }

   /**
   * Get impactedSection
   * @return impactedSection
  **/
  @ApiModelProperty(value = "")
  public ImpactedSection getImpactedSection() {
    return impactedSection;
  }

  public void setImpactedSection(ImpactedSection impactedSection) {
    this.impactedSection = impactedSection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Impacted impacted = (Impacted) o;
    return Objects.equals(this.impactedStops, impacted.impactedStops) &&
        Objects.equals(this.ptObject, impacted.ptObject) &&
        Objects.equals(this.impactedSection, impacted.impactedSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impactedStops, ptObject, impactedSection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Impacted {\n");
    
    sb.append("    impactedStops: ").append(toIndentedString(impactedStops)).append("\n");
    sb.append("    ptObject: ").append(toIndentedString(ptObject)).append("\n");
    sb.append("    impactedSection: ").append(toIndentedString(impactedSection)).append("\n");
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
     
    out.writeValue(impactedStops);

    out.writeValue(ptObject);

    out.writeValue(impactedSection);
  }

  public Impacted() {
    super();
  }

  Impacted(Parcel in) {
    
    impactedStops = (List<ImpactedStop>)in.readValue(ImpactedStop.class.getClassLoader());
    ptObject = (PtObject)in.readValue(PtObject.class.getClassLoader());
    impactedSection = (ImpactedSection)in.readValue(ImpactedSection.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Impacted> CREATOR = new Parcelable.Creator<Impacted>() {
    public Impacted createFromParcel(Parcel in) {
      return new Impacted(in);
    }
    public Impacted[] newArray(int size) {
      return new Impacted[size];
    }
  };
}

