
package lambda.prime;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings({ "nls", "javadoc" })
public class CollectExample {
	/**
	 * @param args
	 */

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
