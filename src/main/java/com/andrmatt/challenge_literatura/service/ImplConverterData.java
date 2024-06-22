package com.andrmatt.challenge_literatura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ImplConverterData implements ConverterData {

    private final ObjectMapper objMapper = new ObjectMapper();

    @Override
    public <T> T fromJsonToObject(String json, Class<T> objetc) {

        try {
            return objMapper.readValue(json, objetc);
        } catch (JsonProcessingException error) {
            error.printStackTrace();
            throw new RuntimeException(String.format("Could Not Convert for", error));
        }
    }

}
