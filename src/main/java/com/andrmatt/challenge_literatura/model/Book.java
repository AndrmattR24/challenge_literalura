package com.andrmatt.challenge_literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Book(
        @JsonAlias(value = "id") String bookID,
        @JsonAlias(value = "title") String bookTitle,
        @JsonAlias(value = "authors") String authors,
        @JsonAlias(value = "languages") String languages) {
}
