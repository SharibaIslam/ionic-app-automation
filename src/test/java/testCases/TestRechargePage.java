package testCases;


import features.Recharge;
import util.Util;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestRechargePage {
    Recharge recharge;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     recharge=new Recharge();
 }


    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testRechargeMobile() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.giveRechargeMobile.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeMobSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testOperatorDropDown() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.operatorDropDownPopUp.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testOperatorPopUpOpen();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testOperatorSelect() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.selectOperator.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testOperatorSelect();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testOperatorOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.operatorOkButton.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testOperatorOkButton();
    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testAmount() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeAmount.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testAmount();
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(recharge.rechargeNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        recharge.testNextButton();
    }
    @Test(priority = 7,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(recharge.rechargeConfirm.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        recharge.testConfirmButton();

    }
    @Test(priority = 8,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testRechargeOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((recharge.rechargeOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        recharge.testRechargeOkButton();
    }
    @Test(priority = 9,alwaysRun = true, enabled = true, groups = "TestRechargePage", dependsOnGroups = "TestCashOutPage")
    public void testCaseForPayment() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (recharge.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Recharge \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " +Util.readConfigData()[2]+ "\n\r Agent Wallet: " +recharge.mobile+ "\n\r Agent Wallet: " +recharge.operator+ "\n\r  Amount: " +recharge.amount+ "\n\r Type: " +recharge.type );
            }
        }catch (Exception e){
            Util.homeButtonClick();
            Thread.sleep(1000);
            Util.homeButtonEnter();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Recharge \n\r Date Time: " + (time.toString()));
            Thread.sleep(1000);

        }
    }

}
