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
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.VJDisplayInformation;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Header
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-06-21T11:32:39.197+02:00")
public class Header implements Parcelable {
  @SerializedName("display_informations")
  private VJDisplayInformation displayInformations = null;

  @SerializedName("additional_informations")
  private List<String> additionalInformations = new ArrayList<String>();

  @SerializedName("links")
  private List<LinkSchema> links = null;

  public Header displayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
    return this;
  }

   /**
   * Get displayInformations
   * @return displayInformations
  **/
  @ApiModelProperty(value = "")
  public VJDisplayInformation getDisplayInformations() {
    return displayInformations;
  }

  public void setDisplayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
  }

  public Header additionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public Header addAdditionalInformationsItem(String additionalInformationsItem) {
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

  public Header links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Header addLinksItem(LinkSchema linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<LinkSchema>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
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
    Header header = (Header) o;
    return Objects.equals(this.displayInformations, header.displayInformations) &&
        Objects.equals(this.additionalInformations, header.additionalInformations) &&
        Objects.equals(this.links, header.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayInformations, additionalInformations, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Header {\n");
    
    sb.append("    displayInformations: ").append(toIndentedString(displayInformations)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
     
    out.writeValue(displayInformations);

    out.writeValue(additionalInformations);

    out.writeValue(links);
  }

  public Header() {
    super();
  }

  Header(Parcel in) {
    
    displayInformations = (VJDisplayInformation)in.readValue(VJDisplayInformation.class.getClassLoader());
    additionalInformations = (List<String>)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Header> CREATOR = new Parcelable.Creator<Header>() {
    public Header createFromParcel(Parcel in) {
      return new Header(in);
    }
    public Header[] newArray(int size) {
      return new Header[size];
    }
  };
}

