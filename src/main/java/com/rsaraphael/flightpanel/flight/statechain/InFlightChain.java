package com.rsaraphael.flightpanel.flight.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.rsaraphael.flightpanel.flight.Flight;
import com.rsaraphael.flightpanel.flight.FlightState;

public class InFlightChain extends StateChain {
	
	@Override
	public FlightState getFlightState(Flight flight) {
		LocalDateTime arriveTime =  getLocalDateTimeItinerary(flight.getArriveItinerary().getTime());
		LocalDateTime departTime =  getLocalDateTimeItinerary(flight.getDepartItinerary().getTime());
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		if(now.isAfter(departTime) && now.isBefore(arriveTime)){
			return FlightState.IN_FLIGHT;
		}
		return stateChain.getFlightState(flight);
	}

}
