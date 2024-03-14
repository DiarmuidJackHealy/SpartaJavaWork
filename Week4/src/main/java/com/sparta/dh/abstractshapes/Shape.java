package com.sparta.dh.abstractshapes;

public abstract class Shape {
    public abstract double calculateArea();

    public String toString()
    {
        double area = calculateArea();
        String res = String.valueOf(area);
        return res;
    }
}
