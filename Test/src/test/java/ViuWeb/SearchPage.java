package ViuWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends ViuPage {
    public void playFirstSearchedResult(WebDriver driver) {

        WebDriverWait videoWait = new WebDriverWait(driver, 20);
        WebElement firstSearchResult = videoWait.until(ExpectedConditions.presenceOfElementLocated(By.className("c-thumlist-card__media")));
        firstSearchResult.click();

    }
}
