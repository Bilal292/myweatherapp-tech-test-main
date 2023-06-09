package com.weatherapp.myweatherapp.controller;

import com.weatherapp.myweatherapp.model.CityInfo;
import com.weatherapp.myweatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WeatherController {

  @Autowired
  WeatherService weatherService;

  @GetMapping("/forecast/{city}")
  public ResponseEntity<CityInfo> forecastByCity(@PathVariable("city") String city) {

    CityInfo ci = weatherService.forecastByCity(city);

    return ResponseEntity.ok(ci);
  }

  @GetMapping("/daylight/{city_one}/{city_two}")
  public ResponseEntity<CityInfo> longestDaylight(@PathVariable("city_one") String cityOne,
                                           @PathVariable("city_two") String cityTwo) {
    CityInfo ci = weatherService.getCityWithLongestDaylight(cityOne, cityTwo);

    return ResponseEntity.ok(ci);
  }

  @GetMapping("/forecast/{city_one}/{city_two}")
  public ResponseEntity<CityInfo> rainingInCity(@PathVariable("city_one") String cityOne,
                                                  @PathVariable("city_two") String cityTwo) {
    CityInfo ci = weatherService.rainingInCity(cityOne, cityTwo);

    return ResponseEntity.ok(ci);
  }

}
