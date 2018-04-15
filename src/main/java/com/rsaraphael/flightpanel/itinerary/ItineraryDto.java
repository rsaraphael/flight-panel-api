package com.rsaraphael.flightpanel.itinerary;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *  Represents the data transfer object to <class>Itinerary</class>domain.
 *  Should be used to serialization purposes. 
 *
 * @author Raphael Alves
 */
@Getter
@Setter
@AllArgsConstructor
public class ItineraryDto {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
	private Date departTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
	private Date arriveTime;	
	private String pilotName;
	private String aircraftName;
	private String status;
	private String origin;
	private String destination;
}
