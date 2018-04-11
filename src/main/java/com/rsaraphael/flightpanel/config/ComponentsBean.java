package com.rsaraphael.flightpanel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rsaraphael.flightpanel.flight.statechain.ArrivedChain;
import com.rsaraphael.flightpanel.flight.statechain.AwaitingChain;
import com.rsaraphael.flightpanel.flight.statechain.InFlightChain;
import com.rsaraphael.flightpanel.flight.statechain.StateChain;

@ComponentScan(basePackages = {"com.rsaraphael.*"})
@Configuration
public class ComponentsBean {
	
	@Bean
	public StateChain stateChain(){
		ArrivedChain arrivedChain = new ArrivedChain();
		InFlightChain inFlightChain = new InFlightChain();
		AwaitingChain awaitingChain = new AwaitingChain();
		arrivedChain.setStateChain(inFlightChain);
		inFlightChain.setStateChain(awaitingChain);
		return arrivedChain;
	}

}
