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
import org.kisio.NavitiaSDK.models.DictAddresses;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // AddressesApi constructor
    @Test
    public void shouldInstantiateAddressesApiGivenValidToken() throws Exception {
        AddressesApi currentApi = new AddressesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateAddressesApiGivenValidToken() throws Exception {
        AddressesApi currentApi = null;

        try {
            currentApi = new AddressesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
@Ignore
public void CoverageLonLatAddressesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatAddressesIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriAddressesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageLonLatUriAddressesIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionAddressesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionAddressesIdRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriAddressesRequestBuilder_get_Test() {}

    
        @Test
@Ignore
public void CoverageRegionUriAddressesIdRequestBuilder_get_Test() {}

    
}
