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

public class Limit extends BasePage{
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());

    public Limit() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForLimitMenu)
    public static WebElement limitMenu;

    @FindBy(xpath = Path.xPathForLimitMenuTab1Click)
    public static WebElement tab1Click;

    @FindBy(xpath = Path.xPathForLimitMenuTab2Click)
    public static WebElement tab2Click;

    @FindBy(xpath = Path.xPathForLimitMenuTestCase)
    public static WebElement testCase;

    @FindBy(xpath = Path.xPathForLimitMenuHomeButton)
    public static WebElement limitHomeButton;


    @Test(priority = 0)
    public void testLimitMenuClick() throws Exception {
        Util.homeDashBoardButtonClick();
        Thread.sleep(2000);
        limitMenu.click();
        Thread.sleep(2000);
        Util.attachScreenShot(driver);
    }
    @Test(priority = 1)
    public void secondTabCheck() throws InterruptedException, IOException, URISyntaxException {
        tab1Click.click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void thirdTabCheck() throws InterruptedException, IOException, URISyntaxException {
        tab2Click.click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void returnToDashBoardCheck() throws Exception {
        limitHomeButton.click();
        Thread.sleep(1000);
        Util.homeButtonEnter();
        Thread.sleep(1000);
    }


}
