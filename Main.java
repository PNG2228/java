package com.pg;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pranay", 20);
        System.out.println("Name: " + person.personName);
        System.out.println("Age: " + person.getAge());

        // Modifying age using setter
        person.setAge(35);
        person.personName="Nishanth";
        System.out.println("New Age: " + person.getAge());
        System.out.println("New name: "+ person.personName);
    }
}