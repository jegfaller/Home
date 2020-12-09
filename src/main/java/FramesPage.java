import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    By iFrameLink = By.xpath("//a[@href='/iframe']");
    By iFrame = By.tagName("iframe");
    By iFrameBody = By.id("tinymce");

    public void clickIframe() {
        driver.findElement(iFrameLink).click();

    }

    public String getPText() {
        WebElement iframeMsg = driver.findElement(iFrame);
        driver.switchTo().frame(iframeMsg);
        String text = driver.findElement(iFrameBody).getText();
        return text;
    }
}
