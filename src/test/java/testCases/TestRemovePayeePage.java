package testCases;


import features.RemoveFavPayment;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestRemovePayeePage {
    RemoveFavPayment removeFavPayment;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     removeFavPayment=new RemoveFavPayment();
 }

    @Test(priority = 0,alwaysRun = true, enabled = false, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void testMenu() throws Exception {
        removeFavPayment.testRemovePayeeMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = false, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void secondTabCheck() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(removeFavPayment.firstNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        removeFavPayment.selectPayeeToRemove();
    }
    @Test(priority = 2,alwaysRun = true, enabled = false, groups = "TestLimitPage", dependsOnGroups = "TestLoginPage")
    public void tapSlide() throws IOException, InterruptedException, URISyntaxException {
        Thread.sleep(3000);
     removeFavPayment.tapSlide();
        Thread.sleep(3000);
    }


}
