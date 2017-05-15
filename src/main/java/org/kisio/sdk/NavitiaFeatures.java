package org.kisio.sdk;

import org.kisio.sdk.Places.EndpointPlaces;

public class NavitiaFeatures {
    private NavitiaConfiguration navitiaConfiguration;
    private EndpointPlaces autoComplete;

    public EndpointPlaces getAutoComplete() {
        return autoComplete;
    }

    public NavitiaFeatures(NavitiaConfiguration navitiaConfiguration) {
        this.navitiaConfiguration = navitiaConfiguration;
        this.autoComplete = new EndpointPlaces(this.navitiaConfiguration);
    }
}
