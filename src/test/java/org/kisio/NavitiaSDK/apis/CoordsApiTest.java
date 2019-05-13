/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.78.0
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
import org.kisio.NavitiaSDK.models.DictAddresses;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordsApiTest {
    private final String testToken = "fc4b8d9e-ca2e-487f-9c04-c81fc9d2a781";

    // CoordsApi constructor
    @Test
    public void shouldInstantiateCoordsApiGivenValidToken() throws Exception {
        CoordsApi currentApi = new CoordsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCoordsApiGivenValidToken() throws Exception {
        CoordsApi currentApi = null;

        try {
            currentApi = new CoordsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
@Ignore
public void CoverageLonLatCoordRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatCoordIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatCoordsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatCoordsIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriCoordRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriCoordIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriCoordsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriCoordsIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCoordRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCoordIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCoordsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionCoordsIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriCoordRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriCoordIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriCoordsRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriCoordsIdRequestBuilder_get_Test() {}

    
}
