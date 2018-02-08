/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * 
 * @author 212626994
 */
public class LocalDateExample {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "nls", "javadoc" })
	public static void main(String[] args) {

		// print today's date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Today's date = " + currentDate);

		// print the date as per the specified parameters
		LocalDate myDate = LocalDate.of(2018, Month.FEBRUARY, 28);
		System.out.println("Date as per the specified year, month and day: " + myDate);

		// print the date as per the zone
		LocalDate zoneDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Date of the specified zone: " + zoneDate);
		System.out.println();

		// print the date of the specified day of the year
		LocalDate date = LocalDate.ofYearDay(2018, 32);
		System.out.println("Date corresponding to the specified day of the year: " + date);

		// print the date with the specified epoch-date. Epoch date is
		// 1970-01-01
		LocalDate ld = LocalDate.ofEpochDay(-5);
		System.out.println("Date with the specified epoch-day: " + ld);
		System.out.println();

		LocalDate loc = LocalDate.now(ZoneId.systemDefault());
		System.out.println("Date of the system's zone: " + loc);

		System.out.println("Parsed date: " + LocalDate.parse("2018-01-11"));

	}

}
