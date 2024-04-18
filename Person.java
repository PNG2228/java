package com.pg;
public class Person {
	public String personName;
	private int personAge;
	
    // Constructor
    public Person(String name, int age) {
        this.personName = name;
        this.personAge = age;
    }

    // Getter for name
    public String getName() {
        return personName;
    }

    // Setter for name
    public void setName(String name) {
        this.personName = name;
    }

    // Getter for age
    public int getAge() {
        return personAge;
    }

    // Setter for age
    public void setAge(int age) {
        this.personAge = age;
    }
}

