
# Section

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferType** | **String** |  |  [optional]
**from** | [**Place**](Place.md) |  |  [optional]
**links** | [**List&lt;LinkSchema&gt;**](LinkSchema.md) |  | 
**arrivalDateTime** | **String** | Arrival date and time of the section |  [optional]
**additionalInformations** | [**List&lt;AdditionalInformationsEnum&gt;**](#List&lt;AdditionalInformationsEnum&gt;) |  |  [optional]
**departureDateTime** | **String** | Departure date and time of the section |  [optional]
**displayInformations** | [**VJDisplayInformation**](VJDisplayInformation.md) |  |  [optional]
**to** | [**Place**](Place.md) |  |  [optional]
**baseArrivalDateTime** | **String** | Base-schedule arrival date and time of the section |  [optional]
**baseDepartureDateTime** | **String** | Base-schedule departure date and time of the section |  [optional]
**co2Emission** | [**Amount**](Amount.md) |  | 
**geojson** | [**SectionGeoJsonSchema**](SectionGeoJsonSchema.md) | GeoJSON of the shape of the section |  [optional]
**duration** | **Integer** | Duration of the section (seconds) | 
**path** | [**List&lt;Path&gt;**](Path.md) |  |  [optional]
**stopDateTimes** | [**List&lt;StopDateTime&gt;**](StopDateTime.md) |  |  [optional]
**type** | **String** |  |  [optional]
**id** | **String** |  | 
**dataFreshness** | **String** |  |  [optional]
**mode** | **String** |  |  [optional]


<a name="List<AdditionalInformationsEnum>"></a>
## Enum: List&lt;AdditionalInformationsEnum&gt;
Name | Value
---- | -----
ODT_WITH_ZONE | &quot;ODT_WITH_ZONE&quot;
ODT_WITH_STOP_POINT | &quot;ODT_WITH_STOP_POINT&quot;
ODT_WITH_STOP_TIME | &quot;ODT_WITH_STOP_TIME&quot;
HAS_DATETIME_ESTIMATED | &quot;HAS_DATETIME_ESTIMATED&quot;
REGULAR | &quot;REGULAR&quot;
STAY_IN | &quot;STAY_IN&quot;



