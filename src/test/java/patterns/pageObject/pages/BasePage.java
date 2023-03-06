package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public final String env = "https://localhost";
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
