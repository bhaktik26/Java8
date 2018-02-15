 
package features;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(20);
		System.out.println("Example of Predicate - anyMatch: ");
		System.out.println("Element present in list: " + list.stream().anyMatch(i -> i == 4));
		System.out.println();
		
		System.out.println("No of elements after applying filter: " + list.stream().filter(i -> i > 4).count());

	}

}
