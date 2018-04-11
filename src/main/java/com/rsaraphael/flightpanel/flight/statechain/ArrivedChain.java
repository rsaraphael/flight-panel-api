package com.rsaraphael.flightpanel.flight.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.rsaraphael.flightpanel.flight.Flight;
import com.rsaraphael.flightpanel.flight.FlightState;

public class ArrivedChain extends StateChain{

	@Override
	public FlightState getFlightState(Flight flight) {
		LocalDateTime arriveTime =  getLocalDateTimeItinerary(flight.getArriveItinerary().getTime());
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		if(now.isAfter(arriveTime)){
			return FlightState.ARRIVED;
		}
		return stateChain.getFlightState(flight);
	}

}
