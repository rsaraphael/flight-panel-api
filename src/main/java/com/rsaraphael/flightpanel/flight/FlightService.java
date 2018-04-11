package com.rsaraphael.flightpanel.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	@Autowired
	private FlightAdapter flightAdapter;

	public List<FlightVO> getAllFlights() {
		return flightAdapter.adapt(flightRepository.findAll());
	}

}
