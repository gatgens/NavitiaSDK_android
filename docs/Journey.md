
# Journey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Status from the whole journey taking into account the most disturbing information retrieved on every object used (can be \&quot;NO_SERVICE\&quot;, \&quot;SIGNIFICANT_DELAYS\&quot;, ... | 
**fare** | [**Fare**](Fare.md) |  | 
**from** | [**Place**](Place.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  | 
**nbTransfers** | **Integer** | Number of transfers along the journey | 
**durations** | [**Durations**](Durations.md) |  |  [optional]
**arrivalDateTime** | **String** | Arrival date and time of the journey |  [optional]
**calendars** | [**List&lt;Calendar&gt;**](Calendar.md) |  |  [optional]
**departureDateTime** | **String** | Departure date and time of the journey |  [optional]
**to** | [**Place**](Place.md) |  |  [optional]
**requestedDateTime** | **String** |  |  [optional]
**co2Emission** | [**Amount**](Amount.md) |  | 
**type** | **String** | Used to qualify the journey (can be \&quot;best\&quot;, \&quot;comfort\&quot;, \&quot;non_pt_walk\&quot;, ... | 
**duration** | **Integer** | Duration of the journey (seconds) | 
**sections** | [**List&lt;Section&gt;**](Section.md) |  |  [optional]
**debug** | [**JourneyDebug**](JourneyDebug.md) |  |  [optional]



