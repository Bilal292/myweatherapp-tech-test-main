package com.weatherapp.myweatherapp.service;

import com.weatherapp.myweatherapp.repository.VisualcrossingRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    @Mock
    VisualcrossingRepository weatherRepo;

    WeatherService weatherService;

    @Test
    public void test_forecastByCity() {
//        when(weatherRepo.getByCity(anyString())).thenReturn();

    }
}