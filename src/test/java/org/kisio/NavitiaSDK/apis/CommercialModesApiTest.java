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
import org.kisio.NavitiaSDK.models.CommercialModes;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommercialModesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // CommercialModesApi constructor
    @Test
    public void shouldInstantiateCommercialModesApiGivenValidToken() throws Exception {
        CommercialModesApi currentApi = new CommercialModesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCommercialModesApiGivenValidToken() throws Exception {
        CommercialModesApi currentApi = null;

        try {
            currentApi = new CommercialModesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatCommercialModesRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageLonLatCommercialModesRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageLonLatCommercialModesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatCommercialModesIdRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageLonLatCommercialModesIdRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageLonLatCommercialModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("commercial_mode:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriCommercialModesRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageLonLatUriCommercialModesRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageLonLatUriCommercialModesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriCommercialModesIdRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageLonLatUriCommercialModesIdRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageLonLatUriCommercialModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("commercial_mode:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageRegionCommercialModesRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageRegionCommercialModesRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageRegionCommercialModesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageRegionCommercialModesIdRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageRegionCommercialModesIdRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageRegionCommercialModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("commercial_mode:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriCommercialModesRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageRegionUriCommercialModesRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageRegionUriCommercialModesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriCommercialModesIdRequestBuilder_get_Test() throws Exception {
    CommercialModesApi.CoverageRegionUriCommercialModesIdRequestBuilder requestBuilder = new CommercialModesApi(testToken).newCoverageRegionUriCommercialModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("commercial_mode:TGV"));

    final CommercialModes[] asyncResult = new CommercialModes[1];
    requestBuilder.get(new ApiCallback<CommercialModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(CommercialModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCommercialModes().size() > 0);
    assertTrue(asyncResult[0].getCommercialModes().get(0) != null);
}
    
}
