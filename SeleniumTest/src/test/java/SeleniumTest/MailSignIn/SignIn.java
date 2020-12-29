package SeleniumTest.MailSignIn;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class SignIn {
    WebDriver driver = new ChromeDriver();
    String webUlr ="https://login.yahoo.com/";
    String invalidUserName = "Poorva";
    String invalidPasswd = "invalid@123";
    String validUserName = "validUser";
    String validPasswd = "password@123";
    WebDriverWait wait = new WebDriverWait(driver,20);
/*    ChromeOptions options = new ChromeOptions();
    options.addArgument("--allow-running-insecure-content");
    options.addArgument("--disable-web-security");
*/

    @Test
    public void InvalidUser() {
        driver.get(webUlr);
//testcase 1 Ivalid username
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-username"))).sendKeys(invalidUserName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-signin"))).click();
     //   assertThat(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username-error"))).isDisplayed()).isTrue();
        assertThat(wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-msg"))).isDisplayed()).isTrue();
        driver.close();
    }
    @Test
    public void InvalidPasswd(){
        //Valid Username  Invalid Passwd
        driver.get(webUlr);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-username"))).sendKeys(validUserName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-signin"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-passwd"))).sendKeys(invalidPasswd);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-signin"))).click();
        assertThat(wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-msg"))).isDisplayed()).isTrue();


        driver.close();

    }
    @Test
    public void ValidPasswd(){
        //Valid Username  Invalid Passwd
        driver.get(webUlr);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-username"))).sendKeys(validUserName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-signin"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-passwd"))).sendKeys(validPasswd);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-signin"))).click();
        assertThat(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("header-profile-button"))).isDisplayed()).isTrue();

        driver.close();

    }
}
