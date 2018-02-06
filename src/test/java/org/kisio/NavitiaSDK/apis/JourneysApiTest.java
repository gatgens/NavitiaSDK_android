/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.49.0
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
import org.kisio.NavitiaSDK.models.Journeys;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JourneysApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // JourneysApi constructor
    @Test
    public void shouldInstantiateJourneysApiGivenValidToken() throws Exception {
        JourneysApi currentApi = new JourneysApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateJourneysApiGivenValidToken() throws Exception {
        JourneysApi currentApi = null;

        try {
            currentApi = new JourneysApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatJourneysRequestBuilder_get_Test() throws Exception {
    JourneysApi.CoverageLonLatJourneysRequestBuilder requestBuilder = new JourneysApi(testToken).newCoverageLonLatJourneysRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withFrom(String.valueOf("stop_area:JDR:SA:GDLYO"));
    requestBuilder.withTo(String.valueOf("2.3665844;48.8465337"));

    final Journeys[] asyncResult = new Journeys[1];
    requestBuilder.get(new ApiCallback<Journeys>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Journeys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneys().size() > 0);
    assertTrue(asyncResult[0].getJourneys().get(0) != null);
}
    
        @Test
public void CoverageRegionJourneysRequestBuilder_get_Test() throws Exception {
    JourneysApi.CoverageRegionJourneysRequestBuilder requestBuilder = new JourneysApi(testToken).newCoverageRegionJourneysRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withFrom(String.valueOf("stop_area:JDR:SA:GDLYO"));
    requestBuilder.withTo(String.valueOf("2.3665844;48.8465337"));

    final Journeys[] asyncResult = new Journeys[1];
    requestBuilder.get(new ApiCallback<Journeys>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Journeys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneys().size() > 0);
    assertTrue(asyncResult[0].getJourneys().get(0) != null);
}
    
        @Test
public void JourneysRequestBuilder_get_Test() throws Exception {
    JourneysApi.JourneysRequestBuilder requestBuilder = new JourneysApi(testToken).newJourneysRequestBuilder();

    // Test case parameters
    requestBuilder.withFrom(String.valueOf("stop_area:JDR:SA:GDLYO"));
    requestBuilder.withTo(String.valueOf("2.3665844;48.8465337"));

    final Journeys[] asyncResult = new Journeys[1];
    requestBuilder.get(new ApiCallback<Journeys>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Journeys result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getJourneys().size() > 0);
    assertTrue(asyncResult[0].getJourneys().get(0) != null);
}
    
}
