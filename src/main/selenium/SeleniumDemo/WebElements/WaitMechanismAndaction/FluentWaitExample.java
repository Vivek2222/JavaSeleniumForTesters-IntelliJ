package SeleniumDemo.WebElements.WaitMechanismAndaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class FluentWaitExample {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with ShadowDOM
        wd.get("https://demo.evershop.io/account/login");

        //Fluent wait
        FluentWait<WebDriver> wait = new FluentWait<>(wd);
                    wait.withTimeout(Duration.ofSeconds(30))
                                    .pollingEvery(Duration.ofSeconds(5))
                                      .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.logo-icon")));

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("Vivek");

        wd.quit();
    }
}