package com.wbl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.Collection;
import com.wbl.Person;

public class CollectionTest {
	    List<Person> list;
	    Person p5;
	    Person p1;
	    Person p2;
	    Person p3;

	    /**
	     * Initialization Method.
	     */
	    @BeforeMethod
	    public void init() {

	         p1 = new Person("mr", "sanjan", "sumanth", 23);
	         p2 = new Person("mr", "Arjun", "ravi", 25);
	         p3 = new Person("mr", "laskhman", "shiva", 30);
	        list = new ArrayList<Person>(Arrays.asList(p1, p2, p3));
	    }

	    @Test
	    public void PersonByAge20() {
	        List<Person> actual = Collection.getPersonsByAge(list, 20);
	        List<Person> expected = new ArrayList<Person>(Arrays.asList(p1, p2, p3));
	        Assert.assertEquals(actual, expected);
	    }

	    @Test
	    public void PersonByAge30() {
	        List<Person> actual = Collection.getPersonsByAge(list, 30);
	        List<Person> expected = new ArrayList<Person>(Arrays.asList(p3));
	        Assert.assertEquals(actual, expected);
	    }



	    @Test
	    public void MaxAge() {
	        Optional<Person> actual = Collection.getMaxAge(list);
	        Optional<Person> expected = Optional.of(p3);
	        Assert.assertEquals(actual, expected);
	    }

	    @Test
	    public void GroupByAge() {
	        Map<Integer, List<Person>> actual = Collection.groupByAge(list);
	        System.out.println(actual.size());
	        Map<Integer, List<Person>> expected = CollectionTest.putDataInMap(list);
	        Assert.assertEquals(actual, expected);
	    }


	    @Test
	    public void NameByAge() {
	        Map<Integer, List<String>> actual = Collection.getNamesByAge(list);
	        System.out.println(actual.size());
	        Map<Integer, List<String>> expected = CollectionTest.getNameData(list);
	        Assert.assertEquals(actual, expected);
	    }


	    /**
	     * Method to get the people by grouping with Ages.
	     *
	     * @param persons List of People
	     * @return Person using Optional FI with grouping by age
	     */
	    public static Map<Integer, List<Person>> putDataInMap(List<Person> persons) {
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
	    public static Map<Integer, Long> countData(List<Person> persons) {
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
	    public static Map<Integer, List<String>> getNameData(List<Person> persons) {
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
}
