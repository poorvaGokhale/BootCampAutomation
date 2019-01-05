package ViuWeb;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchPlayTest {

    public WebDriver driver;
    //   private WebDriverSingletonClass driverSingleton;
    public ViuPage homePage1;
    // public ViuPage searchPage1;

    @Before
    public void DriverInitialise() {
        //   driverSingleton = WebDriverSingletonClass.getWebDriverSingletonClassInstance();
        //  driver = driverSingleton.getDriverInstance();
        driver = WebDriverSingletonClass.getWebDriverSingletonClassInstance();
    }

    @Test
    public void launchHomePage() {

/*
        HomePage homepPage1 = launchPage("Viu.com");
        SearchResultPage searchResult1 = homePage1.searchOnHomePage("Banned");
        VideoPage videoPage1 = searchResult1(1).Play(click)
        videoPage1.details == annotation
*/
        homePage1 = new HomePage();
        homePage1.setViuURL("https://www.viu.com/ott/in/en/hindi/");
        driver.get(homePage1.viuURL);


        // call Homepage child class method for searching String
        ((HomePage) homePage1).setSearchVideoString("Banned");
        SearchPage searchPage1 = ((HomePage) homePage1).searchVideo(driver);


        //call SearchPage child method for Play
        searchPage1.playFirstSearchedResult(driver);


    }

    @Test
    public void menuSearchPlay() {
        homePage1 = new HomePage();
        homePage1.setViuURL("https://www.viu.com/ott/in/en/hindi/");
        driver.get(homePage1.viuURL);
        //  assertTrue(true);
        ((HomePage) homePage1).setMenuOption("Korean");
        SearchPage searchPage1 = ((HomePage) homePage1).clickMenu(driver);

    }


}
