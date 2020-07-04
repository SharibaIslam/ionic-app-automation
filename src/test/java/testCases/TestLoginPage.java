package testCases;


import features.LogIn;
import util.Util;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class TestLoginPage {
    LogIn logIn;
    Date time = new Date(System.currentTimeMillis());
 @BeforeTest
    public void init() throws Exception{
     logIn=new LogIn();
 }
    @Test(priority = 0,alwaysRun = true, groups = "TestLoginPage")
    public void testUiElementVisibility() throws IOException, InterruptedException {
        Assert.assertEquals(true, logIn.validateLoginPageUiELementsVisibility());
    }

    @Test(priority = 1,alwaysRun = true, groups = "TestLoginPage")
    public void testLogIn() throws IOException, InterruptedException, URISyntaxException {

        logIn.testLogin();
        //Assert.assertTrue(logIn.logInButton.isDisplayed(), "Login test PASS");

    }
    @Test(priority = 2,alwaysRun = true, groups = "TestLoginPage")
    public void testCase() throws Exception {
        try {
            if (logIn.loginTest1.isDisplayed()){
                Allure.addDescription("Status: PASS \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()) + "\n\r Login Wallet: " + Util.readConfigData()[2]);
            }

        }catch (Exception e){
            try {
                if(logIn.loginTest2.isDisplayed()){
                    Allure.addDescription("Status: PASS \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()) + "\n\r Login Wallet: " + Util.readConfigData()[2]);
                }
            }catch (Exception f){
                Assert.fail("Status: FAIL \n\r Type: Login As Customer \n\r Date Time: " + (time.toString()));
            }
        }
    }
}
