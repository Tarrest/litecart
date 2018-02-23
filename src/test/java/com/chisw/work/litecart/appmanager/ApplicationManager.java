package com.chisw.work.litecart.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private final Properties properties;
    WebDriver driver;
    private String browser;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private CountriesPage countriesPage;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        }
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        countriesPage = new CountriesPage(driver);
        //driver.get(properties.getProperty("web.baseUrl"));
        driver.get("http://localhost/litecart/admin/");
        sessionHelper.login("admin", "admin" );
    }

    public void tearDown() {
        driver.quit();
    }

    public NavigationHelper navigateTo() {
        return navigationHelper;
    }

    public CountriesPage countries() {
        return countriesPage;
    }
}
