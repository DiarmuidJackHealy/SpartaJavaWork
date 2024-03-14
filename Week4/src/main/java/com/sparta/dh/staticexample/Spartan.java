package com.sparta.dh.staticexample;

public class Spartan {
    private static String name; //Belongs to the class - not the object

    //static block
    static {
        //once class is loaded - once only
        System.out.println("I'm in a static block");
        name = "no name assigned";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        Spartan.name = name;
    }

    public static void main(String[] args) {
        Spartan dj = new Spartan();
        Spartan alex = new Spartan();

//        dj.setName("DJ");
//        alex.setName("Alex");

        System.out.println(dj.getName());
        System.out.println(alex.getName());
    }
}
