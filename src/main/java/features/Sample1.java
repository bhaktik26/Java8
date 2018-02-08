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

/**
 * 
 * @author 212626994
 */
public class Sample1 {
	/**
	 * @param args
	 */
	@SuppressWarnings({ "nls", "javadoc" })
	public static void main(String args[]) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Using anonymous class");

			}
		};

		Runnable r2 = () -> System.out.println("Using lambda");
		r1.run();
		r2.run();

	}
}
