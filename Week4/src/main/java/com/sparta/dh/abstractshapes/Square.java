package com.sparta.dh.abstractshapes;

public class Square extends Shape implements Printable {
    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    public Square(double side){
        this.side = side;
    }

    public void print() {
        System.out.println("Square: " + calculateArea());
    }
}
