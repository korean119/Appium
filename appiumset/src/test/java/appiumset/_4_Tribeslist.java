package appiumset;

import java.net.MalformedURLException;
import java.util.Objects;

import org.openqa.selenium.InvalidSelectorException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _4_Tribeslist extends _0_Automation_Main { 
	public static void tribeslist() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Tribes_list 진행>>");
		
		MobileElement kakao = driver.findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("카카오 클릭 완료");
		 		                 

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
		.click();
		System.out.println("카카오 계속하기 클릭 완료 ");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
		.click();	
		System.out.println("트라이브 목록 탭");
		
		
		new TouchAction(driver)
		.longPress(PointOption.point(550, 1340))
		.waitAction()
		.moveTo(PointOption.point(550, 60))
		.release()
		.perform();
		
		System.out.println("스크롤 동작");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[1]")
		.click();
		System.out.println("러닝 트라이브 진입");
		
		if (driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("토스트 팝업 존재");
		
		MobileElement toastView = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView");
		String text = toastView.getText();
		System.out.println(toastView.getText()); 	
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.close();
			
		}
		
		if (driver.findElementsByAccessibilityId("out in TopBar")
				.isEmpty())
		{System.out.println("Out in Top 없는 상태 확인");
		
		MobileElement tribesin1 = driver.findElementByAccessibilityId("arrow beside text in button");
		tribesin1.click();
		System.out.println("없는 상태라면 [입장하기] 버튼 입력"); 	
		}else{
			System.out.println("Out in Top 존재 상태 -- 이슈"); 
			driver.close();
			
		}
		MobileElement back = driver.findElementByAccessibilityId("Up button in TopBar");
		back.click();
		System.out.println("TopBar Back"); 
		Thread.sleep(2000);
	}
}
