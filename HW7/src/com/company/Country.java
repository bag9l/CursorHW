package com.company;

import static com.company.Continent.*;

public enum Country {
    UKRAINE("Ukraine", ASIA),
    FRANCE("France", EUROPE),
    POLAND("Poland", EUROPE),
    ISRAEL("Israel", EUROPE),
    USA("USA", NORTH_AMERICA),
    ARGENTINA("Argentina", SOUTH_AMERICA),
    AUSTRALIA("Australia", OCEANIA);

    private String countryName;
    private Continent continent;

    Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
