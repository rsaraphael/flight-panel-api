package com.rsaraphael.flightpanel.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/**
 *  Represents the repository of <class>Flight</class> domain.
 *  Should be used by Spring Framework to communicate with Database. 
 *
 * @author Raphael Alves
 */
public interface FlightRepository extends JpaRepository<Flight, Long>, JpaSpecificationExecutor<Flight> {

}
