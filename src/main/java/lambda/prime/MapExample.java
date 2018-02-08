
package lambda.prime;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({ "nls", "javadoc" })
public class MapExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "a");
		// putIfAbsent puts the value for the key if its absent
		for (int i = 0; i < 5; i++)
			map.putIfAbsent(i, "value" + i);
		System.out.println("The map is: " + map.entrySet());
		map.computeIfAbsent(5, num -> num + "b");
		System.out.println("Value corresponding to key=5: " + map.get(5));
		System.out.println("If value for the key isnt present: " + map.getOrDefault(6, "Key doesnt exist"));
		System.out.println("Removes if value matches: " + map.remove(5, "c"));
		System.out.println("Removed: " + map.remove(5, "5b"));
		System.out.println("Value is: " + map.get(5));
		map.merge(7, "val7", (val, newVal) -> val.concat(newVal));
		System.out.println("Value assigned: " + map.get(7));
		map.merge(7, "7", (val, newVal) -> val.concat(newVal));
		System.out.println("Value merged: " + map.get(7));

	}

}
