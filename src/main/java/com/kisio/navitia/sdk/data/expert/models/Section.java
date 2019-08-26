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
import com.kisio.navitia.sdk.data.expert.models.Amount;
import com.kisio.navitia.sdk.data.expert.models.Journey;
import com.kisio.navitia.sdk.data.expert.models.LinkSchema;
import com.kisio.navitia.sdk.data.expert.models.Path;
import com.kisio.navitia.sdk.data.expert.models.Place;
import com.kisio.navitia.sdk.data.expert.models.RidesharingInformation;
import com.kisio.navitia.sdk.data.expert.models.SectionGeoJsonSchema;
import com.kisio.navitia.sdk.data.expert.models.StopDateTime;
import com.kisio.navitia.sdk.data.expert.models.VJDisplayInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Section
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-08-26T16:17:02.580+02:00")
public class Section implements Parcelable {
  @SerializedName("display_informations")
  private VJDisplayInformation displayInformations = null;

  @SerializedName("from")
  private Place from = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  /**
   * Gets or Sets transferType
   */
  public enum TransferTypeEnum {
    @SerializedName("walking")
    WALKING("walking"),
    
    @SerializedName("stay_in")
    STAY_IN("stay_in");

    private String value;

    TransferTypeEnum(String value) {
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

  @SerializedName("transfer_type")
  private TransferTypeEnum transferType = null;

  @SerializedName("arrival_date_time")
  private String arrivalDateTime = null;

  /**
   * Gets or Sets additionalInformations
   */
  public enum AdditionalInformationsEnum {
    @SerializedName("odt_with_zone")
    ODT_WITH_ZONE("odt_with_zone"),
    
    @SerializedName("odt_with_stop_point")
    ODT_WITH_STOP_POINT("odt_with_stop_point"),
    
    @SerializedName("odt_with_stop_time")
    ODT_WITH_STOP_TIME("odt_with_stop_time"),
    
    @SerializedName("has_datetime_estimated")
    HAS_DATETIME_ESTIMATED("has_datetime_estimated"),
    
    @SerializedName("regular")
    REGULAR("regular"),
    
    @SerializedName("stay_in")
    STAY_IN("stay_in");

    private String value;

    AdditionalInformationsEnum(String value) {
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

  @SerializedName("additional_informations")
  private List<AdditionalInformationsEnum> additionalInformations = null;

  @SerializedName("departure_date_time")
  private String departureDateTime = null;

  @SerializedName("ridesharing_informations")
  private RidesharingInformation ridesharingInformations = null;

  @SerializedName("to")
  private Place to = null;

  @SerializedName("base_arrival_date_time")
  private String baseArrivalDateTime = null;

  @SerializedName("base_departure_date_time")
  private String baseDepartureDateTime = null;

  @SerializedName("co2_emission")
  private Amount co2Emission = null;

  @SerializedName("ridesharing_journeys")
  private List<Journey> ridesharingJourneys = null;

  @SerializedName("geojson")
  private SectionGeoJsonSchema geojson = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("path")
  private List<Path> path = null;

  @SerializedName("stop_date_times")
  private List<StopDateTime> stopDateTimes = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("public_transport")
    PUBLIC_TRANSPORT("public_transport"),
    
    @SerializedName("street_network")
    STREET_NETWORK("street_network"),
    
    @SerializedName("waiting")
    WAITING("waiting"),
    
    @SerializedName("transfer")
    TRANSFER("transfer"),
    
    @SerializedName("boarding")
    BOARDING("boarding"),
    
    @SerializedName("landing")
    LANDING("landing"),
    
    @SerializedName("bss_rent")
    BSS_RENT("bss_rent"),
    
    @SerializedName("bss_put_back")
    BSS_PUT_BACK("bss_put_back"),
    
    @SerializedName("crow_fly")
    CROW_FLY("crow_fly"),
    
    @SerializedName("park")
    PARK("park"),
    
    @SerializedName("leave_parking")
    LEAVE_PARKING("leave_parking"),
    
    @SerializedName("alighting")
    ALIGHTING("alighting"),
    
    @SerializedName("ridesharing")
    RIDESHARING("ridesharing"),
    
    @SerializedName("on_demand_transport")
    ON_DEMAND_TRANSPORT("on_demand_transport");

    private String value;

    TypeEnum(String value) {
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

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets dataFreshness
   */
  public enum DataFreshnessEnum {
    @SerializedName("base_schedule")
    BASE_SCHEDULE("base_schedule"),
    
    @SerializedName("adapted_schedule")
    ADAPTED_SCHEDULE("adapted_schedule"),
    
    @SerializedName("realtime")
    REALTIME("realtime");

    private String value;

    DataFreshnessEnum(String value) {
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

  @SerializedName("data_freshness")
  private DataFreshnessEnum dataFreshness = null;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    @SerializedName("walking")
    WALKING("walking"),
    
    @SerializedName("bike")
    BIKE("bike"),
    
    @SerializedName("car")
    CAR("car"),
    
    @SerializedName("bss")
    BSS("bss"),
    
    @SerializedName("ridesharing")
    RIDESHARING("ridesharing"),
    
    @SerializedName("carnopark")
    CARNOPARK("carnopark"),
    
    @SerializedName("taxi")
    TAXI("taxi");

    private String value;

    ModeEnum(String value) {
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

  @SerializedName("mode")
  private ModeEnum mode = null;

  public Section displayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
    return this;
  }

   /**
   * Get displayInformations
   * @return displayInformations
  **/
  @ApiModelProperty(value = "")
  public VJDisplayInformation getDisplayInformations() {
    return displayInformations;
  }

  public void setDisplayInformations(VJDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
  }

  public Section from(Place from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public Place getFrom() {
    return from;
  }

  public void setFrom(Place from) {
    this.from = from;
  }

  public Section links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Section addLinksItem(LinkSchema linksItem) {
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

  public Section transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(value = "")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }

  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }

  public Section arrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    return this;
  }

   /**
   * Arrival date and time of the section
   * @return arrivalDateTime
  **/
  @ApiModelProperty(value = "Arrival date and time of the section")
  public String getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public Section additionalInformations(List<AdditionalInformationsEnum> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public Section addAdditionalInformationsItem(AdditionalInformationsEnum additionalInformationsItem) {
    if (this.additionalInformations == null) {
      this.additionalInformations = new ArrayList<AdditionalInformationsEnum>();
    }
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(value = "")
  public List<AdditionalInformationsEnum> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<AdditionalInformationsEnum> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public Section departureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
  }

   /**
   * Departure date and time of the section
   * @return departureDateTime
  **/
  @ApiModelProperty(value = "Departure date and time of the section")
  public String getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public Section ridesharingInformations(RidesharingInformation ridesharingInformations) {
    this.ridesharingInformations = ridesharingInformations;
    return this;
  }

   /**
   * Get ridesharingInformations
   * @return ridesharingInformations
  **/
  @ApiModelProperty(value = "")
  public RidesharingInformation getRidesharingInformations() {
    return ridesharingInformations;
  }

  public void setRidesharingInformations(RidesharingInformation ridesharingInformations) {
    this.ridesharingInformations = ridesharingInformations;
  }

  public Section to(Place to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public Place getTo() {
    return to;
  }

  public void setTo(Place to) {
    this.to = to;
  }

  public Section baseArrivalDateTime(String baseArrivalDateTime) {
    this.baseArrivalDateTime = baseArrivalDateTime;
    return this;
  }

   /**
   * Base-schedule arrival date and time of the section
   * @return baseArrivalDateTime
  **/
  @ApiModelProperty(value = "Base-schedule arrival date and time of the section")
  public String getBaseArrivalDateTime() {
    return baseArrivalDateTime;
  }

  public void setBaseArrivalDateTime(String baseArrivalDateTime) {
    this.baseArrivalDateTime = baseArrivalDateTime;
  }

  public Section baseDepartureDateTime(String baseDepartureDateTime) {
    this.baseDepartureDateTime = baseDepartureDateTime;
    return this;
  }

   /**
   * Base-schedule departure date and time of the section
   * @return baseDepartureDateTime
  **/
  @ApiModelProperty(value = "Base-schedule departure date and time of the section")
  public String getBaseDepartureDateTime() {
    return baseDepartureDateTime;
  }

  public void setBaseDepartureDateTime(String baseDepartureDateTime) {
    this.baseDepartureDateTime = baseDepartureDateTime;
  }

  public Section co2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
    return this;
  }

   /**
   * Get co2Emission
   * @return co2Emission
  **/
  @ApiModelProperty(required = true, value = "")
  public Amount getCo2Emission() {
    return co2Emission;
  }

  public void setCo2Emission(Amount co2Emission) {
    this.co2Emission = co2Emission;
  }

  public Section ridesharingJourneys(List<Journey> ridesharingJourneys) {
    this.ridesharingJourneys = ridesharingJourneys;
    return this;
  }

  public Section addRidesharingJourneysItem(Journey ridesharingJourneysItem) {
    if (this.ridesharingJourneys == null) {
      this.ridesharingJourneys = new ArrayList<Journey>();
    }
    this.ridesharingJourneys.add(ridesharingJourneysItem);
    return this;
  }

   /**
   * Get ridesharingJourneys
   * @return ridesharingJourneys
  **/
  @ApiModelProperty(value = "")
  public List<Journey> getRidesharingJourneys() {
    return ridesharingJourneys;
  }

  public void setRidesharingJourneys(List<Journey> ridesharingJourneys) {
    this.ridesharingJourneys = ridesharingJourneys;
  }

  public Section geojson(SectionGeoJsonSchema geojson) {
    this.geojson = geojson;
    return this;
  }

   /**
   * GeoJSON of the shape of the section
   * @return geojson
  **/
  @ApiModelProperty(value = "GeoJSON of the shape of the section")
  public SectionGeoJsonSchema getGeojson() {
    return geojson;
  }

  public void setGeojson(SectionGeoJsonSchema geojson) {
    this.geojson = geojson;
  }

  public Section duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the section (seconds)
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Duration of the section (seconds)")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Section path(List<Path> path) {
    this.path = path;
    return this;
  }

  public Section addPathItem(Path pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<Path>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public List<Path> getPath() {
    return path;
  }

  public void setPath(List<Path> path) {
    this.path = path;
  }

  public Section stopDateTimes(List<StopDateTime> stopDateTimes) {
    this.stopDateTimes = stopDateTimes;
    return this;
  }

  public Section addStopDateTimesItem(StopDateTime stopDateTimesItem) {
    if (this.stopDateTimes == null) {
      this.stopDateTimes = new ArrayList<StopDateTime>();
    }
    this.stopDateTimes.add(stopDateTimesItem);
    return this;
  }

   /**
   * Get stopDateTimes
   * @return stopDateTimes
  **/
  @ApiModelProperty(value = "")
  public List<StopDateTime> getStopDateTimes() {
    return stopDateTimes;
  }

  public void setStopDateTimes(List<StopDateTime> stopDateTimes) {
    this.stopDateTimes = stopDateTimes;
  }

  public Section type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Section id(String id) {
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

  public Section dataFreshness(DataFreshnessEnum dataFreshness) {
    this.dataFreshness = dataFreshness;
    return this;
  }

   /**
   * Get dataFreshness
   * @return dataFreshness
  **/
  @ApiModelProperty(value = "")
  public DataFreshnessEnum getDataFreshness() {
    return dataFreshness;
  }

  public void setDataFreshness(DataFreshnessEnum dataFreshness) {
    this.dataFreshness = dataFreshness;
  }

  public Section mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.displayInformations, section.displayInformations) &&
        Objects.equals(this.from, section.from) &&
        Objects.equals(this.links, section.links) &&
        Objects.equals(this.transferType, section.transferType) &&
        Objects.equals(this.arrivalDateTime, section.arrivalDateTime) &&
        Objects.equals(this.additionalInformations, section.additionalInformations) &&
        Objects.equals(this.departureDateTime, section.departureDateTime) &&
        Objects.equals(this.ridesharingInformations, section.ridesharingInformations) &&
        Objects.equals(this.to, section.to) &&
        Objects.equals(this.baseArrivalDateTime, section.baseArrivalDateTime) &&
        Objects.equals(this.baseDepartureDateTime, section.baseDepartureDateTime) &&
        Objects.equals(this.co2Emission, section.co2Emission) &&
        Objects.equals(this.ridesharingJourneys, section.ridesharingJourneys) &&
        Objects.equals(this.geojson, section.geojson) &&
        Objects.equals(this.duration, section.duration) &&
        Objects.equals(this.path, section.path) &&
        Objects.equals(this.stopDateTimes, section.stopDateTimes) &&
        Objects.equals(this.type, section.type) &&
        Objects.equals(this.id, section.id) &&
        Objects.equals(this.dataFreshness, section.dataFreshness) &&
        Objects.equals(this.mode, section.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayInformations, from, links, transferType, arrivalDateTime, additionalInformations, departureDateTime, ridesharingInformations, to, baseArrivalDateTime, baseDepartureDateTime, co2Emission, ridesharingJourneys, geojson, duration, path, stopDateTimes, type, id, dataFreshness, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    displayInformations: ").append(toIndentedString(displayInformations)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    arrivalDateTime: ").append(toIndentedString(arrivalDateTime)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    ridesharingInformations: ").append(toIndentedString(ridesharingInformations)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    baseArrivalDateTime: ").append(toIndentedString(baseArrivalDateTime)).append("\n");
    sb.append("    baseDepartureDateTime: ").append(toIndentedString(baseDepartureDateTime)).append("\n");
    sb.append("    co2Emission: ").append(toIndentedString(co2Emission)).append("\n");
    sb.append("    ridesharingJourneys: ").append(toIndentedString(ridesharingJourneys)).append("\n");
    sb.append("    geojson: ").append(toIndentedString(geojson)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    stopDateTimes: ").append(toIndentedString(stopDateTimes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataFreshness: ").append(toIndentedString(dataFreshness)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
     
    out.writeValue(displayInformations);

    out.writeValue(from);

    out.writeValue(links);

    out.writeValue(transferType);

    out.writeValue(arrivalDateTime);

    out.writeValue(additionalInformations);

    out.writeValue(departureDateTime);

    out.writeValue(ridesharingInformations);

    out.writeValue(to);

    out.writeValue(baseArrivalDateTime);

    out.writeValue(baseDepartureDateTime);

    out.writeValue(co2Emission);

    out.writeValue(ridesharingJourneys);

    out.writeValue(geojson);

    out.writeValue(duration);

    out.writeValue(path);

    out.writeValue(stopDateTimes);

    out.writeValue(type);

    out.writeValue(id);

    out.writeValue(dataFreshness);

    out.writeValue(mode);
  }

  public Section() {
    super();
  }

  Section(Parcel in) {
    
    displayInformations = (VJDisplayInformation)in.readValue(VJDisplayInformation.class.getClassLoader());
    from = (Place)in.readValue(Place.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    transferType = (TransferTypeEnum)in.readValue(null);
    arrivalDateTime = (String)in.readValue(null);
    additionalInformations = (List<AdditionalInformationsEnum>)in.readValue(null);
    departureDateTime = (String)in.readValue(null);
    ridesharingInformations = (RidesharingInformation)in.readValue(RidesharingInformation.class.getClassLoader());
    to = (Place)in.readValue(Place.class.getClassLoader());
    baseArrivalDateTime = (String)in.readValue(null);
    baseDepartureDateTime = (String)in.readValue(null);
    co2Emission = (Amount)in.readValue(Amount.class.getClassLoader());
    ridesharingJourneys = (List<Journey>)in.readValue(Journey.class.getClassLoader());
    geojson = (SectionGeoJsonSchema)in.readValue(SectionGeoJsonSchema.class.getClassLoader());
    duration = (Integer)in.readValue(null);
    path = (List<Path>)in.readValue(Path.class.getClassLoader());
    stopDateTimes = (List<StopDateTime>)in.readValue(StopDateTime.class.getClassLoader());
    type = (TypeEnum)in.readValue(null);
    id = (String)in.readValue(null);
    dataFreshness = (DataFreshnessEnum)in.readValue(null);
    mode = (ModeEnum)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Section> CREATOR = new Parcelable.Creator<Section>() {
    public Section createFromParcel(Parcel in) {
      return new Section(in);
    }
    public Section[] newArray(int size) {
      return new Section[size];
    }
  };
}

