package com.rsaraphael.flightpanel.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsaraphael.flightpanel.flight.Flight;
import com.rsaraphael.flightpanel.flight.FlightService;

@RestController(value="/flight")
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping()
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
}
