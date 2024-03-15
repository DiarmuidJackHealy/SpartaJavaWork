package com.sparta.dh.strings;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        System.out.println(isPalindrome("RACECAR"));
    }

    static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        if(sb.reverse().toString().equals(input)) {
            return true;
        }
        return false;
    }
}
