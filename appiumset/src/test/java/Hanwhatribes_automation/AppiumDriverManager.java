package Hanwhatribes_automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

