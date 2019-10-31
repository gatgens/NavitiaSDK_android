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
import com.kisio.navitia.sdk.data.expert.models.Disruptions;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisruptionsApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // DisruptionsApi constructor
    @Test
    public void shouldInstantiateDisruptionsApiGivenValidToken() throws Exception {
        DisruptionsApi currentApi = new DisruptionsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateDisruptionsApiGivenValidToken() {
        DisruptionsApi currentApi = null;

        try {
            currentApi = new DisruptionsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    @Ignore("Empty tests")
    public void CoverageLonLatDisruptionsRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageLonLatDisruptionsIdRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageLonLatUriDisruptionsRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageLonLatUriDisruptionsIdRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageRegionDisruptionsRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageRegionDisruptionsIdRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageRegionUriDisruptionsRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoverageRegionUriDisruptionsIdRequestBuilder_get_Test() {}
    
}
