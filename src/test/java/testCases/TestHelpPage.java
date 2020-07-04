package testCases;


import features.Help;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestHelpPage {
    Help help;
    Date time = new Date(System.currentTimeMillis());
    String ascm;
 @BeforeTest
    public void init() throws Exception{
     help=new Help();
 }

    @Test(priority = 0,alwaysRun = true, enabled = true, groups = "TestHelpPage", dependsOnGroups = "TestLimitPage")
    public void testMenu() throws Exception {
        help.testHelpMenuClick();
    }

    @Test(priority = 1,alwaysRun = true, enabled = true, groups = "TestHelpPage", dependsOnGroups = "TestLimitPage")
    public void testCaseForTxnHistory() throws IOException, InterruptedException, URISyntaxException {
        try {
            if (help.testCaseForHelpMenu.isDisplayed()) {
                Allure.addDescription("Status: PASS \n\r Type: Help \n\r Date Time: " + (time.toString()));
            }
        }catch (Exception e){
            Assert.fail("Status: FAIL \n\r Type: Help \n\r Date Time: " + (time.toString()));
        }
    }

    @Test(priority = 2,alwaysRun = true, enabled = true, groups = "TestHelpPage", dependsOnGroups = "TestLimitPage")
    public void testReturnHome() throws Exception {

        help.returnToHomePage();
    }

}
