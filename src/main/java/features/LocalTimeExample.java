

package features;

import java.time.LocalTime;
import java.time.ZoneId;

@SuppressWarnings({ "nls", "javadoc" })
public class LocalTimeExample {

	/**
	 * @param args
	 */
	
	public static void main(String args[]) {
		
		System.out.println("----------LocalTime----------");
		LocalTime currentTime = LocalTime.now();
		System.out.println("The current time is: " + currentTime);

		LocalTime time = LocalTime.of(22, 55, 26, 12);
		System.out.println("The specified time is: " + time);

		LocalTime zoneTime = LocalTime.now(ZoneId.systemDefault());
		System.out.println("Current time as per the specified zone: " + zoneTime);
		System.out.println();

		 System.out.println(ZoneId.getAvailableZoneIds());

		LocalTime lt = LocalTime.ofSecondOfDay(2000);
		System.out.println("Time with the specified second-of-day: " + lt);

		System.out.println("The parsed time is: " + LocalTime.parse("10:15:43.21"));
	}
}
