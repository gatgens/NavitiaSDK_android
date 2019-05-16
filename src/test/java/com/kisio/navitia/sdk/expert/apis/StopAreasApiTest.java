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
import com.kisio.navitia.sdk.expert.models.StopAreas;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopAreasApiTest {
    private final String testToken = "fc4b8d9e-ca2e-487f-9c04-c81fc9d2a781";

    // StopAreasApi constructor
    @Test
    public void shouldInstantiateStopAreasApiGivenValidToken() throws Exception {
        StopAreasApi currentApi = new StopAreasApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateStopAreasApiGivenValidToken() throws Exception {
        StopAreasApi currentApi = null;

        try {
            currentApi = new StopAreasApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
    public void CoverageLonLatStopAreasRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageLonLatStopAreasRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageLonLatStopAreasRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageLonLatStopAreasIdRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageLonLatStopAreasIdRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageLonLatStopAreasIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("stop_area:JDR:SA:GareMontparnasse"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageLonLatUriStopAreasRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageLonLatUriStopAreasRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageLonLatUriStopAreasRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageLonLatUriStopAreasIdRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageLonLatUriStopAreasIdRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageLonLatUriStopAreasIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
        requestBuilder.withId(String.valueOf("stop_area:JDR:SA:GareMontparnasse"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageRegionStopAreasRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageRegionStopAreasRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageRegionStopAreasRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageRegionStopAreasIdRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageRegionStopAreasIdRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageRegionStopAreasIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withId(String.valueOf("stop_area:JDR:SA:GareMontparnasse"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageRegionUriStopAreasRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageRegionUriStopAreasRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageRegionUriStopAreasRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void CoverageRegionUriStopAreasIdRequestBuilder_get_Test() throws Exception {
        StopAreasApi.CoverageRegionUriStopAreasIdRequestBuilder requestBuilder = new StopAreasApi(testToken).newCoverageRegionUriStopAreasIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("jdr"));
        requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
        requestBuilder.withId(String.valueOf("stop_area:JDR:SA:GareMontparnasse"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
        @Test
    public void StopAreasRequestBuilder_get_Test() throws Exception {
        StopAreasApi.StopAreasRequestBuilder requestBuilder = new StopAreasApi(testToken).newStopAreasRequestBuilder();

        // Test case parameters
        requestBuilder.withExternalCode(String.valueOf("JDRGareMontparnasse"));

        final StopAreas[] asyncResult = new StopAreas[1];
        requestBuilder.get(new ApiCallback<StopAreas>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(StopAreas result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getStopAreas().size() > 0);
        assertNotNull(asyncResult[0].getStopAreas().get(0));
    }
    
}
