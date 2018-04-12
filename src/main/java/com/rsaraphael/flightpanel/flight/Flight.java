package com.rsaraphael.flightpanel.flight;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.Location;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Flight {

	@Id
	private Long id;
	@OneToMany(mappedBy = "flight")
	@OrderBy("departTime DESC")
	private List<Itinerary> itineraries;
	@ManyToOne
	@JoinColumn(name = "origin")
	private Location origin;
	@ManyToOne
	@JoinColumn(name = "destination")
	private Location destination;

}
