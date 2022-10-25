package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _2_Ondoarding extends _0_Automation_Main { 
	
	
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
//		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();  
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		
		System.out.println("온보딩 1 클릭 ");
		arrow.click();
		Thread.sleep(1000);
		
		System.out.println("온보딩 2 클릭 ");
		arrow.click();
		Thread.sleep(3000);
		

//		AppiumDriverManager.removeDriver();
	}
	
	
	
}

