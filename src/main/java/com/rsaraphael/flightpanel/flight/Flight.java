package com.rsaraphael.flightpanel.flight;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.rsaraphael.flightpanel.itinerary.Itinerary;

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
	private List<Itinerary> itinerary;
	@ManyToOne
	private Pilot pilot;

}
