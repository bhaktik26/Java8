/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package lambda.prime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 * @author 212626994
 */
public class DateAPIExamples {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "nls", "javadoc" })
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		// get the year and check if it is a leap year
		System.out.println("Is " + date.getYear() + " a Leap Year? : " + date.isLeapYear());

		// check if today's date is after a specified date
		System.out.println("Is today after 01-02-2018? :" + date.isAfter(LocalDate.of(2018, 2, 1)));

		// Create LocalDateTime from LocalDate
		System.out.println("Date Time: " + date.atTime(LocalTime.now()));

		// today plus 5 days
		System.out.println("Date after 5 days from today: " + date.plusDays(5));

		// today minus 1 month
		System.out.println("Date 1 month before: " + date.minusMonths(1));

		// TemporalAdjusters
		System.out.println("Last day of the current month: " + date.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("First day of the current year: " + date.with(TemporalAdjusters.firstDayOfYear()));

	}

}
