package com.rsaraphael.flightpanel.flight;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aircraft {
	
	@Id
	private Long id;
	@Column
	private String model;
	@OneToMany(mappedBy = "aircraft")
	private List<Flight> flight;

}
