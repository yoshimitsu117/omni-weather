package com.dailyforecast.omniweather.model;

import java.io.Serializable;

public class current implements Serializable {
			/**
	 * 
	 */
	private static final long serialVersionUID = -6511197141373231115L;
			private String observation_time;
			private int temperature;
			public String getObservation_time() {
				return observation_time;
			}
			public void setObservation_time(String observation_time) {
				this.observation_time = observation_time;
			}
			public int getTemperature() {
				return temperature;
			}
			public void setTemperature(int temperature) {
				this.temperature = temperature;
			}
}
