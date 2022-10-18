package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

private final String name;

    Planets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // list the planets here.
        // Mercury, Venus, Earth, Mars, Jupiter,
        // Saturn, Uranus, Neptune
        // Don't forget to capitalization convention and enum
        // syntax to separate value and end the list

}