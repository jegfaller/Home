import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlPage {
    WebDriver driver;

    public DynamicControlPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkbox = By.id("checkbox");
    By checkboxButton = By.xpath("//button[@onclick='swapCheckbox()']");
    By itsGoneMessage = By.xpath("//p[contains(text(),'gone')]");
    By input = By.tagName("input");
    By inputButton = By.xpath("//button[@onclick='swapInput()']");
    By itsEnabledMessage = By.xpath("//p[contains(text(),'enabled')]");

    public boolean findCheckbox() {
        driver.findElement(checkbox);
        return true;
    }

    public boolean clickCheckboxButton() {
        driver.findElement(checkboxButton).click();
        return true;
    }

    public String getItsGoneText() {
        String message = driver.findElement(itsGoneMessage).getText();
        return message;
    }

    public boolean checkCheckboxVisibility(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkbox));
        return true;
    }

    public boolean findInput(){
        driver.findElement(input);
        return true;
    }

    public boolean checkDisabledInput(){
        driver.findElement(input).getAttribute("disabled");
        return true;
    }

    public boolean clickInputButton(){
        driver.findElement(inputButton).click();
        return true;
    }

    public String getIsEnabledMessage(){
        String mess = driver.findElement(itsEnabledMessage).getText();
        return mess;
    }

    public boolean checkEnabledInput(){
        driver.findElement(input).getAttribute("enabled");
        return true;
    }
}
