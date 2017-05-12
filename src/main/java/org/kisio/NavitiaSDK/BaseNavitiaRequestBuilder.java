package org.kisio.NavitiaSDK;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public abstract class BaseNavitiaRequestBuilder<T> {
    private NavitiaConfiguration navitiaConfiguration;
    private String resourceUri;
    private Hashtable<String, String> queryParameters;
    final Class<T> typeParameterClass;

    protected BaseNavitiaRequestBuilder(NavitiaConfiguration navitiaConfiguration, String resourceUri, Class<T> typeParameterClass) {
        this.navitiaConfiguration = navitiaConfiguration;
        this.resourceUri = resourceUri;
        this.queryParameters = new Hashtable<String, String>();
        this.typeParameterClass = typeParameterClass;
    }

    public void addQueryParameter(String key, String value) {
        this.queryParameters.put(key, value);
    }

    public String getUrl() {
        StringBuilder resultUrlBuilder = new StringBuilder();
        resultUrlBuilder.append(this.navitiaConfiguration.getBaseUrl());
        resultUrlBuilder.append(this.resourceUri);
        resultUrlBuilder.append("?");

        for (String key : this.queryParameters.keySet()) {
            resultUrlBuilder.append(key + "=" + this.queryParameters.get(key) + "&");
        }

        return resultUrlBuilder.toString();
    }

    private String getResponse() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(this.getUrl())
                .addHeader("Authorization", this.navitiaConfiguration.getToken())
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public interface ErrorRequestCallback<T> { void callback(ResourceRequestError resourceRequestError); }

    public interface BaseRequestCallback { void callback(JSONObject jsonObject); }
    public void rawGet(BaseRequestCallback baseRequestCallback, ErrorRequestCallback errorRequestCallback) throws IOException, ParseException {
        try {
            String jsonResponse = this.getResponse();

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);

            baseRequestCallback.callback(jsonObject);
        }
        catch (Exception e) {
            errorRequestCallback.callback(new ResourceRequestError(666, "toto", e));
        }
    }

    public interface ModelRequestCallback<T> { void callback(T endpointResponseModel); }
    public void get(ModelRequestCallback<T> modelRequestCallback, ErrorRequestCallback errorRequestCallback) throws IOException, ParseException {
        String jsonResponse = this.getResponse();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        modelRequestCallback.callback(gson.fromJson(jsonResponse, typeParameterClass));
    }
}
