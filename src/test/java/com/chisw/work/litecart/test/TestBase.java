package com.chisw.work.litecart.test;

import com.chisw.work.litecart.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));


    @BeforeClass
    public void startBrowser() {
        app.init();
    }

    @AfterClass
    public void closeBrowser() {
        app.tearDown();
    }

}
