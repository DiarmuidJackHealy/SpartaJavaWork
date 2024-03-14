package com.sparta.dh.staticfinallab;

import java.util.Random;

public class Counter
{
    //attributes
    private static String name; //doorman
    private static int count; //number of people let in so far
    private static int globalCount; //total number of people let in so far by all doormen
    private static final int CAPACITY;
    static
    {
        CAPACITY = new Random().nextInt(30,120);
    }

    //constructor
    public Counter(String name)
    {
        this.name = name;
        globalCount = 0;
        count = 0;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public int getCount()
    {
        return count;
    }
    public static int getGlobalCount()
    {
        return globalCount;
    }
    public static int getCapacity()
    {
        return CAPACITY;
    }

    //behavioural methods
    public void increment()
    {
        if(globalCount < CAPACITY)
        {
            count ++;
            globalCount ++;
        }
    }

    public void decrement()
    {
        count --;
        globalCount --;
    }
}
