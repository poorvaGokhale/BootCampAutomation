package com.ViuWeb;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class SearchPlayTest {
    /*
     HomePage homepPage1 = launchPage("Viu.com");
     SearchResultPage searchResult1 = homePage1.searchOnHomePage("Banned");
     VideoPage videoPage1 =  searchResult1(1).Play(click)
     videoPage1.details == annotation
  */
    public WebDriver driver;
    private WebDriverSingletonClass drievrSingleton;
    public ViuPage homePage1;
    // public ViuPage searchPage1;

    @Before
    public void DriverInitialise() {
        drievrSingleton = WebDriverSingletonClass.getWebDriverSingletonClassInstance();
        driver = drievrSingleton.getDriverInstance();
    }

    @Test
    public void launchHomePage() {
        homePage1 = new HomePage();
        //    homePage1.driver.get("https://www.viu.com/ott/in/en/hindi/");
        homePage1.setViuURL("https://www.viu.com/ott/in/en/hindi/");
        driver.get(homePage1.viuURL);


        // call Homepage child class method for searching String
        ((HomePage) homePage1).setSearchVideoString("Banned");
        SearchPage searchPage1 = ((HomePage) homePage1).searchVideo(driver);


        //call SearchPage child method for Play
        searchPage1.playFirstSearchedResult(driver);
    }

    public void searchPlay() {
        assertTrue(true);
    }


}
