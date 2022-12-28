package Hanwhatribes_automation;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

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

	
	@AfterMethod
	public void fetchMostRecentTestResult(ITestResult result) {

	    int status = result.getStatus();

	    switch (status) {
	        case ITestResult.SUCCESS:
	            //do something
	            break;
	        case ITestResult.FAILURE:
	            //do something else
	            break;
	        case ITestResult.SKIP:
	            //and something else
	            break;
	        default:
	            throw new RuntimeException("Invalid status");
	    }
	}
}




//public WebElement getWebElClickable(String xpath, int waitSeconds) {
//	WebDriverWait wait = new WebDriverWait(driver.get(), 10);
//	
//    return wait.ignoring(StaleElementReferenceException.class).until(
//            ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(xpath))));



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

// @트라이 캐치로 끊기지 않게 계속 자동화 가능 
//try {
//} catch (Exception e) {
//    e.printStackTrace();
// }

