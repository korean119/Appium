package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _2_Ondoarding extends _0_Automation_Main { 
	
	
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();  
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		System.out.println("온보딩 1 클릭 ");
		arrow.click();
		System.out.println("온보딩 2 클릭 ");
		Thread.sleep(1000);
		
		
		if (!arrow.isDisplayed()) {
			
			System.out.println(" 버튼 미출력으로 이슈-- ");
			
			Thread.sleep(1000);
			
		
		}else {
			System.out.println(" else = 버튼 출력 확인 ");
			arrow.click();
			System.out.println("else = 온보딩 3 클릭 ");
			Thread.sleep(1000);
		}
		
	}
	
	
	
}

