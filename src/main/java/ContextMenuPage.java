import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    By contextArea = By.id("hot-spot");

    public void rightClick() {
        Actions actions = new Actions(driver);
        WebElement textArea = driver.findElement(contextArea);
        actions.contextClick(textArea).perform();
    }

    public boolean clickOkOnAlertButton() {
        Alert okButton = driver.switchTo().alert();
        okButton.accept();
        return true;
    }
    public String getAlertMessage(){
        Alert alertMessage = driver.switchTo().alert();
        String message = alertMessage.getText();
        return message;
    }
}
