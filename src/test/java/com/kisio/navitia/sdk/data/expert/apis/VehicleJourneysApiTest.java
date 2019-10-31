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

import com.kisio.navitia.sdk.data.expert.BuildConfig;
import com.kisio.navitia.sdk.data.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.data.expert.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.kisio.navitia.sdk.data.expert.models.VehicleJourneys;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleJourneysApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // VehicleJourneysApi constructor
    @Test
    public void shouldInstantiateVehicleJourneysApiGivenValidToken() throws Exception {
        VehicleJourneysApi currentApi = new VehicleJourneysApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateVehicleJourneysApiGivenValidToken() {
        VehicleJourneysApi currentApi = null;

        try {
            currentApi = new VehicleJourneysApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatUriVehicleJourneysRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageLonLatUriVehicleJourneysRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageLonLatUriVehicleJourneysRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageLonLatUriVehicleJourneysIdRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageLonLatUriVehicleJourneysIdRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageLonLatUriVehicleJourneysIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));
        requestBuilder.withId(String.valueOf("vehicle_journey:RAT:AM1DFE-1A3201_dst_1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageLonLatVehicleJourneysRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageLonLatVehicleJourneysRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageLonLatVehicleJourneysRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageLonLatVehicleJourneysIdRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageLonLatVehicleJourneysIdRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageLonLatVehicleJourneysIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("vehicle_journey:RAT:AM1DFE-1A3201_dst_1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageRegionUriVehicleJourneysRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageRegionUriVehicleJourneysRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageRegionUriVehicleJourneysRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageRegionUriVehicleJourneysIdRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageRegionUriVehicleJourneysIdRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageRegionUriVehicleJourneysIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));
        requestBuilder.withId(String.valueOf("vehicle_journey:RAT:AM1DFE-1A3201_dst_1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageRegionVehicleJourneysRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageRegionVehicleJourneysRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageRegionVehicleJourneysRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void CoverageRegionVehicleJourneysIdRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.CoverageRegionVehicleJourneysIdRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newCoverageRegionVehicleJourneysIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withId(String.valueOf("vehicle_journey:RAT:AM1DFE-1A3201_dst_1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
    @Test
    public void VehicleJourneysRequestBuilder_get_Test() throws Exception {
        VehicleJourneysApi.VehicleJourneysRequestBuilder requestBuilder = new VehicleJourneysApi(testToken).newVehicleJourneysRequestBuilder();

        // Test case parameters
        requestBuilder.withExternalCode(String.valueOf("105282330-1"));

        final VehicleJourneys[] asyncResult = new VehicleJourneys[1];
        requestBuilder.get(new ApiCallback<VehicleJourneys>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(VehicleJourneys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getVehicleJourneys().size() > 0);
        assertNotNull(asyncResult[0].getVehicleJourneys().get(0));
    }
    
}
