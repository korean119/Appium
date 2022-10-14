package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class Onboarding extends Hanwhatribes2 { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		System.out.println("온보딩 버튼 클릭 완료 ");
	}
}
