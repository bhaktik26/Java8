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

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 
 * @author 212626994
 */
public class LocalTimeExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String args[]) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("The current time is: " + currentTime);

		LocalTime time = LocalTime.of(22, 55, 26, 12);
		System.out.println("The specified time is: " + time);

		LocalTime zoneTime = LocalTime.now(ZoneId.systemDefault());
		System.out.println("Current time as per the specified zone: " + zoneTime);
		System.out.println();

		// System.out.println(ZoneId.getAvailableZoneIds());

		LocalTime lt = LocalTime.ofSecondOfDay(2000);
		System.out.println("Time with the specified second-of-day: " + lt);

		System.out.println("The parsed time is: " + LocalTime.parse("10:15:43.21"));
	}
}
