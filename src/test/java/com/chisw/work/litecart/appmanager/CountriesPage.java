package com.chisw.work.litecart.appmanager;

import com.chisw.work.litecart.data.Countries;
import com.chisw.work.litecart.data.CountriesData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountriesPage extends BaseHelper{


    public CountriesPage(WebDriver driver) {
        super(driver);
    }


    private Countries countryCache = null;

    public Countries all() {
        if (countryCache != null) {
            return new Countries(countryCache);
        }

        countryCache = new Countries();
        List<WebElement> elements = driver.findElements(By.xpath("//form[@name='countries_form']//td[5]/a"));
        for (WebElement element : elements) {
            String countryName = element.getText();
            CountriesData country = new CountriesData().withCountryName(countryName);
            countryCache.add(country);
        }
        return new Countries(countryCache);
    }

    public List<WebElement> getCountryZone() {
        List<WebElement> elements = driver.findElements(By.xpath("//form[@name='countries_form']//td[6]"));
        return elements;
    }
}
