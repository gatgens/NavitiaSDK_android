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
import com.kisio.navitia.sdk.data.expert.models.Contributors;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContributorsApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // ContributorsApi constructor
    @Test
    public void shouldInstantiateContributorsApiGivenValidToken() throws Exception {
        ContributorsApi currentApi = new ContributorsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateContributorsApiGivenValidToken() {
        ContributorsApi currentApi = null;

        try {
            currentApi = new ContributorsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatContributorsRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageLonLatContributorsRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageLonLatContributorsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageLonLatContributorsIdRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageLonLatContributorsIdRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageLonLatContributorsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("RAT"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageLonLatUriContributorsRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageLonLatUriContributorsRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageLonLatUriContributorsRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageLonLatUriContributorsIdRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageLonLatUriContributorsIdRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageLonLatUriContributorsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));
        requestBuilder.withId(String.valueOf("RAT"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageRegionContributorsRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageRegionContributorsRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageRegionContributorsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageRegionContributorsIdRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageRegionContributorsIdRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageRegionContributorsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withId(String.valueOf("RAT"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageRegionUriContributorsRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageRegionUriContributorsRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageRegionUriContributorsRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
    @Test
    public void CoverageRegionUriContributorsIdRequestBuilder_get_Test() throws Exception {
        ContributorsApi.CoverageRegionUriContributorsIdRequestBuilder requestBuilder = new ContributorsApi(testToken).newCoverageRegionUriContributorsIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("lines/line:RAT:M1"));
        requestBuilder.withId(String.valueOf("RAT"));

        final Contributors[] asyncResult = new Contributors[1];
        requestBuilder.get(new ApiCallback<Contributors>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Contributors result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getContributors().size() > 0);
        assertNotNull(asyncResult[0].getContributors().get(0));
    }
    
}
