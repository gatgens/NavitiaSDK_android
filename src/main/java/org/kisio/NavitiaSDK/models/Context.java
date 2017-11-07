/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.43.0-34-g30b0bcf
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
import org.kisio.NavitiaSDK.models.CO2;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Context
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class Context implements Parcelable {
  @SerializedName("car_direct_path")
  private CO2 carDirectPath = null;

  public Context carDirectPath(CO2 carDirectPath) {
    this.carDirectPath = carDirectPath;
    return this;
  }

   /**
   * Get carDirectPath
   * @return carDirectPath
  **/
  @ApiModelProperty(value = "")
  public CO2 getCarDirectPath() {
    return carDirectPath;
  }

  public void setCarDirectPath(CO2 carDirectPath) {
    this.carDirectPath = carDirectPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.carDirectPath, context.carDirectPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carDirectPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    carDirectPath: ").append(toIndentedString(carDirectPath)).append("\n");
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
     
    out.writeValue(carDirectPath);
  }

  public Context() {
    super();
  }

  Context(Parcel in) {
    
    carDirectPath = (CO2)in.readValue(CO2.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Context> CREATOR = new Parcelable.Creator<Context>() {
    public Context createFromParcel(Parcel in) {
      return new Context(in);
    }
    public Context[] newArray(int size) {
      return new Context[size];
    }
  };
}

