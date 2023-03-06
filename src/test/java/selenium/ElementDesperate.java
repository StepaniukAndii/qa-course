package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementDesperate {

    WebDriver driver;

    @Test
    public void checkDeleteElement() {

        WebElement element = null;
    }


    public boolean isDeleteElement(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));

        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    public boolean isDeleteElement2(String locator) {
        try {
            driver.findElement(By.xpath(locator));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }


    public boolean isDeleteElement3(String locator) {
        return driver.findElements(By.xpath(locator)).size() == 0;
    }
}
