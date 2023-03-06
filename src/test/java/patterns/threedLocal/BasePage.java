package patterns.threedLocal;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public void setValue(String value, String element) {

        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath(element))).sendKeys(value);
    }

    protected void openUrl(String url) {
        DriverManager.getDriver().get(url);
    }
}
