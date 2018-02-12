
package features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings({ "nls", "javadoc" })
public class Sample3 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(10);
		list.add(8);
		list.add(7);
		System.out.println("Example of Function - map: ");
		System.out.println("Illustrating Higher efficiency with laziness: ");
		System.out.println("Square of Min even no greater than 3 and less than 10: " + sqOfMin(list));
		System.out.println();
		System.out.println("Result: " + multiply(list));
	}

	public static int sqOfMin(List<Integer> l) {
		return l.stream().filter(Sample3::isEven).filter(Sample3::isGreaterThan3).filter(Sample3::isLessThan10)
				.min(Comparator.naturalOrder()).map(i -> i * i).get();

	}

	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

	public static boolean isGreaterThan3(int i) {
		return i > 3;
	}

	public static boolean isLessThan10(int i) {
		return i < 10;
	}

	/**
	 * @param l
	 *            multiply the nos >3 and <10 using reduce()
	 * @return
	 */
	public static int multiply(List<Integer> l) {
		return l.stream().filter(Sample3::isGreaterThan3).filter(Sample3::isLessThan10).mapToInt(i -> i).reduce(1,
				(a, b) -> a * b);
	}
}
