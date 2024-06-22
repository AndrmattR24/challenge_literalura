package com.andrmatt.challenge_literatura.service;

public interface ConverterData {

    <T> T fromJsonToObject(String json, Class<T> objetc);
}
