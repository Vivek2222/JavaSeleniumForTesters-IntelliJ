package SeleniumDemo.WebElements.WaitMechanismAndaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Action_Keyboard_Mouse {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //Working with ShadowDOM
        wd.get("https://demo.evershop.io/account/login");
        Actions a1 = new Actions(wd);
        WebElement e1 = wd.findElement(By.xpath("//input[@name='email']"));

        //mimic keyboard keys press
        a1.moveToElement(e1).click().keyDown(Keys.SHIFT).sendKeys("Vivek").keyUp(Keys.SHIFT).perform();

        //mimic mouse
        a1.moveToElement(e1).contextClick().perform();

        wd.quit();

    }
}
