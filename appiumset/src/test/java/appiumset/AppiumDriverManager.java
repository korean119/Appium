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
	
	public static AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();
	
	
	
	public static void removeDriver() {
//		driver.get().quit();
		appiumDriver.remove();
	}
//	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
//	
//	
//	public void setDriver(AppiumDriver<MobileElement> driver) {
//		driver.set(driver);
//	}
//	public AppiumDriver<MobileElement> getDriver() {
//		return this.driver.get();
//	}

}
