import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextMenuTest {
    WebDriver driver;
    ContextMenuPage page;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

    @Test
    public void testContextMenuIsAppear() {
        page = new ContextMenuPage(driver);
        page.rightClick();
        page.clickOkOnAlertButton();
        Assert.assertTrue(true);
    }

    @AfterTest
    public void driverClose() {
        driver.close();
    }
}
