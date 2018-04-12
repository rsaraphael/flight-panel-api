package com.rsaraphael.flightpanel.flight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rsaraphael.flightpanel.flight.statechain.StateChain;
import com.rsaraphael.flightpanel.itinerary.ItineraryVO;

@Component
public class FlightAdapter {
	@Autowired
	private StateChain stateChain;

	public FlightVO adapt(Flight flight) {
		List<ItineraryVO> itineraryVOs = new ArrayList<>();
		flight.getItineraries().forEach(itinerary -> itineraryVOs
				.add(new ItineraryVO(itinerary.getTime(), itinerary.getLocation().getCompletedInformation(), itinerary.getType())));
		FlightState state = stateChain.getFlightState(flight);
		return new FlightVO(flight.getAircraftInformation(), flight.getPilotName(), itineraryVOs,
				state.toString());
		
	}

	public List<FlightVO> adapt(List<Flight> flights) {
		List<FlightVO> flightVOs = new ArrayList<>();
		flights.forEach(flight -> flightVOs.add(adapt(flight)));
		return flightVOs;	
	}
}
