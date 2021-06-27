package com.dailyforecast.omniweather.model;

import java.io.Serializable;

public class request implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3851888092424167545L;
	private String type;
	private String query;
	private String language;
	private String unit;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
