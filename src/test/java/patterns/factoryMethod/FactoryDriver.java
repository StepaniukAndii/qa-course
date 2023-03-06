package patterns.factoryMethod;

public class FactoryDriver {

    public static IDriver getDriver(DriversEnum type, boolean isRemote) {
        IDriver driver;
        switch (type) {
            case CHROME:
                driver = new ChromeDriver(isRemote);
            case FIREFOX:
                driver = new FirefoxDriver(isRemote);
            default:
                driver = new ChromeDriver(isRemote);
        }
        return driver;
    }

    public static IDriver getDriver() {
        IDriver driver;
        boolean headlessBool;

        String browser = System.getProperty("browser");
        String headless = System.getProperty("headless");

        switch (headless) {
            case "true":
                headlessBool = true;
            case "false":
                headlessBool = false;
            default:
                headlessBool = true;
        }

        switch (browser) {
            case "chrome":
                driver = getDriver(DriversEnum.CHROME, headlessBool);
            case "firefox":
                driver = getDriver(DriversEnum.FIREFOX, headlessBool);
            default:
                driver = getDriver(DriversEnum.CHROME, false);
        }

        return driver;
    }
}
