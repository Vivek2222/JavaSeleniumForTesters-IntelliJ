package SeleniumDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class takeScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver wd = null;

        ChromeOptions option = new ChromeOptions();
        //connecting to selenium grid
        wd = new RemoteWebDriver(new URL("http://localhost:4444"), option);

        //TakeScreenshot

        wd.get("https://demo.evershop.io/account/login");
        wd.manage().window().maximize();
        // Get the timestamp to create a unique filename
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileWithPath = "./screenshots/" + "Demo" + "_" + timeStamp + ".png";

        TakesScreenshot scrShot = ((TakesScreenshot) wd);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
        System.out.println("Screenshot saved at: " + fileWithPath);

        wd.quit();

    }
}
