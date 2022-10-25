package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class _7_Settings extends _0_Automation_Main {
	
	public static void settings() throws MalformedURLException, InterruptedException  {
		
		
		
		MobileElement settings = driver.findElementByAccessibilityId("setting in TopBar");
		settings.click(); 
		System.out.println("설정 입력");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 자주 묻는 질문");
		
		MobileElement button = driver.findElementByAccessibilityId("1:1 문의하기");
		button.click();
		System.out.println("1:1문의하기 버튼 입력");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.TextView")
		.click(); 
		System.out.println("사진 첨부하기 입력");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.Button").click();
				
		System.out.println("사진 첨부하기 입력");

		driver.findElementsByXPath("//a[contains(@aria-label, '첨부 이미지 삭제')]");
		System.out.println("첨부 이미지 삭제");

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("1:1문의 > 자주 묻는 질문");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("자주 묻는 질문 > 설정");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 알림설정 진입");
	
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 알림설정 > 혜택 및 이벤트 알림 진입");


		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")
		.click(); 
		System.out.println("혜택 및 이벤트 알림 토글 클릭");
	
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")
		.click(); 
		System.out.println("바텀 시트 [끄기] 버튼 입력 ");
		Thread.sleep(3000);
	
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button")
		.click();
		System.out.println("컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);

	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")
		.click(); 
		System.out.println("혜택 및 이벤트 알림 토글 클릭");
	
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button")
		.click();
		System.out.println("컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);

		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch")
		.click(); 
		System.out.println("야간 알림 제한 토글 클릭 ");
		Thread.sleep(3000);
	
	
		MobileElement back2 = driver.findElementByAccessibilityId("Up button in TopBar");
		back2.click();
		System.out.println("TopBar Back"); 

	
		MobileElement back3 = driver.findElementByAccessibilityId("Up button in TopBar");
		back3.click();
		System.out.println("TopBar Back"); 
	
	
		MobileElement back4 = driver.findElementByAccessibilityId("Up button in TopBar");
		back4.click();
	
		
		MobileElement settings2 = driver.findElementByAccessibilityId("setting in TopBar");
		settings2.click();
		System.out.println("설정 입력2");
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView\r\n")
		.click(); 
		System.out.println("설정 -> 회원정보 관리");
		Thread.sleep(1000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click();
		System.out.println("회원정보 관리 -> 닉네임 변경 버튼");
		
		
		MobileElement nickname = driver.findElementByAccessibilityId("clear input");
		nickname.click(); 
		System.out.println("닉네임 초기화");
		
		
		driver.getKeyboard().sendKeys("Junoh");
		System.out.println("닉네임 입력");
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("회원정보 관리 -> 저장");
		
		
		MobileElement back5 = driver.findElementByAccessibilityId("Up button in TopBar");
		back5.click(); 
		System.out.println("회원정보 관리 Back key"); 
		
		
		MobileElement back6 = driver.findElementByAccessibilityId("Up button in TopBar");
		back6.click();
		System.out.println("설정 Back key");
		
		
	}

}
