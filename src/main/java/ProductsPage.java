import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By addButton = By.xpath("//button[@class='btn_primary btn_inventory']");
    By removeButton = By.xpath("//button[@class='btn_secondary btn_inventory' and text()='REMOVE']");
    By cartBadge = By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");
    By sortPrice = By.xpath("//select[@class='product_sort_container']");

    public void clickAnyAddButton(){
        driver.findElement(addButton).click();
    }

    public void clickAnyRemoveButton(){
        driver.findElement(removeButton).click();
    }





}
