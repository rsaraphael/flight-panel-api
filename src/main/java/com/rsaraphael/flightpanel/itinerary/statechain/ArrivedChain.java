package com.rsaraphael.flightpanel.itinerary.statechain;

import java.time.LocalDateTime;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

/**
 *  Contains the logic to set the Itinerary status as arrived.
 *  The bean is declared on <class>ComponentsBean</class>.  
 *
 * @author Raphael Alves
 */
public class ArrivedChain extends ItineraryStatusChain {

	public ArrivedChain(DateTimeProvider dateTimeProvider) {
		super(dateTimeProvider);
	}

	@Override
	public ItineraryStatus getItineraryStatus(Itinerary itinerary) {
		LocalDateTime arriveTime = getLocalDateTimeItinerary(itinerary.getArriveTime());
		LocalDateTime now = dateTimeProvider.getNowUtcDateTime();
		if (now.isAfter(arriveTime)) {
			return ItineraryStatus.ARRIVED;
		}
		return itineraryStatusChain.getItineraryStatus(itinerary);
	}

}
