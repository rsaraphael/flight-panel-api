package com.rsaraphael.flightpanel.flight;

import java.util.List;

import com.rsaraphael.flightpanel.itinerary.ItineraryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *  Represents the data transfer object to <class>Flight</class> domain.
 *  Should be used to serialization purposes. 
 *
 * @author Raphael Alves
 */
@Getter
@Setter
@AllArgsConstructor
public class FlightDto {
	
	public Long flightNumber;
	public List<ItineraryDto> itineraries;


}
