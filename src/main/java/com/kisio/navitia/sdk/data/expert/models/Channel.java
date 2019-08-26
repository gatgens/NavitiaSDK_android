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
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Channel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Channel implements Parcelable {
  @SerializedName("content_type")
  private String contentType = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets types
   */
  public enum TypesEnum {
    @SerializedName("web")
    WEB("web"),
    
    @SerializedName("sms")
    SMS("sms"),
    
    @SerializedName("email")
    EMAIL("email"),
    
    @SerializedName("mobile")
    MOBILE("mobile"),
    
    @SerializedName("notification")
    NOTIFICATION("notification"),
    
    @SerializedName("twitter")
    TWITTER("twitter"),
    
    @SerializedName("facebook")
    FACEBOOK("facebook"),
    
    @SerializedName("unknown_type")
    UNKNOWN_TYPE("unknown_type"),
    
    @SerializedName("title")
    TITLE("title"),
    
    @SerializedName("beacon")
    BEACON("beacon");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("types")
  private List<TypesEnum> types = null;

  @SerializedName("name")
  private String name = null;

  public Channel contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Channel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Channel types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public Channel addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypesEnum>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public Channel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
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
    Channel channel = (Channel) o;
    return Objects.equals(this.contentType, channel.contentType) &&
        Objects.equals(this.id, channel.id) &&
        Objects.equals(this.types, channel.types) &&
        Objects.equals(this.name, channel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, id, types, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
     
    out.writeValue(contentType);

    out.writeValue(id);

    out.writeValue(types);

    out.writeValue(name);
  }

  public Channel() {
    super();
  }

  Channel(Parcel in) {
    
    contentType = (String)in.readValue(null);
    id = (String)in.readValue(null);
    types = (List<TypesEnum>)in.readValue(null);
    name = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Channel> CREATOR = new Parcelable.Creator<Channel>() {
    public Channel createFromParcel(Parcel in) {
      return new Channel(in);
    }
    public Channel[] newArray(int size) {
      return new Channel[size];
    }
  };
}

