# PlaceUriApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatPlacesId**](PlaceUriApi.md#getCoverageLonLatPlacesId) | **GET** /coverage/{lon};{lat}/places/{id} | 
[**getCoverageRegionPlacesId**](PlaceUriApi.md#getCoverageRegionPlacesId) | **GET** /coverage/{region}/places/{id} | 
[**getPlacesId**](PlaceUriApi.md#getPlacesId) | **GET** /places/{id} | 


<a name="getCoverageLonLatPlacesId"></a>
# **getCoverageLonLatPlacesId**
> Places getCoverageLonLatPlacesId(lat, lon, id, realTime, addPoiInfos, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.PlaceUriApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlaceUriApi apiInstance = new PlaceUriApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
String id = "id_example"; // String | Id of the object you want to query
Boolean realTime = True; // Boolean | Show bss stands availability
List<String> addPoiInfos = Arrays.asList("[u'bss_stands', u'car_park']"); // List<String> | Show more information about the poi if it's available, for instance, show BSS/car park availability in the pois(BSS/car park) of response
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Places result = apiInstance.getCoverageLonLatPlacesId(lat, lon, id, realTime, addPoiInfos, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceUriApi#getCoverageLonLatPlacesId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **id** | **String**| Id of the object you want to query |
 **realTime** | **Boolean**| Show bss stands availability | [optional] [default to True]
 **addPoiInfos** | [**List&lt;String&gt;**](String.md)| Show more information about the poi if it&#39;s available, for instance, show BSS/car park availability in the pois(BSS/car park) of response | [optional] [default to [u&#39;bss_stands&#39;, u&#39;car_park&#39;]] [enum: bss_stands, car_park, ]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Places**](Places.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionPlacesId"></a>
# **getCoverageRegionPlacesId**
> Places getCoverageRegionPlacesId(region, id, realTime, addPoiInfos, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.PlaceUriApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlaceUriApi apiInstance = new PlaceUriApi();
String region = "region_example"; // String |  The region you want to query
String id = "id_example"; // String | Id of the object you want to query
Boolean realTime = True; // Boolean | Show bss stands availability
List<String> addPoiInfos = Arrays.asList("[u'bss_stands', u'car_park']"); // List<String> | Show more information about the poi if it's available, for instance, show BSS/car park availability in the pois(BSS/car park) of response
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Places result = apiInstance.getCoverageRegionPlacesId(region, id, realTime, addPoiInfos, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceUriApi#getCoverageRegionPlacesId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **id** | **String**| Id of the object you want to query |
 **realTime** | **Boolean**| Show bss stands availability | [optional] [default to True]
 **addPoiInfos** | [**List&lt;String&gt;**](String.md)| Show more information about the poi if it&#39;s available, for instance, show BSS/car park availability in the pois(BSS/car park) of response | [optional] [default to [u&#39;bss_stands&#39;, u&#39;car_park&#39;]] [enum: bss_stands, car_park, ]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Places**](Places.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getPlacesId"></a>
# **getPlacesId**
> Places getPlacesId(id, realTime, addPoiInfos, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.PlaceUriApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlaceUriApi apiInstance = new PlaceUriApi();
String id = "id_example"; // String | Id of the object you want to query
Boolean realTime = True; // Boolean | Show bss stands availability
List<String> addPoiInfos = Arrays.asList("[u'bss_stands', u'car_park']"); // List<String> | Show more information about the poi if it's available, for instance, show BSS/car park availability in the pois(BSS/car park) of response
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Places result = apiInstance.getPlacesId(id, realTime, addPoiInfos, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceUriApi#getPlacesId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the object you want to query |
 **realTime** | **Boolean**| Show bss stands availability | [optional] [default to True]
 **addPoiInfos** | [**List&lt;String&gt;**](String.md)| Show more information about the poi if it&#39;s available, for instance, show BSS/car park availability in the pois(BSS/car park) of response | [optional] [default to [u&#39;bss_stands&#39;, u&#39;car_park&#39;]] [enum: bss_stands, car_park, ]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Places**](Places.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

