package com.rsaraphael.flightpanel.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

}
