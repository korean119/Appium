package appiumset;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumDriverManager {
	
	private static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<>();
	
	public static void setDriver(AppiumDriver<MobileElement> driver) { 
		appiumDriver.set(driver);
	}
	
	
	public static AppiumDriver<MobileElement> getDriver() {
        return appiumDriver.get();
    }
	
	
	public static void removeDriver() {
		appiumDriver.get().quit();
		appiumDriver.remove();
	}

}
