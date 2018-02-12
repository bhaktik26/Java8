
package lambda.prime;

import java.util.HashMap;
import java.util.Iterator;

public final class ShallowCopyExample {
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
		return this.testMap;
	}

	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	public ShallowCopyExample(int i, String n, HashMap<String, String> hm) {
		this.id = i;
		this.name = n;
		this.testMap=hm;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i=10;
		
		ShallowCopyExample ce = new ShallowCopyExample(i,s,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.getTestMap());
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.getTestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.getTestMap());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());

	
	}

}
