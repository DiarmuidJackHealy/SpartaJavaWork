package com.sparta.dh.enums;

public enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        Days dayOfTheWeek = Days.TUESDAY;
        Days tomorrow = Days.WEDNESDAY;
        Days start = Days.SUNDAY;

        System.out.println(dayOfTheWeek.ordinal());

        System.out.println(tomorrow.ordinal());
        System.out.println(start.ordinal());

        System.out.println(start.compareTo(tomorrow));
    }
}
