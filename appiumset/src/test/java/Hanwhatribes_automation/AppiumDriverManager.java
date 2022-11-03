package Hanwhatribes_automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumDriverManager {
	
	protected static ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<>();
	
	
	public void setDriver(AppiumDriver<MobileElement> driver) { 
		this.driver.set(driver);
	
	}
	

	public AppiumDriver<MobileElement> getDriver() {
        return this.driver.get();
        
	}

}


	/*
	 * public WebElement waitUntilElementIsVisible(MobileElement id) { WebDriverWait
	 * wait = new WebDriverWait(driver.get(), 10); return
	 * wait.until(ExpectedConditions.visibilityOf(id))
	 */

	
/*	private static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<>();
	
	public static void setDriver(AppiumDriver<MobileElement> driver) { 
		appiumDriver.set(driver);
	}
	

	public static AppiumDriver<MobileElement> getDriver() {
        return appiumDriver.get();
    }
	
	public static AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();
	*/
	
//	public static void removeDriver() {
//		driver.get().quit();
//		appiumDriver.remove();
	
//	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
//	
//	
//	public void setDriver(AppiumDriver<MobileElement> driver) {
//		driver.set(driver);
//	}
//	public AppiumDriver<MobileElement> getDriver() {
//		return this.driver.get();
//	}



// @@ 예전에 사용 하던 드라이버 
//AppiumDriver<MobileElement> driver = null;
//
//driver = AppiumDriverManager.getDriver();

