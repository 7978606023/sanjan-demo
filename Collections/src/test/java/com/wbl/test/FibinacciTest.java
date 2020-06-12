package com.wbl.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.FibonacciEx;

public class FibinacciTest {

	public class FibonacciSeriesTest {
	   
	    List<Integer> actual;
	    List<Integer> expected;

	    @BeforeMethod
	    public void init() {
	        actual = new ArrayList<>();
	        expected = new ArrayList<>();
	    }

	    @Test
	    public void testWithPositive() {
	        actual = FibonacciEx.fibonacci(4);
	        expected = new ArrayList<>(Arrays.asList(0, 1, 1, 2));
	        assertEquals(actual, expected);
	    }

	    @Test
	    public void testWithNegative() {
	        actual = FibonacciEx.fibonacci(-5);
	        expected = Collections.emptyList();
	        assertEquals(actual, expected);
	    }

	    @Test
	    public void testWithZero() {
	        actual = FibonacciEx.fibonacci(0);
	        expected = Collections.emptyList();
	        assertEquals(actual, expected);
	    }

	    @Test
	    public void testWithOne() {
	        actual = FibonacciEx.fibonacci(1);
	        expected = Collections.emptyList();
	        assertEquals(actual, expected);
	    }
}
}
