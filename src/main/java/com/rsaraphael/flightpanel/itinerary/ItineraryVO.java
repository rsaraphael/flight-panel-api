package com.rsaraphael.flightpanel.itinerary;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItineraryVO {
	
	public Date time;
	public String city;
	public ItineraryType type;
	
	


}
