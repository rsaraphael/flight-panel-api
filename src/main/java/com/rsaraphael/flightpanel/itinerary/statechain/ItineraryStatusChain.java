package com.rsaraphael.flightpanel.itinerary.statechain;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

import lombok.Setter;


/**
*  Used to abstract commom methods of the Status Chain
*
* @author Raphael Alves
*/
public abstract class ItineraryStatusChain {

	protected DateTimeProvider dateTimeProvider;
	@Setter
	protected ItineraryStatusChain itineraryStatusChain;

	public abstract ItineraryStatus getItineraryStatus(Itinerary itinerary);

	protected LocalDateTime getLocalDateTimeItinerary(Date date) {
		return LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.UTC);
	}

	public ItineraryStatusChain(DateTimeProvider dateTimeProvider) {
		this.dateTimeProvider = dateTimeProvider;

	}

}
