package com.rsaraphael.flightpanel.itinerary;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class that represent Pilot.
 *
 * @author Raphael Alves
 */
@Getter
@Setter
@Entity
public class Pilot {

	@Id
	private Long id;
	@Column
	private String name;
	@OneToMany(mappedBy = "pilot")
	private List<Itinerary> itineraries;

}
