package SeleniumDemo.JavaScriptExecutor;

public class MainDummy {

    public static void main(String[] args) {

        ChromeDriverDummy cd = new ChromeDriverDummy();
        WebDriverDummy wd = new ChromeDriverDummy();
        //WebDriverDummy wd = cd;
        JavaScriptExecuteDummy js1 = null;

        wd.getWebDriver();

        js1 = (JavaScriptExecuteDummy) wd;
        js1.getJSExecutor();
        cd.getChromeDriver();
        //[cd --> wd] ---> js
    }

}
