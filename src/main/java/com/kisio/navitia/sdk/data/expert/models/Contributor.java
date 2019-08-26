/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.82.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Contributor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Contributor implements Parcelable {
  @SerializedName("website")
  private String website = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("name")
  private String name = null;

  public Contributor website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Contributor id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the object
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contributor license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Contributor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contributor contributor = (Contributor) o;
    return Objects.equals(this.website, contributor.website) &&
        Objects.equals(this.id, contributor.id) &&
        Objects.equals(this.license, contributor.license) &&
        Objects.equals(this.name, contributor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(website, id, license, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contributor {\n");
    
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
     
    out.writeValue(website);

    out.writeValue(id);

    out.writeValue(license);

    out.writeValue(name);
  }

  public Contributor() {
    super();
  }

  Contributor(Parcel in) {
    
    website = (String)in.readValue(null);
    id = (String)in.readValue(null);
    license = (String)in.readValue(null);
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Contributor> CREATOR = new Parcelable.Creator<Contributor>() {
    public Contributor createFromParcel(Parcel in) {
      return new Contributor(in);
    }
    public Contributor[] newArray(int size) {
      return new Contributor[size];
    }
  };
}

