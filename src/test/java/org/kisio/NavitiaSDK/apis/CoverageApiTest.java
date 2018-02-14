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
import org.kisio.NavitiaSDK.models.Coverages;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoverageApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // CoverageApi constructor
    @Test
    public void shouldInstantiateCoverageApiGivenValidToken() throws Exception {
        CoverageApi currentApi = new CoverageApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCoverageApiGivenValidToken() throws Exception {
        CoverageApi currentApi = null;

        try {
            currentApi = new CoverageApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageRequestBuilder_get_Test() throws Exception {
    CoverageApi.CoverageRequestBuilder requestBuilder = new CoverageApi(testToken).newCoverageRequestBuilder();

    // Test case parameters

    final Coverages[] asyncResult = new Coverages[1];
    requestBuilder.get(new ApiCallback<Coverages>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Coverages result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRegions().size() > 0);
    assertTrue(asyncResult[0].getRegions().get(0) != null);
}
    
        @Test
public void CoverageLonLatRequestBuilder_get_Test() throws Exception {
    CoverageApi.CoverageLonLatRequestBuilder requestBuilder = new CoverageApi(testToken).newCoverageLonLatRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Coverages[] asyncResult = new Coverages[1];
    requestBuilder.get(new ApiCallback<Coverages>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Coverages result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRegions().size() > 0);
    assertTrue(asyncResult[0].getRegions().get(0) != null);
}
    
        @Test
public void CoverageRegionRequestBuilder_get_Test() throws Exception {
    CoverageApi.CoverageRegionRequestBuilder requestBuilder = new CoverageApi(testToken).newCoverageRegionRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Coverages[] asyncResult = new Coverages[1];
    requestBuilder.get(new ApiCallback<Coverages>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Coverages result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRegions().size() > 0);
    assertTrue(asyncResult[0].getRegions().get(0) != null);
}
    
}
