import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlPage dynamicControlPage;
    FramesPage framesPage;
    UploadFilePage uploadFilePage;

    @BeforeMethod
    public void initTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlPage = new DynamicControlPage(driver);
        framesPage = new FramesPage(driver);
        uploadFilePage = new UploadFilePage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }
}

