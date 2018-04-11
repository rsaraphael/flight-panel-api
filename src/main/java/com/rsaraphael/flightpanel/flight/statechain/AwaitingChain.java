package com.rsaraphael.flightpanel.flight.statechain;

import com.rsaraphael.flightpanel.flight.Flight;
import com.rsaraphael.flightpanel.flight.FlightState;

public class AwaitingChain extends StateChain {

	@Override
	public FlightState getFlightState(Flight flight) {
		return FlightState.AWAITING;
	}

}
