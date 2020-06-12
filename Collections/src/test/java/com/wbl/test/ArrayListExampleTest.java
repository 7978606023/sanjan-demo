package com.wbl.test;

import java.util.List;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.ArrayListExample;

public class ArrayListExampleTest {

		
	ArrayListExample arraylistexa = null;
		@BeforeTest
		public void setUp() {
			arraylistexa = new ArrayListExample();
		}
		   @Test
		    public void testMyArray() {

		       Assert.assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), arraylistexa.myArray());
		    }
		   
		   //@Test
		   public void myArrayTest()    {
		       List<String> result = arraylistexa.myArray();
		       Assert.assertEquals("Wrong 1st element", "Customer1", result.get(0));
		       Assert.assertEquals("Wrong 2nd element", "Customer2", result.get(1));
		       Assert.assertEquals("Wrong 3rd element", "Customer3", result.get(2));
		   }
		}

