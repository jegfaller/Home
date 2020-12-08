import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;
    LoginPage page;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/index.html");

    }

    @Test
    public void successLogin() {
        page = new LoginPage(driver);
        page.typeUsername("locked_out_user")
                .typePassword("secret_sauce")
                .makeLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }

    @Test
    public void emptyField() {
        page = new LoginPage(driver);
        page.makeLogin();
        Assert.assertTrue(page.typeErrorButton());
    }

    @Test
    public void emptyUsername() {
        page = new LoginPage(driver);
        page.typePassword("secret_sauce")
                .makeLogin();
        page.emptyNameErrorMassage("Epic sadface: Username is required");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}



