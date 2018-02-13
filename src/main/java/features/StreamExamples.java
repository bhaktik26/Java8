
package features;

import java.util.function.Supplier;
import java.util.stream.Stream;

@SuppressWarnings({ "javadoc", "nls" })
public class StreamExamples {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// of() - create a stream , mapToInt - create a stream of integers ,
		// mapToObj - create obj stream
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).peek(i -> System.out.println(i)).mapToObj(i -> "s" + i)
				.forEach(System.out::println);

		Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c", "d", "e");
		System.out.println(supplier.get().anyMatch(i -> i == "c"));
		System.out.println(supplier.get().filter(i -> i.startsWith("b")).allMatch(i -> i == "b"));

	}

}
