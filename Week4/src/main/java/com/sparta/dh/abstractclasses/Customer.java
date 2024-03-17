package com.sparta.dh.abstractclasses;

import java.util.Objects;

public class Customer extends Person implements Printable {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        return (obj instanceof Customer anotherCustomer)
                && getFirstName().equals(anotherCustomer.getFirstName())
                && getLastName().equals(anotherCustomer.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
