/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.82.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.data.expert.apis;

import com.kisio.navitia.sdk.data.expert.BuildConfig;
import com.kisio.navitia.sdk.data.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.data.expert.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.kisio.navitia.sdk.data.expert.models.Pois;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoisApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // PoisApi constructor
    @Test
    public void shouldInstantiatePoisApiGivenValidToken() throws Exception {
        PoisApi currentApi = new PoisApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiatePoisApiGivenValidToken() {
        PoisApi currentApi = null;

        try {
            currentApi = new PoisApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatPoisRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageLonLatPoisRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageLonLatPoisRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageLonLatPoisIdRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageLonLatPoisIdRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageLonLatPoisIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("poi:osm:node:295494073"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageLonLatUriPoisRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageLonLatUriPoisRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageLonLatUriPoisRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("poi_types/poi_type:amenity:college"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageLonLatUriPoisIdRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageLonLatUriPoisIdRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageLonLatUriPoisIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("poi_types/poi_type:amenity:college"));
        requestBuilder.withId(String.valueOf("poi:osm:node:295494073"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageRegionPoisRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageRegionPoisRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageRegionPoisRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageRegionPoisIdRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageRegionPoisIdRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageRegionPoisIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withId(String.valueOf("poi:osm:node:295494073"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageRegionUriPoisRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageRegionUriPoisRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageRegionUriPoisRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("poi_types/poi_type:amenity:college"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
    @Test
    public void CoverageRegionUriPoisIdRequestBuilder_get_Test() throws Exception {
        PoisApi.CoverageRegionUriPoisIdRequestBuilder requestBuilder = new PoisApi(testToken).newCoverageRegionUriPoisIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("poi_types/poi_type:amenity:college"));
        requestBuilder.withId(String.valueOf("poi:osm:node:295494073"));

        final Pois[] asyncResult = new Pois[1];
        requestBuilder.get(new ApiCallback<Pois>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Pois result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getPois().size() > 0);
        assertNotNull(asyncResult[0].getPois().get(0));
    }
    
}
