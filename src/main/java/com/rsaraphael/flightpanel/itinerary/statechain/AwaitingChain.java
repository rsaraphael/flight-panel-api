package com.rsaraphael.flightpanel.itinerary.statechain;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

public class AwaitingChain extends ItineraryStatusChain {

	public AwaitingChain(DateTimeProvider dateTimeProvider) {
		super(dateTimeProvider);
	}

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		return ItineraryStatus.AWAITING;
	}

}
