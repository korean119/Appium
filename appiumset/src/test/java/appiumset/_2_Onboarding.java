package appiumset;

import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;


public class _2_Onboarding extends AppiumDriverManager { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<onboarding 진행>>");
		
		
		MobileElement arrow = driver.get().findElementByAccessibilityId("화살표");
		arrow.click(); 
		System.out.println("P# 온보딩 화면_[>] 버튼 입력");
		Thread.sleep(2000); 
		
		//@정합성 필요 
		
		arrow.click(); 
	    System.out.println("P# 온보딩 화면_[>] 버튼2 입력");
	    Thread.sleep(2000); 
	    
		arrow.click(); 
		System.out.println("P# 온보딩 화면_[>] 버튼3 입력");
		Thread.sleep(2000); 

	}
}

