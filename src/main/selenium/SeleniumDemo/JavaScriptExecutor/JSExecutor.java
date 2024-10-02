package SeleniumDemo.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class JSExecutor {

    //Check
    //Go to Login page
    //Open console
    // Add - document.getElementsByName('email')[0].value= 'Vivek'
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with JavaScript
        //JavascriptExecutor js1 = (JavascriptExecutor)(new ChromeDriver());

        wd.get("https://demo.evershop.io/account/login");
        wd.manage().window().maximize();

        WebElement e2 = wd.findElement(By.xpath("//input[@name='email']"));

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("arguments[0].value='Vivek'", e2);
        Thread.sleep(3000);
        wd.quit();

    }
}
