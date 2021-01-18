import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage extends BasePage {

    @FindBy(xpath = "//a[@href='/iframe']")
    WebElement iFrameLink;
    @FindBy(tagName = "iframe")
    WebElement iFrame;
    @FindBy(id = "tinymce")
    WebElement iFrameBody;

    public FramesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openPage(){
        driver.get("http://the-internet.herokuapp.com/frames");
    }

    public void clickIframe() {
        iFrameLink.click();
    }

    public String getPText() {
        driver.switchTo().frame(iFrame);
        String text = iFrameBody.getText();
        return text;
    }
}
