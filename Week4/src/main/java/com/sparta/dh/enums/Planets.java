package com.sparta.dh.enums;

public enum Planets {
    MERCURY("Mercury", 0.39, 0.33),
    VENUS("Venus", 0.72, 0.81),
    EARTH("Earth", 1, 1),
    MARS("Mars", 1.52, 0.11),
    JUPITER("Jupiter", 5.2, 317.8),
    SATURN("Saturn", 9.54, 95.16),
    URANUS("Uranus", 19.2, 14.54),
    NEPTUNE("Neptune", 30.06, 17.1),
    PLUTO("Pluto", 34.3, 0.063);

    private String name;
    private double distance;
    private double mass;

    Planets(String name, double distance, double mass) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
    }

    public static void main(String[] args) {
        Planets p1 = Planets.EARTH;
        Planets p2 = Planets.PLUTO;
        Planets p3 = Planets.SATURN;

        System.out.println(p1.mass == p1.distance);
        System.out.println(p2.name.equals(PLUTO.name));
        System.out.println(p3.name.equals(JUPITER.name));
        System.out.println(p3.name());
    }
}
