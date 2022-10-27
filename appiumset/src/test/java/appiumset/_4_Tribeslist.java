package appiumset;

import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _4_Tribeslist extends _0_Automation_Main { 
	public static void tribeslist() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Tribes_list 진행>>");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
		.click();	
		System.out.println("트라이브 목록 탭");
		
		
		MobileElement notificationinTopBar = driver.get().findElementByAccessibilityId("notification in TopBar");
		notificationinTopBar.click();
		System.out.println("[알림] 버튼 입력"); 
		
		
		MobileElement back_UpbuttoninTopBar = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back_UpbuttoninTopBar.click();
		System.out.println("[Back] 버튼 입력"); 
		
		
		//@ 원하는 추천 혜택에 들어가서 정합성 여부 판단 필요
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View")
		.click();	
		System.out.println("추천혜택 영역 탭");
		
		
		/* @ 정합성 필요 
		 * MobileElement element = driver.get().findElement(MobileBy.AndroidUIAutomator(
		 * "new UiScrollable(new UiSelector().scrollable(true))" +
		 * ".scrollIntoView(new UiSelector().textContains(\"진행중\"))"));
		 */
		
		driver.get().navigate().back();
		System.out.println("안드로이드 H/K Back");
		Thread.sleep(2000);
		
		/*
		 * back_UpbuttoninTopBar.click(); System.out.println("[Back] 버튼 입력");
		 */
		
		
		new TouchAction(driver.get())
		.longPress(PointOption.point(550, 1340))
		.waitAction()
		.moveTo(PointOption.point(550, 60))
		.release()
		.perform();
		System.out.println("스크롤 동작");
		Thread.sleep(2000);
		
		
		driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[1]")
		.click();
		System.out.println("러닝 트라이브 진입");
		Thread.sleep(1000);
		
		if (driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("토스트 팝업 존재");
		Thread.sleep(2000);
		
		MobileElement toastView = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView");
		String text = toastView.getText();
		System.out.println(toastView.getText()); 	
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
			Thread.sleep(2000);
		}
		
		
		if (driver.get().findElementsByAccessibilityId("out in TopBar")
				.isEmpty())
		{System.out.println("Out in Top 없는 상태 확인");
		
		MobileElement tribesin1 = driver.get().findElementByAccessibilityId("arrow beside text in button");
		tribesin1.click();
		System.out.println("없는 상태라면 [입장하기] 버튼 입력"); 	
		}else{
			System.out.println("Out in Top 존재 상태 -- 이슈"); 
			driver.get().close();
		}
		
		
		driver.get().navigate().back();
		System.out.println("안드로이드 H/K Back");
		Thread.sleep(2000);
		
	
	
	}
}