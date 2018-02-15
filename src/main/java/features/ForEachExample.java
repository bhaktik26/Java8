package features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("javadoc")
public class ForEachExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(10);
		list.add(8);
		list.add(7);

		System.out.println("Prior to Java 8, using Iterator");
		System.out.println();
		System.out.println("The list is: ");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();
		System.out.println("Using Java 8 forEach method");
		list.forEach(i -> System.out.println(i));

	}

}
