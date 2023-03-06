package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TstNgAssert extends Object {

    @Test
    public void checkAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("And", "And123");

        System.out.println("mksvdnlhjvsdjkbdskj");

        softAssert.assertEquals("And", "And123");
        softAssert.assertEquals("And", "And123");
        softAssert.assertEquals("And", "And123");
        softAssert.assertEquals("And", "And123");

        softAssert.assertAll();

    }
}
