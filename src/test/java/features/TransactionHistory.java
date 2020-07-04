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

public class TransactionHistory extends BasePage {
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    public TransactionHistory() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForTxnHistoryMenu)
    public static WebElement txnHistoryMenu;

    @FindBy(xpath = Path.xPathForTxnHistoryDetails)
    public static WebElement testCaseForTxnHistory;

    @FindBy(xpath = Path.xPathForTxnHistoryHomeButton)
    public static WebElement txnHistoryHomeButton;


    @Test(priority = 0)
    public void testTxnHistoryMenuClick() throws Exception {
        Util.homeDashBoardButtonClick();
        Thread.sleep(2000);
        txnHistoryMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void returnToHomePage() throws InterruptedException, IOException, URISyntaxException {
        txnHistoryHomeButton.click();
        Thread.sleep(1000);
        Util.homeButtonEnter();
        Thread.sleep(1000);
    }

}
