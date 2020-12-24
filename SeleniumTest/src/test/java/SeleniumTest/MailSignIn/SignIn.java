package SeleniumTest.MailSignIn;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    WebDriver driver = new ChromeDriver();
    String webUlr ="https://login.yahoo.com/";
    String invalidUserName = "Test";
    String validUserName = "aamod_00";
    String validPasswd = "";

    @Test
    public void InvalidUser() {
        driver.get(webUlr);
//testcase 1 Ivalid username
        WebElement userNameInputtxtBox = driver.findElement(By.id("login-username"));
        userNameInputtxtBox.sendKeys(invalidUserName);
        WebElement signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();
        driver.close();
    }
    @Test
    public void InvalidPasswd(){
        //Valid Username  Invalid Passwd
        driver.get(webUlr);
        WebElement userNameInputtxtBox = driver.findElement(By.id("login-username"));
        userNameInputtxtBox.sendKeys(validUserName);
        WebElement signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();
        WebElement passwdInputBox =driver.findElement(By.id("login-passwd"));
        passwdInputBox.sendKeys(invalidUserName);

        signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();

        driver.close();

    }
    @Test
    public void ValidPasswd(){
        //Valid Username  Invalid Passwd
        driver.get(webUlr);
        WebElement userNameInputtxtBox = driver.findElement(By.id("login-username"));
        userNameInputtxtBox.sendKeys(validUserName);
        WebElement signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();
        WebElement passwdInputBox =driver.findElement(By.id("login-passwd"));
        passwdInputBox.sendKeys(validPasswd);

        signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();

        driver.close();

    }
}
