package patterns.pageObject.pages;

import org.openqa.selenium.WebDriver;

import javax.sql.RowSet;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage open() {
        driver.get(env);
        return this;
    }

    public SignInPage clickSignInBtn() {
        find("//button").click();
        return this;
    }
}
