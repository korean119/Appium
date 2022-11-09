package Hanwhatribes_automation;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;


public class _5_Tribeslist extends _0_Automation_Main { 
	public static void Tribeslist() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<<<<<< Tribes_list 진행 >>>>>>>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
	
		Thread.sleep(2000); 
		
		MobileElement 알림함버튼 = driver.get().findElementByAccessibilityId("notification in TopBar");
		wait.until(ExpectedConditions.visibilityOf(알림함버튼)).click();
		System.out.println("P# 트라이브 목록 화면_[알림함] 버튼 입력"); 
		
		
		Thread.sleep(2000); 
		MobileElement 알림함텍스트찾기 = driver.get().findElement(By.xpath ("//*[contains( @text , '알림')]"));
		 if (알림함텍스트찾기.isDisplayed())
			{System.out.println("M# 알림함 화면_'알림' 텍스트 존재 확인 = " + 알림함텍스트찾기.getText());
	 			
			}else{
				System.out.println("M# 알림함 화면_'알림' 텍스트 찾기 실패 =" + 알림함텍스트찾기.getText() + "-- FAIL"); 
				driver.get().close();
		
			}
		 
		 
		MobileElement UpbuttoninTopBar = driver.get().findElementByAccessibilityId("Up button in TopBar");
		wait.until(ExpectedConditions.visibilityOf(UpbuttoninTopBar)).click();   
		System.out.println("P# 트라이브 홈_UpbuttoninTopBar 버튼 입력"); 
		 
		 
		Thread.sleep(2000);  
		MobileElement 트라이브목록버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
		wait.until(ExpectedConditions.visibilityOf(트라이브목록버튼)).click();	
		System.out.println("P# My 트라이브 화면_트라이브 목록 버튼 탭");
		Thread.sleep(2000); 
		
		
		//@ 원하는 추천 혜택에 들어가서 정합성 여부 판단 필요
		Thread.sleep(2000);  
		MobileElement 추천혜택영역 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View");
		wait.until(ExpectedConditions.visibilityOf(추천혜택영역)).click(); 
		System.out.println("P# 트라이브 목록 화면_추천혜택 영역 탭");
		Thread.sleep(2000); 
		
		
		Set<String> contextNames = driver.get().getContextHandles();
		  for (String contextName : contextNames) 
		  {System.out.println(contextName); }
		
		driver.get().context((String) contextNames.toArray()[1]);
		Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
		System.out.println("S# Context WebView로 변경");  
		
		MobileElement 혜택공유하기 = driver.get().findElementByXPath("//button[@aria-label='혜택 공유하기']"); 
			
		if (혜택공유하기.isDisplayed()) 
		{System.out.println("M# 혜택상세 화면_ 공유하기 버튼 노출 확인");
		Thread.sleep(2000);
		 
		MobileElement 혜택상세닫기 = driver.get().findElementByXPath("//button[@aria-label='혜택 상세 닫기']");
		wait.until(ExpectedConditions.visibilityOf(혜택상세닫기)).sendKeys(Keys.ENTER); 
		System.out.println("P# 혜택상세 화면_혜택상세 [X] 닫기 버튼 입력");
		
		}else{
			System.out.println("M# 혜택상세 화면_ 공유하기 버튼 비노출 -- Fail");
			driver.get().close(); 
		 
		 }
	
	
		driver.get().context("NATIVE_APP");
		System.out.println("S# Context NATIVE로 변경"); 

		 
	}
}