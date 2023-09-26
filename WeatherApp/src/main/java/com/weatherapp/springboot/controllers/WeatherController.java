package com.weatherapp.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapp.springboot.entities.Weather;
import com.weatherapp.springboot.services.WeatherService;

@RestController
@RequestMapping("api/v1/weather")
@CrossOrigin
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    
    @GetMapping("/getall")
    public List<Weather> getAllWeather(){
    	return weatherService.getAllWeather();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Weather>> searchWeatherByLocation(@RequestParam("location") String location) {
        List<Weather> weatherResults = weatherService.searchWeatherByLocation(location);

        if (!weatherResults.isEmpty()) {
            return ResponseEntity.ok(weatherResults);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/saveweather")
    public Weather saveWeather(@RequestBody Weather weather) {
        return weatherService.saveWeather(weather);
    }

    // Other controller methods
}
