
package lambda.prime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;
import java.util.Date;

@SuppressWarnings({ "javadoc", "nls" })
public class InstantExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Instant currentTime = Instant.now();
		System.out.println("The current time is: " + currentTime);

		System.out.println("Current time in ms: " + System.currentTimeMillis());
		System.out.println();
		System.out.println("Current zone date time: " + ZonedDateTime.now());
		System.out.println();
		System.out.println("Using Java 8");
		System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println(ZonedDateTime.now().toInstant().toEpochMilli());
		System.out.println();
		Clock clock = Clock.systemUTC();
		System.out.println(clock.millis());
		System.out.println();

		Date dt = new Date();
		LocalDate date = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(date);

		LocalDate localDate = LocalDate.now();
		Date d = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(d);

		Date d2 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(d2);

	}

}
