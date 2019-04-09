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
import org.kisio.NavitiaSDK.models.PhysicalModes;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhysicalModesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // PhysicalModesApi constructor
    @Test
    public void shouldInstantiatePhysicalModesApiGivenValidToken() throws Exception {
        PhysicalModesApi currentApi = new PhysicalModesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiatePhysicalModesApiGivenValidToken() throws Exception {
        PhysicalModesApi currentApi = null;

        try {
            currentApi = new PhysicalModesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatPhysicalModesRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageLonLatPhysicalModesRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageLonLatPhysicalModesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatPhysicalModesIdRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageLonLatPhysicalModesIdRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageLonLatPhysicalModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("physical_mode:LongDistanceTrain"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriPhysicalModesRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageLonLatUriPhysicalModesRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageLonLatUriPhysicalModesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriPhysicalModesIdRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageLonLatUriPhysicalModesIdRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageLonLatUriPhysicalModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("physical_mode:LongDistanceTrain"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageRegionPhysicalModesRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageRegionPhysicalModesRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageRegionPhysicalModesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageRegionPhysicalModesIdRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageRegionPhysicalModesIdRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageRegionPhysicalModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("physical_mode:LongDistanceTrain"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriPhysicalModesRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageRegionUriPhysicalModesRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageRegionUriPhysicalModesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriPhysicalModesIdRequestBuilder_get_Test() throws Exception {
    PhysicalModesApi.CoverageRegionUriPhysicalModesIdRequestBuilder requestBuilder = new PhysicalModesApi(testToken).newCoverageRegionUriPhysicalModesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("physical_mode:LongDistanceTrain"));

    final PhysicalModes[] asyncResult = new PhysicalModes[1];
    requestBuilder.get(new ApiCallback<PhysicalModes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(PhysicalModes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getPhysicalModes().size() > 0);
    assertTrue(asyncResult[0].getPhysicalModes().get(0) != null);
}
    
}
