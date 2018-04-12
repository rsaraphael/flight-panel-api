package com.rsaraphael.flightpanel.itinerary;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	private Date departTime;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date arriveTime;	
	@ManyToOne
	private Pilot pilot;
	@ManyToOne
	private Aircraft aircraft;
	@ManyToOne
	private Flight flight;

}
