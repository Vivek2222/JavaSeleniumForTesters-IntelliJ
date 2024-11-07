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

public class Dropdown_FindingElementsandList {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //findElements List

        wd.get("https://demo.evershop.io");
        wd.findElement(By.xpath("//a[text()='Men']")).click();
        List<WebElement> l2 = wd.findElements(By.cssSelector(".form-field option"));
        Iterator<WebElement> i2 = l2.iterator();
//        while(i2.hasNext()){
//            System.out.println(i2.next().getText());
//        }
        wd.findElement(By.className("form-field")).click();
        WebElement e3 = null;
        while (i2.hasNext()) {
            e3 = i2.next();
            if (e3.getAttribute("value").equals("name")) {
                e3.click();
            }
        }
        //l2.get(2).click();

    }
}
