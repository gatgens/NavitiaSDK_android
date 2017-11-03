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


package org.kisio.NavitiaSDK.apis;

import org.kisio.NavitiaSDK.invokers.ApiCallback;
import org.kisio.NavitiaSDK.invokers.ApiClient;
import org.kisio.NavitiaSDK.invokers.ApiException;
import org.kisio.NavitiaSDK.invokers.ApiResponse;
import org.kisio.NavitiaSDK.invokers.Configuration;
import org.kisio.NavitiaSDK.invokers.Pair;
import org.kisio.NavitiaSDK.invokers.ProgressRequestBody;
import org.kisio.NavitiaSDK.invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.kisio.NavitiaSDK.models.TrafficReports;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficReportApi {
    private ApiClient apiClient;

    public TrafficReportApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoverageRegionTrafficReports
     * @param region  The region you want to query (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageRegionTrafficReportsCall(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{region}/traffic_reports"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (depth != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth", depth));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
        if (startPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_page", startPage));
        if (forbiddenId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forbidden_id[]", forbiddenId));
        if (forbiddenUris != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forbidden_uris[]", forbiddenUris));
        if (distance != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "distance", distance));
        if (disableGeojson != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            ""
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
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
    private com.squareup.okhttp.Call getCoverageRegionTrafficReportsValidateBeforeCall(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegionTrafficReports(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageRegionTrafficReportsCall(region, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @return TrafficReports
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected TrafficReports getCoverageRegionTrafficReports(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson) throws ApiException {
        ApiResponse<TrafficReports> resp = getCoverageRegionTrafficReportsWithHttpInfo(region, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @return ApiResponse&lt;TrafficReports&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TrafficReports> getCoverageRegionTrafficReportsWithHttpInfo(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageRegionTrafficReportsValidateBeforeCall(region, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<TrafficReports>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionTrafficReportsAsync(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ApiCallback<TrafficReports> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionTrafficReportsValidateBeforeCall(region, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrafficReports>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionTrafficReportsAsyncRaw(String region, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionTrafficReportsValidateBeforeCall(region, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionTrafficReportsRequestBuilder newCoverageRegionTrafficReportsRequestBuilder() {
        return new CoverageRegionTrafficReportsRequestBuilder(this);
    }

    public class CoverageRegionTrafficReportsRequestBuilder {
        private TrafficReportApi currentApi;
        private String region;
        private Integer depth;
        private Integer count;
        private Integer startPage;
        private List<String> forbiddenId;
        private List<String> forbiddenUris;
        private Integer distance;
        private Boolean disableGeojson;

        public CoverageRegionTrafficReportsRequestBuilder(TrafficReportApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionTrafficReportsRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withCount(Integer count) {
            this.count = count;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withStartPage(Integer startPage) {
            this.startPage = startPage;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withForbiddenId(List<String> forbiddenId) {
            this.forbiddenId = forbiddenId;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withForbiddenUris(List<String> forbiddenUris) {
            this.forbiddenUris = forbiddenUris;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public CoverageRegionTrafficReportsRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<TrafficReports > callback) throws ApiException {
            return currentApi.getCoverageRegionTrafficReportsAsync(this.region, this.depth, this.count, this.startPage, this.forbiddenId, this.forbiddenUris, this.distance, this.disableGeojson, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionTrafficReportsAsyncRaw(this.region, this.depth, this.count, this.startPage, this.forbiddenId, this.forbiddenUris, this.distance, this.disableGeojson, callback);
        }
    }
    /**
     * Build call for getCoverageRegionUriTrafficReports
     * @param region  The region you want to query (required)
     * @param uri First part of the uri (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageRegionUriTrafficReportsCall(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{region}/{uri}/traffic_reports"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()))
            .replaceAll("\\{" + "uri" + "\\}", apiClient.escapePathParam(uri.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (depth != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth", depth));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
        if (startPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_page", startPage));
        if (forbiddenId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forbidden_id[]", forbiddenId));
        if (forbiddenUris != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forbidden_uris[]", forbiddenUris));
        if (distance != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "distance", distance));
        if (disableGeojson != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            ""
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
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
    private com.squareup.okhttp.Call getCoverageRegionUriTrafficReportsValidateBeforeCall(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegionUriTrafficReports(Async)");
        }
        
        // verify the required parameter 'uri' is set
        if (uri == null) {
            throw new ApiException("Missing the required parameter 'uri' when calling getCoverageRegionUriTrafficReports(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageRegionUriTrafficReportsCall(region, uri, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param uri First part of the uri (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @return TrafficReports
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected TrafficReports getCoverageRegionUriTrafficReports(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson) throws ApiException {
        ApiResponse<TrafficReports> resp = getCoverageRegionUriTrafficReportsWithHttpInfo(region, uri, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param uri First part of the uri (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @return ApiResponse&lt;TrafficReports&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<TrafficReports> getCoverageRegionUriTrafficReportsWithHttpInfo(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageRegionUriTrafficReportsValidateBeforeCall(region, uri, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<TrafficReports>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param uri First part of the uri (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionUriTrafficReportsAsync(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ApiCallback<TrafficReports> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionUriTrafficReportsValidateBeforeCall(region, uri, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrafficReports>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param uri First part of the uri (required)
     * @param depth The depth of your object (optional, default to 1)
     * @param count Number of objects per page (optional, default to 10)
     * @param startPage The current page (optional)
     * @param forbiddenId DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; (optional)
     * @param forbiddenUris forbidden uris (optional)
     * @param distance Distance range of the query. Used only if a coord is in the query (optional, default to 200)
     * @param disableGeojson remove geojson from the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionUriTrafficReportsAsyncRaw(String region, String uri, Integer depth, Integer count, Integer startPage, List<String> forbiddenId, List<String> forbiddenUris, Integer distance, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionUriTrafficReportsValidateBeforeCall(region, uri, depth, count, startPage, forbiddenId, forbiddenUris, distance, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionUriTrafficReportsRequestBuilder newCoverageRegionUriTrafficReportsRequestBuilder() {
        return new CoverageRegionUriTrafficReportsRequestBuilder(this);
    }

    public class CoverageRegionUriTrafficReportsRequestBuilder {
        private TrafficReportApi currentApi;
        private String region;
        private String uri;
        private Integer depth;
        private Integer count;
        private Integer startPage;
        private List<String> forbiddenId;
        private List<String> forbiddenUris;
        private Integer distance;
        private Boolean disableGeojson;

        public CoverageRegionUriTrafficReportsRequestBuilder(TrafficReportApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionUriTrafficReportsRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withUri(String uri) {
            this.uri = uri;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withCount(Integer count) {
            this.count = count;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withStartPage(Integer startPage) {
            this.startPage = startPage;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withForbiddenId(List<String> forbiddenId) {
            this.forbiddenId = forbiddenId;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withForbiddenUris(List<String> forbiddenUris) {
            this.forbiddenUris = forbiddenUris;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public CoverageRegionUriTrafficReportsRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<TrafficReports > callback) throws ApiException {
            return currentApi.getCoverageRegionUriTrafficReportsAsync(this.region, this.uri, this.depth, this.count, this.startPage, this.forbiddenId, this.forbiddenUris, this.distance, this.disableGeojson, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionUriTrafficReportsAsyncRaw(this.region, this.uri, this.depth, this.count, this.startPage, this.forbiddenId, this.forbiddenUris, this.distance, this.disableGeojson, callback);
        }
    }
}
