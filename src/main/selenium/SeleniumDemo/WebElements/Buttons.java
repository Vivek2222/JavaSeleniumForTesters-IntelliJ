package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Buttons {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with buttons
        wd.get("https://demo.evershop.io/account/login");
        wd.findElement(By.xpath("//button[@type='submit']")).click();
        String s1 = wd.findElement(By.xpath("//button[@type='submit']")).getText();
        System.out.println(s1);
        boolean isDisplayed = wd.findElement(By.cssSelector(".pl025.text-critical")).isDisplayed();
        System.out.println("Element is displayed: " + isDisplayed);

    }
}
