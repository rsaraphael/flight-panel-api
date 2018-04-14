package com.rsaraphael.flightpanel.itinerary.statechain;

import java.time.LocalDateTime;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

public class InFlightChain extends ItineraryStatusChain {

	public InFlightChain(DateTimeProvider dateTimeProvider) {
		super(dateTimeProvider);
	}

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		LocalDateTime arriveTime = getLocalDateTimeItinerary(itinerary.getArriveTime());
		LocalDateTime departTime = getLocalDateTimeItinerary(itinerary.getDepartTime());
		LocalDateTime now = dateTimeProvider.getNowUtcDateTime();
		if (now.isAfter(departTime) && now.isBefore(arriveTime)) {
			return ItineraryStatus.IN_FLIGHT;
		}
		return itineraryStatusChain.getItineraryStatus(itinerary);
	}
}
