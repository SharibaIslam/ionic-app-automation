package launch;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.*;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AppLaunch {
    public static AndroidDriver driver;
    public static AppLaunch instance;

    private AppLaunch() {
        setUp();
    }

    public static AppLaunch getInstance() throws IOException, InterruptedException {
        if (instance == null) {
            instance = new AppLaunch();
        }
        return instance;
    }
      private void setUp(){
        // Created object of DesiredCapabilities class.
            try {
                DesiredCapabilities cap = new DesiredCapabilities();
                Util util = new Util();
                Properties prop = util.readPropertiesData();
                cap.setCapability("deviceName", prop.getProperty("deviceName"));
                cap.setCapability("platformName", prop.getProperty("platformName"));
                cap.setCapability("appPackage", prop.getProperty("appPackage"));
                cap.setCapability("appActivity", prop.getProperty("appActivity"));
                cap.setCapability("autoGrantPermissions", true);

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                Thread.sleep(2000);
                switchToContext("WEBVIEW", driver);
            }catch(Exception e){
                System.out.println(e.toString());
            }


    }
    private void switchToContext(String context, RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        Map<String,String> params = new HashMap<>();
        params.put("name", context);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
    private String getCurrentContextHandle(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        String context =  (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
        return context;
    }
    private List<String> getContextHandles(RemoteWebDriver _driver) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(_driver);
        List<String> contexts =  (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
        return contexts;
    }
}
