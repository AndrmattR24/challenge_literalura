package com.andrmatt.challenge_literatura.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumerAPI {

    private final HttpClient client = HttpClient.newHttpClient();
    private HttpResponse<String> response = null;
    private HttpRequest request = null;
    private final String URL_BASE = "https://gutendex.com/books/";

    public String getJsonData(String URL_PATH) {

        try {

            request = HttpRequest.newBuilder()
                    .uri(new URI(URL_PATH))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (InterruptedException | IOException | URISyntaxException error) {
            throw new RuntimeException(
                    String.format("Error sending request to server for : ${error}", error));
        }
    }
}
