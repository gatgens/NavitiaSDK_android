/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.87.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.data.expert.models.BetaEndpoints;
import com.kisio.navitia.sdk.data.expert.models.Context;
import com.kisio.navitia.sdk.data.expert.models.Error;
import com.kisio.navitia.sdk.data.expert.models.FeedPublisher;
import com.kisio.navitia.sdk.data.expert.models.HeatMap;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * HeatMap1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-10-31T10:31:10.538+01:00")
public class HeatMap1 implements Parcelable {
  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("warnings")
  private List<BetaEndpoints> warnings = new ArrayList<BetaEndpoints>();

  @SerializedName("heat_maps")
  private List<HeatMap> heatMaps = new ArrayList<HeatMap>();

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  public HeatMap1 links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public HeatMap1 addLinksItem(LinkSchema linksItem) {
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

  public HeatMap1 warnings(List<BetaEndpoints> warnings) {
    this.warnings = warnings;
    return this;
  }

  public HeatMap1 addWarningsItem(BetaEndpoints warningsItem) {
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

  public HeatMap1 heatMaps(List<HeatMap> heatMaps) {
    this.heatMaps = heatMaps;
    return this;
  }

  public HeatMap1 addHeatMapsItem(HeatMap heatMapsItem) {
    this.heatMaps.add(heatMapsItem);
    return this;
  }

   /**
   * Get heatMaps
   * @return heatMaps
  **/
  @ApiModelProperty(required = true, value = "")
  public List<HeatMap> getHeatMaps() {
    return heatMaps;
  }

  public void setHeatMaps(List<HeatMap> heatMaps) {
    this.heatMaps = heatMaps;
  }

  public HeatMap1 feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public HeatMap1 addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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

  public HeatMap1 context(Context context) {
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

  public HeatMap1 error(Error error) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatMap1 heatMap1 = (HeatMap1) o;
    return Objects.equals(this.links, heatMap1.links) &&
        Objects.equals(this.warnings, heatMap1.warnings) &&
        Objects.equals(this.heatMaps, heatMap1.heatMaps) &&
        Objects.equals(this.feedPublishers, heatMap1.feedPublishers) &&
        Objects.equals(this.context, heatMap1.context) &&
        Objects.equals(this.error, heatMap1.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, warnings, heatMaps, feedPublishers, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatMap1 {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    heatMaps: ").append(toIndentedString(heatMaps)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
     
    out.writeValue(links);

    out.writeValue(warnings);

    out.writeValue(heatMaps);

    out.writeValue(feedPublishers);

    out.writeValue(context);

    out.writeValue(error);
  }

  public HeatMap1() {
    super();
  }

  HeatMap1(Parcel in) {
    
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    warnings = (List<BetaEndpoints>)in.readValue(BetaEndpoints.class.getClassLoader());
    heatMaps = (List<HeatMap>)in.readValue(HeatMap.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<HeatMap1> CREATOR = new Parcelable.Creator<HeatMap1>() {
    public HeatMap1 createFromParcel(Parcel in) {
      return new HeatMap1(in);
    }
    public HeatMap1[] newArray(int size) {
      return new HeatMap1[size];
    }
  };
}

