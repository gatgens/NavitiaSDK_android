/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.apis;

import com.kisio.navitia.sdk.expert.BuildConfig;
import com.kisio.navitia.sdk.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.expert.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.kisio.navitia.sdk.expert.models.Trips;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripsApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // TripsApi constructor
    @Test
    public void shouldInstantiateTripsApiGivenValidToken() throws Exception {
        TripsApi currentApi = new TripsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateTripsApiGivenValidToken() {
        TripsApi currentApi = null;

        try {
            currentApi = new TripsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatTripsRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageLonLatTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatTripsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageLonLatTripsIdRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageLonLatTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatTripsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("RAT:AM1DFE-1A3201"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageLonLatUriTripsRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageLonLatUriTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatUriTripsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageLonLatUriTripsIdRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageLonLatUriTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatUriTripsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));
        requestBuilder.withId(String.valueOf("RAT:AM1DFE-1A3201"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageRegionTripsRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageRegionTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionTripsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("fr-idf"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageRegionTripsIdRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageRegionTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionTripsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("fr-idf"));
        requestBuilder.withId(String.valueOf("OIF:99183664-1_139226-1"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageRegionUriTripsRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageRegionUriTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionUriTripsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("fr-idf"));
        requestBuilder.withUri(String.valueOf("lines/line:OIF:101261020:1OIF369"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
    @Test
    public void CoverageRegionUriTripsIdRequestBuilder_get_Test() throws Exception {
        TripsApi.CoverageRegionUriTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionUriTripsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("fr-idf"));
        requestBuilder.withUri(String.valueOf("lines/line:OIF:101261020:1OIF369"));
        requestBuilder.withId(String.valueOf("OIF:99183664-1_139226-1"));

        final Trips[] asyncResult = new Trips[1];
        requestBuilder.get(new ApiCallback<Trips>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getTrips().size() > 0);
        assertNotNull(asyncResult[0].getTrips().get(0));
    }
    
}
