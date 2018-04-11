package com.rsaraphael.flightpanel.flight;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Flight {

	@Id
	private Long id;
	@ManyToOne
	private Aircraft aircraft;
	@OneToMany(mappedBy = "flight")
	@OrderBy("type DESC")
	private List<Itinerary> itineraries;
	@ManyToOne
	private Pilot pilot;


	@JsonIgnore
	public Itinerary getArriveItinerary() {
		return getFirstItineraryByType(ItineraryType.ARRIVE);
	}

	@JsonIgnore
	public Itinerary getDepartItinerary() {
		return getFirstItineraryByType(ItineraryType.DEPART);
	}
	
	public String getPilotName(){
		return pilot.getName();
	}
	
	public String getAircraftInformation(){
		return aircraft.getModelAndPrefix();
	}

	private Itinerary getFirstItineraryByType(ItineraryType type) {
		return itineraries.stream().filter(itinerary -> itinerary.getType().equals(type)).findFirst().get();	

	}
}
