package patterns.factoryMethod;

import org.testng.annotations.BeforeMethod;

public class TestInit {

    @BeforeMethod
    public void setUpDriver() {
        FactoryDriver.getDriver(DriversEnum.FIREFOX, false).setUpDriver();
    }
}
