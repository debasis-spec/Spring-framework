package com.dev.springframework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public mobileprocessor getProcessor() {
		return new Snapdragon();
	}
}
