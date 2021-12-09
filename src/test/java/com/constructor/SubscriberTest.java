package com.constructor;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * This code solves the constructor problem using creational builder pattern.
 * Java version: 11
 * run as JUnit test
 * 
 * @author Felipe Messeri
 *
 */

public class SubscriberTest {

	@Test
	public void buildSubscriber1() {
		LocalDate today = LocalDate.now();
		
		final Subscriber.Builder subBuilder = new Subscriber.Builder();
		
		final Subscriber subscriber1 = subBuilder
											.withId(1)
											.withName("Jonas")
											.withClassType(ClassType.POSTPAID)
											.withMainBucket(new Bucket(1, today.plusMonths(1L), new BigDecimal("23.50")))
											.build();
		// Success -> no exception thrown
		System.out.println(subscriber1.toString());
				
		final Subscriber subscriber2 = subBuilder
				.withId(2)
				.withName("Peter")
				.withClassType(ClassType.PREPAID)
				.withMainBucket(new Bucket(3, today.plusWeeks(2L), new BigDecimal("15.00")))
				.withDataBucket(new Bucket(7, today.plusDays(5L), new BigDecimal("22.30")))
				.build();
		// Success -> no exception thrown
		System.out.println("\n"+subscriber2.toString());
	}
}
