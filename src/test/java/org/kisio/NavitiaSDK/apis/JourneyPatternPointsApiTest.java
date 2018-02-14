/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.50.0
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
import org.kisio.NavitiaSDK.models.JourneyPatternPoints;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JourneyPatternPointsApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // JourneyPatternPointsApi constructor
    @Test
    public void shouldInstantiateJourneyPatternPointsApiGivenValidToken() throws Exception {
        JourneyPatternPointsApi currentApi = new JourneyPatternPointsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateJourneyPatternPointsApiGivenValidToken() throws Exception {
        JourneyPatternPointsApi currentApi = null;

        try {
            currentApi = new JourneyPatternPointsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatJourneyPatternPointsRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageLonLatJourneyPatternPointsRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageLonLatJourneyPatternPointsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
public void CoverageLonLatJourneyPatternPointsIdRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageLonLatJourneyPatternPointsIdRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageLonLatJourneyPatternPointsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("journey_pattern_point:0"));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriJourneyPatternPointsRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageLonLatUriJourneyPatternPointsRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageLonLatUriJourneyPatternPointsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
@Ignore
public void CoverageLonLatUriJourneyPatternPointsIdRequestBuilder_get_Test() {}

    
        @Test
public void CoverageRegionJourneyPatternPointsRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageRegionJourneyPatternPointsRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageRegionJourneyPatternPointsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
public void CoverageRegionJourneyPatternPointsIdRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageRegionJourneyPatternPointsIdRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageRegionJourneyPatternPointsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("journey_pattern_point:0"));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
public void CoverageRegionUriJourneyPatternPointsRequestBuilder_get_Test() throws Exception {
    JourneyPatternPointsApi.CoverageRegionUriJourneyPatternPointsRequestBuilder requestBuilder = new JourneyPatternPointsApi(testToken).newCoverageRegionUriJourneyPatternPointsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final JourneyPatternPoints[] asyncResult = new JourneyPatternPoints[1];
    requestBuilder.get(new ApiCallback<JourneyPatternPoints>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(JourneyPatternPoints result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneyPatternPoints().size() > 0);
    assertTrue(asyncResult[0].getJourneyPatternPoints().get(0) != null);
}
    
        @Test
@Ignore
public void CoverageRegionUriJourneyPatternPointsIdRequestBuilder_get_Test() {}

    
}
