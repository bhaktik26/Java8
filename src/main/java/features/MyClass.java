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
public class MyClass implements MyFuncInterface, MyFuncInterface2 {

	@Override
	public int my1() {
		return 0;
	}

	@Override
	public int myMethod() {
		return 0;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		MyFuncInterface.super.m1();
	}

	static int m2() {
		System.out.println("MyClass");
		return 3;
	}

	public static void main(String args[]) {
		System.out.println("Main");
		MyFuncInterface.m2();
		m2();
	}

}
