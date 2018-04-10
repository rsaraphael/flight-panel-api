package com.rsaraphael.flightpanel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rsaraphael.*"})
public class FlightPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightPanelApplication.class, args);
	}
}
