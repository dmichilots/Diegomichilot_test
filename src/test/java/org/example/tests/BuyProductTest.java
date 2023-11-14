package org.example.tests;

import org.example.pageObjects.BugProductPage;
import org.example.pageObjects.LoginPage;
import org.example.testUtils.BaseTest;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {
    @Test
    public void bugtest(){
        BugProductPage bp = new BugProductPage(driver);
        bp.getFirstProduct();
        bp.getSecondProduct();
        bp.getThirdProduct();
        bp.goToCardView();
        bp.fillform();
        bp.paymentInformation();

        assert(bp.checkIconIsDisplayed());


    }
}
