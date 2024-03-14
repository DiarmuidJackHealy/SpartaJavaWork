package com.sparta.dh.uml;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("DJ", "Healy");
        System.out.println(p1.getDetails());
        System.out.println("\n");

        Customer c1 = new Customer("Jack", "Healy", "Belfast");
        System.out.println(c1.getDetails());
        System.out.println("\n");
    }
}
