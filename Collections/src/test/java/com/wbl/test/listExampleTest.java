package com.wbl.test;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.ListExample;

public class listExampleTest {


	ListExample refernce = null;
	
	@BeforeTest
	public void setUp() {
		refernce = new ListExample();
	}
	@Test
	public void test() {
			List<String> input = Arrays
			        .asList("how", "to", "do", "in", "java", "dot", "com");
			List<String> actual = refernce.refernce(input);
			List<String> expected = Arrays.asList("com", "do", "dot", "how", "in", "java", "to");
			Assert.assertEquals(actual, expected);
			 
	}
}
