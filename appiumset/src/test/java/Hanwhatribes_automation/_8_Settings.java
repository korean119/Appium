package Hanwhatribes_automation;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _8_Settings extends _0_Automation_Main {
	
	public static void settings() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<< Settings 진행>>");
		

		WebDriverWait wait = new WebDriverWait(driver.get(), 10);

		
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
		Thread.sleep(2000);
		
		MobileElement nickname = driver.get().findElementByAccessibilityId("clear input");
		nickname.click(); 
		System.out.println("닉네임 초기화");
		Thread.sleep(2000);
		
		driver.get().getKeyboard().sendKeys("Donggyu");
		System.out.println("닉네임 입력");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("회원정보 관리 -> 저장");
		Thread.sleep(2000);

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
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button")
		.click();
		System.out.println("회원정보 관리 -> 닉네임 변경 버튼");
		Thread.sleep(2000);
		
		MobileElement nickname2 = driver.get().findElementByAccessibilityId("clear input");
		nickname2.click(); 
		System.out.println("닉네임 초기화");
		Thread.sleep(2000);
		
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
		
		}
		
		Thread.sleep(5000);
		
		MobileElement signout = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView[3]");
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
		Thread.sleep(3000);
		
		Set<String> contextNames1 = driver.get().getContextHandles();
		for (String contextName : contextNames1) {
			System.out.println(contextName); }
			
	
		driver.get().context((String) contextNames1.toArray()[1]);
		Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용
		System.out.println("S# Context WebView로 변경");
		Thread.sleep(3000);
		
		
		MobileElement 일대일문의하기버튼 = driver.get().findElementByXPath("//a[@id='inquiry-in-faq']");
		wait.until(ExpectedConditions.visibilityOf(일대일문의하기버튼)).sendKeys(Keys.ENTER);
		System.out.println("[1:1문의하기] 버튼 입력");
		Thread.sleep(3000);
		
		
		MobileElement 나의문의하기내역버튼 = driver.get().findElementByXPath("//button[@id='inquiry-list-tab']");
		wait.until(ExpectedConditions.visibilityOf(나의문의하기내역버튼)).sendKeys(Keys.ENTER);
		System.out.println("[나의 문의하기 내역] Tab 입력");
		Thread.sleep(3000);
		
		
		MobileElement 일대일문의버튼 = driver.get().findElementByXPath("//button[@id='inquiry-tab']");
		wait.until(ExpectedConditions.visibilityOf(일대일문의버튼)).sendKeys(Keys.ENTER);
		System.out.println("[1:1문의] Tab 입력");
		Thread.sleep(3000);
		
		MobileElement photo = driver.get().findElementByXPath("//*[@id='add-inquiry-photo']");
		photo.click();
		
		//wait.until(ExpectedConditions.visibilityOf(photo)).sendKeys(Keys.ENTER);
		System.out.println("[사진 첨부하기] 버튼 입력");
		Thread.sleep(2000);
		
		driver.get().context("NATIVE_APP");
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);
		
		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); }
			
	
		driver.get().context((String) contextNames.toArray()[1]);
		System.out.println("S# Context WebView로 변경");
		Thread.sleep(3000);
		
		MobileElement 첨부이미지삭제 = driver.get().findElementByXPath("//button[@aria-label='첨부 이미지 삭제']");
		wait.until(ExpectedConditions.visibilityOf(첨부이미지삭제)).sendKeys(Keys.ENTER);
		System.out.println("첨부 이미지 삭제");
		Thread.sleep(3000);
		
		driver.get().findElementByXPath("//*[@id=\"__next\"]/div[3]/div[1]/button")
		.click();
		System.out.println("드롭다운 출력");
		Thread.sleep(3000);
		
		MobileElement box = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div[2]/div/div/div/ul/li[1]/label");
		box.click();
		System.out.println("트라이브 선택");
		Thread.sleep(2000);
		
		MobileElement 제목 = driver.get().findElementByXPath("//*[@id='title']");
		wait.until(ExpectedConditions.visibilityOf(제목)).sendKeys(Keys.ENTER);
		System.out.println("제목 입력");
		Thread.sleep(2000);
		
		driver.get().getKeyboard().sendKeys("QaTest");
		System.out.println("제목 text 입력");
		
		MobileElement 문의내용 = driver.get().findElementByXPath("//*[@id='inquiry']");
		wait.until(ExpectedConditions.visibilityOf(문의내용)).sendKeys(Keys.ENTER);
		System.out.println("문의내용 입력");
		Thread.sleep(2000);
		
		driver.get().getKeyboard().sendKeys("QaTest2");
		System.out.println("문의내용 text 입력");
		
		MobileElement 문의하기버튼 = driver.get().findElementByXPath("//*[@id='inquiry-regist']");
		wait.until(ExpectedConditions.visibilityOf(문의하기버튼)).sendKeys(Keys.ENTER);
		System.out.println("[문의하기] 버튼 입력");
		Thread.sleep(2000);
		
		if (driver.get().findElementByXPath("//div[@aria-label='문의 접수 완료']")
				.isDisplayed())
		{System.out.println("토스트 팝업 출력 확인");
		
		MobileElement inquiry = driver.get().findElementByXPath("//div[@aria-label='문의 접수 완료']");
		String text4 = inquiry.getText();
		System.out.println(inquiry.getText()); 			
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.get().close();
	
		}
		
		Thread.sleep(6000);
		
		MobileElement 뒤로가기버튼 = driver.get().findElementByXPath("//*[@id=\"__next\"]/div[1]/div/button");
		wait.until(ExpectedConditions.visibilityOf(뒤로가기버튼)).sendKeys(Keys.ENTER);
		System.out.println("[뒤로가기] 버튼 입력 -> 설정 **(이슈)** ");
		Thread.sleep(3000);
		
		
		  //driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		 // .click();
		//  System.out.println("자주 묻는 질문 > 설정"); Thread.sleep(2000);
		 
		
		driver.get().context("NATIVE_APP");
		Thread.sleep(3000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]")
		.click(); 
		System.out.println("공지사항 진입");
		Thread.sleep(2000);
				
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[뒤로가기] 버튼 입력");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]")
		.click(); 
		System.out.println("약관 및 정책 진입");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView")
		.click(); 
		System.out.println("서비스 이용약관 진입");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[X] 버튼 입력");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView")
		.click(); 
		System.out.println("개인정보 처리방침 진입");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[X] 버튼 입력");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.TextView")
		.click(); 
		System.out.println("오픈소스 라이선스 진입");
		Thread.sleep(2000);
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[X] 버튼 입력");
		Thread.sleep(2000);
		
		MobileElement back6 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back6.click(); 
		System.out.println("[Back key] 약관 및 정책 -> 설정");
		
		
		MobileElement back7 = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back7.click(); 
		System.out.println("[Back key] 설정 -> MY트라이브"); 
		
	}

}
