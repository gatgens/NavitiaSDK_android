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
import com.kisio.navitia.sdk.data.expert.models.Networks;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworksApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // NetworksApi constructor
    @Test
    public void shouldInstantiateNetworksApiGivenValidToken() throws Exception {
        NetworksApi currentApi = new NetworksApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateNetworksApiGivenValidToken() {
        NetworksApi currentApi = null;

        try {
            currentApi = new NetworksApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    public void CoverageLonLatNetworksRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageLonLatNetworksRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageLonLatNetworksRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageLonLatNetworksIdRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageLonLatNetworksIdRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageLonLatNetworksIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withId(String.valueOf("network:RAT:1"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageLonLatUriNetworksRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageLonLatUriNetworksRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageLonLatUriNetworksRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageLonLatUriNetworksIdRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageLonLatUriNetworksIdRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageLonLatUriNetworksIdRequestBuilder();

        // Test case parameters
        requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
        requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));
        requestBuilder.withId(String.valueOf("network:RAT:1"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageRegionNetworksRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageRegionNetworksRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageRegionNetworksRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageRegionNetworksIdRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageRegionNetworksIdRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageRegionNetworksIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withId(String.valueOf("network:RAT:1"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageRegionUriNetworksRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageRegionUriNetworksRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageRegionUriNetworksRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void CoverageRegionUriNetworksIdRequestBuilder_get_Test() throws Exception {
        NetworksApi.CoverageRegionUriNetworksIdRequestBuilder requestBuilder = new NetworksApi(testToken).newCoverageRegionUriNetworksIdRequestBuilder();

        // Test case parameters
        requestBuilder.withRegion(String.valueOf("sandbox"));
        requestBuilder.withUri(String.valueOf("commercial_modes/commercial_mode:Metro"));
        requestBuilder.withId(String.valueOf("network:RAT:1"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
    @Test
    public void NetworksRequestBuilder_get_Test() throws Exception {
        NetworksApi.NetworksRequestBuilder requestBuilder = new NetworksApi(testToken).newNetworksRequestBuilder();

        // Test case parameters
        requestBuilder.withExternalCode(String.valueOf("RAT1"));

        final Networks[] asyncResult = new Networks[1];
        requestBuilder.get(new ApiCallback<Networks>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                synchronized (asyncResult) {
                    asyncResult.notify();
                }
            }

            @Override
            public void onSuccess(Networks result, int statusCode, Map<String, List<String>> responseHeaders) {
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

        assertTrue(asyncResult[0].getNetworks().size() > 0);
        assertNotNull(asyncResult[0].getNetworks().get(0));
    }
    
}
