package com.dailyforecast.omniweather.model;

import java.io.Serializable;

public class location implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 220242708219017491L;
	private String name;
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	private String country;
	private String region;
	private String lat;
	private String lon;
	private String timezone_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getTimezone_id() {
		return timezone_id;
	}
	public void setTimezone_id(String timezone_id) {
		this.timezone_id = timezone_id;
	}
	
	
}
