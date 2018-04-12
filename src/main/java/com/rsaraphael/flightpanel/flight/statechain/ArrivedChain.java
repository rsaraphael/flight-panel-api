package com.rsaraphael.flightpanel.flight.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;

public class ArrivedChain extends ItineraryStatusChain {

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		LocalDateTime arriveTime = getLocalDateTimeItinerary(itinerary.getArriveTime());
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		if (now.isAfter(arriveTime)) {
			return ItineraryStatus.ARRIVED;
		}
		return itineraryStatusChain.getItineraryStatus(itinerary);
	}
	
}
