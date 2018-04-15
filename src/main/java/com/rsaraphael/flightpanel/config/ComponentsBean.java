package com.rsaraphael.flightpanel.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rsaraphael.flightpanel.itinerary.statechain.ArrivedChain;
import com.rsaraphael.flightpanel.itinerary.statechain.AwaitingChain;
import com.rsaraphael.flightpanel.itinerary.statechain.InFlightChain;
import com.rsaraphael.flightpanel.itinerary.statechain.ItineraryStatusChain;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

/**
 * Class responsible to scan Spring beans, like components,
 * and to declare some custom beans.
 *
 * @author Raphael Alves
 */
@ComponentScan(basePackages = {"com.rsaraphael.*"})
@Configuration
public class ComponentsBean {
	
	@Bean
	public ItineraryStatusChain stateChain(@Qualifier("dateTimeProvider") DateTimeProvider dateTimeProvider){
		ArrivedChain arrivedChain = new ArrivedChain(dateTimeProvider);
		InFlightChain inFlightChain = new InFlightChain(dateTimeProvider);
		AwaitingChain awaitingChain = new AwaitingChain(dateTimeProvider);
		arrivedChain.setItineraryStatusChain(inFlightChain);
		inFlightChain.setItineraryStatusChain(awaitingChain);
		return arrivedChain;
	}

}
