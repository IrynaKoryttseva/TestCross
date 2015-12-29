
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GooglePage extends Page {

    private static final String URL = "http://google.com/";

    private static final By SEARCH_INPUT = By.name("q");
    private static final By SEARCH_BTN = By.name("btnK");


    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void search(String name){
        $(SEARCH_INPUT).sendKeys(name);
        $(SEARCH_BTN).click();
    }

    public void open() {
        toPage(URL);
    }
}