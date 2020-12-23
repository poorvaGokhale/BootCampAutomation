package SeleniumTest.MailSignIn;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    @Test
    public void LaunchWeb(){
     //   System.setProperty("webdriver.chrome.driver", "/Users/poorvagokhale/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");


    }
}
