package com.rsaraphael.flightpanel.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsaraphael.flightpanel.flight.FlightDto;
import com.rsaraphael.flightpanel.flight.FlightService;

@RestController
@RequestMapping(value="/flight")
@CrossOrigin
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping
	public List<Long> getAllFlightNumbers() {
		return flightService.getAllFlightNumber();
	}
	
	@GetMapping(value="/{id}")
	public FlightDto getFlight(@PathVariable Long id) {
		return flightService.getFlightById(id);
	}
}
