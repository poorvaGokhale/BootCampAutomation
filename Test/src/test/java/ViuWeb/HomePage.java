package ViuWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends ViuPage{
    public void setSearchVideoString(String searchVideoString) {
        this.searchVideoString = searchVideoString;
    }

    String searchVideoString;
    ViuPage searchPage1=new SearchPage();
    public SearchPage searchVideo(WebDriver driver) {
     //   searchVideoString = "Banned";
        WebElement viuSearchBox = driver.findElement(By.className("txtsearch"));
        viuSearchBox.sendKeys(searchVideoString);
        viuSearchBox.sendKeys(ENTER);
        return ((SearchPage)searchPage1);
    }
}
