/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.78.0
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
import org.kisio.NavitiaSDK.models.BetaEndpoints;
import org.kisio.NavitiaSDK.models.Context;
import org.kisio.NavitiaSDK.models.Disruption;
import org.kisio.NavitiaSDK.models.EquipmentReport;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.Note;
import org.kisio.NavitiaSDK.models.Pagination;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * EquipmentReports
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-05-13T11:47:49.806+02:00")
public class EquipmentReports implements Parcelable {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("warnings")
  private List<BetaEndpoints> warnings = new ArrayList<BetaEndpoints>();

  @SerializedName("equipment_reports")
  private List<EquipmentReport> equipmentReports = new ArrayList<EquipmentReport>();

  @SerializedName("notes")
  private List<Note> notes = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  public EquipmentReports pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public EquipmentReports links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public EquipmentReports addLinksItem(LinkSchema linksItem) {
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

  public EquipmentReports warnings(List<BetaEndpoints> warnings) {
    this.warnings = warnings;
    return this;
  }

  public EquipmentReports addWarningsItem(BetaEndpoints warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BetaEndpoints> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<BetaEndpoints> warnings) {
    this.warnings = warnings;
  }

  public EquipmentReports equipmentReports(List<EquipmentReport> equipmentReports) {
    this.equipmentReports = equipmentReports;
    return this;
  }

  public EquipmentReports addEquipmentReportsItem(EquipmentReport equipmentReportsItem) {
    this.equipmentReports.add(equipmentReportsItem);
    return this;
  }

   /**
   * Get equipmentReports
   * @return equipmentReports
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EquipmentReport> getEquipmentReports() {
    return equipmentReports;
  }

  public void setEquipmentReports(List<EquipmentReport> equipmentReports) {
    this.equipmentReports = equipmentReports;
  }

  public EquipmentReports notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public EquipmentReports addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }

  public EquipmentReports error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public EquipmentReports feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public EquipmentReports addFeedPublishersItem(FeedPublisher feedPublishersItem) {
    this.feedPublishers.add(feedPublishersItem);
    return this;
  }

   /**
   * Get feedPublishers
   * @return feedPublishers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FeedPublisher> getFeedPublishers() {
    return feedPublishers;
  }

  public void setFeedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
  }

  public EquipmentReports context(Context context) {
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

  public EquipmentReports disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public EquipmentReports addDisruptionsItem(Disruption disruptionsItem) {
    this.disruptions.add(disruptionsItem);
    return this;
  }

   /**
   * Get disruptions
   * @return disruptions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentReports equipmentReports = (EquipmentReports) o;
    return Objects.equals(this.pagination, equipmentReports.pagination) &&
        Objects.equals(this.links, equipmentReports.links) &&
        Objects.equals(this.warnings, equipmentReports.warnings) &&
        Objects.equals(this.equipmentReports, equipmentReports.equipmentReports) &&
        Objects.equals(this.notes, equipmentReports.notes) &&
        Objects.equals(this.error, equipmentReports.error) &&
        Objects.equals(this.feedPublishers, equipmentReports.feedPublishers) &&
        Objects.equals(this.context, equipmentReports.context) &&
        Objects.equals(this.disruptions, equipmentReports.disruptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, warnings, equipmentReports, notes, error, feedPublishers, context, disruptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentReports {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    equipmentReports: ").append(toIndentedString(equipmentReports)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
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
     
    out.writeValue(pagination);

    out.writeValue(links);

    out.writeValue(warnings);

    out.writeValue(equipmentReports);

    out.writeValue(notes);

    out.writeValue(error);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(disruptions);
  }

  public EquipmentReports() {
    super();
  }

  EquipmentReports(Parcel in) {
    
    pagination = (Pagination)in.readValue(Pagination.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    warnings = (List<BetaEndpoints>)in.readValue(BetaEndpoints.class.getClassLoader());
    equipmentReports = (List<EquipmentReport>)in.readValue(EquipmentReport.class.getClassLoader());
    notes = (List<Note>)in.readValue(Note.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    disruptions = (List<Disruption>)in.readValue(Disruption.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<EquipmentReports> CREATOR = new Parcelable.Creator<EquipmentReports>() {
    public EquipmentReports createFromParcel(Parcel in) {
      return new EquipmentReports(in);
    }
    public EquipmentReports[] newArray(int size) {
      return new EquipmentReports[size];
    }
  };
}

