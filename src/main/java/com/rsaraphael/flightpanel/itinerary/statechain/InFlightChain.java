package com.rsaraphael.flightpanel.itinerary.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;

public class InFlightChain extends ItineraryStatusChain {

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		LocalDateTime arriveTime = getLocalDateTimeItinerary(itinerary.getArriveTime());
		LocalDateTime departTime = getLocalDateTimeItinerary(itinerary.getDepartTime());
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		if (now.isAfter(departTime) && now.isBefore(arriveTime)) {
			return ItineraryStatus.IN_FLIGHT;
		}
		return itineraryStatusChain.getItineraryStatus(itinerary);
	}
}
