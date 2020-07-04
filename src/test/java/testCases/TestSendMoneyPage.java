package testCases;


import features.SendMoney;
import util.Util;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestSendMoneyPage {
    SendMoney sendMoney;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     sendMoney=new SendMoney();
 }
    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoney.sendMoneyMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testWallet() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoney.wallet.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testWalletSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testAmount() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoney.amount1.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testAmountSend();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testPurpose() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoney.purpose.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testPurposeSend();
    }
    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testNextButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(sendMoney.nextButton.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testNextButton();
    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(sendMoney.confirmButton.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
     sendMoney.testConfirmButton();

    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testSendMoneyOkButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((sendMoney.successOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        sendMoney.testSendMoneyOkButton();
    }
    @Test(priority = 7,alwaysRun = true, enabled = true, groups = "SendMoney", dependsOnGroups = "TestDeviceRegPage")
    public void testCaseForSendMoney() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (sendMoney.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: Send Money \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " +Util.readConfigData()[2]+ "\n\r To Wallet: " +sendMoney.toWallet+  "\n\r Amount: " +sendMoney.amount+ "\n\r Txn ID: " +sendMoney.txnId );
            }
        }catch (Exception e){
            sendMoney.sendMoneyHomeButton.click();
            Thread.sleep(2000);
            Util.homeButtonEnter();
            Thread.sleep(2000);
            Assert.fail("Status: FAIL \n\r Type: Send Money \n\r Date Time: " + (time.toString()));
        }
    }

}
