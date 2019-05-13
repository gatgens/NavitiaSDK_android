/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.78.0
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


import java.math.BigDecimal;
import org.kisio.NavitiaSDK.models.DictAddresses;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordApi {
    private ApiClient apiClient;

    public CoordApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoordLonLat
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoordLonLatCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coord/{lon};{lat}/"
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
    private okhttp3.Call getCoordLonLatValidateBeforeCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoordLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoordLonLat(Async)");
        }
        

        okhttp3.Call call = getCoordLonLatCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return DictAddresses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected DictAddresses getCoordLonLat(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<DictAddresses> resp = getCoordLonLatWithHttpInfo(basePath, debugUrl, lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;DictAddresses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DictAddresses> getCoordLonLatWithHttpInfo(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        okhttp3.Call call = getCoordLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, null, null);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected okhttp3.Call getCoordLonLatAsync(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<DictAddresses> callback) throws ApiException {

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

        okhttp3.Call call = getCoordLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected okhttp3.Call getCoordLonLatAsyncRaw(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

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

        okhttp3.Call call = getCoordLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoordLonLatRequestBuilder newCoordLonLatRequestBuilder() {
        return new CoordLonLatRequestBuilder(this);
    }

    public class CoordLonLatRequestBuilder {
        private CoordApi currentApi;
        private String basePath;
        private String debugUrl;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoordLonLatRequestBuilder(CoordApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoordLonLatRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoordLonLatRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoordLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoordLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<DictAddresses > callback) throws ApiException {
            return currentApi.getCoordLonLatAsync(basePath, debugUrl, this.lat, this.lon, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoordLonLatAsyncRaw(basePath, debugUrl, this.lat, this.lon, callback);
        }
    }
    /**
     * Build call for getCoordsLonLat
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private okhttp3.Call getCoordsLonLatCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables CC
        String localVarPath = "/coords/{lon};{lat}/"
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
    private okhttp3.Call getCoordsLonLatValidateBeforeCall(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoordsLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoordsLonLat(Async)");
        }
        

        okhttp3.Call call = getCoordsLonLatCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return DictAddresses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected DictAddresses getCoordsLonLat(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<DictAddresses> resp = getCoordsLonLatWithHttpInfo(basePath, debugUrl, lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param basePath The API base path (optional)
     * @param debugUrl The API Debug url (optional)
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;DictAddresses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DictAddresses> getCoordsLonLatWithHttpInfo(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon) throws ApiException {
        okhttp3.Call call = getCoordsLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, null, null);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected okhttp3.Call getCoordsLonLatAsync(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<DictAddresses> callback) throws ApiException {

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

        okhttp3.Call call = getCoordsLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected okhttp3.Call getCoordsLonLatAsyncRaw(String basePath, String debugUrl, BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

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

        okhttp3.Call call = getCoordsLonLatValidateBeforeCall(basePath, debugUrl, lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoordsLonLatRequestBuilder newCoordsLonLatRequestBuilder() {
        return new CoordsLonLatRequestBuilder(this);
    }

    public class CoordsLonLatRequestBuilder {
        private CoordApi currentApi;
        private String basePath;
        private String debugUrl;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoordsLonLatRequestBuilder(CoordApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoordsLonLatRequestBuilder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public CoordsLonLatRequestBuilder withDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }

        public CoordsLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoordsLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public okhttp3.Call get(final ApiCallback<DictAddresses > callback) throws ApiException {
            return currentApi.getCoordsLonLatAsync(basePath, debugUrl, this.lat, this.lon, callback);
        }

        public okhttp3.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoordsLonLatAsyncRaw(basePath, debugUrl, this.lat, this.lon, callback);
        }
    }
}
