package features;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import util.*;
import launch.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

public class ChangePIN extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement ee1,ee2,ee3,asuc,msg;
    public String txnId,toWallet,amount,asc,ascm,msg1;

    public ChangePIN() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForChangePINMenu)
    public static WebElement changePINMenu;

    @FindBy(xpath = Path.xPathForChangePINCurrentPIN)
    public static WebElement giveCurrentPIN;

    @FindBy(xpath = Path.xPathForChangePINNewPIN)
    public static WebElement giveNewPIN;

    @FindBy(xpath = Path.xPathForChangePINNewPINRetyped)
    public static WebElement newPINRetyped;

    @FindBy(xpath = Path.xPathForChangePINNextButton)
    public static WebElement chagePINNext;

    @FindBy(xpath = Path.xPathForChangePINOkButton)
    public static WebElement chagePINOkButton;

    @FindBy(xpath = Path.xPathForChangePINSuccessMsg)
    public static WebElement successMsg;

    @FindBy(xpath = Path.xPathForChangePINHomeButton)
    public static WebElement changePINHomeButton;


    @Test(priority = 0)
    public void testChangePINMenuClick() throws Exception {
        Util.homeDashBoardButtonClick();
        Thread.sleep(2000);
        changePINMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testCurrentPINSend() throws InterruptedException, IOException, URISyntaxException {
        giveCurrentPIN.sendKeys(Util.readConfigData()[3]);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testNewPINSend() throws InterruptedException, IOException, URISyntaxException {
        giveNewPIN.sendKeys(Util.readConfigData()[12]);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testNewPINRetyped() throws InterruptedException, IOException, URISyntaxException {
        newPINRetyped.sendKeys(Util.readConfigData()[12]);
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testNextButton() throws InterruptedException, IOException, URISyntaxException {
        chagePINNext.click();
        Thread.sleep(2000);
        Util.Push();
        Thread.sleep(11000);
    }
    @Test(priority = 5, alwaysRun = true, groups = "ChangePIN", dependsOnGroups = "Help")
    public void TestChangePINOkButton() throws InterruptedException, IOException, URISyntaxException {
        try {
            if (chagePINOkButton.isDisplayed()) {
                Thread.sleep(1000);
                msg=successMsg;
                msg1=msg.getText().toString();
                System.out.println(msg1);
                Thread.sleep(3000);
                chagePINOkButton.click();
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }



}
