import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {


    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public static final By CONTEXT_AREA = By.id("hot-spot");

    public void openPage() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

    public void rightClick() {
        Actions actions = new Actions(driver);
        WebElement textArea = driver.findElement(CONTEXT_AREA);
        actions.contextClick(textArea).perform();
    }

    public boolean clickOkOnAlertButton() {
        Alert okButton = driver.switchTo().alert();
        okButton.accept();
        return true;
    }

    public String getAlertMessage() {
        Alert alertMessage = driver.switchTo().alert();
        String message = alertMessage.getText();
        return message;
    }
}
