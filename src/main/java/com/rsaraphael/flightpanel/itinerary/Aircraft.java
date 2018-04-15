package com.rsaraphael.flightpanel.itinerary;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class that represent Aircraft.
 *
 * @author Raphael Alves
 */
@Getter
@Setter
@Entity
public class Aircraft {
	
	@Id
	private Long id;
	@Column
	private String model;
	@Column
	private String prefix;
	@OneToMany(mappedBy = "aircraft")
	private List<Itinerary> itineraries;
	
	public String getModelAndPrefix(){
		StringBuilder builder = new StringBuilder();
		builder.append(prefix);
		builder.append(" - ");
		builder.append(model);
		return builder.toString();
	}
	
}
