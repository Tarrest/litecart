package com.chisw.work.litecart.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountriesData {

    private String countryName;
    private int countryZone;

    public String getCountryName() {
        return countryName;
    }
    public int getCountryZone() {
        return countryZone;
    }

    public CountriesData withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public CountriesData withCountryZone(int countryZone) {
        this.countryZone = countryZone;
        return this;
    }

    private List<CountriesData> countries = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountriesData that = (CountriesData) o;
        return Objects.equals(countryName, that.countryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName);
    }

    @Override
    public String toString() {
        return "CountiesData{" +
                "countryName='" + countryName + '\'' +
                '}';
    }

}
