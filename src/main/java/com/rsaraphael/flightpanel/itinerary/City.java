package com.rsaraphael.flightpanel.itinerary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	private Long id;
	@Column
	private String name;

}
