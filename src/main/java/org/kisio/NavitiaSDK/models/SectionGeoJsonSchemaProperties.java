/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.75.0
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
import java.math.BigDecimal;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * SectionGeoJsonSchemaProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-04-08T11:54:38.551+02:00")
public class SectionGeoJsonSchemaProperties implements Parcelable {
  @SerializedName("length")
  private BigDecimal length = null;

  public SectionGeoJsonSchemaProperties length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionGeoJsonSchemaProperties sectionGeoJsonSchemaProperties = (SectionGeoJsonSchemaProperties) o;
    return Objects.equals(this.length, sectionGeoJsonSchemaProperties.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionGeoJsonSchemaProperties {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
     
    out.writeValue(length);
  }

  public SectionGeoJsonSchemaProperties() {
    super();
  }

  SectionGeoJsonSchemaProperties(Parcel in) {
    
    length = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SectionGeoJsonSchemaProperties> CREATOR = new Parcelable.Creator<SectionGeoJsonSchemaProperties>() {
    public SectionGeoJsonSchemaProperties createFromParcel(Parcel in) {
      return new SectionGeoJsonSchemaProperties(in);
    }
    public SectionGeoJsonSchemaProperties[] newArray(int size) {
      return new SectionGeoJsonSchemaProperties[size];
    }
  };
}

