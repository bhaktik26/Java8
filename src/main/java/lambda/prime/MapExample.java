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

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author 212626994
 */
public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "a");
		for(int i = 0 ; i<5; i++)
			map.putIfAbsent(i, "value" + i);
		System.out.println(map.entrySet());
		map.computeIfAbsent(5, num -> "b");
		System.out.println(map.get(5));
		System.out.println(map.getOrDefault(6, "Key doesnt exist"));
		System.out.println(map.remove(5, "c"));
		System.out.println(map.remove(5, "b"));
		System.out.println(map.get(5));
		map.merge(7, "val7", (val,newVal) -> val.concat(newVal));
		System.out.println(map.get(7));
		map.merge(7, "7", (val,newVal) -> val.concat(newVal));
		System.out.println(map.get(7));
		

	}

}
