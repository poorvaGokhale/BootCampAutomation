package ViuWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends ViuPage {
    String searchVideoString, menuOption;
    ViuPage searchPage1 = new SearchPage();

    public void setSearchVideoString(String searchVideoString) {
        this.searchVideoString = searchVideoString;
    }

    public void setMenuOption(String menuOption) {
        this.menuOption = menuOption;
    }


    public SearchPage searchVideo(WebDriver driver) {
        //   searchVideoString = "Banned";
        WebElement viuSearchBox = driver.findElement(By.className("txtsearch"));
        viuSearchBox.sendKeys(searchVideoString);
        viuSearchBox.sendKeys(ENTER);
        return ((SearchPage) searchPage1);
    }

    public SearchPage clickMenu(WebDriver driver) {
        WebElement viuMenu = driver.findElement(By.className("menusidebar"));
        viuMenu.click();

        WebDriverWait menuWait = new WebDriverWait(driver, 20);
        WebElement viuMenuOption = menuWait.until(ExpectedConditions.presenceOfElementLocated(By.className("drdown")));
        viuMenuOption.click();
        menuWait.until(ExpectedConditions.presenceOfElementLocated(By.className("drdown__options")));

        // code using ClassName: List is not found: not working
        // List<WebElement> webList = viuMenuOption.findElements(By.className("drdown__options"));
        // code using XPATH: Working
        // List<WebElement> webList = By.xpath("//button[contains(@class,'dd__opt')]").findElements(viuMenuOption);

        // code using cssSelector: Working
        List<WebElement> webList = viuMenuOption.findElements(By.cssSelector("button.dd__opt"));


        System.out.println("Test Execution Log: Weblist Elements Size for content preference:" + webList.size());

        for ( int listIterator = 0; listIterator < webList.size() ; listIterator++) {
            if (webList.get(listIterator).getText().compareToIgnoreCase(menuOption) == 0)
                webList.get(listIterator).click();
        }



        return ((SearchPage) searchPage1);

    }

    private void foreach(List<WebElement> webList) {
    }
}
