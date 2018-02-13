
package features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings({ "nls", "javadoc" })
public class FormatterExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("/////Formatting LocalDate/////");
		System.out.println("Basic ISO Date format= " + date.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Date in specified pattern= " + date.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Date in specified pattern= " + date.format(DateTimeFormatter.ofPattern("d-MMMM-uuuu")));
		System.out.println();

		LocalTime time = LocalTime.now();
		System.out.println("/////Formatting LocalTime/////");
		System.out.println("Time in ISO format: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println();

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("/////Formatting LocalDateTime/////");
		System.out.println("Date time in ISO format: " + ldt.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(
				"Date Time in specified format: " + ldt.format(DateTimeFormatter.ofPattern("d-MMM-uuuu HH:mm:ss")));

	}

}
