
package lambda.prime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;

@SuppressWarnings({ "javadoc", "nls" })
public class InstantExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Instant currentTime = Instant.now();
		System.out.println("The current time is: " + currentTime);
		
		System.out.println(System.currentTimeMillis());
		System.out.println();
		System.out.println(ZonedDateTime.now());
		System.out.println();
		System.out.println("Using Java 8");
		System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println(ZonedDateTime.now().toInstant().toEpochMilli());

	}

}
