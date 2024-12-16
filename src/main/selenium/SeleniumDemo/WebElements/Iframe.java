package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Iframe {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with Iframe
        wd.get("https://selectorshub.com/iframe-scenario/");

        //Indexing
        //wd.switchTo().frame(1).findElement(By.cssSelector("#inp_val")).sendKeys("Vivek");
        //String: Name or Id
        //wd.switchTo().frame("pact1").findElement(By.cssSelector("#inp_val")).sendKeys("Vivek");


        //WebElement
        WebElement frameElement = wd.findElement(By.cssSelector("#pact1"));
        //wd.switchTo().frame(frameElement).findElement(By.cssSelector("#inp_val")).sendKeys("Vivek");
        //System.out.println(wd.switchTo().parentFrame().findElement(By.id("content")).getAttribute("role"));

        //Nested Frames
        wd.switchTo().frame(frameElement).switchTo().frame("pact2").findElement(By.cssSelector("#jex")).sendKeys("Vivek");
        wd.switchTo().parentFrame().findElement(By.cssSelector("#inp_val")).sendKeys("Vivek");
        System.out.println(wd.switchTo().parentFrame().findElement(By.id("content")).getAttribute("role"));

    }
}
