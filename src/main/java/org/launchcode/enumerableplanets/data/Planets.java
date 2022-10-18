package org.launchcode.enumerableplanets.data;

import java.util.HashMap;

public enum Planets {

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

private final String name;

private int yearLength;
//Back in the Planets enum, add a new field called yearLength.
//
//    The value of each yearLength should be the number of earth days of a year on the given planet.
//    Number of earth days on each planet:
//    Mercury: 88
//    Venus: 225
//    Earth: 365
//    Mars: 687
//    Jupiter: 4333
//    Saturn: 10759
//    Uranus: 30687
//    Neptune: 60200
//    Update the constructor and add a getter for this field.

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }
    public int getYearLength() {
        return yearLength;
    }
}