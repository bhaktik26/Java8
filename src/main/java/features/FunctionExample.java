
package features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings({ "nls", "javadoc" })
public class FunctionExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("Function Example: ");
		Stream.of(1.0, 2.0, 3.0)
				.map(i -> i * i)
				.mapToInt(Double::intValue)
				.forEach(System.out::println);
		
		System.out.println();

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(4);
		list.add(10);
		list.add(8);
		list.add(7);
		System.out.println("BinaryOperator - Specialization of BiFunction");
		System.out.println("Sum is: " + sum(list));
	}

	/**
	 * @param list
	 * @return
	 */
	private static int sum(List<Integer> list) {

		// list.stream().reduce((a,b) -> a+b).get();
		return list.stream()
							.reduce(0, (a, b) -> a + b);
	}

}
