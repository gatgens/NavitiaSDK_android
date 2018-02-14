/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.50.0
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
 * BetaEndpoints
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-02-14T10:20:26.501+01:00")
public class BetaEndpoints implements Parcelable {
  @SerializedName("message")
  private String message = null;

  @SerializedName("id")
  private String id = null;

  public BetaEndpoints message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BetaEndpoints id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaEndpoints betaEndpoints = (BetaEndpoints) o;
    return Objects.equals(this.message, betaEndpoints.message) &&
        Objects.equals(this.id, betaEndpoints.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaEndpoints {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
     
    out.writeValue(message);

    out.writeValue(id);
  }

  public BetaEndpoints() {
    super();
  }

  BetaEndpoints(Parcel in) {
    
    message = (String)in.readValue(null);
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<BetaEndpoints> CREATOR = new Parcelable.Creator<BetaEndpoints>() {
    public BetaEndpoints createFromParcel(Parcel in) {
      return new BetaEndpoints(in);
    }
    public BetaEndpoints[] newArray(int size) {
      return new BetaEndpoints[size];
    }
  };
}

