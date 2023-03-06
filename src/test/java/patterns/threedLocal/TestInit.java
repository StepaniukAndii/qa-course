package patterns.threedLocal;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    @SneakyThrows
    @BeforeMethod
    public void setUp() {
//        ChromeOptions chromeOptions = new ChromeOptions().setHeadless(true);
//        DesiredCapabilities capabilities = new DesiredCapabilities(chromeOptions);
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "102.0");
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", false,
//                "enableVideo", false
//        ));

//        DriverManager.setDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        DriverManager.setDriver(driver);
    }

    @AfterMethod
    public void q() {
        DriverManager.quitDriver();
    }
}
