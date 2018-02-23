package com.chisw.work.litecart.test;

import com.chisw.work.litecart.appmanager.CountriesPage;
import com.chisw.work.litecart.data.Countries;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestSortingTaskNine extends TestBase {

    @Test
    public void checkSortingTaskNine() {
        app.navigateTo().countriesPage();
        Countries before = app.countries().all();
        Countries after = app.countries().all();
        assertEquals(after, before);
    }

    @Test
    public void checkZones() {
        app.navigateTo().countriesPage();
        List<WebElement> countryZones = app.countries().getCountryZone().stream().filter(zone -> Integer.parseInt(zone.getText()) != 0).findAny()
    }
}
