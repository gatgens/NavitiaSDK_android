/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2-3-g25474e0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Pagination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-07-04T15:30:47.760+02:00")
public class Pagination implements Parcelable {
  @SerializedName("start_page")
  private Integer startPage = null;

  @SerializedName("items_on_page")
  private Integer itemsOnPage = null;

  @SerializedName("items_per_page")
  private Integer itemsPerPage = null;

  @SerializedName("total_result")
  private Integer totalResult = null;

  public Pagination startPage(Integer startPage) {
    this.startPage = startPage;
    return this;
  }

   /**
   * Get startPage
   * @return startPage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartPage() {
    return startPage;
  }

  public void setStartPage(Integer startPage) {
    this.startPage = startPage;
  }

  public Pagination itemsOnPage(Integer itemsOnPage) {
    this.itemsOnPage = itemsOnPage;
    return this;
  }

   /**
   * Get itemsOnPage
   * @return itemsOnPage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getItemsOnPage() {
    return itemsOnPage;
  }

  public void setItemsOnPage(Integer itemsOnPage) {
    this.itemsOnPage = itemsOnPage;
  }

  public Pagination itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Get itemsPerPage
   * @return itemsPerPage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public Pagination totalResult(Integer totalResult) {
    this.totalResult = totalResult;
    return this;
  }

   /**
   * Get totalResult
   * @return totalResult
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalResult() {
    return totalResult;
  }

  public void setTotalResult(Integer totalResult) {
    this.totalResult = totalResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.startPage, pagination.startPage) &&
        Objects.equals(this.itemsOnPage, pagination.itemsOnPage) &&
        Objects.equals(this.itemsPerPage, pagination.itemsPerPage) &&
        Objects.equals(this.totalResult, pagination.totalResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPage, itemsOnPage, itemsPerPage, totalResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    itemsOnPage: ").append(toIndentedString(itemsOnPage)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    totalResult: ").append(toIndentedString(totalResult)).append("\n");
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
     
    out.writeValue(startPage);

    out.writeValue(itemsOnPage);

    out.writeValue(itemsPerPage);

    out.writeValue(totalResult);
  }

  public Pagination() {
    super();
  }

  Pagination(Parcel in) {
    
    startPage = (Integer)in.readValue(null);
    itemsOnPage = (Integer)in.readValue(null);
    itemsPerPage = (Integer)in.readValue(null);
    totalResult = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Pagination> CREATOR = new Parcelable.Creator<Pagination>() {
    public Pagination createFromParcel(Parcel in) {
      return new Pagination(in);
    }
    public Pagination[] newArray(int size) {
      return new Pagination[size];
    }
  };
}

