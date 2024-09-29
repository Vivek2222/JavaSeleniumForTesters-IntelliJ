package OOPS.Polymorphism.InterfacePoly;

public class Selenium {


    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        FirefoxBrowser firefox = new FirefoxBrowser();

        chrome.console();
        chrome.userInterface();

        firefox.console();
        firefox.userInterface();

        Browser b1 = new ChromeBrowser();
        Browser b2 = new FirefoxBrowser();

        b1.console();
        b2.console();

    }
}
