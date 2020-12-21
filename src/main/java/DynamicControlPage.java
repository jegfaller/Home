import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlPage extends BasePage {


    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    public static final By CHECKBOX = By.id("checkbox");
    public static final By CHECKBOX_BUTTON = By.xpath("//button[@onclick='swapCheckbox()']");
    public static final By ITS_GONE_MESSAGE = By.xpath("//p[contains(text(),'gone')]");
    public static final By INPUT = By.tagName("input");
    public static final By INPUT_BUTTON = By.xpath("//button[@onclick='swapInput()']");
    public static final By ITS_ENABLED_MESSAGE = By.xpath("//p[contains(text(),'enabled')]");

    public void openPage() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    }

    public boolean findCheckbox() {
        driver.findElement(CHECKBOX);
        return true;
    }

    public boolean clickCheckboxButton() {
        driver.findElement(CHECKBOX_BUTTON).click();
        return true;
    }

    public String getItsGoneText() {
        String message = driver.findElement(ITS_GONE_MESSAGE).getText();
        return message;
    }

    public boolean checkCheckboxVisibility() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX));
        return true;
    }

    public boolean findInput() {
        driver.findElement(INPUT);
        return true;
    }

    public boolean checkDisabledInput() {
        driver.findElement(INPUT).getAttribute("disabled");
        return true;
    }

    public boolean clickInputButton() {
        driver.findElement(INPUT_BUTTON).click();
        return true;
    }

    public String getIsEnabledMessage() {
        String mess = driver.findElement(ITS_ENABLED_MESSAGE).getText();
        return mess;
    }

    public boolean checkEnabledInput() {
        driver.findElement(INPUT).getAttribute("enabled");
        return true;
    }
}
