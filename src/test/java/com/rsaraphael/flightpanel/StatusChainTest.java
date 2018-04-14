package com.rsaraphael.flightpanel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.sql.Date;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.rsaraphael.flightpanel.config.ComponentsBean;
import com.rsaraphael.flightpanel.itinerary.Itinerary;
import com.rsaraphael.flightpanel.itinerary.ItineraryStatus;
import com.rsaraphael.flightpanel.itinerary.statechain.ItineraryStatusChain;
import com.rsaraphael.flightpanel.util.DateTimeProvider;

@RunWith(MockitoJUnitRunner.class)
public class StatusChainTest {

	private ItineraryStatusChain itineraryStatusChain;
	
	@Mock
	private DateTimeProvider dateTimeProvider;

	@Before
	public void setUp() {
		Mockito.when(dateTimeProvider.getNowUtcDateTime()).thenReturn(LocalDateTime.now(Clock.fixed(instantFixture(7), ZoneOffset.UTC)));
		itineraryStatusChain = new ComponentsBean().stateChain(dateTimeProvider);
	}

	@Test
	public void shouldSetStatusAsArrived() {
		Itinerary itinerary = itineraryFixture(1, 2);
		assertThat(itineraryStatusChain.getItineraryStatus(itinerary), equalTo(ItineraryStatus.ARRIVED));

	}

	@Test
	public void shouldSetStatusAsInFlight() {
		Itinerary itinerary = itineraryFixture(5, 10);
		assertThat(itineraryStatusChain.getItineraryStatus(itinerary), equalTo(ItineraryStatus.IN_FLIGHT));

	}

	@Test
	public void shouldSetStatusAsAwaiting() {
		Itinerary itinerary = itineraryFixture(8, 10);
		assertThat(itineraryStatusChain.getItineraryStatus(itinerary), equalTo(ItineraryStatus.AWAITING));

	}

	private Itinerary itineraryFixture(int departHour, int arriveHour) {
		Itinerary itinerary = new Itinerary();
		itinerary.setDepartTime(Date.from(instantFixture(departHour)));
		itinerary.setArriveTime(Date.from(instantFixture(arriveHour)));
		return itinerary;
	}

	private Instant instantFixture(int hour) {
		return LocalDateTime.of(2018, Month.APRIL, 14, hour, 20, 20).toInstant(ZoneOffset.UTC);
	}

}
