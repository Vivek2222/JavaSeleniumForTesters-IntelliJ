package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ShadowDOM {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with ShadowDOM
        wd.get("https://selectorshub.com/xpath-practice-page/");
        wd.manage().window().maximize();
        SearchContext shadowRoot = wd.findElement(By.xpath("//div[@id='userName']")).getShadowRoot();
        shadowRoot.findElement(By.cssSelector("#kils")).sendKeys("Vivek");

        SearchContext innershadowRoot = shadowRoot.findElement(By.cssSelector("#app2")).getShadowRoot();
        innershadowRoot.findElement(By.cssSelector("#pizza")).sendKeys("Cheese");

        Thread.sleep(3000);
        wd.quit();

    }
}
