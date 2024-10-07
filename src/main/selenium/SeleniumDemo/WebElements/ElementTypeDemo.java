package SeleniumDemo.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ElementTypeDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Input text, send the text
        /*
        wd.get("https://demo.evershop.io");
//        wd.get("https://demo.evershop.io/account/login");
//        wd.findElement(By.cssSelector("input[name='email']")).sendKeys("vivek@test.com");
//        wd.findElement(By.name("password")).sendKeys("welcome@123");
//        wd.findElement(By.className("primary")).click();

        wd.findElement(By.cssSelector(".search-icon")).click();

        wd.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Men");

        //Fetch the data
        String s1 = wd.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("value");
        System.out.println(s1);
         */

        //Dropdown
/*
        wd.get("https://demo.evershop.io");
        wd.findElement(By.xpath("//a[text()='Men']")).click();

        WebElement e1 = wd.findElement(By.className("form-field"));
        Select s1 = new Select(e1);

        List<WebElement> l1 = s1.getOptions();
        Iterator<WebElement> i1 = l1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next().getText());
        }

        s1.selectByIndex(2);
        s1.selectByVisibleText("Name");
        s1.selectByValue("price");
*/

        //findElements List
        /*
        wd.get("https://demo.evershop.io");
        wd.findElement(By.xpath("//a[text()='Men']")).click();
        List<WebElement> l2 = wd.findElements(By.cssSelector(".form-field option"));
        Iterator<WebElement> i2 = l2.iterator();
//        while(i2.hasNext()){
//            System.out.println(i2.next().getText());
//        }
        wd.findElement(By.className("form-field")).click();
        WebElement e3 = null;
        while(i2.hasNext()){
            e3 = i2.next();
            if (e3.getAttribute("value").equals("name")){
                e3.click();
            }
        }
        //l2.get(2).click();
        */


    }
}
