package com.dailyforecast.omniweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailyforecast.omniweather.model.ResponseObjectWeather;
import com.dailyforecast.omniweather.service.WeatherInfoInterface;

@RestController
public class WeatherController {
	@Autowired(required=true)
	private WeatherInfoInterface weatherInfointerface;
	
	@GetMapping("/currentweather")
	@ResponseBody
	public ResponseEntity<ResponseObjectWeather> retrieve(@RequestParam(name="query") String query)
			{
			ResponseObjectWeather response=weatherInfointerface.retrieveCurrentWeather(query);
			return new ResponseEntity<ResponseObjectWeather>(response,HttpStatus.OK);
			}
}
