
package features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("javadoc")
public class SupplierExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3 });
		System.out.println("Stream elements are - ");
		//stream.forEach(System.out::println);
		//stream.count();
		System.out.println();
		
		System.out.println("Stream reusability using Supplier: ");
		Supplier<Stream<Integer>> supplier = () -> Stream.of(new Integer[] { 1, 2, 3 }) ;
/*		System.out.println(supplier.get().anyMatch(i -> i == "c"));
		System.out.println(supplier.get().filter(i -> i.startsWith("b")).allMatch(i -> i == "b"));
*/		System.out.println();
System.out.println(supplier.get().collect(Collectors.toList()));
supplier.get().forEach(System.out::println);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(20);
		List<Integer> li = list.parallelStream()
												.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println("Elements of list: " + li);
		
		

		
		Stream<String> s = Stream.generate(()->"abc").limit(5);
		s.forEach(i-> System.out.println(i));
	}

}
