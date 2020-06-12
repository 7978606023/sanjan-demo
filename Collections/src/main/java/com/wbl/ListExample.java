package com.wbl;

import java.util.List;
import java.util.stream.Collectors;

public class ListExample {


		/**
		 * @param strings string
		 * @return value
		 */
		public List<String> refernce(final List<String> strings) {
		List<String> sorted = strings
		.stream()
		.sorted((s1, s2) -> s1.compareTo(s2))
		.collect(Collectors.toList());
		return sorted;
		}
		}

