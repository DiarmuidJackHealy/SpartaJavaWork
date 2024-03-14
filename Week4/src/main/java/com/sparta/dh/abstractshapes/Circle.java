package com.sparta.dh.abstractshapes;

public class Circle extends Shape{

    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

}
