package com.dailyforecast.omniweather.model;

import java.io.Serializable;

public class ResponseObjectWeather implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = -1945137468798652486L;
		private request request;
		private location location;
		private current current;
		public request getRequest() {
			return request;
		}
		public void setRequest(request request) {
			this.request = request;
		}
		public location getLocation() {
			return location;
		}
		public void setLocation(location location) {
			this.location = location;
		}
		public current getCurrent() {
			return current;
		}
		public void setCurrent(current current) {
			this.current = current;
		}
		
}
