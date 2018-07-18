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
import org.kisio.NavitiaSDK.models.Cost;
import org.kisio.NavitiaSDK.models.LinkSchema;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Ticket
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-06-21T11:32:39.197+02:00")
public class Ticket implements Parcelable {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("cost")
  private Cost cost = null;

  @SerializedName("found")
  private Boolean found = null;

  @SerializedName("id")
  private String id = null;

  public Ticket comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Ticket name(String name) {
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

  public Ticket links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Ticket addLinksItem(LinkSchema linksItem) {
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

  public Ticket cost(Cost cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "")
  public Cost getCost() {
    return cost;
  }

  public void setCost(Cost cost) {
    this.cost = cost;
  }

  public Ticket found(Boolean found) {
    this.found = found;
    return this;
  }

   /**
   * Get found
   * @return found
  **/
  @ApiModelProperty(value = "")
  public Boolean getFound() {
    return found;
  }

  public void setFound(Boolean found) {
    this.found = found;
  }

  public Ticket id(String id) {
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
    Ticket ticket = (Ticket) o;
    return Objects.equals(this.comment, ticket.comment) &&
        Objects.equals(this.name, ticket.name) &&
        Objects.equals(this.links, ticket.links) &&
        Objects.equals(this.cost, ticket.cost) &&
        Objects.equals(this.found, ticket.found) &&
        Objects.equals(this.id, ticket.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, links, cost, found, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
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
     
    out.writeValue(comment);

    out.writeValue(name);

    out.writeValue(links);

    out.writeValue(cost);

    out.writeValue(found);

    out.writeValue(id);
  }

  public Ticket() {
    super();
  }

  Ticket(Parcel in) {
    
    comment = (String)in.readValue(null);
    name = (String)in.readValue(null);
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    cost = (Cost)in.readValue(Cost.class.getClassLoader());
    found = (Boolean)in.readValue(null);
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Ticket> CREATOR = new Parcelable.Creator<Ticket>() {
    public Ticket createFromParcel(Parcel in) {
      return new Ticket(in);
    }
    public Ticket[] newArray(int size) {
      return new Ticket[size];
    }
  };
}

