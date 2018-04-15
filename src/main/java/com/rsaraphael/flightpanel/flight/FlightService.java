package com.rsaraphael.flightpanel.flight;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.rsaraphael.flightpanel.itinerary.ItineraryLikeFilter;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	@Autowired
	private FlightAdapter flightAdapter;

	public List<Long> getAllFlightNumbers() {
		List<Flight> flights = flightRepository.findAll();
		return flightAdapter.adaptToLongList(flights);
	}


	public FlightDto getFlightById(Long id) {
		return flightAdapter.adapt(flightRepository.findById(id).get());
	}

	public List<Long> getFlightBySearch(String pilotName, String origin, String destination, String aircraftModel) {
		List<Flight> flights = flightRepository
				.findAll(Specification.where(new ItineraryLikeFilter<Flight>(origin, "origin.city"))
								      .and(new ItineraryLikeFilter<>(destination, "destination.city"))
									  .and(new ItineraryLikeFilter<>(aircraftModel, "aircraft.model"))
									  .and(new ItineraryLikeFilter<>(pilotName, "pilot.name")));
		return flightAdapter.adaptToLongList(flights).stream().distinct().collect(Collectors.toList());
	}

}
