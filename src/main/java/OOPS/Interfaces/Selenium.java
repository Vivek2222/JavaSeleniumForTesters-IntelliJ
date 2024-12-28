package OOPS.Interfaces;

public class Selenium {


    public static void main(String[] args) {

//        ChromeBrowser chrome = new ChromeBrowser();
//        FirefoxBrowser firefox = new FirefoxBrowser();

//        chrome.console();
//        chrome.userInterface();
//
//        firefox.console();
//        firefox.userInterface();

        String browserName = "chrome";
        Browser b1 = null;
        if (browserName == "chrome") {
            b1 = new ChromeBrowser();
        } else {
            b1 = new FirefoxBrowser();
        }

        b1.console();
        b1.userInterface();
    }
}
