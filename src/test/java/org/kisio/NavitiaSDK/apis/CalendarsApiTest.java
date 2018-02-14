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
import org.kisio.NavitiaSDK.models.Calendars;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarsApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // CalendarsApi constructor
    @Test
    public void shouldInstantiateCalendarsApiGivenValidToken() throws Exception {
        CalendarsApi currentApi = new CalendarsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCalendarsApiGivenValidToken() throws Exception {
        CalendarsApi currentApi = null;

        try {
            currentApi = new CalendarsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
@Ignore
public void CoverageLonLatCalendarsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatCalendarsIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriCalendarsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCalendarsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCalendarsIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriCalendarsRequestBuilder_get_Test() {}

    
}
