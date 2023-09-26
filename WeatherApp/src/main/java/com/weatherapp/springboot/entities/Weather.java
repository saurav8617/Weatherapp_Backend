package com.weatherapp.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String weatherCondition;
    private double temperature;
    private double humidity;
    
    
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Weather(Long id, String location, String weatherCondition, double temperature, double humidity) {
		super();
		this.id = id;
		this.location = location;
		this.weatherCondition = weatherCondition;
		this.temperature = temperature;
		this.humidity = humidity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getWeatherCondition() {
		return weatherCondition;
	}


	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public double getHumidity() {
		return humidity;
	}


	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

   
}
