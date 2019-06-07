/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.apis;

import com.kisio.navitia.sdk.expert.BuildConfig;
import com.kisio.navitia.sdk.expert.invokers.ApiCallback;
import com.kisio.navitia.sdk.expert.invokers.ApiException;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.kisio.navitia.sdk.expert.models.StopSchedules;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopSchedulesApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // StopSchedulesApi constructor
    @Test
    public void shouldInstantiateStopSchedulesApiGivenValidToken() throws Exception {
        StopSchedulesApi currentApi = new StopSchedulesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateStopSchedulesApiGivenValidToken() {
        StopSchedulesApi currentApi = null;

        try {
            currentApi = new StopSchedulesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    @Ignore("Empty tests")
    public void CoverageLonLatUriStopSchedulesRequestBuilder_get_Test() {}

    
    @Test
    @Ignore("Empty tests")
    public void CoverageRegionUriStopSchedulesRequestBuilder_get_Test() {}

    
    @Test
    @Ignore("Empty tests")
    public void StopSchedulesRequestBuilder_get_Test() {}

    
}
