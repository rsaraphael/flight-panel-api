package com.rsaraphael.flightpanel.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

/**
 * Class used to handle with dates.
 *
 * @author Raphael Alves
 */
@Component
public class DateTimeProvider {

	public LocalDateTime getNowUtcDateTime(){
		return LocalDateTime.now(ZoneOffset.UTC);
	}
}
