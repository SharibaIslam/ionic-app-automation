package testCases;


import features.SchoolPayment;
import util.Util;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestSchoolPaymentPage {
    SchoolPayment schoolPayment;
    Date time = new Date(System.currentTimeMillis());
    String ascm,msg2;
 @BeforeTest
    public void init() throws Exception{
     schoolPayment=new SchoolPayment();
 }

    public TestSchoolPaymentPage() {
        super();
    }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testMenu() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.paymentMenu.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testPaymentMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testPayee() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.payeeCode.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testPayeeSend();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testFirstNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.firstNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testNextClick();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testStdId() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.stdID.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testStdIdSend();
    }

    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testSecondNextButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.secondNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testSecondNextButton();
    }
    @Test(priority = 5,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testSchoolNext() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(schoolPayment.schoolNext.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.testSchoolNextButton();
    }
    @Test(priority = 6,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testConfirmButton() throws IOException, InterruptedException, URISyntaxException {
     Assert.assertTrue(schoolPayment.confirmButton.isDisplayed(), "Login test PASS");
     Thread.sleep(1000);
        schoolPayment.testConfirmButton();

    }
    @Test(priority = 7,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testSchoolPaymentButton() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue((schoolPayment.successOkButton.isDisplayed()), "Login test PASS");
        Thread.sleep(1000);
        schoolPayment.paymentOkButton();
    }
    @Test(priority = 8,alwaysRun = true, enabled = true, groups = "TestSchoolPaymentPage", dependsOnGroups = "TestPaymentPage")
    public void testCaseForPayment() throws Exception {
        // Verify login/test case
        try {
            ascm="Transaction successful.";

            if (schoolPayment.msg1.equalsIgnoreCase(ascm)) {
                Allure.addDescription("Status: PASS \n\r Type: School Payment \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " +Util.readConfigData()[2]+ "\n\r To Payee: " +Util.readConfigData()[7]+ "\n\r To MerChantWallet: " +schoolPayment.MerchantWallet+ "\n\r Amount: " +schoolPayment.amount+ "\n\r Txn ID: " +schoolPayment.txnId );
            }
        }catch (Exception e){
            try {
                msg2="Your payment amount is too small";
                String msg3=schoolPayment.paymentDueMsg.getText();
                if (msg3.equalsIgnoreCase(ascm)) {
                    Allure.addDescription("Status: PASS \n\r Type: School Payment/No Due \n\r Date Time: " + (time.toString())+ "\n\r From Wallet: " +Util.readConfigData()[2]+ "\n\r To Payee: " +Util.readConfigData()[7]+ "\n\r To MerChantWallet: " +schoolPayment.MerchantWallet+ "\n\r Amount: " +schoolPayment.amount+ "\n\r Txn ID: " +schoolPayment.txnId );
                }
            }catch (Exception f){
            schoolPayment.paymentHomeButton.click();
            Thread.sleep(1000);
            Util.homeButtonEnter();
            Thread.sleep(1000);
            Assert.fail("Status: FAIL \n\r Type: Payment \n\r Date Time: " + (time.toString()));
        }
        }

    }

}
