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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Parameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class Parameters implements Parcelable {
  @SerializedName("min_car")
  private Integer minCar = null;

  @SerializedName("max_duration")
  private Integer maxDuration = null;

  @SerializedName("journey_order")
  private String journeyOrder = null;

  @SerializedName("min_tc_with_bss")
  private Integer minTcWithBss = null;

  @SerializedName("max_bss_duration_to_pt")
  private Integer maxBssDurationToPt = null;

  @SerializedName("max_nb_transfers")
  private Integer maxNbTransfers = null;

  @SerializedName("bike_speed")
  private Float bikeSpeed = null;

  @SerializedName("walking_transfer_penalty")
  private Integer walkingTransferPenalty = null;

  @SerializedName("max_additional_connections")
  private Integer maxAdditionalConnections = null;

  @SerializedName("walking_speed")
  private Float walkingSpeed = null;

  @SerializedName("max_duration_fallback_mode")
  private String maxDurationFallbackMode = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("car_speed")
  private Float carSpeed = null;

  @SerializedName("min_tc_with_car")
  private Integer minTcWithCar = null;

  @SerializedName("min_tc_with_bike")
  private Integer minTcWithBike = null;

  @SerializedName("successive_physical_mode_to_limit_id")
  private String successivePhysicalModeToLimitId = null;

  @SerializedName("min_bike")
  private Integer minBike = null;

  @SerializedName("max_walking_duration_to_pt")
  private Integer maxWalkingDurationToPt = null;

  @SerializedName("night_bus_filter_base_factor")
  private Integer nightBusFilterBaseFactor = null;

  @SerializedName("max_bike_duration_to_pt")
  private Integer maxBikeDurationToPt = null;

  @SerializedName("max_duration_criteria")
  private String maxDurationCriteria = null;

  @SerializedName("bss_provider")
  private Boolean bssProvider = null;

  @SerializedName("scenario")
  private String scenario = null;

  @SerializedName("max_car_duration_to_pt")
  private Integer maxCarDurationToPt = null;

  @SerializedName("min_bss")
  private Integer minBss = null;

  @SerializedName("min_duration_too_long_journey")
  private Integer minDurationTooLongJourney = null;

  @SerializedName("night_bus_filter_max_factor")
  private Float nightBusFilterMaxFactor = null;

  @SerializedName("factor_too_long_journey")
  private Integer factorTooLongJourney = null;

  @SerializedName("bss_speed")
  private Float bssSpeed = null;

  public Parameters minCar(Integer minCar) {
    this.minCar = minCar;
    return this;
  }

   /**
   * Get minCar
   * @return minCar
  **/
  @ApiModelProperty(value = "")
  public Integer getMinCar() {
    return minCar;
  }

  public void setMinCar(Integer minCar) {
    this.minCar = minCar;
  }

  public Parameters maxDuration(Integer maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * Get maxDuration
   * @return maxDuration
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(Integer maxDuration) {
    this.maxDuration = maxDuration;
  }

  public Parameters journeyOrder(String journeyOrder) {
    this.journeyOrder = journeyOrder;
    return this;
  }

   /**
   * Get journeyOrder
   * @return journeyOrder
  **/
  @ApiModelProperty(value = "")
  public String getJourneyOrder() {
    return journeyOrder;
  }

  public void setJourneyOrder(String journeyOrder) {
    this.journeyOrder = journeyOrder;
  }

  public Parameters minTcWithBss(Integer minTcWithBss) {
    this.minTcWithBss = minTcWithBss;
    return this;
  }

   /**
   * Get minTcWithBss
   * @return minTcWithBss
  **/
  @ApiModelProperty(value = "")
  public Integer getMinTcWithBss() {
    return minTcWithBss;
  }

  public void setMinTcWithBss(Integer minTcWithBss) {
    this.minTcWithBss = minTcWithBss;
  }

  public Parameters maxBssDurationToPt(Integer maxBssDurationToPt) {
    this.maxBssDurationToPt = maxBssDurationToPt;
    return this;
  }

   /**
   * Get maxBssDurationToPt
   * @return maxBssDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBssDurationToPt() {
    return maxBssDurationToPt;
  }

  public void setMaxBssDurationToPt(Integer maxBssDurationToPt) {
    this.maxBssDurationToPt = maxBssDurationToPt;
  }

  public Parameters maxNbTransfers(Integer maxNbTransfers) {
    this.maxNbTransfers = maxNbTransfers;
    return this;
  }

   /**
   * Get maxNbTransfers
   * @return maxNbTransfers
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxNbTransfers() {
    return maxNbTransfers;
  }

  public void setMaxNbTransfers(Integer maxNbTransfers) {
    this.maxNbTransfers = maxNbTransfers;
  }

  public Parameters bikeSpeed(Float bikeSpeed) {
    this.bikeSpeed = bikeSpeed;
    return this;
  }

   /**
   * Get bikeSpeed
   * @return bikeSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getBikeSpeed() {
    return bikeSpeed;
  }

  public void setBikeSpeed(Float bikeSpeed) {
    this.bikeSpeed = bikeSpeed;
  }

  public Parameters walkingTransferPenalty(Integer walkingTransferPenalty) {
    this.walkingTransferPenalty = walkingTransferPenalty;
    return this;
  }

   /**
   * Get walkingTransferPenalty
   * @return walkingTransferPenalty
  **/
  @ApiModelProperty(value = "")
  public Integer getWalkingTransferPenalty() {
    return walkingTransferPenalty;
  }

  public void setWalkingTransferPenalty(Integer walkingTransferPenalty) {
    this.walkingTransferPenalty = walkingTransferPenalty;
  }

  public Parameters maxAdditionalConnections(Integer maxAdditionalConnections) {
    this.maxAdditionalConnections = maxAdditionalConnections;
    return this;
  }

   /**
   * Get maxAdditionalConnections
   * @return maxAdditionalConnections
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxAdditionalConnections() {
    return maxAdditionalConnections;
  }

  public void setMaxAdditionalConnections(Integer maxAdditionalConnections) {
    this.maxAdditionalConnections = maxAdditionalConnections;
  }

  public Parameters walkingSpeed(Float walkingSpeed) {
    this.walkingSpeed = walkingSpeed;
    return this;
  }

   /**
   * Get walkingSpeed
   * @return walkingSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getWalkingSpeed() {
    return walkingSpeed;
  }

  public void setWalkingSpeed(Float walkingSpeed) {
    this.walkingSpeed = walkingSpeed;
  }

  public Parameters maxDurationFallbackMode(String maxDurationFallbackMode) {
    this.maxDurationFallbackMode = maxDurationFallbackMode;
    return this;
  }

   /**
   * Get maxDurationFallbackMode
   * @return maxDurationFallbackMode
  **/
  @ApiModelProperty(value = "")
  public String getMaxDurationFallbackMode() {
    return maxDurationFallbackMode;
  }

  public void setMaxDurationFallbackMode(String maxDurationFallbackMode) {
    this.maxDurationFallbackMode = maxDurationFallbackMode;
  }

  public Parameters priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Parameters carSpeed(Float carSpeed) {
    this.carSpeed = carSpeed;
    return this;
  }

   /**
   * Get carSpeed
   * @return carSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getCarSpeed() {
    return carSpeed;
  }

  public void setCarSpeed(Float carSpeed) {
    this.carSpeed = carSpeed;
  }

  public Parameters minTcWithCar(Integer minTcWithCar) {
    this.minTcWithCar = minTcWithCar;
    return this;
  }

   /**
   * Get minTcWithCar
   * @return minTcWithCar
  **/
  @ApiModelProperty(value = "")
  public Integer getMinTcWithCar() {
    return minTcWithCar;
  }

  public void setMinTcWithCar(Integer minTcWithCar) {
    this.minTcWithCar = minTcWithCar;
  }

  public Parameters minTcWithBike(Integer minTcWithBike) {
    this.minTcWithBike = minTcWithBike;
    return this;
  }

   /**
   * Get minTcWithBike
   * @return minTcWithBike
  **/
  @ApiModelProperty(value = "")
  public Integer getMinTcWithBike() {
    return minTcWithBike;
  }

  public void setMinTcWithBike(Integer minTcWithBike) {
    this.minTcWithBike = minTcWithBike;
  }

  public Parameters successivePhysicalModeToLimitId(String successivePhysicalModeToLimitId) {
    this.successivePhysicalModeToLimitId = successivePhysicalModeToLimitId;
    return this;
  }

   /**
   * Get successivePhysicalModeToLimitId
   * @return successivePhysicalModeToLimitId
  **/
  @ApiModelProperty(value = "")
  public String getSuccessivePhysicalModeToLimitId() {
    return successivePhysicalModeToLimitId;
  }

  public void setSuccessivePhysicalModeToLimitId(String successivePhysicalModeToLimitId) {
    this.successivePhysicalModeToLimitId = successivePhysicalModeToLimitId;
  }

  public Parameters minBike(Integer minBike) {
    this.minBike = minBike;
    return this;
  }

   /**
   * Get minBike
   * @return minBike
  **/
  @ApiModelProperty(value = "")
  public Integer getMinBike() {
    return minBike;
  }

  public void setMinBike(Integer minBike) {
    this.minBike = minBike;
  }

  public Parameters maxWalkingDurationToPt(Integer maxWalkingDurationToPt) {
    this.maxWalkingDurationToPt = maxWalkingDurationToPt;
    return this;
  }

   /**
   * Get maxWalkingDurationToPt
   * @return maxWalkingDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxWalkingDurationToPt() {
    return maxWalkingDurationToPt;
  }

  public void setMaxWalkingDurationToPt(Integer maxWalkingDurationToPt) {
    this.maxWalkingDurationToPt = maxWalkingDurationToPt;
  }

  public Parameters nightBusFilterBaseFactor(Integer nightBusFilterBaseFactor) {
    this.nightBusFilterBaseFactor = nightBusFilterBaseFactor;
    return this;
  }

   /**
   * Get nightBusFilterBaseFactor
   * @return nightBusFilterBaseFactor
  **/
  @ApiModelProperty(value = "")
  public Integer getNightBusFilterBaseFactor() {
    return nightBusFilterBaseFactor;
  }

  public void setNightBusFilterBaseFactor(Integer nightBusFilterBaseFactor) {
    this.nightBusFilterBaseFactor = nightBusFilterBaseFactor;
  }

  public Parameters maxBikeDurationToPt(Integer maxBikeDurationToPt) {
    this.maxBikeDurationToPt = maxBikeDurationToPt;
    return this;
  }

   /**
   * Get maxBikeDurationToPt
   * @return maxBikeDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBikeDurationToPt() {
    return maxBikeDurationToPt;
  }

  public void setMaxBikeDurationToPt(Integer maxBikeDurationToPt) {
    this.maxBikeDurationToPt = maxBikeDurationToPt;
  }

  public Parameters maxDurationCriteria(String maxDurationCriteria) {
    this.maxDurationCriteria = maxDurationCriteria;
    return this;
  }

   /**
   * Get maxDurationCriteria
   * @return maxDurationCriteria
  **/
  @ApiModelProperty(value = "")
  public String getMaxDurationCriteria() {
    return maxDurationCriteria;
  }

  public void setMaxDurationCriteria(String maxDurationCriteria) {
    this.maxDurationCriteria = maxDurationCriteria;
  }

  public Parameters bssProvider(Boolean bssProvider) {
    this.bssProvider = bssProvider;
    return this;
  }

   /**
   * Get bssProvider
   * @return bssProvider
  **/
  @ApiModelProperty(value = "")
  public Boolean getBssProvider() {
    return bssProvider;
  }

  public void setBssProvider(Boolean bssProvider) {
    this.bssProvider = bssProvider;
  }

  public Parameters scenario(String scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Get scenario
   * @return scenario
  **/
  @ApiModelProperty(value = "")
  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public Parameters maxCarDurationToPt(Integer maxCarDurationToPt) {
    this.maxCarDurationToPt = maxCarDurationToPt;
    return this;
  }

   /**
   * Get maxCarDurationToPt
   * @return maxCarDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCarDurationToPt() {
    return maxCarDurationToPt;
  }

  public void setMaxCarDurationToPt(Integer maxCarDurationToPt) {
    this.maxCarDurationToPt = maxCarDurationToPt;
  }

  public Parameters minBss(Integer minBss) {
    this.minBss = minBss;
    return this;
  }

   /**
   * Get minBss
   * @return minBss
  **/
  @ApiModelProperty(value = "")
  public Integer getMinBss() {
    return minBss;
  }

  public void setMinBss(Integer minBss) {
    this.minBss = minBss;
  }

  public Parameters minDurationTooLongJourney(Integer minDurationTooLongJourney) {
    this.minDurationTooLongJourney = minDurationTooLongJourney;
    return this;
  }

   /**
   * Get minDurationTooLongJourney
   * @return minDurationTooLongJourney
  **/
  @ApiModelProperty(value = "")
  public Integer getMinDurationTooLongJourney() {
    return minDurationTooLongJourney;
  }

  public void setMinDurationTooLongJourney(Integer minDurationTooLongJourney) {
    this.minDurationTooLongJourney = minDurationTooLongJourney;
  }

  public Parameters nightBusFilterMaxFactor(Float nightBusFilterMaxFactor) {
    this.nightBusFilterMaxFactor = nightBusFilterMaxFactor;
    return this;
  }

   /**
   * Get nightBusFilterMaxFactor
   * @return nightBusFilterMaxFactor
  **/
  @ApiModelProperty(value = "")
  public Float getNightBusFilterMaxFactor() {
    return nightBusFilterMaxFactor;
  }

  public void setNightBusFilterMaxFactor(Float nightBusFilterMaxFactor) {
    this.nightBusFilterMaxFactor = nightBusFilterMaxFactor;
  }

  public Parameters factorTooLongJourney(Integer factorTooLongJourney) {
    this.factorTooLongJourney = factorTooLongJourney;
    return this;
  }

   /**
   * Get factorTooLongJourney
   * @return factorTooLongJourney
  **/
  @ApiModelProperty(value = "")
  public Integer getFactorTooLongJourney() {
    return factorTooLongJourney;
  }

  public void setFactorTooLongJourney(Integer factorTooLongJourney) {
    this.factorTooLongJourney = factorTooLongJourney;
  }

  public Parameters bssSpeed(Float bssSpeed) {
    this.bssSpeed = bssSpeed;
    return this;
  }

   /**
   * Get bssSpeed
   * @return bssSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getBssSpeed() {
    return bssSpeed;
  }

  public void setBssSpeed(Float bssSpeed) {
    this.bssSpeed = bssSpeed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameters parameters = (Parameters) o;
    return Objects.equals(this.minCar, parameters.minCar) &&
        Objects.equals(this.maxDuration, parameters.maxDuration) &&
        Objects.equals(this.journeyOrder, parameters.journeyOrder) &&
        Objects.equals(this.minTcWithBss, parameters.minTcWithBss) &&
        Objects.equals(this.maxBssDurationToPt, parameters.maxBssDurationToPt) &&
        Objects.equals(this.maxNbTransfers, parameters.maxNbTransfers) &&
        Objects.equals(this.bikeSpeed, parameters.bikeSpeed) &&
        Objects.equals(this.walkingTransferPenalty, parameters.walkingTransferPenalty) &&
        Objects.equals(this.maxAdditionalConnections, parameters.maxAdditionalConnections) &&
        Objects.equals(this.walkingSpeed, parameters.walkingSpeed) &&
        Objects.equals(this.maxDurationFallbackMode, parameters.maxDurationFallbackMode) &&
        Objects.equals(this.priority, parameters.priority) &&
        Objects.equals(this.carSpeed, parameters.carSpeed) &&
        Objects.equals(this.minTcWithCar, parameters.minTcWithCar) &&
        Objects.equals(this.minTcWithBike, parameters.minTcWithBike) &&
        Objects.equals(this.successivePhysicalModeToLimitId, parameters.successivePhysicalModeToLimitId) &&
        Objects.equals(this.minBike, parameters.minBike) &&
        Objects.equals(this.maxWalkingDurationToPt, parameters.maxWalkingDurationToPt) &&
        Objects.equals(this.nightBusFilterBaseFactor, parameters.nightBusFilterBaseFactor) &&
        Objects.equals(this.maxBikeDurationToPt, parameters.maxBikeDurationToPt) &&
        Objects.equals(this.maxDurationCriteria, parameters.maxDurationCriteria) &&
        Objects.equals(this.bssProvider, parameters.bssProvider) &&
        Objects.equals(this.scenario, parameters.scenario) &&
        Objects.equals(this.maxCarDurationToPt, parameters.maxCarDurationToPt) &&
        Objects.equals(this.minBss, parameters.minBss) &&
        Objects.equals(this.minDurationTooLongJourney, parameters.minDurationTooLongJourney) &&
        Objects.equals(this.nightBusFilterMaxFactor, parameters.nightBusFilterMaxFactor) &&
        Objects.equals(this.factorTooLongJourney, parameters.factorTooLongJourney) &&
        Objects.equals(this.bssSpeed, parameters.bssSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minCar, maxDuration, journeyOrder, minTcWithBss, maxBssDurationToPt, maxNbTransfers, bikeSpeed, walkingTransferPenalty, maxAdditionalConnections, walkingSpeed, maxDurationFallbackMode, priority, carSpeed, minTcWithCar, minTcWithBike, successivePhysicalModeToLimitId, minBike, maxWalkingDurationToPt, nightBusFilterBaseFactor, maxBikeDurationToPt, maxDurationCriteria, bssProvider, scenario, maxCarDurationToPt, minBss, minDurationTooLongJourney, nightBusFilterMaxFactor, factorTooLongJourney, bssSpeed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameters {\n");
    
    sb.append("    minCar: ").append(toIndentedString(minCar)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
    sb.append("    journeyOrder: ").append(toIndentedString(journeyOrder)).append("\n");
    sb.append("    minTcWithBss: ").append(toIndentedString(minTcWithBss)).append("\n");
    sb.append("    maxBssDurationToPt: ").append(toIndentedString(maxBssDurationToPt)).append("\n");
    sb.append("    maxNbTransfers: ").append(toIndentedString(maxNbTransfers)).append("\n");
    sb.append("    bikeSpeed: ").append(toIndentedString(bikeSpeed)).append("\n");
    sb.append("    walkingTransferPenalty: ").append(toIndentedString(walkingTransferPenalty)).append("\n");
    sb.append("    maxAdditionalConnections: ").append(toIndentedString(maxAdditionalConnections)).append("\n");
    sb.append("    walkingSpeed: ").append(toIndentedString(walkingSpeed)).append("\n");
    sb.append("    maxDurationFallbackMode: ").append(toIndentedString(maxDurationFallbackMode)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    carSpeed: ").append(toIndentedString(carSpeed)).append("\n");
    sb.append("    minTcWithCar: ").append(toIndentedString(minTcWithCar)).append("\n");
    sb.append("    minTcWithBike: ").append(toIndentedString(minTcWithBike)).append("\n");
    sb.append("    successivePhysicalModeToLimitId: ").append(toIndentedString(successivePhysicalModeToLimitId)).append("\n");
    sb.append("    minBike: ").append(toIndentedString(minBike)).append("\n");
    sb.append("    maxWalkingDurationToPt: ").append(toIndentedString(maxWalkingDurationToPt)).append("\n");
    sb.append("    nightBusFilterBaseFactor: ").append(toIndentedString(nightBusFilterBaseFactor)).append("\n");
    sb.append("    maxBikeDurationToPt: ").append(toIndentedString(maxBikeDurationToPt)).append("\n");
    sb.append("    maxDurationCriteria: ").append(toIndentedString(maxDurationCriteria)).append("\n");
    sb.append("    bssProvider: ").append(toIndentedString(bssProvider)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    maxCarDurationToPt: ").append(toIndentedString(maxCarDurationToPt)).append("\n");
    sb.append("    minBss: ").append(toIndentedString(minBss)).append("\n");
    sb.append("    minDurationTooLongJourney: ").append(toIndentedString(minDurationTooLongJourney)).append("\n");
    sb.append("    nightBusFilterMaxFactor: ").append(toIndentedString(nightBusFilterMaxFactor)).append("\n");
    sb.append("    factorTooLongJourney: ").append(toIndentedString(factorTooLongJourney)).append("\n");
    sb.append("    bssSpeed: ").append(toIndentedString(bssSpeed)).append("\n");
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
     
    out.writeValue(minCar);

    out.writeValue(maxDuration);

    out.writeValue(journeyOrder);

    out.writeValue(minTcWithBss);

    out.writeValue(maxBssDurationToPt);

    out.writeValue(maxNbTransfers);

    out.writeValue(bikeSpeed);

    out.writeValue(walkingTransferPenalty);

    out.writeValue(maxAdditionalConnections);

    out.writeValue(walkingSpeed);

    out.writeValue(maxDurationFallbackMode);

    out.writeValue(priority);

    out.writeValue(carSpeed);

    out.writeValue(minTcWithCar);

    out.writeValue(minTcWithBike);

    out.writeValue(successivePhysicalModeToLimitId);

    out.writeValue(minBike);

    out.writeValue(maxWalkingDurationToPt);

    out.writeValue(nightBusFilterBaseFactor);

    out.writeValue(maxBikeDurationToPt);

    out.writeValue(maxDurationCriteria);

    out.writeValue(bssProvider);

    out.writeValue(scenario);

    out.writeValue(maxCarDurationToPt);

    out.writeValue(minBss);

    out.writeValue(minDurationTooLongJourney);

    out.writeValue(nightBusFilterMaxFactor);

    out.writeValue(factorTooLongJourney);

    out.writeValue(bssSpeed);
  }

  public Parameters() {
    super();
  }

  Parameters(Parcel in) {
    
    minCar = (Integer)in.readValue(null);
    maxDuration = (Integer)in.readValue(null);
    journeyOrder = (String)in.readValue(null);
    minTcWithBss = (Integer)in.readValue(null);
    maxBssDurationToPt = (Integer)in.readValue(null);
    maxNbTransfers = (Integer)in.readValue(null);
    bikeSpeed = (Float)in.readValue(null);
    walkingTransferPenalty = (Integer)in.readValue(null);
    maxAdditionalConnections = (Integer)in.readValue(null);
    walkingSpeed = (Float)in.readValue(null);
    maxDurationFallbackMode = (String)in.readValue(null);
    priority = (Integer)in.readValue(null);
    carSpeed = (Float)in.readValue(null);
    minTcWithCar = (Integer)in.readValue(null);
    minTcWithBike = (Integer)in.readValue(null);
    successivePhysicalModeToLimitId = (String)in.readValue(null);
    minBike = (Integer)in.readValue(null);
    maxWalkingDurationToPt = (Integer)in.readValue(null);
    nightBusFilterBaseFactor = (Integer)in.readValue(null);
    maxBikeDurationToPt = (Integer)in.readValue(null);
    maxDurationCriteria = (String)in.readValue(null);
    bssProvider = (Boolean)in.readValue(null);
    scenario = (String)in.readValue(null);
    maxCarDurationToPt = (Integer)in.readValue(null);
    minBss = (Integer)in.readValue(null);
    minDurationTooLongJourney = (Integer)in.readValue(null);
    nightBusFilterMaxFactor = (Float)in.readValue(null);
    factorTooLongJourney = (Integer)in.readValue(null);
    bssSpeed = (Float)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator<Parameters>() {
    public Parameters createFromParcel(Parcel in) {
      return new Parameters(in);
    }
    public Parameters[] newArray(int size) {
      return new Parameters[size];
    }
  };
}

