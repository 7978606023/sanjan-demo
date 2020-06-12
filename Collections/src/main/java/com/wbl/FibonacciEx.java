package com.wbl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class FibonacciEx {
	    /**
	     * @param input to limit the Range of Series
	     * @return List of Fibonacci series elements
	     */
	    public static List<Integer> fibonacci(int input) {
	        if (input < 2) {
	            return Collections.emptyList();
	        }
	        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
	                .limit(input)
	                .map(n -> n[0])
	                .collect(toList());
	    }

	    public static void main(String[] args) {
	    	FibonacciEx.fibonacci(2).forEach(System.out::println);
	    }
	}

