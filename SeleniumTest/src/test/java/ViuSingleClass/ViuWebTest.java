package ViuSingleClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViuWebTest {
    @Test
    public void launchPage() {

        System.setProperty("webdriver.chrome.driver", "/Users/poorvagokhale/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.viu.com/ott/in/en/hindi/");


        //driver.findElement(By.className("browse__btn")).click();

        WebElement searchBox = driver.findElement(By.className("txtsearch"));
        searchBox.sendKeys("BANNED");
        searchBox.sendKeys(Keys.ENTER);

        WebDriverWait videoWait = new WebDriverWait(driver, 20);
        WebElement searchResult = videoWait.until(ExpectedConditions.presenceOfElementLocated(By.className("c-thumlist-card__media")));
        searchResult.click();


        //WebElement playVideo = videoWait.until(ExpectedConditions.presenceOfElementLocated(By.id("viu-video-player")));

        //  String more_container = driver.findElement(By.className("c-playerinfo")).findElement(By.className("c-title")).getAttribute("innerHTML")
//

//
//        String tabIndex = driver.findElement(By.id("viu-video-player")).getAttribute("tabindex");
//
//        assertEquals("0", tabIndex);
//
//        assertTrue("Test Failed of Video Play ....", tabIndex.equalsIgnoreCase("0"));
        // driver.close();

    }
}
