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
import org.kisio.NavitiaSDK.models.Comment;
import org.kisio.NavitiaSDK.models.Line;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * LineGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-04-08T11:54:38.551+02:00")
public class LineGroup implements Parcelable {
  @SerializedName("name")
  private String name = null;

  @SerializedName("lines")
  private List<Line> lines = null;

  @SerializedName("main_line")
  private Line mainLine = null;

  @SerializedName("comments")
  private List<Comment> comments = new ArrayList<Comment>();

  @SerializedName("id")
  private String id = null;

  public LineGroup name(String name) {
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

  public LineGroup lines(List<Line> lines) {
    this.lines = lines;
    return this;
  }

  public LineGroup addLinesItem(Line linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<Line>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<Line> getLines() {
    return lines;
  }

  public void setLines(List<Line> lines) {
    this.lines = lines;
  }

  public LineGroup mainLine(Line mainLine) {
    this.mainLine = mainLine;
    return this;
  }

   /**
   * Get mainLine
   * @return mainLine
  **/
  @ApiModelProperty(value = "")
  public Line getMainLine() {
    return mainLine;
  }

  public void setMainLine(Line mainLine) {
    this.mainLine = mainLine;
  }

  public LineGroup comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public LineGroup addCommentsItem(Comment commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public LineGroup id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineGroup lineGroup = (LineGroup) o;
    return Objects.equals(this.name, lineGroup.name) &&
        Objects.equals(this.lines, lineGroup.lines) &&
        Objects.equals(this.mainLine, lineGroup.mainLine) &&
        Objects.equals(this.comments, lineGroup.comments) &&
        Objects.equals(this.id, lineGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lines, mainLine, comments, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    mainLine: ").append(toIndentedString(mainLine)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
     
    out.writeValue(name);

    out.writeValue(lines);

    out.writeValue(mainLine);

    out.writeValue(comments);

    out.writeValue(id);
  }

  public LineGroup() {
    super();
  }

  LineGroup(Parcel in) {
    
    name = (String)in.readValue(null);
    lines = (List<Line>)in.readValue(Line.class.getClassLoader());
    mainLine = (Line)in.readValue(Line.class.getClassLoader());
    comments = (List<Comment>)in.readValue(Comment.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LineGroup> CREATOR = new Parcelable.Creator<LineGroup>() {
    public LineGroup createFromParcel(Parcel in) {
      return new LineGroup(in);
    }
    public LineGroup[] newArray(int size) {
      return new LineGroup[size];
    }
  };
}

