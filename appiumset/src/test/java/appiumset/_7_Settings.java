package appiumset;

import java.net.MalformedURLException;
import java.util.Set;

import io.appium.java_client.MobileElement;

public class _7_Settings extends _0_Automation_Main {
	
	public static void settings() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<< Settings 진행>>");
		
		/*-----------------------
		
		MobileElement kakao = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("카카오 클릭 완료");
		Thread.sleep(3000);              

		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			
			driver.get().findElementByXPath("//*[@id=\"mArticle\"]/div/div/div[2]/form/button")
			.click();
			System.out.println("카카오 계속하기 클릭 완료 ");
			Thread.sleep(3000);
			
			System.out.println("컨펌팝업 확인"); 
			
			driver.get().context("NATIVE_APP");
			Thread.sleep(3000);
		
		//----------------------- */
		
		MobileElement settings = driver.get().findElementByAccessibilityId("setting in TopBar");
		settings.click(); 
		System.out.println("설정 입력");
	
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView\r\n")
		.click(); 
		System.out.println("설정 -> 회원정보 관리");
		Thread.sleep(1000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click();
		System.out.println("회원정보 관리 -> 닉네임 변경 버튼");
		
		
		MobileElement nickname = driver.get().findElementByAccessibilityId("clear input");
		nickname.click(); 
		System.out.println("닉네임 초기화");
		
		
		driver.get().getKeyboard().sendKeys("Donggyu");
		System.out.println("닉네임 입력");
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("회원정보 관리 -> 저장");
		

		MobileElement changename = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
		MobileElement changename2 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
		
		String text = changename.getText();
		System.out.println("입력된 닉네임: " + changename.getText());
		
		if(changename.equals(changename2)) {
			System.out.println("지정한 닉네임< " + changename2.getText() + " >와 일치");
			
		}else {
			System.out.println("지정한 닉네임< " + changename2.getText() + " >와 불일치 --> 이슈");
			driver.get().close();
		}
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click();
		System.out.println("회원정보 관리 -> 닉네임 변경 버튼");
		
		
		MobileElement nickname2 = driver.get().findElementByAccessibilityId("clear input");
		nickname2.click(); 
		System.out.println("닉네임 초기화");
		
		
		driver.get().getKeyboard().sendKeys("def  ult");
		System.out.println("닉네임 띄어쓰기 입력");
		
		if (driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]/android.widget.TextView[2]")
				.isDisplayed())
		{System.out.println("얼럿메세지 존재");
		
		MobileElement alert = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]/android.widget.TextView[2]");
		String text2 = alert.getText();
		System.out.println("얼럿메세지 출력: " + alert.getText()); 	
		}else{
			System.out.println("얼럿메세지 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
		}
		
		Thread.sleep(2000);
		
		MobileElement nickname3 = driver.get().findElementByAccessibilityId("clear input");
		nickname3.click(); 
		System.out.println("닉네임 초기화");
		
		
		driver.get().getKeyboard().sendKeys("defult");
		System.out.println("기본 닉네임 입력");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("회원정보 관리 -> 저장");
		
		Thread.sleep(2000);
		
		if (driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("토스트 팝업 존재");
		
		MobileElement toastView = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView");
		String text3 = toastView.getText();
		System.out.println(toastView.getText()); 	
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
		Thread.sleep(2000);
		}
		
		MobileElement signout = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
		signout.click(); 
		System.out.println("탈퇴 [여기] 버튼 입력");
		
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView")
		.click(); 
		System.out.println("[X] 버튼 입력 -> 회원정보 관리");
		
		
		MobileElement back5 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back5.click(); 
		System.out.println("[Back key] 입력 -> 설정"); 
		

		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 알림설정 진입");
	
	
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 알림설정 > 혜택 및 이벤트 알림 진입");


		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")
		.click(); 
		System.out.println("혜택 및 이벤트 알림 토글 클릭");
	
	
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")
		.click(); 
		System.out.println("바텀 시트 [끄기] 버튼 입력 ");
		Thread.sleep(3000);
	
	
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button")
		.click();
		System.out.println("컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);

	
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")
		.click(); 
		System.out.println("혜택 및 이벤트 알림 토글 클릭");
	
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button")
		.click();
		System.out.println("컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);

		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch")
		.click(); 
		System.out.println("야간 알림 제한 토글 클릭 ");
		Thread.sleep(3000);
	
	
		MobileElement back2 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back2.click();
		System.out.println("TopBar Back"); 

	
		MobileElement back3 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back3.click();
		System.out.println("TopBar Back"); 
	
	
		MobileElement back4 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back4.click();
	
		
		MobileElement settings2 = driver.get().findElementByAccessibilityId("setting in TopBar");
		settings2.click();
		System.out.println("설정 입력2");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 자주 묻는 질문");
		
		MobileElement button = driver.get().findElementByAccessibilityId("1:1 문의하기");
		button.click();
		System.out.println("1:1문의하기 버튼 입력");
		Thread.sleep(2000);
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.TextView")
		.click(); 
		System.out.println("사진 첨부하기 입력");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);
		

		driver.get().findElementsByXPath("//a[contains(@aria-label, '첨부 이미지 삭제')]");
		System.out.println("첨부 이미지 삭제");

		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("1:1문의 > 자주 묻는 질문");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("자주 묻는 질문 > 설정");
		
		MobileElement back6 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back6.click(); 
		System.out.println("[Back key] 설정 -> MY트라이브");
	}

}
