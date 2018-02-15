
package features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings({ "nls", "javadoc" })
public class LambdaLazyLoading {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(10);
		list.add(8);
		list.add(7);
		System.out.println("Illustrating Higher efficiency with laziness: ");
		System.out.println("Square of Min even no greater than 3 and less than 10: " + sqOfMin(list));
	}

	public static int sqOfMin(List<Integer> l) {
		return l.stream().filter(LambdaLazyLoading::isEven).filter(LambdaLazyLoading::isGreaterThan3).filter(LambdaLazyLoading::isLessThan10)
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


}
