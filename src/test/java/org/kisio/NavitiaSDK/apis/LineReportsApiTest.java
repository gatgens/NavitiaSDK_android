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
import org.joda.time.DateTime;
import org.kisio.NavitiaSDK.models.LineReports;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineReportsApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // LineReportsApi constructor
    @Test
    public void shouldInstantiateLineReportsApiGivenValidToken() throws Exception {
        LineReportsApi currentApi = new LineReportsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateLineReportsApiGivenValidToken() throws Exception {
        LineReportsApi currentApi = null;

        try {
            currentApi = new LineReportsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
@Ignore
public void CoverageLonLatLineReportsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriLineReportsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionLineReportsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriLineReportsRequestBuilder_get_Test() {}

    
}
