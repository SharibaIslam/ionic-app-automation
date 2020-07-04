package util;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import launch.*;
import push.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.*;

public class Util {
    WebElement element;


    @Attachment(value = "ScreenShot", type = "image/png")
    public static byte[] attachScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static String[] readConfigData() throws IOException {
        InputConfig ip=new InputConfig();
        String result[] = ip.getPropValues();
        return result;
    }

    public static void switchToContext(String context, RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        Map<String,String> params = new HashMap<>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
    public static String getCurrentContextHandle(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        String context =  (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
        return context;
    }
    public static List<String> getContextHandles(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        List<String> contexts =  (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
        return contexts;
    }
     public static void homeButtonClick() throws Exception{
         AppLaunch.driver.findElement(By.xpath(Path.xPathForHomeButtonClick)).click();
     }
     public static void homeDashBoardButtonClick() throws Exception{
         AppLaunch.driver.findElement(By.xpath(Path.xPathForeEnterDashboardHome)).click();
     }
     public static void homeButtonEnter() throws InterruptedException {
         AppLaunch.driver.findElement(By.xpath(Path.xPathForeEnterHome)).click();
}
    public static int Push() throws InterruptedException, IOException, URISyntaxException {
        PushForCustomerLogin pushForLogin = new PushForCustomerLogin();
        int push = pushForLogin.PushApi();
        System.out.printf("Push value is " + push);
        return push;
    }
    public Properties readPropertiesData() {
        Properties prop = new Properties();
        try {
            InputStream inputStream;
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {

        }
        return prop;
    }
    public static void time() throws Exception{
        Date time = new Date(System.currentTimeMillis());
    }

}

