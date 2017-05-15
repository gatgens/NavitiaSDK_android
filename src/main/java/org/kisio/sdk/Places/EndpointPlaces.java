package org.kisio.sdk.Places;

import org.kisio.sdk.NavitiaConfiguration;

public class EndpointPlaces {
    private NavitiaConfiguration navitiaConfiguration;

    public EndpointPlaces(NavitiaConfiguration navitiaConfiguration) {
        this.navitiaConfiguration = navitiaConfiguration;
    }

    public EndpointRequestBuilderPlaces newRequestBuilder() {
        return new EndpointRequestBuilderPlaces(this.navitiaConfiguration);
    }
}