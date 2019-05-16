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


package com.kisio.navitia.sdk.expert.apis;

import com.kisio.navitia.sdk.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.expert.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.kisio.navitia.sdk.expert.models.StopPoints;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopPointsApiTest {
    private final String testToken = "fc4b8d9e-ca2e-487f-9c04-c81fc9d2a781";

    // StopPointsApi constructor
    @Test
    public void shouldInstantiateStopPointsApiGivenValidToken() throws Exception {
        StopPointsApi currentApi = new StopPointsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateStopPointsApiGivenValidToken() throws Exception {
        StopPointsApi currentApi = null;

        try {
            currentApi = new StopPointsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
    public void CoverageLonLatStopPointsRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageLonLatStopPointsRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageLonLatStopPointsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageLonLatStopPointsIdRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageLonLatStopPointsIdRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageLonLatStopPointsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("stop_point:JDR:SP:GareMontparnasse-TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageLonLatUriStopPointsRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageLonLatUriStopPointsRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageLonLatUriStopPointsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageLonLatUriStopPointsIdRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageLonLatUriStopPointsIdRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageLonLatUriStopPointsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
        requestBuilder.withId(String.valueOf("stop_point:JDR:SP:GareMontparnasse-TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageRegionStopPointsRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageRegionStopPointsRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageRegionStopPointsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageRegionStopPointsIdRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageRegionStopPointsIdRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageRegionStopPointsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withId(String.valueOf("stop_point:JDR:SP:GareMontparnasse-TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageRegionUriStopPointsRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageRegionUriStopPointsRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageRegionUriStopPointsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void CoverageRegionUriStopPointsIdRequestBuilder_get_Test() throws Exception {
        StopPointsApi.CoverageRegionUriStopPointsIdRequestBuilder requestBuilder = new StopPointsApi(testToken).newCoverageRegionUriStopPointsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
        requestBuilder.withId(String.valueOf("stop_point:JDR:SP:GareMontparnasse-TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
        @Test
    public void StopPointsRequestBuilder_get_Test() throws Exception {
        StopPointsApi.StopPointsRequestBuilder requestBuilder = new StopPointsApi(testToken).newStopPointsRequestBuilder();

        // Test case parameters
        requestBuilder.withExternalCode(String.valueOf("JDRGareMontparnasse-TGV"));

        final StopPoints[] asyncResult = new StopPoints[1];
        requestBuilder.get(new ApiCallback<StopPoints>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopPoints().size() > 0);
        assertNotNull(asyncResult[0].getStopPoints().get(0));
    }
    
}
