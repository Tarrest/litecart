package com.chisw.work.litecart.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String password) {
        type(By.name("username"), user);
        type(By.name("password"), password);
        click(By.name("login"));
    }
}