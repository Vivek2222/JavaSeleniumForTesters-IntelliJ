package SeleniumDemo.WebElements.WaitMechanismAndaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with ShadowDOM
        wd.get("https://demo.evershop.io/account/login");

        //implicit wait
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("Vivek");

        System.out.println(wd.manage().timeouts().getImplicitWaitTimeout().getSeconds());

        wd.quit();
    }
}
