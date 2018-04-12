package com.rsaraphael.flightpanel.itinerary.statechain;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;

public class AwaitingChain extends ItineraryStatusChain {

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		return ItineraryStatus.AWAITING;
	}

}
