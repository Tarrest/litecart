package com.chisw.work.litecart.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void countriesPage() {
        click(By.linkText("Countries"));
    }
}
