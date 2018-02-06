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
import org.kisio.NavitiaSDK.models.PtObject;
import org.kisio.NavitiaSDK.models.Route;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * ImpactedSection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-05T11:43:57.432+01:00")
public class ImpactedSection implements Parcelable {
  @SerializedName("routes")
  private Route routes = null;

  @SerializedName("to")
  private PtObject to = null;

  @SerializedName("from")
  private PtObject from = null;

  public ImpactedSection routes(Route routes) {
    this.routes = routes;
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @ApiModelProperty(value = "")
  public Route getRoutes() {
    return routes;
  }

  public void setRoutes(Route routes) {
    this.routes = routes;
  }

  public ImpactedSection to(PtObject to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public PtObject getTo() {
    return to;
  }

  public void setTo(PtObject to) {
    this.to = to;
  }

  public ImpactedSection from(PtObject from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public PtObject getFrom() {
    return from;
  }

  public void setFrom(PtObject from) {
    this.from = from;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactedSection impactedSection = (ImpactedSection) o;
    return Objects.equals(this.routes, impactedSection.routes) &&
        Objects.equals(this.to, impactedSection.to) &&
        Objects.equals(this.from, impactedSection.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes, to, from);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactedSection {\n");
    
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
     
    out.writeValue(routes);

    out.writeValue(to);

    out.writeValue(from);
  }

  public ImpactedSection() {
    super();
  }

  ImpactedSection(Parcel in) {
    
    routes = (Route)in.readValue(Route.class.getClassLoader());
    to = (PtObject)in.readValue(PtObject.class.getClassLoader());
    from = (PtObject)in.readValue(PtObject.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ImpactedSection> CREATOR = new Parcelable.Creator<ImpactedSection>() {
    public ImpactedSection createFromParcel(Parcel in) {
      return new ImpactedSection(in);
    }
    public ImpactedSection[] newArray(int size) {
      return new ImpactedSection[size];
    }
  };
}

