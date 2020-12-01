import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By userPassword = By.id("password");
    By loginButton = By.id("login-button");

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
}

