import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By userPassword = By.id("password");
    By loginButton = By.id("login-button");
    By errorButton = By.xpath("//button[@class='error-button']");
    By errorMessage = By.xpath("//h3[@data-test='error']");

    public LoginPage typeUsername(String name) {
        driver.findElement(username).sendKeys(name);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(userPassword).sendKeys(password);
        return this;
    }

    public void makeLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean typeErrorButton() {
        driver.findElement(errorButton);
        return true;
    }

    public LoginPage emptyNameErrorMassage(String message){
     String mess = driver.findElement(errorMessage).getText();
        Assert.assertEquals(mess,message);
        return this;
    }
}

