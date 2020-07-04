package testCases;


import features.TransactionHistory;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestTxnHistoryPage {
    TransactionHistory transactionHistory;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     transactionHistory=new TransactionHistory();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestTxnHistoryPage", dependsOnGroups = "TestRechargePage")
    public void testMenu() throws Exception {
        transactionHistory.testTxnHistoryMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestTxnHistoryPage", dependsOnGroups = "TestRechargePage")
    public void testCaseForTxnHistory() throws IOException, InterruptedException, URISyntaxException {
        try {
            if(transactionHistory.testCaseForTxnHistory.isDisplayed()) {
                Allure.addDescription("Status: PASS \n\r Type: Transaction History Display \n\r Date Time: " + (time.toString()));
            }
        }catch (Exception e){
            Assert.fail("Status: FAIL \n\r Type: Transaction History Display \n\r Date Time: " + (time.toString()));
        }
    }

    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestTxnHistoryPage", dependsOnGroups = "TestRechargePage")
    public void testReturnHome() throws Exception {

        transactionHistory.returnToHomePage();
    }

}
