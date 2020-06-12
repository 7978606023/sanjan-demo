package com.wbl;

public class Person {

	        String title;
	        String name;
	        String surname;
	        int age;

	        public Person() {

	        }

	        /**
	         * Parameterised Constructor.
	         *
	         * @param title   of Person
	         * @param name    of Person
	         * @param surname of Person
	         * @param age     of Person
	         */
	        public Person(String title, String name, String surname, int age) {
	            this.title = title;
	            this.name = name;
	            this.age = age;
	            this.surname = surname;
	        }

	        String getTitle() {
	            return title;
	        }

	        public int getAge() {
	            return age;
	        }

	        public String getName() {
	            return name;
	        }

	        String getSurname() {
	            return surname;
	        }

	        @Override
	        public String toString() {
	            return "Person1 : " + " name : " + name + " surname : " + surname + " title : " + title + " age : " + age;
	        }

	    }

