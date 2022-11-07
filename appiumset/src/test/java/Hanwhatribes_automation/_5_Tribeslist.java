package Hanwhatribes_automation;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _5_Tribeslist extends _0_Automation_Main { 
	public static void Tribeslist() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Tribes_list 진행>>");
		
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
		System.out.println("혜택상세 닫기");
		
		}else{
			System.out.println("M# 혜택상세 화면_ 공유하기 버튼 비노출 -- Fail");
			driver.get().close(); 
		 
		 }
	
		
		driver.get().context("NATIVE_APP");
		System.out.println("S# Context NATIVE로 변경"); 
		Thread.sleep(3000);
		
		
		Thread.sleep(2000);
		MobileElement 러닝트라이브진입 = driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]");
		wait.until(ExpectedConditions.visibilityOf(러닝트라이브진입)).click(); 
		System.out.println("P# 트라이브 목록 화면_골프 트라이브 진입");
		
		Thread.sleep(2000);
		MobileElement 골프텍스트찾기 = driver.get().findElement(By.xpath ("//*[contains( @text , '골프')]"));
		 if (골프텍스트찾기.isDisplayed())
			{System.out.println("M# 트라이브홈 화면_'골프' 텍스트 존재 확인 = " + 골프텍스트찾기.getText());
	 			
			}else{
				System.out.println("M# 트라이브홈 화면_'골프' 텍스트 찾기 실패 = " +골프텍스트찾기.getText() + "-- FAIL"); 
				driver.get().close();
		
			}		
		 
		 
		 try {
			    driver.get().findElement(MobileBy.AndroidUIAutomator(
			            "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
			    System.out.println("S# 트라이브홈 화면_스크롤 최하단으로");
			} catch (InvalidSelectorException e) {
				
			}
	
		 Thread.sleep(2000);
		
		 
//		new TouchAction(driver.get())
//		.longPress(PointOption.point(550, 1340))
//		.waitAction()
//		.moveTo(PointOption.point(550, 60))
//		.release()
//		.perform();
//		System.out.println("S# 트라이브 목록 화면_스크롤 동작");
//		Thread.sleep(3000);
	
		Thread.sleep(2000);
		MobileElement TIPS이미지 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View");
		wait.until(ExpectedConditions.visibilityOf(TIPS이미지)).click();
		System.out.println("P# 트라이브 홈 화면_TIPS 이미지 선택");
		
		
		Thread.sleep(2000);
		MobileElement TIPS상세이미지X버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
		wait.until(ExpectedConditions.visibilityOf(TIPS상세이미지X버튼)).click();
		System.out.println("P# 트라이브 홈 화면_TIPS 상세이미지X버튼");

		
		Thread.sleep(2000);
		MobileElement 미션영역 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View");
		wait.until(ExpectedConditions.visibilityOf(미션영역)).click();
		System.out.println("P# 트라이브 홈 화면_미션영역 선택");
		
		
		Thread.sleep(2000);
		for (String contextName : contextNames) 
		{System.out.println(contextName); }
				
		driver.get().context((String) contextNames.toArray()[1]);
		Thread.sleep(2000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
		System.out.println("S# Context WebView로 변경");  
		
		MobileElement 혜택상세닫기 = driver.get().findElementByXPath("//button[@aria-label='혜택 상세 닫기']");
		wait.until(ExpectedConditions.visibilityOf(혜택상세닫기)).sendKeys(Keys.ENTER);
		System.out.println("P# 혜택상세 화면_[혜택상세 닫기] 버튼 입력");
		
		Thread.sleep(2000); 
		driver.get().context("NATIVE_APP");
		System.out.println("S# Context NATIVE로 변경"); 
			


		
		
//		MobileElement 자세히보기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView");
//		wait.until(ExpectedConditions.visibilityOf(자세히보기버튼)).click();
//		System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
//		Thread.sleep(3000);
		
		
	/*
		new TouchAction(driver.get())
		.longPress(PointOption.point(550, 1340))
		.waitAction()
		.moveTo(PointOption.point(550, 60))
		.release()
		.perform();
		System.out.println("S# 트라이브 목록 화면_스크롤 동작");
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]")))
		.click();    
		System.out.println("P# 트라이브 목록 화면_러닝 트라이브 진입");
	
*/
		
		MobileElement UpbuttoninTopBar1 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		wait.until(ExpectedConditions.visibilityOf(UpbuttoninTopBar1)).click();   
		System.out.println("P# 트라이브 홈_UpbuttoninTopBar 버튼 입력"); 
		

	}
}