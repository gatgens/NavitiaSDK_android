# StatusApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageRegionStatus**](StatusApi.md#getCoverageRegionStatus) | **GET** /coverage/{region}/status | 


<a name="getCoverageRegionStatus"></a>
# **getCoverageRegionStatus**
> Status1 getCoverageRegionStatus(region)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.StatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatusApi apiInstance = new StatusApi();
String region = "region_example"; // String |  The region you want to query
try {
    Status1 result = apiInstance.getCoverageRegionStatus(region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getCoverageRegionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |

### Return type

[**Status1**](Status1.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

