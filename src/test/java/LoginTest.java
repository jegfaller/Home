import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage page;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/index.html");
    }

    @Test
    public void successLogin() {
        page = new LoginPage(driver);
        page.typeUsername("standard_user")
                .typePassword("secret_sauce")
                .makeLogin();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

}



