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
import org.kisio.NavitiaSDK.models.Code;
import org.kisio.NavitiaSDK.models.LinkSchema;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Network
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-04-08T11:54:38.551+02:00")
public class Network implements Parcelable {
  @SerializedName("codes")
  private List<Code> codes = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("name")
  private String name = null;

  public Network codes(List<Code> codes) {
    this.codes = codes;
    return this;
  }

  public Network addCodesItem(Code codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<Code>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * Get codes
   * @return codes
  **/
  @ApiModelProperty(value = "")
  public List<Code> getCodes() {
    return codes;
  }

  public void setCodes(List<Code> codes) {
    this.codes = codes;
  }

  public Network id(String id) {
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

  public Network links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Network addLinksItem(LinkSchema linksItem) {
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

  public Network name(String name) {
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
    Network network = (Network) o;
    return Objects.equals(this.codes, network.codes) &&
        Objects.equals(this.id, network.id) &&
        Objects.equals(this.links, network.links) &&
        Objects.equals(this.name, network.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, id, links, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
     
    out.writeValue(codes);

    out.writeValue(id);

    out.writeValue(links);

    out.writeValue(name);
  }

  public Network() {
    super();
  }

  Network(Parcel in) {
    
    codes = (List<Code>)in.readValue(Code.class.getClassLoader());
    id = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Network> CREATOR = new Parcelable.Creator<Network>() {
    public Network createFromParcel(Parcel in) {
      return new Network(in);
    }
    public Network[] newArray(int size) {
      return new Network[size];
    }
  };
}

