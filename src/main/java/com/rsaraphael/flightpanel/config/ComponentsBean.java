package com.rsaraphael.flightpanel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rsaraphael.flightpanel.flight.statechain.ArrivedChain;
import com.rsaraphael.flightpanel.flight.statechain.AwaitingChain;
import com.rsaraphael.flightpanel.flight.statechain.InFlightChain;
import com.rsaraphael.flightpanel.flight.statechain.ItineraryStatusChain;

@ComponentScan(basePackages = {"com.rsaraphael.*"})
@Configuration
public class ComponentsBean {
	
	@Bean
	public ItineraryStatusChain stateChain(){
		ArrivedChain arrivedChain = new ArrivedChain();
		InFlightChain inFlightChain = new InFlightChain();
		AwaitingChain awaitingChain = new AwaitingChain();
		arrivedChain.setItineraryStatusChain(inFlightChain);
		inFlightChain.setItineraryStatusChain(awaitingChain);
		return arrivedChain;
	}

}
