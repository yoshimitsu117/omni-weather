package com.dailyforecast.omniweather.service;

import com.dailyforecast.omniweather.model.ResponseObjectWeather;

public interface WeatherInfoInterface {
	public abstract ResponseObjectWeather retrieveCurrentWeather(String query);
}
