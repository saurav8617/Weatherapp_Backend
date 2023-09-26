package com.weatherapp.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weatherapp.springboot.entities.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    List<Weather> findByLocation(String location);

}