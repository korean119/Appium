package appiumset;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class _2_Deviceinfo  {
	
	
	protected static AppiumDriver<MobileElement> driver;

		@Parameters({"device", "apppackage", "activity","version","appiumServer"})
		@BeforeClass
		public void deviceSetUp(String device, String apppackage, String activity, String version, String appiumServer) throws InterruptedException, MalformedURLException, InterruptedException {
			System.out.println("****************************************");
			System.out.println("Setting up device and desired capabilities");
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
			cap.setCapability(MobileCapabilityType.UDID, device);
			//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
	
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			//cap.setCapability(MobileCapabilityType., BrowserType.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
			
		
			//"com.hanwha.lifeplus.tribes.app.qa"
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, apppackage);
			//"com.hanwha.lifeplus.presentation.ui.HomeActivity"
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, activity);
		
			cap.setCapability("automationName", "UiAutomator2");
	
			cap.setCapability("noReset","false");
			cap.setCapability("FullReset","true");
		
			//cap.setCapability("APP_WAIT_ACTIVITY", "*");
			cap.setCapability("autowebview","false");
			
			URL url = new URL(appiumServer);
			driver = new AndroidDriver<MobileElement>(url, cap);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		@AfterClass
		public void tearDown() throws Exception
		{
			if(driver!=null)
			{
				System.out.println("******************************************************");
				System.out.println("Destroying Test Environment");
				driver.quit();
			}
		}
    
}
