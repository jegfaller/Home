import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFramesPage {
    WebDriver driver;
    FramesPage page;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/frames");
    }

    @Test
    public void testPText() {
        page = new FramesPage(driver);
        page.clickIframe();
        Assert.assertEquals(page.getPText(), "Your content goes here.");
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
