package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class DropdownSelection {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Dropdown

        wd.get("https://demo.evershop.io");
        wd.findElement(By.xpath("//a[text()='Men']")).click();

        WebElement e1 = wd.findElement(By.className("form-field"));
        Select s1 = new Select(e1);

        List<WebElement> l1 = s1.getOptions();
        Iterator<WebElement> i1 = l1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next().getText());
        }

        s1.selectByIndex(2);
        s1.selectByVisibleText("Name");
        s1.selectByValue("price");
    }
}
