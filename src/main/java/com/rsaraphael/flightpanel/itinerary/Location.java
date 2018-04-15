package com.rsaraphael.flightpanel.itinerary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class that represent Location.
 *
 * @author Raphael Alves
 */
@Entity
@Getter
@Setter
public class Location {

	@Id
	private Long id;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	

	public String getCompletedInformation() {
		StringBuilder builder = new StringBuilder();
		builder.append(city);
		builder.append(" - ");
		builder.append(state);
		builder.append(" - ");
		builder.append(country);
		return builder.toString();
	}

}
