package org.kisio.sdk;

import org.kisio.sdk.Places.EndpointPlaces;

public class NavitiaEndpoints {
    private NavitiaConfiguration navitiaConfiguration;
    private EndpointPlaces places;

    public EndpointPlaces getPlaces() {
        return places;
    }

    public NavitiaEndpoints(NavitiaConfiguration navitiaConfiguration) {
        this.navitiaConfiguration = navitiaConfiguration;
        this.places = new EndpointPlaces(this.navitiaConfiguration);
    }
}
