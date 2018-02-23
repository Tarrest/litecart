package com.chisw.work.litecart.data;

import com.google.common.collect.ForwardingList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Countries extends ForwardingList<CountriesData> {

    private List<CountriesData> delegate;

    public Countries(Countries countries) {
        this.delegate = new ArrayList<CountriesData>(countries.delegate);
    }

    public Countries() {
        this.delegate = new ArrayList<CountriesData>();
    }

    public Countries(Collection<CountriesData> countries) {
        this.delegate = new ArrayList<CountriesData>(countries);
    }

    @Override
    protected List<CountriesData> delegate() {
        return delegate;
    }

    public Countries withAdded(CountriesData country) {
        Countries countries = new Countries(this);
        countries.add(country);
        return countries;
    }

    public Countries withoutAdded(CountriesData country) {
        Countries countries = new Countries(this);
        countries.remove(country);
        return countries;
    }
}
