package features;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import util.*;
import launch.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;

public class RemoveFavPayment extends BasePage{
    public static WebElement element = null;
    Date time = new Date(System.currentTimeMillis());
    WebElement slider;
    int x='%';
    public static TouchAction action;
    public RemoveFavPayment() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForPaymentMenuHit)
    public static WebElement paymentMenu;

    @FindBy(xpath = Path.xPathForFavPaymentMenuAdd)
    public static WebElement firstNext;



    @Test(priority = 0)
    public void testRemovePayeeMenuClick() throws InterruptedException, IOException {
        Thread.sleep(2000);
        paymentMenu.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void selectPayeeToRemove() throws InterruptedException, IOException, URISyntaxException {
            WebElement slider = firstNext;
            Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void tapSlide() throws InterruptedException, IOException, URISyntaxException {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, Double> swipeObject = new HashMap<String, Double>();
            swipeObject.put("startX", -(1.0));
            swipeObject.put("startY", 0.0);
            swipeObject.put("endX", (-0.05));
            swipeObject.put("endY", 0.0);
            swipeObject.put("duration", 3.0);
            js.executeScript("mobile: swipe", swipeObject);


}
}
