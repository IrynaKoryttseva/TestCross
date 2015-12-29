
import org.testng.annotations.*;


public class TestGoogleSearch extends BaseTestGrid {

    GooglePage googlePage;

    @BeforeMethod
    public void setUp() {
        googlePage = new GooglePage(WebDriverInstansiator.getDriver());
    }

    @Test
    public void shouldBeBlogTitle() {
        googlePage.open();
        googlePage.search("automation remarks");
    }
}