package com.sparta.dh.abstractclasses;

public class Customer extends Person{
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("Customer has been deleted");
    }
}
