package com.dailyforecast.omniweather;
import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan({ "com.dailyforecast.omniweather,com.dailyforecast.omniweather.controller,com.dailyforecast.omniweather.model,com.dailyforecast.omniweather.service,com.dailyforecast.omniweather.config","com.dailyforecast.omni-weather.dbmodel","com.dailyforecast.omni-weather.repositories"})

public class OmniWeatherApplication {
	
	private static final Logger log=Logger.getLogger(OmniWeatherApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(OmniWeatherApplication.class, args);
		log.info("Database query excecuted successfully");	
	}
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
