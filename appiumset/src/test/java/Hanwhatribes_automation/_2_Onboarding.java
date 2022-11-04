package Hanwhatribes_automation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	
		//@ 온보딩 정합성 
		MobileElement 건너뛰기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView");
		
		if (wait.until(ExpectedConditions.visibilityOf(건너뛰기버튼)).isDisplayed())
		{System.out.println("M# 온보딩 화면_[건너뛰기] 버튼 노출 확인");
 			
		}else{
			System.out.println("M# 온보딩 화면_[건너뛰기] 버튼 노출 안됨 -- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
	
		}


	    wait.until(ExpectedConditions.visibilityOf(arrow)).click();
	    System.out.println("P# 온보딩 화면_[>] 버튼2 입력");

		//@ 온보딩 정합성 - 건너뛰기 버튼이 없어야함
	    Thread.sleep(2000); 
		if (driver.get().findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
			.isEmpty())
		{System.out.println("M# 온보딩 화면_[건너뛰기] 버튼 미노출 확인");
 			
		}else{
			System.out.println("(\"M# 온보딩 화면_[건너뛰기] 버튼 노출 됨 -- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
	
		}
	    
		
	    wait.until(ExpectedConditions.visibilityOf(arrow)).click();
	 	System.out.println("P# 온보딩 화면_[>] 버튼3 입력");
	 	Thread.sleep(2000); 
	 	
	 	 MobileElement 카카오로시작하기버튼 = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
	 	 MobileElement 본인인증으로계속하기버튼= driver.get().findElementByAccessibilityId("본인인증으로 계속하기 로고");
	 	 MobileElement Apple로계속하기버튼 = driver.get().findElementByAccessibilityId("Apple로 계속하기 로고");
	 	 
	 	
	 	if (카카오로시작하기버튼.isDisplayed())
			{System.out.println("M# 로그인&회원가입 화면_카카오로 시작하기 버튼 노출");
	 			
			}else{
				System.out.println("M# 로그인&회원가입 화면_카카오로 시작하기 버튼 비노출 -- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
				driver.get().close();
		
			}
	 	
	 	if (본인인증으로계속하기버튼.isDisplayed())
			{System.out.println("M# 로그인&회원가입 화면_본인인증 으로 계속하기버튼 노출");
	 			
			}else{
				System.out.println("M# 로그인&회원가입 화면_본인인증 으로 계속하기버튼 비노출 -- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
				driver.get().close();
		
			}
	 	
	 	if (Apple로계속하기버튼.isDisplayed())
			{System.out.println("M# 로그인&회원가입 화면_Apple로 계속하기 버튼 노출");
	 			
			}else{
				System.out.println("M# 로그인&회원가입 화면_Apple로 계속하기 버튼 비노출 -- FAIL");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
				driver.get().close();
		
			}
	 	
	 	
	 	
	 	/*
		MobileElement 온보딩이미지 = driver.get().findElementByAccessibilityId("온보딩 이미지");
		System.out.println("P# 온보딩 화면_[>] 버튼 입력");


		Actions action = new Actions(driver.get());
		action.moveToElement(온보딩이미지);
        action.clickAndHold();
        action.moveByOffset(400, 50);
        action.release();
        action.perform();
    	System.out.println("온보딩 스와이프"); 
    	*/
    	
    	
    	
    	
    	//driver.get().findElementByAccessibilityId(dddd)
    	//("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); //scroll down to the element and click

    	
  
		
	
		
		
	}
}

