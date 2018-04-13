package com.rsaraphael.flightpanel.flight;

import java.util.List;

import com.rsaraphael.flightpanel.itinerary.ItineraryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FlightDto {
	
	public Long flightNumber;
	public List<ItineraryDto> itineraries;


}
