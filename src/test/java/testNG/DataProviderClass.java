package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider
    private Object[][] data() {
        return new Object[][]{
                {"user", 401},
                {"admin", 200},
                {"admin",  401}
        };
    }

    @Test(dataProvider = "data")
    public void checkRegistration(String user, String statusCode) {
        System.out.println("first = " + user + " second = " + statusCode);
    }

    @Test(dataProvider = "data")
    public void checkRegistration1(String user, String statusCode) {
        System.out.println("first = " + user + " second = " + statusCode);
    }

    @Test(dataProvider = "data")
    public void checkRegistration2(String user, String statusCode) {
        System.out.println("first = " + user + " second = " + statusCode);
    }

    @Test(dataProvider = "data")
    public void checkRegistration3(String user, String statusCode) {
        System.out.println("first = " + user + " second = " + statusCode);
    }
}
