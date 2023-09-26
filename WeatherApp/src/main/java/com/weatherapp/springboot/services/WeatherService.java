package com.weatherapp.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherapp.springboot.entities.Weather;
import com.weatherapp.springboot.repositories.WeatherRepository;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }
    
    public List<Weather> getAllWeather() {
    	return weatherRepository.findAll();
    }

    public List<Weather> searchWeatherByLocation(String location) {
        return weatherRepository.findByLocation(location);
    }

    public Weather saveWeather(Weather weather) {
        return weatherRepository.save(weather);
    }

    // Other methods for managing weather data
}

