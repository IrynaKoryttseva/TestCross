
import org.openqa.selenium.WebDriver;
import ru.stqa.selenium.factory.WebDriverFactory;

public class WebDriverInstansiator {

    private static InheritableThreadLocal<WebDriver> webDriver = new InheritableThreadLocal<WebDriver>();
    private static WebDriverFactory factory;

    public static void setDriver(String browserName, String browserVersion){
        factory = new WebDriverFactory();

        webDriver.set(factory.getWebDriver(browserName, browserVersion));
    }

    public static WebDriver getDriver(){
        return webDriver.get();
    }

}