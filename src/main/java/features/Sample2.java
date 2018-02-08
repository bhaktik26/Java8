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
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author 212626994
 */
@SuppressWarnings({ "nls", "javadoc" })
public class Sample2 {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(10);
		System.out.println("Sum of squares of nos greater than 7: " + sumOfSquaresGreaterThan7(list));
		System.out
				.println("Sum of squares of nos greater than 7 using lambda: " + lambdaSumOfSquaresGreaterThan7(list));
		System.out.println("Sum of squares of even nos: " + lambdaSumOfSquaresBasedOnCond(list, num -> num % 2 == 0));
	}

	/**
	 * @param l
	 * @return
	 */
	public static int sumOfSquaresGreaterThan7(List<Integer> l) {
		Iterator<Integer> it = l.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int val = it.next();
			if (val > 7) {
				sum = sum + val * val;
			}
		}
		return sum;
	}

	/**
	 * @param l
	 *            stream() - Returns a sequential Stream with this
	 *            collection(list l) as its source. filter() - Returns a stream
	 *            consisting of elements that match the predicate mapToInt() -
	 *            Returns an IntStream after applying the funcn
	 * @return
	 */
	public static int lambdaSumOfSquaresGreaterThan7(List<Integer> l) {
		return l.stream().filter(num -> num > 7).mapToInt(num -> num * num).sum();
	}

	/**
	 * @param l
	 * @param predicate
	 *            passing behaviours into methods
	 * @return
	 */
	public static int lambdaSumOfSquaresBasedOnCond(List<Integer> l, Predicate<Integer> predicate) {
		return l.stream().filter(predicate).mapToInt(num -> num * num).sum();
	}

}
