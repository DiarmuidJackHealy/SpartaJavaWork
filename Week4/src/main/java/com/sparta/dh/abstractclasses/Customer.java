package com.sparta.dh.abstractclasses;

public class Customer extends Person implements Printable{
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("Customer has been deleted");
    }

    @Override
    public void print() {
        System.out.println("Customer: " + super.getFirstName());
    }
}
