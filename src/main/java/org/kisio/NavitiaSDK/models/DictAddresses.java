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
import org.kisio.NavitiaSDK.models.Address;
import org.kisio.NavitiaSDK.models.Context;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * DictAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-06-21T11:32:39.197+02:00")
public class DictAddresses implements Parcelable {
  @SerializedName("regions")
  private List<String> regions = new ArrayList<String>();

  @SerializedName("message")
  private String message = null;

  @SerializedName("context")
  private Context context = null;

  @SerializedName("address")
  private Address address = null;

  public DictAddresses regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public DictAddresses addRegionsItem(String regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  public DictAddresses message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DictAddresses context(Context context) {
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

  public DictAddresses address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictAddresses dictAddresses = (DictAddresses) o;
    return Objects.equals(this.regions, dictAddresses.regions) &&
        Objects.equals(this.message, dictAddresses.message) &&
        Objects.equals(this.context, dictAddresses.context) &&
        Objects.equals(this.address, dictAddresses.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, message, context, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictAddresses {\n");
    
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    out.writeValue(message);

    out.writeValue(context);

    out.writeValue(address);
  }

  public DictAddresses() {
    super();
  }

  DictAddresses(Parcel in) {
    
    regions = (List<String>)in.readValue(null);
    message = (String)in.readValue(null);
    context = (Context)in.readValue(Context.class.getClassLoader());
    address = (Address)in.readValue(Address.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<DictAddresses> CREATOR = new Parcelable.Creator<DictAddresses>() {
    public DictAddresses createFromParcel(Parcel in) {
      return new DictAddresses(in);
    }
    public DictAddresses[] newArray(int size) {
      return new DictAddresses[size];
    }
  };
}

