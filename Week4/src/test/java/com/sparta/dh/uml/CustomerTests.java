package com.sparta.dh.uml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTests {
    @Test
    @DisplayName("Customer first name")
    public void getCustomerFirstName_Test() {
        Customer c1 = new Customer("Jack", "Healy", "Belfast");
        String name = "Jack";
        String res = c1.getFirstName();
        Assertions.assertEquals(name, res);
    }

    @Test
    @DisplayName("Customer second name")
    public void getCustomerSecondName_Test() {
        Customer c1 = new Customer("Jack", "Healy", "Belfast");
        String name = "Healy";
        String res = c1.getSecondName();
        Assertions.assertEquals(name, res);
    }
    @Test
    @DisplayName("Customer Delivery Address")
    public void getCustomerDeliveryAddress_Test() {
        Customer c1 = new Customer("Jack", "Healy", "Belfast");
        String address = "Belfast";
        String res = c1.getDeliveryAddress();
        Assertions.assertEquals(address, res);
    }
}
