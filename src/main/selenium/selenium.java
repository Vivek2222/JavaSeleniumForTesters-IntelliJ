import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class selenium {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //Need to download this jar- selenium-server-4.23.1.jar
        //run the Command from that folder: java -jar selenium-server-4.23.1.jar standalone
        //Path:C:\Users\vivek\Downloads\Selenium
        //Connecting to selenium Grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);


        //Connect to Driver directly
        //wd = new ChromeDriver();


        //open url method1
        //wd.get("https://demo.nopcommerce.com/login");
        wd.get("https://demo.evershop.io/account/login");

        //open URL method2
        /*
        wd.navigate().to("https://demo.nopcommerce.com/login");
        wd.navigate().to(new URL("https://demo.nopcommerce.com/login?returnUrl=%2F"));
        wd.navigate().refresh();

        wd.navigate().to("https://podtest.in");
        wd.navigate().back();//demo.nopcommerce
        wd.navigate().forward();//podtest
         */

        //Work on element
        //WebElement
        //wd.findElement(By.xpath("//input[@class='email']")).sendKeys("vivek@patil.com");

        //wd.findElements(); //List
        List<WebElement> l1 = wd.findElements(By.xpath("//input"));

        Iterator<WebElement> i1 = l1.iterator();

        while(i1.hasNext()){
            System.out.println(i1.next().getAttribute("name"));
        }
        wd.close();
    }
}
