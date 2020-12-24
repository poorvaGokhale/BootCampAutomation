package SeleniumTest.MailSignIn;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    @Test
    public void LaunchWeb(){
        String webUlr ="https://login.yahoo.com/";
        String InvalidUserName = "Test";
        String ValidUserName = "Poorva.Gokhale26";
        String ValidPasswd = "";


        WebDriver driver = new ChromeDriver();
        driver.get(webUlr);
//testcase 1 Ivalid username
/*        WebElement userNameInputtxtBox = driver.findElement(By.id("login-username"));
        userNameInputtxtBox.sendKeys(InvalidUserName);
        WebElement signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();
*/
        //Valid Username  Invalid Passwd
        WebElement userNameInputtxtBox = driver.findElement(By.id("login-username"));
        userNameInputtxtBox.sendKeys(ValidUserName);
        WebElement signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();
        WebElement passwdInputBox =driver.findElement(By.id("login-passwd"));
        passwdInputBox.sendKeys(InvalidUserName);

        signInButton = driver.findElement(By.id("login-signin"));
        signInButton.submit();


        driver.close();

    }
}
