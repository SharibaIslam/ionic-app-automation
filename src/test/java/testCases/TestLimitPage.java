package testCases;


import features.Limit;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestLimitPage {
    Limit limit;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     limit=new Limit();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestTxnHistoryPage")
    public void testMenu() throws Exception {
        limit.testLimitMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestTxnHistoryPage")
    public void secondTabCheck() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(limit.tab1Click.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        limit.secondTabCheck();
    }
    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestTxnHistoryPage")
    public void thirdTabCheck() throws IOException, InterruptedException, URISyntaxException {

        Assert.assertTrue(limit.tab2Click.isDisplayed(), "Login test PASS");
        Thread.sleep(1000);
        limit.thirdTabCheck();
    }
    @Test(priority = 3,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestTxnHistoryPage")
    public void testCaseForSendMoney() throws InterruptedException, IOException {
        // Verify login/test case
        try {
            if (limit.testCase.isDisplayed()) {
                Allure.addDescription("Status: PASS \n\r Type: Limit Display \n\r Date Time: " + (time.toString()));
            }
        }catch (Exception e){
            Assert.fail("Status: FAIL \n\r Type: Limit Display \n\r Date Time: " + (time.toString()));
        }
    }

    @Test(priority = 4,alwaysRun = true, enabled = true, groups = "TestLimitPage", dependsOnGroups = "TestTxnHistoryPage")
    public void testReturnHome() throws Exception {

        limit.returnToDashBoardCheck();
    }

}
