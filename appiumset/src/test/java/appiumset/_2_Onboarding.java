package appiumset;

import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;


public class _2_Onboarding extends AppiumDriverManager { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<onboarding 진행>>");
		
		
		MobileElement arrow = driver.get().findElementByAccessibilityId("화살표");
		arrow.click(); 
		System.out.println("온보딩 1 클릭 ");
		Thread.sleep(2000); 
		
		arrow.click(); 
	    System.out.println("온보딩 2 클릭 ");
	    Thread.sleep(2000); 
	    
		arrow.click(); 
		System.out.println("온보딩 3 클릭 ");
		Thread.sleep(2000); 

	}
}

