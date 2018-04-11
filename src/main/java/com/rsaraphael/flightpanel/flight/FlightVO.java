package com.rsaraphael.flightpanel.flight;

import java.util.List;

import com.rsaraphael.flightpanel.itinerary.ItineraryVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FlightVO {
	
	public String aircraftName;
	public String pilotName;
	public List<ItineraryVO> itineraries;
	public String state;
	

}
