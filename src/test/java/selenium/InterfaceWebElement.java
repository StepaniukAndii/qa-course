package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InterfaceWebElement {

    @Test
    public void checkWebElement() {
        WebElement element = null;

        element.findElement(By.xpath(""));
        element.findElements(By.xpath(""));
        element.click();
        element.getText();
        element.sendKeys("");
        element.clear();
        element.getCssValue("color");
        element.getAttribute("href");
        element.getSize();
        element.isDisplayed();
        element.isEnabled();
        element.isSelected();
        element.submit();
        element.getLocation();
    }
}
