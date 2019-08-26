package com.kisio.navitia.sdk.data.expert;

public class NavitiaConfiguration {
    private final String token;

    public NavitiaConfiguration(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
