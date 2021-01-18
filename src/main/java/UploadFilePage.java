import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage extends BasePage {

    public UploadFilePage(WebDriver driver) {

        super(driver);
    }

    public static final By CHOSE_FILE = By.id("file-upload");
    public static final By UPLOAD_FILE_BUTTON = By.id("file-submit");
    public static final By FILE_NAME = By.id("uploaded-files");

    public void openPage(){
        driver.get("http://the-internet.herokuapp.com/upload");
    }

    public void uploadFile() {
        String filePath = "/Users/aliaksandrozerau/Desktop/qa3cz1.jpg";
        driver.findElement(CHOSE_FILE).sendKeys(filePath);
        driver.findElement(UPLOAD_FILE_BUTTON).click();
    }

    public String getFileName() {
        String name = driver.findElement(FILE_NAME).getText();
        return name;
    }
}
