import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestUploadFile {
    WebDriver driver;
    UploadFilePage page;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/upload");
    }

    @Test
    public void testUploadFile() {
        page = new UploadFilePage(driver);
        page.uploadFile();
        Assert.assertEquals(page.getFileName(), "qa3cz1.jpg");
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }

}
