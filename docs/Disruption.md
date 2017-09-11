
# Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruptionId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**severity** | [**Severity**](Severity.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  | 
**applicationPeriods** | [**List&lt;Period&gt;**](Period.md) |  |  [optional]
**impactId** | **String** |  |  [optional]
**messages** | [**List&lt;Message&gt;**](Message.md) |  |  [optional]
**updatedAt** | **String** |  |  [optional]
**uri** | **String** |  |  [optional]
**impactedObjects** | [**List&lt;Impacted&gt;**](Impacted.md) |  |  [optional]
**id** | **String** |  |  [optional]
**contributor** | **String** |  | 
**category** | **String** |  |  [optional]
**cause** | **String** |  | 
**disruptionUri** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PAST | &quot;past&quot;
ACTIVE | &quot;active&quot;
FUTURE | &quot;future&quot;



