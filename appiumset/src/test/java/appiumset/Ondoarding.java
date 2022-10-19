package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class Ondoarding extends Hanwhatribes2 { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		System.out.println("1 클릭 ");
		arrow.click();
		System.out.println("2 클릭 ");
		Thread.sleep(1000);
		
		
		if (!arrow.isDisplayed()) {
			
			System.out.println(" 버튼 안보여 ");
			
			Thread.sleep(1000);
			
		
			
		
		
		}else {
			System.out.println(" else 버튼 보여 ");
			arrow.click();
			System.out.println("else 함 더 클릭 ");
			Thread.sleep(1000);
		}
		
	}
	
}

