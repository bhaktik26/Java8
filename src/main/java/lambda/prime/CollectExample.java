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

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author 212626994
 */
public class CollectExample {
	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String args[]) {
		List<Human> list = new ArrayList<>();
		list.add(new Human("Abc", 21));
		list.add(new Human("Xyz", 43));
		list.add(new Human("Pqr", 21));
		list.add(new Human("Amn", 35));
		list.add(new Human("Rst", 47));

		List<Human> filteredList = list.stream().filter(i -> i.getName().startsWith("A")).collect(Collectors.toList());
		System.out.println("Humans with names starting with A: " + filteredList);

		Map<Integer, List<Human>> set = list.stream().collect(Collectors.groupingBy(p -> p.getAge()));
		System.out.println("Grouping by age: " + set);

		IntSummaryStatistics ageSummary = list.stream().collect(Collectors.summarizingInt(p -> p.getAge()));
		System.out.println("Summary is: " + ageSummary);

		// keymapper, valuemapper, mergefn. mergefn - if key is same how to
		// handle the values
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(p -> p.getAge(), p -> p.getName(), (name1, name2) -> name1 + "+" + name2));
		System.out.println(map);

		/*
		 * String names = list.stream().collect(Collector.of(() -> new
		 * StringJoiner(" | "), (sj, h) -> sj.add(h.getName().toUpperCase()),
		 * (sj1, sj2) -> sj1.merge(sj2), StringJoiner::toString));
		 * System.out.println(names);
		 * 
		 * String str = list.stream().collect(() -> new StringJoiner(" | "),
		 * (sj, h) -> sj.add(h.getName().toUpperCase()), (sj1, sj2) ->
		 * sj1.merge(sj2)).toString(); System.out.println(str);
		 */
	}

}
