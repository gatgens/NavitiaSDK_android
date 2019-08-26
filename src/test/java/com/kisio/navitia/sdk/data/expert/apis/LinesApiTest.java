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
import com.kisio.navitia.sdk.data.expert.models.Lines;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinesApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // LinesApi constructor
    @Test
    public void shouldInstantiateLinesApiGivenValidToken() throws Exception {
        LinesApi currentApi = new LinesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateLinesApiGivenValidToken() {
        LinesApi currentApi = null;

        try {
            currentApi = new LinesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatLinesRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageLonLatLinesRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageLonLatLinesRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageLonLatLinesIdRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageLonLatLinesIdRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageLonLatLinesIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("line:RAT:M1"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageLonLatUriLinesRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageLonLatUriLinesRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageLonLatUriLinesRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageLonLatUriLinesIdRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageLonLatUriLinesIdRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageLonLatUriLinesIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));
        requestBuilder.withId(String.valueOf("line:RAT:M1"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageRegionLinesRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageRegionLinesRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageRegionLinesRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageRegionLinesIdRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageRegionLinesIdRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageRegionLinesIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withId(String.valueOf("line:RAT:M1"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageRegionUriLinesRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageRegionUriLinesRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageRegionUriLinesRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void CoverageRegionUriLinesIdRequestBuilder_get_Test() throws Exception {
        LinesApi.CoverageRegionUriLinesIdRequestBuilder requestBuilder = new LinesApi(testToken).newCoverageRegionUriLinesIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));
        requestBuilder.withId(String.valueOf("line:RAT:M1"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
    @Test
    public void LinesRequestBuilder_get_Test() throws Exception {
        LinesApi.LinesRequestBuilder requestBuilder = new LinesApi(testToken).newLinesRequestBuilder();

        // Test case parameters
        requestBuilder.withExternalCode(String.valueOf("RATM1"));

        final Lines[] asyncResult = new Lines[1];
        requestBuilder.get(new ApiCallback<Lines>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Lines result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getLines().size() > 0);
        assertNotNull(asyncResult[0].getLines().get(0));
    }
    
}
