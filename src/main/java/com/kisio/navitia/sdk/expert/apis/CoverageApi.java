/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2-3-g25474e0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.apis;

import com.kisio.navitia.sdk.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.expert.invokers.ApiClient;
import com.kisio.navitia.sdk.expert.invokers.ApiException;
import com.kisio.navitia.sdk.expert.invokers.ApiResponse;
import com.kisio.navitia.sdk.expert.invokers.Configuration;
import com.kisio.navitia.sdk.expert.invokers.Pair;
import com.kisio.navitia.sdk.expert.invokers.ProgressRequestBody;
import com.kisio.navitia.sdk.expert.invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import com.kisio.navitia.sdk.expert.models.Coverages;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoverageApi {
    private final ApiClient apiClient;

    public CoverageApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoverage
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoverageCall(String basePath, String debugUrl, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coverage/";

        List<Pair> localVarQueryParams = new ArrayList<>();

        if (basePath != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "basePath", basePath));
        }
        if (debugUrl != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "debugUrl", debugUrl));
        }
        if (disableGeojson != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private okhttp3.Call getCoverageValidateBeforeCall(String basePath, String debugUrl, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getCoverageCall(basePath, debugUrl, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverage(String basePath, String debugUrl, Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageWithHttpInfo(basePath, debugUrl, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageWithHttpInfo(String basePath, String debugUrl, Boolean disableGeojson) throws ApiException {
        okhttp3.Call call = getCoverageValidateBeforeCall(basePath, debugUrl, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageAsync(String basePath, String debugUrl, Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageValidateBeforeCall(basePath, debugUrl, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageAsyncRaw(String basePath, String debugUrl, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageValidateBeforeCall(basePath, debugUrl, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRequestBuilder newCoverageRequestBuilder() {
        return new CoverageRequestBuilder(this);
    }

    public class CoverageRequestBuilder {
        private CoverageApi currentApi;
        private String basePath;
        private String debugUrl;
        private Boolean disableGeojson;

        public CoverageRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoverageRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoverageRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageAsync(basePath, debugUrl, this.disableGeojson, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageAsyncRaw(basePath, debugUrl, this.disableGeojson, callback);
        }
    }
    /**
     * Build call for getCoverageLonLat
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoverageLonLatCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coverage/{lon};{lat}/"
            .replaceAll("\\{" + "lat" + "\\}", apiClient.escapePathParam(lat.toString()))
            .replaceAll("\\{" + "lon" + "\\}", apiClient.escapePathParam(lon.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();

        if (basePath != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "basePath", basePath));
        }
        if (debugUrl != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "debugUrl", debugUrl));
        }
        if (disableGeojson != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private okhttp3.Call getCoverageLonLatValidateBeforeCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoverageLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoverageLonLat(Async)");
        }
        

        okhttp3.Call call = getCoverageLonLatCall(basePath, debugUrl, lat, lon, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverageLonLat(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageLonLatWithHttpInfo(basePath, debugUrl, lat, lon, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageLonLatWithHttpInfo(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson) throws ApiException {
        okhttp3.Call call = getCoverageLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageLonLatAsync(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
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
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageLonLatAsyncRaw(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageLonLatRequestBuilder newCoverageLonLatRequestBuilder() {
        return new CoverageLonLatRequestBuilder(this);
    }

    public class CoverageLonLatRequestBuilder {
        private CoverageApi currentApi;
        private String basePath;
        private String debugUrl;
        private BigDecimal lat;
        private BigDecimal lon;
        private Boolean disableGeojson;

        public CoverageLonLatRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageLonLatRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoverageLonLatRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoverageLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoverageLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }
        public CoverageLonLatRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageLonLatAsync(basePath, debugUrl, this.lat, this.lon, this.disableGeojson, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageLonLatAsyncRaw(basePath, debugUrl, this.lat, this.lon, this.disableGeojson, callback);
        }
    }
    /**
     * Build call for getCoverageRegion
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoverageRegionCall(String basePath, String debugUrl, String region, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coverage/{region}/"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();

        if (basePath != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "basePath", basePath));
        }
        if (debugUrl != null) {
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "debugUrl", debugUrl));
        }
        if (disableGeojson != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private okhttp3.Call getCoverageRegionValidateBeforeCall(String basePath, String debugUrl, String region, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegion(Async)");
        }
        

        okhttp3.Call call = getCoverageRegionCall(basePath, debugUrl, region, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverageRegion(String basePath, String debugUrl, String region, Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageRegionWithHttpInfo(basePath, debugUrl, region, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageRegionWithHttpInfo(String basePath, String debugUrl, String region, Boolean disableGeojson) throws ApiException {
        okhttp3.Call call = getCoverageRegionValidateBeforeCall(basePath, debugUrl, region, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageRegionAsync(String basePath, String debugUrl, String region, Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageRegionValidateBeforeCall(basePath, debugUrl, region, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected okhttp3.Call getCoverageRegionAsyncRaw(String basePath, String debugUrl, String region, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        okhttp3.Call call = getCoverageRegionValidateBeforeCall(basePath, debugUrl, region, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionRequestBuilder newCoverageRegionRequestBuilder() {
        return new CoverageRegionRequestBuilder(this);
    }

    public class CoverageRegionRequestBuilder {
        private CoverageApi currentApi;
        private String basePath;
        private String debugUrl;
        private String region;
        private Boolean disableGeojson;

        public CoverageRegionRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoverageRegionRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoverageRegionRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }
        public CoverageRegionRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageRegionAsync(basePath, debugUrl, this.region, this.disableGeojson, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionAsyncRaw(basePath, debugUrl, this.region, this.disableGeojson, callback);
        }
    }
}
