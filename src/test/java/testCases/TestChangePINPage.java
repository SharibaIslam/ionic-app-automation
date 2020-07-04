package testCases;


import features.ChangePIN;
import util.Util;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestChangePINPage {
    ChangePIN changePIN;
    Date time = new Date(System.currentTimeMillis());

    String ascm;
 @BeforeTest
    public void init() throws Exception{
     changePIN=new ChangePIN();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testMenu() throws Exception {

        changePIN.testChangePINMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testCurrentPIN() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(changePIN.giveCurrentPIN.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        changePIN.testCurrentPINSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testNewPIN() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(changePIN.giveNewPIN.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        changePIN.testNewPINSend();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testNewPINRetyped() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(changePIN.newPINRetyped.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        changePIN.testNewPINRetyped();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(changePIN.chagePINNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        changePIN.testNextButton();
    }

    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testChangePINOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((changePIN.chagePINOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        changePIN.TestChangePINOkButton();
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestChangePINPage", dependsOnGroups = "TestHelpPage")
    public void testCaseForChangePIN() throws Exception {
        // Verify login/test case
        try {
            ascm="Your PIN has been changed successfully.";

            if (changePIN.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Change PIN \n\r Date Time: " + (time.toString())+ "\n\r Wallet Wallet: " +Util.readConfigData()[2]);
            }
        }catch (Exception e){
            changePIN.changePINHomeButton.click();
            Thread.sleep(1000);
            Util.homeButtonEnter();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Change PIN \n\r Date Time: " + (time.toString()));
        }
    }

}
