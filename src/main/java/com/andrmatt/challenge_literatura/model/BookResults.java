package com.andrmatt.challenge_literatura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookResults(

                @JsonAlias(value = "count") Integer countResults,
                @JsonAlias(value = "results") List<Book> bookResults) {
}
