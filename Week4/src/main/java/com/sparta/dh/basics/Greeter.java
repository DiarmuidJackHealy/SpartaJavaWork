package com.sparta.dh.basics;

public class Greeter {
    public static String getGreeting(int timeOfDay) {

        String greeting;

        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }

        return greeting;
    }
}
