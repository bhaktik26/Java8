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

@SuppressWarnings({ "javadoc", "nls" })
@FunctionalInterface
public interface MyFuncInterface2 {

	int my1();

	default void m1() {
		System.out.println("HELLO");
	}

	static int m2() {
		System.out.println("MyFuncInterface2");
		return 1;
	}
}
