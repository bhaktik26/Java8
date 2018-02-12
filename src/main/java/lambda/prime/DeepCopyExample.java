
package lambda.prime;

import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("javadoc")
public final class DeepCopyExample {

	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) this.testMap.clone();
	}

	/**
	 * Constructor performing Deep Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	public DeepCopyExample(int i, String n, HashMap<String, String> hm) {
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;

	}

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		DeepCopyExample ce = new DeepCopyExample(i, s, h1);

		// Lets see whether its copy by field or reference
		System.out.println(s == ce.getName());
		System.out.println(h1 == ce.getTestMap());
		// print the ce values
		System.out.println("ce id:" + ce.getId());
		System.out.println("ce name:" + ce.getName());
		System.out.println("ce testMap:" + ce.getTestMap());
		// change the local variable values
		i = 20;
		s = "modified";
		h1.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + ce.getId());
		System.out.println("ce name after local variable change:" + ce.getName());
		System.out.println("ce testMap after local variable change:" + ce.getTestMap());

		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());

	}

}
