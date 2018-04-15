package com.rsaraphael.flightpanel.flight;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.rsaraphael.flightpanel.itinerary.Itinerary;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class that represent the Flight domain.
 *
 * @author Raphael Alves
 */
@Setter
@Getter
@Entity
public class Flight {

	@Id
	private Long id;
	@OneToMany(mappedBy = "flight")
	@OrderBy("departTime DESC")
	private List<Itinerary> itineraries;

}
