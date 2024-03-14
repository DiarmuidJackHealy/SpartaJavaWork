package com.sparta.dh.abstractshapes;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        Circle c = new Circle(12.0);
//        Square sq = new Square(8.0);
//
////        System.out.println(c);      // outputs This shape has an area of 452.3893421169302
////        System.out.println(sq);     // outputs This shape has an area of 64.0
//
//        c.print();
//        sq.print();

        Printable square = new Square(4);
        Printable circle = new Circle(10);

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(square);
        printables.add(circle);

        for(Printable p : printables) {
            p.print();
        }
   }
}
