package com.rsaraphael.flightpanel.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsaraphael.flightpanel.flight.FlightService;
import com.rsaraphael.flightpanel.flight.FlightVO;

@RestController(value="/flight")
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping()
	public List<FlightVO> getAllFlights() {
		return flightService.getAllFlights();
	}
}
