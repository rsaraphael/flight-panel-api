package com.rsaraphael.flightpanel.flight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rsaraphael.flightpanel.flight.statechain.ItineraryStatusChain;
import com.rsaraphael.flightpanel.itinerary.ItineraryDto;

@Component
public class FlightAdapter {
	@Autowired
	private ItineraryStatusChain stateChain;

	public FlightDto adapt(Flight flight) {
		List<ItineraryDto> itineraries = new ArrayList<>();

		flight.getItineraries().forEach(itinerary -> itineraries.add(new ItineraryDto(itinerary.getDepartTime(),
				itinerary.getArriveTime(), itinerary.getPilot().getName(), itinerary.getAircraft().getModelAndPrefix(),
				stateChain.getItineraryStatus(itinerary).getStatusName())));

		return new FlightDto(flight.getId(), itineraries, flight.getOrigin().getCompletedInformation(),
				flight.getDestination().getCompletedInformation());
	}

}
