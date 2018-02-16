
package features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

@SuppressWarnings("javadoc")
public class SupplierExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(20);
		List<Integer> li = list.parallelStream()
												.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(li);
		System.out.println();
		System.out.println("Stream reusability using Supplier: ");
		Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c", "d", "e");
		System.out.println(supplier.get().anyMatch(i -> i == "c"));
		System.out.println(supplier.get().filter(i -> i.startsWith("b")).allMatch(i -> i == "b"));

	}

}
