package testNG;

import org.testng.annotations.*;

import java.util.ArrayList;

public class Annotation {

    @BeforeSuite(enabled = false)
    void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @Test(groups = "smoke")
    public void checkOpenBrowser() {
        System.out.println("---------TEST-------------");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    void afterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("AfterSuite");
    }
}
