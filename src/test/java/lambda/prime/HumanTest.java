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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 * @author 212626994
 */
public class HumanTest extends TestCase {

   @Test
   public void test()
   {
	   List<Human> list = new ArrayList();
	   list.add(new Human("Sarah", 10));
	   list.add(new Human("Jack", 12));
	   list.sort((h1,h2)->h1.getName().compareTo(h2.getName()));
	   Assert.assertEquals(list.get(0), new Human("Jack", 12));
   }
}
