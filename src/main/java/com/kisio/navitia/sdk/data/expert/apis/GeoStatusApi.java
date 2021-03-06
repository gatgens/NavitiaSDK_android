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


package com.kisio.navitia.sdk.data.expert.apis;

import com.kisio.navitia.sdk.data.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.data.expert.invokers.ApiClient;
import com.kisio.navitia.sdk.data.expert.invokers.ApiException;
import com.kisio.navitia.sdk.data.expert.invokers.ApiResponse;
import com.kisio.navitia.sdk.data.expert.invokers.Configuration;
import com.kisio.navitia.sdk.data.expert.invokers.Pair;
import com.kisio.navitia.sdk.data.expert.invokers.ProgressRequestBody;
import com.kisio.navitia.sdk.data.expert.invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import com.kisio.navitia.sdk.data.expert.models.GeoStatus1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoStatusApi {
    private final ApiClient apiClient;

    public GeoStatusApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoverageLonLatGeoStatus
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoverageLonLatGeoStatusCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coverage/{lon};{lat}/_geo_status"
            .replaceAll("\\{" + "lat" + "\\}", apiClient.escapePathParam(lat.toString()))
            .replaceAll("\\{" + "lon" + "\\}", apiClient.escapePathParam(lon.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();

        if (basePath != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "basePath", basePath));
        }
        if (debugUrl != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "debugUrl", debugUrl));
        }

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCoverageLonLatGeoStatusValidateBeforeCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoverageLonLatGeoStatus(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoverageLonLatGeoStatus(Async)");
        }
        

        okhttp3.Call call = getCoverageLonLatGeoStatusCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return GeoStatus1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected GeoStatus1 getCoverageLonLatGeoStatus(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<GeoStatus1> resp = getCoverageLonLatGeoStatusWithHttpInfo(basePath, debugUrl, lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;GeoStatus1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<GeoStatus1> getCoverageLonLatGeoStatusWithHttpInfo(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        okhttp3.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(basePath, debugUrl, lat, lon, null, null);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageLonLatGeoStatusAsync(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<GeoStatus1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageLonLatGeoStatusAsyncRaw(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageLonLatGeoStatusRequestBuilder newCoverageLonLatGeoStatusRequestBuilder() {
        return new CoverageLonLatGeoStatusRequestBuilder(this);
    }

    public class CoverageLonLatGeoStatusRequestBuilder {
        private GeoStatusApi currentApi;
        private String basePath;
        private String debugUrl;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoverageLonLatGeoStatusRequestBuilder(GeoStatusApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageLonLatGeoStatusRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoverageLonLatGeoStatusRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoverageLonLatGeoStatusRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoverageLonLatGeoStatusRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<GeoStatus1 > callback) throws ApiException {
            return currentApi.getCoverageLonLatGeoStatusAsync(basePath, debugUrl, this.lat, this.lon, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageLonLatGeoStatusAsyncRaw(basePath, debugUrl, this.lat, this.lon, callback);
        }
    }
    /**
     * Build call for getCoverageRegionGeoStatus
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoverageRegionGeoStatusCall(String basePath, String debugUrl, String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coverage/{region}/_geo_status"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();

        if (basePath != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "basePath", basePath));
        }
        if (debugUrl != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "debugUrl", debugUrl));
        }

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCoverageRegionGeoStatusValidateBeforeCall(String basePath, String debugUrl, String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegionGeoStatus(Async)");
        }
        

        okhttp3.Call call = getCoverageRegionGeoStatusCall(basePath, debugUrl, region, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @return GeoStatus1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected GeoStatus1 getCoverageRegionGeoStatus(String basePath, String debugUrl, String region) throws ApiException {
        ApiResponse<GeoStatus1> resp = getCoverageRegionGeoStatusWithHttpInfo(basePath, debugUrl, region);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @return ApiResponse&lt;GeoStatus1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<GeoStatus1> getCoverageRegionGeoStatusWithHttpInfo(String basePath, String debugUrl, String region) throws ApiException {
        okhttp3.Call call = getCoverageRegionGeoStatusValidateBeforeCall(basePath, debugUrl, region, null, null);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageRegionGeoStatusAsync(String basePath, String debugUrl, String region, final ApiCallback<GeoStatus1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageRegionGeoStatusValidateBeforeCall(basePath, debugUrl, region, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageRegionGeoStatusAsyncRaw(String basePath, String debugUrl, String region, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageRegionGeoStatusValidateBeforeCall(basePath, debugUrl, region, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionGeoStatusRequestBuilder newCoverageRegionGeoStatusRequestBuilder() {
        return new CoverageRegionGeoStatusRequestBuilder(this);
    }

    public class CoverageRegionGeoStatusRequestBuilder {
        private GeoStatusApi currentApi;
        private String basePath;
        private String debugUrl;
        private String region;

        public CoverageRegionGeoStatusRequestBuilder(GeoStatusApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionGeoStatusRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoverageRegionGeoStatusRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoverageRegionGeoStatusRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<GeoStatus1 > callback) throws ApiException {
            return currentApi.getCoverageRegionGeoStatusAsync(basePath, debugUrl, this.region, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionGeoStatusAsyncRaw(basePath, debugUrl, this.region, callback);
        }
    }
}
