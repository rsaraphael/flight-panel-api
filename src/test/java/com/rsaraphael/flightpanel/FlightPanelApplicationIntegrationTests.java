package com.rsaraphael.flightpanel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.rsaraphael.flightpanel.config.ComponentsBean;
import com.rsaraphael.flightpanel.config.DatabaseBean;
import com.rsaraphael.flightpanel.config.FlightPanelApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightPanelApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@AutoConfigureMockMvc
@Import({ DatabaseBean.class, ComponentsBean.class })
@Sql(scripts = "classpath:db-scripts/03-inserts.sql")
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class FlightPanelApplicationIntegrationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldGetFlightById() throws Exception {
		this.mockMvc.perform(get("/flight/3478").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(status().isOk()).andExpect(jsonPath("$.flightNumber", equalTo(3478)))
				.andExpect(jsonPath("$.itineraries[0].pilotName", equalTo("Josefino Correa")))
				.andExpect(jsonPath("$.itineraries[2].status", equalTo("In Flight")));
	}

	@Test
	public void shouldGetAllFlights() throws Exception {
		this.mockMvc.perform(get("/flight")
				.accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()", equalTo(17)));
	}

	@Test
	public void shouldFilterByPilotNameAircraftModelOriginAndDestination() throws Exception {
		this.mockMvc
				.perform(get("/flight/search")
						.param("destination", "Cabo Canaveral")
						.param("pilotName", "Mauro")
						.param("aircraftModel", "Embraer")
						.param("origin", "Fort Lauderdale")
						.accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(status().isOk()).andExpect(jsonPath("$[0]", equalTo(2777)));
	}

}
