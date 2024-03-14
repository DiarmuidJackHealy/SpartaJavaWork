package com.sparta.dh.staticfinallab;

import java.util.Random;

public class CounterApp {
    public static void main(String[] args) {
        // create the counters
        Counter[] theCounters = {
                new Counter("James", 0),
                new Counter("Avril", 0),
                new Counter("Rishi", 0),
                new Counter("Mo", 0)
        };

        // run the simulation
        Random random = new Random();
        for (int i=0; i < 75; i++) {
            int index = random.nextInt(theCounters.length);
            theCounters[index].increment();
        }
        // how many customers did each doorperson let in?
        for (Counter c : theCounters) {
            System.out.println(c);
        }
        // how many customers do we have?  Have we reached capacity?
        System.out.println("Overall count: " + Counter.getGlobalCount());
        System.out.println("Capacity: " + Counter.getCapacity());
    }
}
