package com.sparta.dh.abstractclasses;

public class Employee extends Person implements Printable{

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("This person has left the company");
    }
    public void print() { System.out.println("Employee: " + super.getFirstName()); }
}
