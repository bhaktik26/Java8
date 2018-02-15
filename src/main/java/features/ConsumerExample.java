
package features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsumerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Consumer Example: ");
		System.out.println();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(10);
		System.out.println("The elements of the list are: ");
		list.forEach(i -> System.out.println(i));
		System.out.println();
		System.out.println("Example of Consumer - peek: ");
		System.out.println(list.stream().filter(i -> i > 4).peek(i -> System.out.println(i)).filter(i -> i > 9)
				.peek(i -> System.out.println(i)).collect(Collectors.toList()));
	}

}
