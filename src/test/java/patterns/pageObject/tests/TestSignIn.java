package patterns.pageObject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import patterns.pageObject.pages.SignInPage;

public class TestSignIn extends TestInit {

    @Test
    public void checkUrl() {
        SignInPage signInPage = new SignInPage(driver);

        String url = signInPage
                .open()
                .clickSignInBtn()
                .getUrl();

        Assert.assertEquals(url, env + "signIn");

    }
}
