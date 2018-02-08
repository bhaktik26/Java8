/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author 212626994
 */
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
		System.out.println("Square of Min even no greater than 3 and less than 10: " + sqOfMin(list));
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
