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

public class Help extends BasePage{
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    public Help() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForHelpMenu)
    public static WebElement helpMenu;

    @FindBy(xpath = Path.xPathForHelpMenuEnter)
    public static WebElement testCaseForHelpMenu;

    @FindBy(xpath = Path.xPathForHelpMenuHome)
    public static WebElement helpMenuHomeButton;


    @Test(priority = 0)
    public void testHelpMenuClick() throws Exception {
        Util.homeDashBoardButtonClick();
        Thread.sleep(2000);
        helpMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void returnToHomePage() throws InterruptedException, IOException, URISyntaxException {
        helpMenuHomeButton.click();
        Thread.sleep(1000);
        Util.homeButtonEnter();
        Thread.sleep(1000);
    }

}
