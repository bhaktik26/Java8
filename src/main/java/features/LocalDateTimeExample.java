
package features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

@SuppressWarnings({ "nls", "javadoc" })
public class LocalDateTimeExample {

	/**
	 * @param args
	 */

	public static void main(String args[]) {
		
		System.out.println("----------LocalDateTime----------");
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("The current date time is: " + currentTime);

		LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("The current date time is: " + dateTime);
		System.out.println();

		LocalDateTime ldt = LocalDateTime.of(2017, Month.DECEMBER, 23, 14, 34, 07);
		System.out.println("The specified date time is: " + ldt);

		/*
		 * LocalDateTime time = LocalDateTime.ofEpochSecond(4000, 5000,
		 * ZoneOffset.ofHours(10)); System.out.println(time);
		 */
		LocalDateTime zoneTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("The date time of the specified zone is: " + zoneTime);
		System.out.println();

		LocalDateTime parseTime = LocalDateTime.parse("2018-01-31T11:45:03");
		System.out.println("The parsed time is: " + parseTime);

	}
}
