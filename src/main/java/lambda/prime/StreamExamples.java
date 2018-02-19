
package lambda.prime;

import java.util.stream.Stream;

@SuppressWarnings({ "javadoc", "nls" })
public class StreamExamples {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// of() - create a stream , mapToInt - create a stream of integers ,
		// mapToObj - create obj stream
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue)
								 .peek(i -> System.out.println(i))
								 .mapToObj(i -> "s" + i)
								 .forEach(System.out::println);
		
	}

}
