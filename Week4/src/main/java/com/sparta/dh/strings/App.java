package com.sparta.dh.strings;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String name1 = "Jack";
        //name.toUpperCase(); wont make it upper case
        name1 = name1.toUpperCase(); //creates a new object
        System.out.println(name1);

        System.out.println();

        String name2 = "Jack";
        String name3 = "Jack";
        String name4 = new String("Jack"); //creates a new variable outside the string pool
        String name5 = new String("DJ");
        System.out.println(name2 == name3); //returns true
        System.out.println(name2 == name4); //returns false as it's a different string object

        System.out.println();

        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());
        System.out.println(name5.hashCode());
        //hash codes are the same as they compare the contents of strings
        //rather than the string object itself
        //name5 has different content so the hash code is different

        System.out.println();

        System.out.println(System.identityHashCode(name2));//returns unique identity hash code of string object
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));
        //name2 and name3 hash codes are the same as they're the same string object
        //name4 returns a different hash code because it's a different object

        System.out.println();
        System.out.println(name3.equals(name4)); //returns true because .equals() compares contents of strings
    }

    static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        if(sb.reverse().toString().equals(input)) {
            return true;
        }
        return false;
    }
}
