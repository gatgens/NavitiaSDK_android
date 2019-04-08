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
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.LinkSchema;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * DateTimeType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-04-08T11:54:38.551+02:00")
public class DateTimeType implements Parcelable {
  @SerializedName("date_time")
  private String dateTime = null;

  @SerializedName("additional_informations")
  private List<String> additionalInformations = new ArrayList<String>();

  @SerializedName("base_date_time")
  private String baseDateTime = null;

  @SerializedName("data_freshness")
  private String dataFreshness = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  public DateTimeType dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public DateTimeType additionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public DateTimeType addAdditionalInformationsItem(String additionalInformationsItem) {
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public DateTimeType baseDateTime(String baseDateTime) {
    this.baseDateTime = baseDateTime;
    return this;
  }

   /**
   * Get baseDateTime
   * @return baseDateTime
  **/
  @ApiModelProperty(value = "")
  public String getBaseDateTime() {
    return baseDateTime;
  }

  public void setBaseDateTime(String baseDateTime) {
    this.baseDateTime = baseDateTime;
  }

  public DateTimeType dataFreshness(String dataFreshness) {
    this.dataFreshness = dataFreshness;
    return this;
  }

   /**
   * Get dataFreshness
   * @return dataFreshness
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDataFreshness() {
    return dataFreshness;
  }

  public void setDataFreshness(String dataFreshness) {
    this.dataFreshness = dataFreshness;
  }

  public DateTimeType links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public DateTimeType addLinksItem(LinkSchema linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeType dateTimeType = (DateTimeType) o;
    return Objects.equals(this.dateTime, dateTimeType.dateTime) &&
        Objects.equals(this.additionalInformations, dateTimeType.additionalInformations) &&
        Objects.equals(this.baseDateTime, dateTimeType.baseDateTime) &&
        Objects.equals(this.dataFreshness, dateTimeType.dataFreshness) &&
        Objects.equals(this.links, dateTimeType.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, additionalInformations, baseDateTime, dataFreshness, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeType {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    baseDateTime: ").append(toIndentedString(baseDateTime)).append("\n");
    sb.append("    dataFreshness: ").append(toIndentedString(dataFreshness)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
     
    out.writeValue(dateTime);

    out.writeValue(additionalInformations);

    out.writeValue(baseDateTime);

    out.writeValue(dataFreshness);

    out.writeValue(links);
  }

  public DateTimeType() {
    super();
  }

  DateTimeType(Parcel in) {
    
    dateTime = (String)in.readValue(null);
    additionalInformations = (List<String>)in.readValue(null);
    baseDateTime = (String)in.readValue(null);
    dataFreshness = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<DateTimeType> CREATOR = new Parcelable.Creator<DateTimeType>() {
    public DateTimeType createFromParcel(Parcel in) {
      return new DateTimeType(in);
    }
    public DateTimeType[] newArray(int size) {
      return new DateTimeType[size];
    }
  };
}

