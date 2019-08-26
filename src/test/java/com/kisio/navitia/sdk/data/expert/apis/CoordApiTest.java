/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.82.0
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
import com.kisio.navitia.sdk.data.expert.models.DictAddresses;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordApiTest {
    private final static String testToken = BuildConfig.API_TOKEN;

    // CoordApi constructor
    @Test
    public void shouldInstantiateCoordApiGivenValidToken() throws Exception {
        CoordApi currentApi = new CoordApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCoordApiGivenValidToken() {
        CoordApi currentApi = null;

        try {
            currentApi = new CoordApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
    @Test
    @Ignore("Empty tests")
    public void CoordLonLatRequestBuilder_get_Test() {}
    
    @Test
    @Ignore("Empty tests")
    public void CoordsLonLatRequestBuilder_get_Test() {}
    
}
