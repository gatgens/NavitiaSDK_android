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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * IndividualRating
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-03-27T16:07:48.813+01:00")
public class IndividualRating implements Parcelable {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("scale_min")
  private Float scaleMin = null;

  @SerializedName("scale_max")
  private Float scaleMax = null;

  @SerializedName("value")
  private Float value = null;

  public IndividualRating count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IndividualRating scaleMin(Float scaleMin) {
    this.scaleMin = scaleMin;
    return this;
  }

   /**
   * Get scaleMin
   * @return scaleMin
  **/
  @ApiModelProperty(value = "")
  public Float getScaleMin() {
    return scaleMin;
  }

  public void setScaleMin(Float scaleMin) {
    this.scaleMin = scaleMin;
  }

  public IndividualRating scaleMax(Float scaleMax) {
    this.scaleMax = scaleMax;
    return this;
  }

   /**
   * Get scaleMax
   * @return scaleMax
  **/
  @ApiModelProperty(value = "")
  public Float getScaleMax() {
    return scaleMax;
  }

  public void setScaleMax(Float scaleMax) {
    this.scaleMax = scaleMax;
  }

  public IndividualRating value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualRating individualRating = (IndividualRating) o;
    return Objects.equals(this.count, individualRating.count) &&
        Objects.equals(this.scaleMin, individualRating.scaleMin) &&
        Objects.equals(this.scaleMax, individualRating.scaleMax) &&
        Objects.equals(this.value, individualRating.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, scaleMin, scaleMax, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualRating {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    scaleMin: ").append(toIndentedString(scaleMin)).append("\n");
    sb.append("    scaleMax: ").append(toIndentedString(scaleMax)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
     
    out.writeValue(count);

    out.writeValue(scaleMin);

    out.writeValue(scaleMax);

    out.writeValue(value);
  }

  public IndividualRating() {
    super();
  }

  IndividualRating(Parcel in) {
    
    count = (Integer)in.readValue(null);
    scaleMin = (Float)in.readValue(null);
    scaleMax = (Float)in.readValue(null);
    value = (Float)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<IndividualRating> CREATOR = new Parcelable.Creator<IndividualRating>() {
    public IndividualRating createFromParcel(Parcel in) {
      return new IndividualRating(in);
    }
    public IndividualRating[] newArray(int size) {
      return new IndividualRating[size];
    }
  };
}

