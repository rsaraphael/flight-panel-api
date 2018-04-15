package com.rsaraphael.flightpanel.itinerary;

import lombok.Getter;

/**
 * Declares the status of the itinerary.
 *
 * @author Raphael Alves
 */
public enum ItineraryStatus {

	ARRIVED("Arrived"), IN_FLIGHT("In Flight"), AWAITING("Awaiting");

	@Getter
	private String statusName;

	private ItineraryStatus(String statusName) {
		this.statusName = statusName;
	}

}
