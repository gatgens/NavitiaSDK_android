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
import com.kisio.navitia.sdk.data.expert.models.Amount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * CO2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class CO2 implements Parcelable {
  @SerializedName("co2_emission")
  private Amount co2Emission = null;

  public CO2 co2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
    return this;
  }

   /**
   * Get co2Emission
   * @return co2Emission
  **/
  @ApiModelProperty(value = "")
  public Amount getCo2Emission() {
    return co2Emission;
  }

  public void setCo2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CO2 co2 = (CO2) o;
    return Objects.equals(this.co2Emission, co2.co2Emission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(co2Emission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CO2 {\n");
    
    sb.append("    co2Emission: ").append(toIndentedString(co2Emission)).append("\n");
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
     
    out.writeValue(co2Emission);
  }

  public CO2() {
    super();
  }

  CO2(Parcel in) {
    
    co2Emission = (Amount)in.readValue(Amount.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<CO2> CREATOR = new Parcelable.Creator<CO2>() {
    public CO2 createFromParcel(Parcel in) {
      return new CO2(in);
    }
    public CO2[] newArray(int size) {
      return new CO2[size];
    }
  };
}

