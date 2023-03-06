package patterns.factoryMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriver implements IDriver {
    private final boolean isRemote;

    public FirefoxDriver(boolean isRemote) {
        this.isRemote = isRemote;
    }

    @Override
    public WebDriver setUpDriver() {
        if (isRemote) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            return new RemoteWebDriver(desiredCapabilities);
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new org.openqa.selenium.firefox.FirefoxDriver();
        }
    }
}
