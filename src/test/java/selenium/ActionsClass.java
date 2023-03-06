package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

    @Test
    public void checkActions() {

        WebDriver driver = null;
        WebElement element = null;

        Actions actions =new Actions(driver);
//        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().doubleClick().clickAndHold().doubleClick().perform();
        actions.doubleClick(element).clickAndHold().moveToElement(element).perform();
        
    }
}
