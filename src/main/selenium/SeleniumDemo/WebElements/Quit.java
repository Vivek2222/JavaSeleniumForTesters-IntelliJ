package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

//Close the window+session Use for clean up session
public class Quit {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Quit

        wd.get("https://demoqa.com/browser-windows");
        // Wait for the page to start loading and then refresh
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        wd.navigate().refresh();
        wd.manage().window().maximize();
        wd.findElement(By.id("tabButton")).click();
        wd.findElement(By.id("windowButton")).click();

        wd.quit();

    }
}
