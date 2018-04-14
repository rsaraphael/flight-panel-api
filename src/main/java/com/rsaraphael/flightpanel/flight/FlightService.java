package com.rsaraphael.flightpanel.flight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	@Autowired
	private FlightAdapter flightAdapter;

	public List<Long> getAllFlightNumbers() {
		List<Long> flightNumbers = new ArrayList<>();
		List<Flight> flights = flightRepository.findAll();
		flights.forEach(flight -> flightNumbers.add(flight.getId()));
		return flightNumbers;
	}

	public FlightDto getFlightById(Long id) {
		return flightAdapter.adapt(flightRepository.findById(id).get());
	}

}
