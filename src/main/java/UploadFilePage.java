import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    WebDriver driver;

    public UploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    By choseFile = By.id("file-upload");
    By uploadFileButton = By.id("file-submit");
    By fileName = By.id("uploaded-files");

    public void uploadFile() {
        String filePath = "/Users/aliaksandrozerau/Desktop/qa3cz1.jpg";
        driver.findElement(choseFile).sendKeys(filePath);
        driver.findElement(uploadFileButton).click();
    }

    public String getFileName() {
        String name = driver.findElement(fileName).getText();
        return name;
    }
}
