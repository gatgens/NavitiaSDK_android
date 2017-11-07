/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.43.0-34-g30b0bcf
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
import org.kisio.NavitiaSDK.models.Datasets;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatasetsApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // DatasetsApi constructor
    @Test
    public void shouldInstantiateDatasetsApiGivenValidToken() throws Exception {
        DatasetsApi currentApi = new DatasetsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateDatasetsApiGivenValidToken() throws Exception {
        DatasetsApi currentApi = null;

        try {
            currentApi = new DatasetsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatDatasetsRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageLonLatDatasetsRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageLonLatDatasetsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageLonLatDatasetsIdRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageLonLatDatasetsIdRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageLonLatDatasetsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("JDR:0"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriDatasetsRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageLonLatUriDatasetsRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageLonLatUriDatasetsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriDatasetsIdRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageLonLatUriDatasetsIdRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageLonLatUriDatasetsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("JDR:0"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageRegionDatasetsRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageRegionDatasetsRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageRegionDatasetsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageRegionDatasetsIdRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageRegionDatasetsIdRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageRegionDatasetsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("JDR:0"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageRegionUriDatasetsRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageRegionUriDatasetsRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageRegionUriDatasetsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
        @Test
public void CoverageRegionUriDatasetsIdRequestBuilder_get_Test() throws Exception {
    DatasetsApi.CoverageRegionUriDatasetsIdRequestBuilder requestBuilder = new DatasetsApi(testToken).newCoverageRegionUriDatasetsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("JDR:0"));

    final Datasets[] asyncResult = new Datasets[1];
    requestBuilder.get(new ApiCallback<Datasets>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Datasets result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getDatasets().size() > 0);
    assertTrue(asyncResult[0].getDatasets().get(0) != null);
}
    
}
