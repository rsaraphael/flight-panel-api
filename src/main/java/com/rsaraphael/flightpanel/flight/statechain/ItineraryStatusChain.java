package com.rsaraphael.flightpanel.flight.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;

import lombok.Setter;

public abstract class ItineraryStatusChain {
	
	@Setter
	protected ItineraryStatusChain itineraryStatusChain;
	
	public abstract ItineraryStatus getItineraryStatus(Itinerary itinerary);
	
	protected LocalDateTime getLocalDateTimeItinerary(Date date){
		return LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.UTC);
	}

}
