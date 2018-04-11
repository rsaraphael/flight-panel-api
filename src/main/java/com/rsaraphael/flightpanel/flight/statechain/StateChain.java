package com.rsaraphael.flightpanel.flight.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import com.rsaraphael.flightpanel.flight.Flight;
import com.rsaraphael.flightpanel.flight.FlightState;

import lombok.Setter;

public abstract class StateChain {
	
	@Setter
	protected StateChain stateChain;
	
	public abstract FlightState getFlightState(Flight flight);
	
	protected LocalDateTime getLocalDateTimeItinerary(Date date){
		return LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.UTC);
	}

}
