import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDynamicControlPage {
    WebDriver driver;
    DynamicControlPage page;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    public void testFindCheckbox() {
        page = new DynamicControlPage(driver);
        Assert.assertTrue(page.findCheckbox());
    }

    @Test
    public void testClickCheckboxButton() {
        page = new DynamicControlPage(driver);
        Assert.assertTrue(page.clickCheckboxButton());
    }

    @Test
    public void testItsGoneText() {
        page = new DynamicControlPage(driver);
        page.clickCheckboxButton();
        String message = page.getItsGoneText();
        Assert.assertEquals(message, "It's gone!");
    }

    @Test
    public void testCheckboxIsNotVisible() {
        page = new DynamicControlPage(driver);
        page.clickCheckboxButton();
        Assert.assertTrue(page.checkCheckboxVisibility());
    }

    @Test
    public void testFindInput() {
        page = new DynamicControlPage(driver);
        Assert.assertTrue(page.findInput());
    }

    @Test
    public void testInputIsDisabled() {
        page = new DynamicControlPage(driver);
        Assert.assertTrue(page.checkDisabledInput());
    }

    @Test
    public void testClickInputButton() {
        page = new DynamicControlPage(driver);
        Assert.assertTrue(page.clickInputButton());
    }

    @Test
    public void testItsEnabledText() {
        page = new DynamicControlPage(driver);
        page.clickInputButton();
        String message = page.getIsEnabledMessage();
        Assert.assertEquals(message, "It's enabled!");
    }

    @Test
    public void testCheckEnabledInput() {
        page = new DynamicControlPage(driver);
        page.clickInputButton();
        Assert.assertTrue(page.checkEnabledInput());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}


