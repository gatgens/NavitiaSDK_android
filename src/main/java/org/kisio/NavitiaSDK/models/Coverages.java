/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.56.0-81-g74dda6e
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
import org.kisio.NavitiaSDK.models.Context;
import org.kisio.NavitiaSDK.models.Coverage;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Coverages
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-06-21T11:32:39.197+02:00")
public class Coverages implements Parcelable {
  @SerializedName("regions")
  private List<Coverage> regions = new ArrayList<Coverage>();

  @SerializedName("context")
  private Context context = null;

  public Coverages regions(List<Coverage> regions) {
    this.regions = regions;
    return this;
  }

  public Coverages addRegionsItem(Coverage regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Coverage> getRegions() {
    return regions;
  }

  public void setRegions(List<Coverage> regions) {
    this.regions = regions;
  }

  public Coverages context(Context context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coverages coverages = (Coverages) o;
    return Objects.equals(this.regions, coverages.regions) &&
        Objects.equals(this.context, coverages.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coverages {\n");
    
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
     
    out.writeValue(regions);

    out.writeValue(context);
  }

  public Coverages() {
    super();
  }

  Coverages(Parcel in) {
    
    regions = (List<Coverage>)in.readValue(Coverage.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Coverages> CREATOR = new Parcelable.Creator<Coverages>() {
    public Coverages createFromParcel(Parcel in) {
      return new Coverages(in);
    }
    public Coverages[] newArray(int size) {
      return new Coverages[size];
    }
  };
}

