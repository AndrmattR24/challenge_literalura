package com.andrmatt.challenge_literatura.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumerAPI {

    private final HttpClient client = HttpClient.newHttpClient();
    private HttpResponse<String> response = null;
    private HttpRequest request = null;

    public String getJsonData(String URL_PATH) {

        try {

            request = HttpRequest.newBuilder()
                    .uri(new URI(URL_PATH))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException("Error creating JSON response");
        }

        return response.body();
    }
}
