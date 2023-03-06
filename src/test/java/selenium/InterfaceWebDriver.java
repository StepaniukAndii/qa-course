package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InterfaceWebDriver {

    @Test
    public void checkWebDriver() {
        WebDriver driver = null;

        driver.get("url");
        driver.findElement(By.xpath(""));
        driver.findElements(By.xpath(""));
        driver.quit();
        driver.close();
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();

        driver.switchTo().alert();
        driver.switchTo().frame("");
        driver.switchTo().window("1234");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().logs().get("");
    }
}
