# GeoStatusApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageRegionGeoStatus**](GeoStatusApi.md#getCoverageRegionGeoStatus) | **GET** /coverage/{region}/_geo_status | 


<a name="getCoverageRegionGeoStatus"></a>
# **getCoverageRegionGeoStatus**
> GeoStatus1 getCoverageRegionGeoStatus(region)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.GeoStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GeoStatusApi apiInstance = new GeoStatusApi();
String region = "region_example"; // String |  The region you want to query
try {
    GeoStatus1 result = apiInstance.getCoverageRegionGeoStatus(region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoStatusApi#getCoverageRegionGeoStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |

### Return type

[**GeoStatus1**](GeoStatus1.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

