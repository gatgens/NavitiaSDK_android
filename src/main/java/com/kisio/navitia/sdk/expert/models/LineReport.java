/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.Line;
import com.kisio.navitia.sdk.expert.models.PtObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * LineReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class LineReport implements Parcelable {
  @SerializedName("line")
  private Line line = null;

  @SerializedName("pt_objects")
  private List<PtObject> ptObjects = new ArrayList<PtObject>();

  public LineReport line(Line line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(value = "")
  public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public LineReport ptObjects(List<PtObject> ptObjects) {
    this.ptObjects = ptObjects;
    return this;
  }

  public LineReport addPtObjectsItem(PtObject ptObjectsItem) {
    this.ptObjects.add(ptObjectsItem);
    return this;
  }

   /**
   * Get ptObjects
   * @return ptObjects
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PtObject> getPtObjects() {
    return ptObjects;
  }

  public void setPtObjects(List<PtObject> ptObjects) {
    this.ptObjects = ptObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineReport lineReport = (LineReport) o;
    return Objects.equals(this.line, lineReport.line) &&
        Objects.equals(this.ptObjects, lineReport.ptObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, ptObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineReport {\n");
    
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    ptObjects: ").append(toIndentedString(ptObjects)).append("\n");
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
     
    out.writeValue(line);

    out.writeValue(ptObjects);
  }

  public LineReport() {
    super();
  }

  LineReport(Parcel in) {
    
    line = (Line)in.readValue(Line.class.getClassLoader());
    ptObjects = (List<PtObject>)in.readValue(PtObject.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LineReport> CREATOR = new Parcelable.Creator<LineReport>() {
    public LineReport createFromParcel(Parcel in) {
      return new LineReport(in);
    }
    public LineReport[] newArray(int size) {
      return new LineReport[size];
    }
  };
}

