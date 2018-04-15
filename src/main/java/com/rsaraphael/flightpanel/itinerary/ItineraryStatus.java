package com.rsaraphael.flightpanel.itinerary;

import lombok.Getter;

public enum ItineraryStatus {

	ARRIVED("Arrived"), IN_FLIGHT("In Flight"), AWAITING("Awaiting");

	@Getter
	private String statusName;

	private ItineraryStatus(String statusName) {
		this.statusName = statusName;
	}

}
