package com.ViuWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingletonClass {

    private static WebDriver driver = null;
    private static WebDriverSingletonClass drievrSingleton = null;
    //      System.setProperty("webdriver.chrome.driver","/Users/poorvagokhale/Downloads/chromedriver");


    private WebDriverSingletonClass() {

    }

    public WebDriver getDriverInstance() {
        // WebDriver initialise for all Package -project to be accessible for all other  classes

        if (driver == null) {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "/Users/poorvagokhale/Downloads/chromedriver");
        }

        return driver;
    }


    public static WebDriverSingletonClass getWebDriverSingletonClassInstance() {
        if (drievrSingleton == null) drievrSingleton = new WebDriverSingletonClass();
        return drievrSingleton;
    }
}
