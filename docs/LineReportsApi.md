# LineReportsApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageRegionLineReports**](LineReportsApi.md#getCoverageRegionLineReports) | **GET** /coverage/{region}/line_reports | 
[**getCoverageRegionUriLineReports**](LineReportsApi.md#getCoverageRegionUriLineReports) | **GET** /coverage/{region}/{uri}/line_reports | 


<a name="getCoverageRegionLineReports"></a>
# **getCoverageRegionLineReports**
> LineReports getCoverageRegionLineReports(region, depth, count, startPage, forbiddenUris, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.LineReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LineReportsApi apiInstance = new LineReportsApi();
String region = "region_example"; // String |  The region you want to query
Integer depth = 1; // Integer | The depth of your object
Integer count = 25; // Integer | Number of objects per page
Integer startPage = 56; // Integer | The current page
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    LineReports result = apiInstance.getCoverageRegionLineReports(region, depth, count, startPage, forbiddenUris, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineReportsApi#getCoverageRegionLineReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **count** | **Integer**| Number of objects per page | [optional] [default to 25]
 **startPage** | **Integer**| The current page | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**LineReports**](LineReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriLineReports"></a>
# **getCoverageRegionUriLineReports**
> LineReports getCoverageRegionUriLineReports(region, uri, depth, count, startPage, forbiddenUris, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.LineReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LineReportsApi apiInstance = new LineReportsApi();
String region = "region_example"; // String |  The region you want to query
String uri = "uri_example"; // String | First part of the uri
Integer depth = 1; // Integer | The depth of your object
Integer count = 25; // Integer | Number of objects per page
Integer startPage = 56; // Integer | The current page
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    LineReports result = apiInstance.getCoverageRegionUriLineReports(region, uri, depth, count, startPage, forbiddenUris, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineReportsApi#getCoverageRegionUriLineReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **uri** | **String**| First part of the uri |
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **count** | **Integer**| Number of objects per page | [optional] [default to 25]
 **startPage** | **Integer**| The current page | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**LineReports**](LineReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

