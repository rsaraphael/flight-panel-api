package com.rsaraphael.flightpanel.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

@Component
public class DateTimeProvider {

	public LocalDateTime getNowUtcDateTime(){
		return LocalDateTime.now(ZoneOffset.UTC);
	}
}
