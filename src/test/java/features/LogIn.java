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


public class LogIn extends BasePage {
    Date time = new Date(System.currentTimeMillis());

    public LogIn() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForLanguageChange)
    private WebElement language;

    @FindBy(xpath = Path.xPathForLoginWallet)
    private WebElement walletNumber;

    @FindBy(xpath = Path.xPathForLoginPIN)
    private WebElement logInPin;

    @FindBy(xpath = Path.xPathForLoginButton)
    public static WebElement logInButton;

    @FindBy(xpath = Path.getxPathForLoginTest1ShowingDRPopUp)
    public static WebElement loginTest1;

    @FindBy(xpath = Path.xPathForDeviceRegErrormsg1)
    public static WebElement loginTest2;


    public boolean validateLoginPageUiELementsVisibility() throws InterruptedException, IOException {

        boolean languageBtnVisible = language.isDisplayed();
        boolean walletNumberInputFieldVisible = walletNumber.isDisplayed();
        boolean pinInputFieldVisible = logInPin.isDisplayed();
        boolean logInBtnVIsible = logInButton.isDisplayed();


        if (languageBtnVisible && logInBtnVIsible && walletNumberInputFieldVisible && pinInputFieldVisible) {
            return true;
        } else
            return false;
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException, IOException, URISyntaxException {
        language.click();
        Thread.sleep(2000);
        walletNumber.sendKeys(Util.readConfigData()[2]);
        Thread.sleep(2000);
        logInPin.sendKeys(Util.readConfigData()[3]);
        Thread.sleep(2000);
        logInButton.click();
        Util.attachScreenShot(driver);
        Thread.sleep(3000);
        Util.Push();
        Thread.sleep(15000);
        System.out.println("Context name is :" + Util.getCurrentContextHandle(driver));
        Thread.sleep(2000);

    }


}