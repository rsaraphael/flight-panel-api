package com.rsaraphael.flightpanel.itinerary;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rsaraphael.flightpanel.flight.Flight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Itinerary {

	@Id
	private Long id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	@Column
	@Enumerated(EnumType.STRING)
	private ItineraryType type;
	@ManyToOne
	private City city;
	@ManyToOne
	private Flight flight;

}
