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

public class WebTable {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with Table

        wd.get("https://demo.evershop.io/account/login");
        wd.manage().window().maximize();
        wd.findElement(By.cssSelector("input[name='email']")).sendKeys("vivek@test.com");
        wd.findElement(By.name("password")).sendKeys("welcome@123");
        wd.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
        wd.get("https://demo.evershop.io/cart");

        //Read the column names
        List<WebElement> l1 = wd.findElements(By.cssSelector("div[id='shopping-cart-items'] thead td"));
        Iterator<WebElement> i1 = l1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next().getText());
        }

        //Read the Rows
        List<WebElement> l2 = wd.findElements(By.cssSelector("div[id='shopping-cart-items'] tbody tr"));
        Iterator<WebElement> i2 = l2.iterator();
        WebElement rowElement = null;
        while (i2.hasNext()) {
            List<WebElement> l3 = null;
            rowElement = i2.next();

            l3 = rowElement.findElements(By.tagName("td"));
            System.out.println(l3.get(0).findElement(By.xpath("//div[@class='cart-tem-info']/a")).getText());
            System.out.println(l3.get(1).findElement(By.cssSelector(".sale-price")).getText());
            System.out.println(l3.get(2).findElement(By.xpath("//input[@type='text']")).getAttribute("value"));
            System.out.println(l3.get(3).getText());
        }

        wd.quit();
    }
}
