package com.andrmatt.challenge_literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Author(

        @JsonAlias(value = "name") String authorName,
        @JsonAlias(value = "birth_year") Integer birthYear,
        @JsonAlias(value = "dead_year") Integer deadYear

) {

}
