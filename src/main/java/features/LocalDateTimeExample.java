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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/**
 * 
 * @author 212626994
 */
public class LocalDateTimeExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String args[]) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("The current date time is: " + currentTime);

		LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("The current date time is: " + dateTime);

		LocalDateTime ldt = LocalDateTime.of(2017, Month.DECEMBER, 23, 14, 34, 07);
		System.out.println("The specified date time is: " + ldt);

		/*
		 * LocalDateTime time = LocalDateTime.ofEpochSecond(4000, 5000,
		 * ZoneOffset.ofHours(10)); System.out.println(time);
		 */
		LocalDateTime zoneTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("The date time of the specified zone is: " + zoneTime);

		LocalDateTime parseTime = LocalDateTime.parse("2018-01-31T11:45:03");
		System.out.println("The parsed time is: " + parseTime);

	}
}
