/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package lambda.prime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 
 * @author 212626994
 */
public class StreamExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// of() - create a stream , mapToInt - create a stream of integers ,
		// mapToObj - create obj stream
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).peek(i -> System.out.println(i)).mapToObj(i -> "s" + i)
				.forEach(System.out::println);

		Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c", "d", "e");
		supplier.get().anyMatch(i -> i == "c");
		supplier.get().filter(i -> i.startsWith("b")).allMatch(i -> i == "b");

	}

}
