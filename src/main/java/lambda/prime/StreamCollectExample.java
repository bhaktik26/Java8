
package lambda.prime;

import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.stream.Stream;

@SuppressWarnings({ "nls", "javadoc" })
public class StreamCollectExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c", "d", "e", "f");
		String strList = supplier.get()
									.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
									.toString();
		System.out.println("String is: " + strList);

		String s = supplier.get()
								.collect(() -> new StringJoiner("."), (sj, v) -> sj.add(v), (sj1, sj2) -> sj1.merge(sj2)).toString();
		System.out.println("String - " + s);
	}

}
