package patterns.threedLocal;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocalDriverContainer threadLocalDriverContainer = new ThreadLocalDriverContainer();

    public static WebDriver getDriver() {
        return threadLocalDriverContainer.getDriver();
    }

    public static void setDriver(WebDriver driver) {
        threadLocalDriverContainer.setDriver(driver);
    }

    public static void quitDriver() {
        threadLocalDriverContainer.quitDriver();
    }
}
