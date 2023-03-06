package patterns.factoryMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriver implements IDriver {

    private final boolean isRemote;

    public ChromeDriver(boolean isRemote) {
        this.isRemote = isRemote;
    }

    @Override
    public WebDriver setUpDriver() {
        if (isRemote) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            return new RemoteWebDriver(desiredCapabilities);
        } else {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            WebDriverManager.chromedriver().setup();
            return new org.openqa.selenium.chrome.ChromeDriver();
        }
    }
}
