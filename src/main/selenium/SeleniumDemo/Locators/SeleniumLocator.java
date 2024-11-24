package SeleniumDemo.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class SeleniumLocator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();

        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);
        //open url method
        wd.get("https://demo.evershop.io/account/login");
        //WebElement
        //wd.findElement(By.xpath("//input[@name='email']")).sendKeys("vivek@gmail.com");

        //Locator Strategy:
        //wd.findElement(By.xpath("(//form[@id='loginForm']//input)[1]")).sendKeys("vivek@gmail.com");
        //css-path
        wd.findElement(By.cssSelector("input[name='email']")).sendKeys("vivek@test.com");

        //ClassName [Allows to work with one class, doesn't work with compounded classed [for these use xpath, css path]]
        String s1 = wd.findElement(By.className("primary")).getAttribute("type");

        //Using Compounded classed using css-path locator
        //String s1 = wd.findElement(By.cssSelector(".button.primary")).getAttribute("type");
        System.out.println(s1);

        //id
        String s2 = wd.findElement(By.id("app")).getAttribute("class");
        System.out.println(s2);

        //name
        wd.findElement(By.name("password")).sendKeys("welcome@123");

        //tagName
        //String s3 = wd.findElement(By.tagName("input")).getAttribute("name");
        //System.out.println(s3);

        List<WebElement> l1 = wd.findElements(By.tagName("input"));
        Iterator<WebElement> i1 = l1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next().getAttribute("name"));
        }

        wd.findElement(By.className("primary")).click();

        //LinkText
        wd.findElement(By.linkText("Men")).click();

        //PartialLinkText
        wd.findElement(By.partialLinkText("Nike air zoom")).click();

        wd.close();
    }
}