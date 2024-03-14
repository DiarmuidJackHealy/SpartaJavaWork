package com.sparta.dh.abstractshapes;

public class Square extends Shape {
    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    public Square(double side){
        this.side = side;
    }
}
