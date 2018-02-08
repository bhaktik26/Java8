package lambda.prime;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*w  w  w. j  a  v  a2s.  c om*/
@SuppressWarnings({ "nls", "javadoc" })
public class Prime {

	public static void main(String[] args) {
		System.out.println("Is the no prime: " + isPrime(11));
		System.out.println();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(20);
		list.add(7);
		list.add(30);
		// convert list to map using toMap(key,value). Function.identity()
		// assigns the value same as value to its corresponding key
		Map<Integer, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s -> s));
		map.forEach((k, v) -> System.out.println("key " + k + " value " + v));
		List<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		Map<String, Object> mapStr = str.stream().collect(Collectors.toMap(Function.identity(), s -> s));
		mapStr.forEach((k, v) -> System.out.println("key " + k + " value " + v));

		// sum of nos greater than 10
		int sum = list.parallelStream().filter(i -> i > 10).mapToInt(i -> i).sum();
		System.out.println("Sum of nos greater than 10: " + sum);
		System.out.println("//////////////////");
		System.out.println("Square is : " + findSquareOfMaxOdd(list));
		System.out.println("//////////////////");
		// creating stream of integer nos
		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3 });
		stream.forEach(System.out::println);
		System.out.println("//////////////////");
		// chars - ascii values
		Stream<String> stream2 = Stream.generate(() -> "abc").limit(5);
		stream2.forEach(System.out::println);
		IntStream is2 = "abc".chars();
		is2.forEach(c -> System.out.println((char) c));
		System.out.println("//////////////////");
		// even nos iterate 10 times(limit) seed = 2 , f(seed) = n + 2
		Stream<Integer> stream3 = Stream.iterate(2, n -> n + 2).limit(10);
		stream3.forEach(System.out::println);
		stream3 = Stream.iterate(2, n -> n + 2).limit(10);
		// get list from stream using collect()
		List<Integer> list2 = stream3.collect(Collectors.toList());
		System.out.println("//////////////////");
		System.out.println(list2);
		System.out.println("//////////////////");
		// stream to array
		stream3 = Stream.iterate(2, n -> n + 2).limit(10);
		Integer[] arr = stream3.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
		System.out.println("//////////////////");
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));
		names = Stream.of("aBc", "d", "ef");
		System.out.println(names.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"), Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());
		flatStream.forEach(System.out::println);
		Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5, 6);
		Optional<Integer> intOptional = integers.reduce((i, j) -> i * j);
		System.out.println(intOptional.get());
	}

	/**
	 * @param list
	 * @return
	 */
	private static int findSquareOfMaxOdd(List<Integer> list) {

		return list.stream().filter(Prime::isOdd).filter(Prime::isGreaterThan1).filter(Prime::isLessThan9)
				.max(Comparator.naturalOrder()).map(i -> i * i).get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}

	public static boolean isGreaterThan1(int i) {
		return i > 1;
	}

	public static boolean isLessThan9(int i) {
		return i < 9;
	}

	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	}
}