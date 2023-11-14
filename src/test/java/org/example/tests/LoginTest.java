package org.example.tests;

import org.example.pageObjects.LoginPage;
import org.example.testUtils.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage lp = new LoginPage(driver);
        lp.getLoginButton();
    }
}
