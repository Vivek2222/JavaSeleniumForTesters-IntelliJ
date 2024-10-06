package SeleniumDemo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Alert {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with ShadowDOM
        wd.get("https://selectorshub.com/xpath-practice-page/");
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//button[@onclick='windowAlertFunction()']")).click();
        Thread.sleep(4000);

        String s1 = wd.switchTo().alert().getText();
        System.out.println(s1);

        wd.switchTo().alert().accept();
        //wd.switchTo().alert().dismiss();

        wd.quit();

    }
}
