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

/**
 * 
 * @author 212626994
 */
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    @SuppressWarnings("nls")
	public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo");
        Spliterator<String> splitStr = nameList.spliterator();
        Spliterator<String> splitStr2 = splitStr.trySplit();
        // Check if splitting actually happened, then use it
        if(splitStr2 != null){
            System.out.println("Spliterator-2");
            while(splitStr2.tryAdvance((n) -> System.out.println("name - " + n)));
        }
        // Original spliterator
        System.out.println("Original Spliterator");
        while(splitStr.tryAdvance((n) -> System.out.println("name - " + n)));
    }
        
}