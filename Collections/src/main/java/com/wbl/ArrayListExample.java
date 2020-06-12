package com.wbl;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	/**
	 * this is simple list interface.
	 * 
	 * @return al
	 */

	public List<String> myArray() {
		List<String> al = new ArrayList<>();
		al.add("Customer1");
		al.add("Customer2");
		al.add("Customer3");
		return al;
	}
}
