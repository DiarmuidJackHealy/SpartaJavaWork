package com.sparta.dh.abstractclasses;

import com.sparta.dh.abstractshapes.Circle;
import com.sparta.dh.abstractshapes.Square;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Printable customer = new Customer("DJ", "Healy");
        Printable employee = new Employee("Jack", "Healy");

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(customer);
        printables.add(employee);

        for(Printable p : printables) {
            p.print();
        }
    }
}
