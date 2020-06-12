package com.wbl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {
	    /**
	     * Method to get persons by Age.
	     *
	     * @param persons list of people
	     * @param age     as input
	     * @return greaterthan or equalTo the age Stream of people
	     */
	    public static List<Person> getPersonsByAge(List<Person> persons, int age) {
	        if (age <= 0 || persons.isEmpty()) {
	            return Collections.emptyList();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.filter(p -> p.getAge() >= age).collect(Collectors.toList());
	    }

	    /**
	     * Method to get Minimum age among the People.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with young age among the people
	     */
	    public static Optional<Person> getMinAge(List<Person> persons) {
	        if (persons.isEmpty()) {
	            return Optional.empty();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.min(Comparator.comparing(Person::getAge));
	    }

	    /**
	     * Method to get Maximum age among the People.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with old age among the people
	     */
	    public static Optional<Person> getMaxAge(List<Person> persons) {
	        if (persons.isEmpty()) {
	            return Optional.empty();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.max(Comparator.comparing(Person::getAge));
	    }

	    /**
	     * Method to get the people by grouping with Ages.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with grouping by age
	     */
	    public static Map<Integer, List<Person>> groupByAge(List<Person> persons) {
	        if (persons.isEmpty()) {
	            return Collections.emptyMap();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.collect(
	                Collectors.groupingBy(
	                        Person::getAge
	                )
	        );
	    }

	    /**
	     * Method to get the people by grouping and counting with Ages.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with grouping and count by age
	     */
	    public static Map<Integer, Long> countByAge(List<Person> persons) {
	        if (persons.isEmpty()) {
	            return Collections.emptyMap();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.collect(
	                Collectors.groupingBy(
	                        Person::getAge,
	                        Collectors.counting()
	                )
	        );
	    }

	    /**
	     * Method to get the people by grouping with Ages and Mapping with Names.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with grouping and count by age and Name
	     */
	    public static Map<Integer, List<String>> getNamesByAge(List<Person> persons) {
	        if (persons.isEmpty()) {
	            return Collections.emptyMap();
	        }
	        Stream<Person> stream = persons.stream();
	        return stream.collect(
	                Collectors.groupingBy(
	                        Person::getAge,
	                        Collectors.mapping(
	                                Person::getName,
	                                Collectors.toList()
	                        )
	                )
	        );
	    }

	    /**
	     * MainMethod.
	     *
	     * @param args String array
	     */
	    public static void main(String[] args) {
	        Person p1 = new Person("mr", "sanjan", "sumanth", 23);
	        Person p2 = new Person("mr", "Arjun", "ravi", 25);
	        Person p3 = new Person("mr", "laskhman", "shiva", 30);
	        List<Person> list = new ArrayList<Person>(Arrays.asList(p1, p2, p3));

	        System.out.println(countByAge(list));
	    }
}
