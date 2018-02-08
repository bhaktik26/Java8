
package features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

@SuppressWarnings({ "nls", "javadoc" })
public class LocalDateExample {

	/**
	 * @param args
	 */
	
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
