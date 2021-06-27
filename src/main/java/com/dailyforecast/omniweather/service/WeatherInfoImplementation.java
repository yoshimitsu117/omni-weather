package com.dailyforecast.omniweather.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailyforecast.omniweather.constants.ApplicationConstants;
import com.dailyforecast.omniweather.model.ResponseObjectWeather;

@Service
@PropertySource("classpath:application.properties")
public class WeatherInfoImplementation implements WeatherInfoInterface{

		@Value("${access_key}")
		private String key;
		@Autowired
		private RestTemplate restTemplate;
		
		@Value("${URL_WEATHER_HOST}")
		private String urlForCurrentWeather;
		
		@Override
		@Cacheable(value="retreiveCurrentWeather",key="#query")
		public ResponseObjectWeather retrieveCurrentWeather(String query) {
			org.slf4j.Logger log=LoggerFactory.getLogger(WeatherInfoImplementation.class);
			
			String url=urlForCurrentWeather.concat(ApplicationConstants.CURRENT_WEATHER).concat("?").concat("access_key").concat("=").concat(key).concat("&").concat("query").concat("=").concat(query);
			ResponseObjectWeather responseObjectWeather=new ResponseObjectWeather();
			ResponseEntity<ResponseObjectWeather> response = null;
			HttpHeaders headers=new HttpHeaders();
			//headers.add("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
			//headers.add("Accept-Encoding", "gzip, deflate");
			//headers.add("Accept-Language", "en-US,en;q=0.5");
			//headers.add("Connection", "keep-alive");
			//headers.add("Host", "api.weatherapi.com");
			//headers.add("Upgrade-Insecure-Requests", "1");
			//headers.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
			HttpEntity<?> httpEntity=new HttpEntity<>(responseObjectWeather,headers);
			try {
				response=restTemplate.exchange(url,HttpMethod.GET,httpEntity,ResponseObjectWeather.class);
				return response.getBody();
			}
			catch(Exception e)
			{
				log.info("----------------------------------------Error Info---------------------------------------");
				log.info("Exception occured:{}", e.getMessage());
				log.info("------------------------------------------------------------------------------------------------");
			}
			return null;
		}
}
