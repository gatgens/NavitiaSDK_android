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
import com.kisio.navitia.sdk.data.expert.models.CurrentAvailability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * EquipmentDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class EquipmentDetails implements Parcelable {
  /**
   * Gets or Sets embeddedType
   */
  public enum EmbeddedTypeEnum {
    @SerializedName("escalator")
    ESCALATOR("escalator"),
    
    @SerializedName("elevator")
    ELEVATOR("elevator");

    private String value;

    EmbeddedTypeEnum(String value) {
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

  @SerializedName("embedded_type")
  private EmbeddedTypeEnum embeddedType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("current_availability")
  private CurrentAvailability currentAvailability = null;

  public EquipmentDetails embeddedType(EmbeddedTypeEnum embeddedType) {
    this.embeddedType = embeddedType;
    return this;
  }

   /**
   * Get embeddedType
   * @return embeddedType
  **/
  @ApiModelProperty(value = "")
  public EmbeddedTypeEnum getEmbeddedType() {
    return embeddedType;
  }

  public void setEmbeddedType(EmbeddedTypeEnum embeddedType) {
    this.embeddedType = embeddedType;
  }

  public EquipmentDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EquipmentDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EquipmentDetails currentAvailability(CurrentAvailability currentAvailability) {
    this.currentAvailability = currentAvailability;
    return this;
  }

   /**
   * Get currentAvailability
   * @return currentAvailability
  **/
  @ApiModelProperty(value = "")
  public CurrentAvailability getCurrentAvailability() {
    return currentAvailability;
  }

  public void setCurrentAvailability(CurrentAvailability currentAvailability) {
    this.currentAvailability = currentAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentDetails equipmentDetails = (EquipmentDetails) o;
    return Objects.equals(this.embeddedType, equipmentDetails.embeddedType) &&
        Objects.equals(this.id, equipmentDetails.id) &&
        Objects.equals(this.name, equipmentDetails.name) &&
        Objects.equals(this.currentAvailability, equipmentDetails.currentAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedType, id, name, currentAvailability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentDetails {\n");
    
    sb.append("    embeddedType: ").append(toIndentedString(embeddedType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currentAvailability: ").append(toIndentedString(currentAvailability)).append("\n");
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
     
    out.writeValue(embeddedType);

    out.writeValue(id);

    out.writeValue(name);

    out.writeValue(currentAvailability);
  }

  public EquipmentDetails() {
    super();
  }

  EquipmentDetails(Parcel in) {
    
    embeddedType = (EmbeddedTypeEnum)in.readValue(null);
    id = (String)in.readValue(null);
    name = (String)in.readValue(null);
    currentAvailability = (CurrentAvailability)in.readValue(CurrentAvailability.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<EquipmentDetails> CREATOR = new Parcelable.Creator<EquipmentDetails>() {
    public EquipmentDetails createFromParcel(Parcel in) {
      return new EquipmentDetails(in);
    }
    public EquipmentDetails[] newArray(int size) {
      return new EquipmentDetails[size];
    }
  };
}

