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

import java.time.Instant;

/**
 * 
 * @author 212626994
 */
public class InstantExample {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "javadoc", "nls" })
	public static void main(String[] args) {
		Instant currentTime = Instant.now();
		System.out.println("The current time is: " + currentTime);

	}

}
