package com.rsaraphael.flightpanel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.rsaraphael.flightpanel.config.DatabaseBean;
import com.rsaraphael.flightpanel.config.FlightPanelApplication;
import com.rsaraphael.flightpanel.flight.FlightRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= FlightPanelApplication.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@DataJpaTest
@Import(DatabaseBean.class)
public class FlightPanelApplicationTests {
	
	@Autowired
	private FlightRepository flightRepository;

	@Test
	@Sql(scripts="classpath:db-scripts/03-inserts.sql")
	public void contextLoads() {
		flightRepository.findAll();
	}

}
