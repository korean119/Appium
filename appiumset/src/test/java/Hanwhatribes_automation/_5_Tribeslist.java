package Hanwhatribes_automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
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
		MobileElement 트라이브목록버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
		wait.until(ExpectedConditions.visibilityOf(트라이브목록버튼)).click();	
		System.out.println("P# My 트라이브 화면_트라이브 목록 버튼 탭");
		
		//@ 원하는 추천 혜택에 들어가서 정합성 여부 판단 필요
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View")))
		.click();    
		System.out.println("P# 트라이브 목록 화면_추천혜택 영역 탭");
		Thread.sleep(2000); // H/K 사용 Sleep 사용 
		
		
		
		
		
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
	

		
		 if (driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
		 .isDisplayed()) { System.out.println("M# 트라이브 홈_트라이브 진입 시 툴팁 노출");
		 Thread.sleep(2000);
		 
		 MobileElement toastView = driver.get().findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView"); 
		 String text = toastView.getText();
		 System.out.println(toastView.getText()); 
		 }else{
		 System.out.println("M# 트라이브 홈_트라이브 진입 시 툴팁 노출 되지 않음 -- FAIL"); 
		 //@xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태
		 driver.get().close(); Thread.sleep(2000); }
		 
		
		if (driver.get().findElementsByAccessibilityId("out in TopBar")
				.isEmpty())
		{System.out.println("M# 트라이브 홈_Out in Top 없는 상태 확인");
		Thread.sleep(3000);
		
		MobileElement tribesin = driver.get().findElementByAccessibilityId("arrow beside text in button");
		wait.until(ExpectedConditions.visibilityOf(tribesin))
		.click();    
		System.out.println("P# 트라이브 홈_없는 상태라면 [입장하기] 버튼 입력"); 	
		}else{
			System.out.println("M# 트라이브 홈_Out in Top 존재 상태 -- FAIL"); 
			driver.get().close();
		}
		
		
		driver.get().navigate().back();
		System.out.println("S# 트라이브 홈_안드로이드 H/K Back");
		Thread.sleep(2000);
		
	}
}