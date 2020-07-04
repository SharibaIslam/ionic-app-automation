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

public class DeviceRegistration extends BasePage{
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());

    public DeviceRegistration() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath = Path.getxPathForLoginTest1ShowingDRPopUp)
    public static WebElement popUp;

    @FindBy(xpath = Path.xPathForDeviceRegYes1)
    public static WebElement yesButton;

    @FindBy(xpath = Path.xPathForDeviceRegSuccessmsg)
    public static WebElement testCase;

    @FindBy(xpath = Path.xPathForDeviceRegSuccessmsgOkButtonClick)
    public static WebElement okButtonClick;

    @FindBy(xpath = Path.xPathForDeviceRegSubMenuClick)
    public static WebElement deviceRegHomeButtonclick;

    public boolean validateLoginPageUiELementsVisibility() throws InterruptedException, IOException {

        boolean popUpVisible = popUp.isDisplayed();

        if (popUpVisible) {
            return true;
        } else
            return false;
    }

    @Test(priority = 1)
    public void testDeviceRegistration() throws InterruptedException, IOException, URISyntaxException {
        popUp.click();
        Thread.sleep(2000);
        yesButton.click();
        Thread.sleep(2000);
        Util.Push();
        Thread.sleep(12000);

    }
    @Test(priority = 3)
    public void okButtonClick() throws InterruptedException, IOException, URISyntaxException {
        okButtonClick.click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void testDeviceRegistrationRetunHome() throws Exception {
        deviceRegHomeButtonclick.click();
        Thread.sleep(2000);
        Util.homeButtonEnter();
        Thread.sleep(2000);
    }
}
