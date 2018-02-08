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
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author 212626994
 */
public class Sample4 {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "nls", "javadoc" })
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(20);
		// print the square of all elements in the list
		list.forEach(i -> System.out.println(i * i));
		System.out.println("Element present in list: " + list.stream().anyMatch(i -> i == 4));
		System.out.println();
		System.out.println(list.stream().filter(i -> i > 4).peek(i -> System.out.println(i)).filter(i -> i > 10)
				.peek(i -> System.out.println(i)).collect(Collectors.toList()));
		System.out.println();
		List<Integer> li = list.parallelStream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(li);
		System.out.println();
		Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c", "d", "e", "f");
		String strList = supplier.get().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
		System.out.println("String is: " + strList);

		String s = supplier.get()
				.collect(() -> new StringJoiner("."), (sj, v) -> sj.add(v), (sj1, sj2) -> sj1.merge(sj2)).toString();
		System.out.println("String - " + s);
	}

}
