package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _5_Tribeshome extends _0_Automation_Main {

	public static void tribeshome() throws MalformedURLException, InterruptedException  {

		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver(); 
		
		System.out.println("<<Tribes_home 진행>>");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
		.click(); 
		System.out.println("트라이브 홈 탭");
		Thread.sleep(2000);
		
		
		if (driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("가입한 트라이브 존재");
		MobileElement toastView = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView");
		String text = toastView.getText();
		System.out.println(toastView.getText()); 	
		}else{
			System.out.println("가입한 트라이브 없음 -- 이슈"); //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 			
		driver.close();
		}
		
	
		MobileElement notification = driver.findElementByAccessibilityId("notification in TopBar");
		notification.click(); 
		System.out.println("알림함");
		
		
		new TouchAction(driver)
		.longPress(PointOption.point(550, 1340))
		.waitAction()
		.moveTo(PointOption.point(550, 60))
		.release()
		.perform();
		System.out.println("스크롤 동작");
		Thread.sleep(2000);

		
		MobileElement back2 = driver.findElementByAccessibilityId("Up button in TopBar");
		back2.click(); 
		System.out.println("알림함 -> Back key");
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView[1]")
		.click(); 
		System.out.println("[종료] 탭 입력");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("[당첨] 탭 입력");
		Thread.sleep(2000);
		

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("[진행중] 탭 입력");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
		.click(); 
		System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
		Thread.sleep(4000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
		.click(); 
		System.out.println("당첨확률 바텀시트 [x]버튼 입력");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
		.click(); 
		System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
		Thread.sleep(4000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("당첨확률 바텀시트 [확인]버튼 입력");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
		.click(); 
		System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
		Thread.sleep(4000);
		
		
		MobileElement sheetclose = driver.findElementByAccessibilityId("시트 닫기");
		sheetclose.click(); 
		System.out.println("바텀시트 시트 닫기(외부터치)");
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")
		.click(); 
		System.out.println("나의 트라이브 첫번째 트라이브 진입");
		Thread.sleep(3000);
		
		
		MobileElement tribesout = driver.findElementByAccessibilityId("out in TopBar");
		tribesout.click();
		System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 
	

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
		.click(); 
		System.out.println("컨펌 팝업 유지하기");
		Thread.sleep(3000);
	
	
		tribesout.click();
		System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 
		Thread.sleep(3000);
	
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
		.click(); 
		System.out.println("컨펌 팝업 나가기");
		Thread.sleep(3000);
			

		MobileElement back = driver.findElementByAccessibilityId("Up button in TopBar");
		back.click();
		System.out.println("TopBar Back"); 
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")
		.click(); 
		System.out.println("나의 트라이브 첫번째 트라이브 진입");
		Thread.sleep(3000);
		
		
		MobileElement tribesout1 = driver.findElementByAccessibilityId("out in TopBar");
		tribesout1.click();
		System.out.println("[트라이브 나가기]버튼-> 나가기 컨펌 팝업 출력"); 
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
		.click(); 
		System.out.println("컨펌 팝업 나가기");
		Thread.sleep(3000);
		
		
		MobileElement back1 = driver.findElementByAccessibilityId("Up button in TopBar");
		back1.click();
		System.out.println("TopBar Back"); 
		
		
	}
	
}
