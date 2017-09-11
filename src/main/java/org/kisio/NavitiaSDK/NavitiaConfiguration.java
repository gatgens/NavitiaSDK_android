package org.kisio.NavitiaSDK;

public class NavitiaConfiguration {
    private String token = "";

    public NavitiaConfiguration(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
