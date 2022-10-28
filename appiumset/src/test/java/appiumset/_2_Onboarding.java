package appiumset;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;


public class _2_Onboarding extends AppiumDriverManager { 
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<onboarding 진행>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		
		MobileElement arrow = driver.get().findElementByAccessibilityId("화살표");
		wait.until(ExpectedConditions.visibilityOf(arrow)).click();
		System.out.println("P# 온보딩 화면_[>] 버튼 입력");
		
		
	    wait.until(ExpectedConditions.visibilityOf(arrow)).click();
	    System.out.println("P# 온보딩 화면_[>] 버튼2 입력");
	    Thread.sleep(2000); 
	    
	    wait.until(ExpectedConditions.visibilityOf(arrow)).click();
		System.out.println("P# 온보딩 화면_[>] 버튼3 입력");
		Thread.sleep(2000); 

	}
}

