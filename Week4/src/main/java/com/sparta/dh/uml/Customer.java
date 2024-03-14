package com.sparta.dh.uml;

public class Customer extends Person{
    private String deliveryAddress;


    public Customer(String firstName, String secondName, String deliveryAddress) {
        super(firstName, secondName);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String getDetails() {
        return "Delivery Address: " + deliveryAddress + ", " + super.getDetails();
    }
}
