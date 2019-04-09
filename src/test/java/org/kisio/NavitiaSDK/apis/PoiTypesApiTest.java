/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.75.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kisio.NavitiaSDK.apis;

import org.kisio.NavitiaSDK.invokers.ApiCallback;
import org.kisio.NavitiaSDK.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.kisio.NavitiaSDK.models.PoiTypes;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiTypesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // PoiTypesApi constructor
    @Test
    public void shouldInstantiatePoiTypesApiGivenValidToken() throws Exception {
        PoiTypesApi currentApi = new PoiTypesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiatePoiTypesApiGivenValidToken() throws Exception {
        PoiTypesApi currentApi = null;

        try {
            currentApi = new PoiTypesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatPoiTypesRequestBuilder_get_Test() throws Exception {
    PoiTypesApi.CoverageLonLatPoiTypesRequestBuilder requestBuilder = new PoiTypesApi(testToken).newCoverageLonLatPoiTypesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final PoiTypes[] asyncResult = new PoiTypes[1];
    requestBuilder.get(new ApiCallback<PoiTypes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PoiTypes result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPoiTypes().size() > 0);
    assertTrue(asyncResult[0].getPoiTypes().get(0) != null);
}
    
        @Test
public void CoverageLonLatPoiTypesIdRequestBuilder_get_Test() throws Exception {
    PoiTypesApi.CoverageLonLatPoiTypesIdRequestBuilder requestBuilder = new PoiTypesApi(testToken).newCoverageLonLatPoiTypesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("poi_type:college"));

    final PoiTypes[] asyncResult = new PoiTypes[1];
    requestBuilder.get(new ApiCallback<PoiTypes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PoiTypes result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPoiTypes().size() > 0);
    assertTrue(asyncResult[0].getPoiTypes().get(0) != null);
}
    
        @Test
@Ignore
public void CoverageLonLatUriPoiTypesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriPoiTypesIdRequestBuilder_get_Test() {}

    
        @Test
public void CoverageRegionPoiTypesRequestBuilder_get_Test() throws Exception {
    PoiTypesApi.CoverageRegionPoiTypesRequestBuilder requestBuilder = new PoiTypesApi(testToken).newCoverageRegionPoiTypesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final PoiTypes[] asyncResult = new PoiTypes[1];
    requestBuilder.get(new ApiCallback<PoiTypes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PoiTypes result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPoiTypes().size() > 0);
    assertTrue(asyncResult[0].getPoiTypes().get(0) != null);
}
    
        @Test
public void CoverageRegionPoiTypesIdRequestBuilder_get_Test() throws Exception {
    PoiTypesApi.CoverageRegionPoiTypesIdRequestBuilder requestBuilder = new PoiTypesApi(testToken).newCoverageRegionPoiTypesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("poi_type:college"));

    final PoiTypes[] asyncResult = new PoiTypes[1];
    requestBuilder.get(new ApiCallback<PoiTypes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PoiTypes result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPoiTypes().size() > 0);
    assertTrue(asyncResult[0].getPoiTypes().get(0) != null);
}
    
        @Test
@Ignore
public void CoverageRegionUriPoiTypesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriPoiTypesIdRequestBuilder_get_Test() {}

    
}
