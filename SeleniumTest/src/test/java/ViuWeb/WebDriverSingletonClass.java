package ViuWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingletonClass {

    private static WebDriver driver = null;
    private static WebDriverSingletonClass drievrSingleton = null;
    //      System.setProperty("webdriver.chrome.driver","/Users/poorvagokhale/Downloads/chromedriver");


    private WebDriverSingletonClass() {

    }



    public static WebDriver getWebDriverSingletonClassInstance() {
        if (driver == null) {
    //        WebDriverSingletonClass driverSingleton = new WebDriverSingletonClass();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
