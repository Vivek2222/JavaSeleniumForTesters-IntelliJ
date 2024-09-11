package SeleniumDemo.JavaScriptExecutor;

public class ChromeDriverDummy implements WebDriverDummy, JavaScriptExecuteDummy{

    public void getChromeDriver(){
        System.out.println("Chrome working as chrome");
    }

    @Override
    public void getJSExecutor(){
        System.out.println("Chorme working as JS");
    }

    @Override
    public void getWebDriver(){
        System.out.println("Chrome working as WebDriver");
    }

}
