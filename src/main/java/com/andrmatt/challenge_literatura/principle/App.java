package com.andrmatt.challenge_literatura.principle;

import com.andrmatt.challenge_literatura.service.ConsumerAPI;

public class App {

    private final ConsumerAPI CONSUMER_API = new ConsumerAPI();

    public App() {
        this.runAppplication();
    }

    private void runAppplication() {

        System.out.println(
                this.CONSUMER_API.getJsonData(
                        "https://gutendex.com/books/"));

    }

}
