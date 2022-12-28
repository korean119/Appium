package Hanwhatribes_automation;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class _8_Settings extends _0_Automation_Main {
	
	public static void settings() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<<<<<< Settings 진행 >>>>>>>");
		

		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		
		
		Thread.sleep(2000); 
		MobileElement My트라이브버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
		wait.until(ExpectedConditions.visibilityOf(My트라이브버튼)).click();
		System.out.println("P# 트라이브 목록 화면_[My트라이브] 버튼 입력 ");
	
		
		Thread.sleep(2000); 
		MobileElement settinginTopBar = driver.get().findElementByAccessibilityId("setting in TopBar");
		wait.until(ExpectedConditions.visibilityOf(settinginTopBar)).click(); 
		System.out.println("P# My 트라이브 화면_[settinginTobBar] 버튼 입력");
		
		
		Thread.sleep(2000); 
		MobileElement 회원정보관리 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView\r\n");
		wait.until(ExpectedConditions.visibilityOf(회원정보관리)).click();
		System.out.println("P# 설정 화면_[회원정보 관리] 버튼 입력");
	
		
		MobileElement 변경전닉네임 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
		변경전닉네임.getText();
		
		String a = 변경전닉네임.getText();
		

		Thread.sleep(2000);
		MobileElement 닉네임변경버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button");
		wait.until(ExpectedConditions.visibilityOf(닉네임변경버튼)).click();
		System.out.println("P# 회원정보 관리 화면_[닉네임 변경] 버튼 입력");
	
	
		Thread.sleep(2000);
		driver.get().getKeyboard().sendKeys("Automati");
		String b = "Automati";
	
		System.out.println("P# 회원정보 관리 화면_닉네임 입력");
		
		
		Thread.sleep(2000);		
		MobileElement 닉네임저장버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button"); 
		wait.until(ExpectedConditions.visibilityOf(닉네임저장버튼)).click();
	    System.out.println("P# 회원정보 관리 화면_[저장] 버튼 입력");
		Thread.sleep(2000);
		
		
		MobileElement 변경후닉네임 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
		변경후닉네임.getText();
		String c = 변경후닉네임.getText();
		System.out.println("변경전 닉네임 = " + a );
		
		if(b.equals(c)) {
			System.out.println("입력한 닉네임 " + b + 변경후닉네임.getText() + " 일치");
			
		}else {
			System.out.println("입력한 닉네임 = " + b + 변경후닉네임.getText() + " 불일치 --> Fail");
			driver.get().close();
		}
		

		Thread.sleep(2000);
		MobileElement 닉네임초기화버튼 = driver.get().findElementByAccessibilityId("clear input");
		wait.until(ExpectedConditions.visibilityOf(닉네임변경버튼)).click();
		System.out.println("P# 회원정보 관리 화면_[닉네임 변경] 버튼 입력");
		
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(닉네임초기화버튼)).click();
		System.out.println("닉네임 초기화");
		System.out.println("P# 회원정보 관리 화면_[초기화] 버튼 입력");
		Thread.sleep(2000);
		
		
		driver.get().getKeyboard().sendKeys("def  ult");
		System.out.println("P# 회원정보 관리 화면_닉네임 띄어쓰기 포함 입력");
	
		Thread.sleep(2000);
		MobileElement alert = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]/android.widget.TextView[2]");
		
		if (alert.isDisplayed())
		{System.out.println("얼럿메세지 출력: " + alert.getText()); 	
		
		}else{
			System.out.println("얼럿메세지 없음 -- Fail"); 
			driver.get().close();
		}
		
		
		wait.until(ExpectedConditions.visibilityOf(닉네임초기화버튼)).click();
		System.out.println("닉네임 초기화");
		
		
		Thread.sleep(2000);
		driver.get().getKeyboard().sendKeys("defult");
		System.out.println("P# 회원정보 관리 화면_기본 닉네임 입력");
		

		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(닉네임저장버튼)).click();
	    System.out.println("P# 회원정보 관리 화면_[저장] 버튼 입력");
		
		
		Thread.sleep(2000);
		if (driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("토스트 팝업 존재");
		
		MobileElement 닉네임변경토스트팝업 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView");
		System.out.println(닉네임변경토스트팝업.getText()); 	
		
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  
			driver.get().close();
		
		}
		
		Thread.sleep(2000);
		MobileElement 회원탈퇴버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView[3]");
		wait.until(ExpectedConditions.visibilityOf(회원탈퇴버튼)).click();
		System.out.println("P# 회원정보 관리 화면_탈퇴 [여기] 버튼 입력");
		
		Thread.sleep(2000);
		
		MobileElement 회원탈퇴화면X버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView"); 
		wait.until(ExpectedConditions.visibilityOf(회원탈퇴화면X버튼)).click();
		System.out.println("P# 히원정보 관리 화면_ 탈퇴화면 [X] 버튼 입력");
		
		
		MobileElement UpButtoninTopBar = driver.get().findElementByAccessibilityId("Up button in TopBar");
		wait.until(ExpectedConditions.visibilityOf(UpButtoninTopBar)).click();
		System.out.println("P# 회원정보 관리 화면_UpButtoninTopBar 버튼 입력"); 
		

		MobileElement 알림설정 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView"); 
		wait.until(ExpectedConditions.visibilityOf(알림설정)).click();
		System.out.println("P# 설정 화면_알림설정 진입");
		
		
		MobileElement 서비스알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView");
		wait.until(ExpectedConditions.visibilityOf(서비스알림)).click();
		System.out.println("P# 알림설정 화면_서비스 알림 진입");
		
		
		MobileElement 기본알림토글버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[1]");
		wait.until(ExpectedConditions.visibilityOf(기본알림토글버튼)).click();
		System.out.println("P# 서비스 알림 화면_기본 알림 토글 버튼 Off");

		
		wait.until(ExpectedConditions.visibilityOf(기본알림토글버튼)).click();
		System.out.println("P# 서비스 알림 화면_기본 알림 토글 버튼 On");
		
		
		MobileElement 트라이브알림토글버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[2]");
		wait.until(ExpectedConditions.visibilityOf(트라이브알림토글버튼)).click();
		System.out.println("P# 서비스 알림 화면_기본 알림 토글 버튼 Off");
		
		
		wait.until(ExpectedConditions.visibilityOf(UpButtoninTopBar)).click();
		System.out.println("P# 서비스 알림_UpButtoninTopBar 버튼 입력"); 
		

		MobileElement 혜택및이벤트알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView"); 
		wait.until(ExpectedConditions.visibilityOf(혜택및이벤트알림)).click();
		System.out.println("P# 알림설정 화면_혜택 및 이벤트 알림 진입");

		
		MobileElement 야간알림제한토글버튼 = driver.get().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch"));
		wait.until(ExpectedConditions.visibilityOf(야간알림제한토글버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_야간 알림 제한 토글 Off");
		
		wait.until(ExpectedConditions.visibilityOf(야간알림제한토글버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_야간 알림 제한 토글 On");


		MobileElement 혜택및이벤트알림토글버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]"); 
		wait.until(ExpectedConditions.visibilityOf(혜택및이벤트알림토글버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_혜택 및 이벤트 알림 토글 Off");
		
		
		MobileElement 바텀시트유지하기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View");
		wait.until(ExpectedConditions.visibilityOf(바텀시트유지하기버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_바텀 시트 [유지하기] 버튼 입력 ");
		
		
		wait.until(ExpectedConditions.visibilityOf(혜택및이벤트알림토글버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_혜택 및 이벤트 알림 토글 Off");
	
		
		MobileElement 바텀시트끄기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"); 
		wait.until(ExpectedConditions.visibilityOf(바텀시트끄기버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_바텀 시트 [끄기] 버튼 입력 ");
		
		
		MobileElement 알림Off컨펌팝업확인버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
		wait.until(ExpectedConditions.visibilityOf(알림Off컨펌팝업확인버튼)).click();
		System.out.println("컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.visibilityOf(혜택및이벤트알림토글버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_혜택 및 이벤트 알림 토글 On");
	
		
		MobileElement 알림On컨펌팝업확확인버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View");
		wait.until(ExpectedConditions.visibilityOf(알림On컨펌팝업확확인버튼)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_컨펌 팝업 [확인] 버튼 입력");
		Thread.sleep(3000);
		
		// @ 여기 하나 비어있음 
		
		
		wait.until(ExpectedConditions.visibilityOf(UpButtoninTopBar)).click();
		System.out.println("P# 혜택 및 이벤트 알림 화면_UpButtoninTopBar 버튼 입력"); 

	
		wait.until(ExpectedConditions.visibilityOf(UpButtoninTopBar)).click();
		System.out.println("P# 알림 설정 화면_UpButtoninTopBar 버튼 입력"); 
	

		
		MobileElement 자주묻는질문 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.TextView"); 
		wait.until(ExpectedConditions.visibilityOf(자주묻는질문)).click();
		System.out.println("P# 설정 화면_자주 묻는 질문 진입");

		
		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
		Thread.sleep(2000); // context 변경 할 시간 필요하기 떄문에 sleep 사용
		System.out.println("S# Context WebView로 변경");
		Thread.sleep(2000);
		
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
		
		MobileElement 사진첨부하기버튼 = driver.get().findElementByXPath("//*[@id='add-inquiry-photo']");
		wait.until(ExpectedConditions.visibilityOf(사진첨부하기버튼)).sendKeys(Keys.ENTER);
		System.out.println("P# 1:1문의 화면_[사진 첨부하기] 버튼 입력");
		
		driver.get().context("NATIVE_APP");
		
		
		// 갤러리 영역 병렬 테스트가 가능한지 여부 확인 필요
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);
		

		for (String contextName : contextNames) {
			System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
		System.out.println("S# Context WebView로 변경");
		Thread.sleep(3000);
		
		MobileElement 첨부이미지삭제 = driver.get().findElementByXPath("//button[@aria-label='첨부 이미지 삭제']");
		wait.until(ExpectedConditions.visibilityOf(첨부이미지삭제)).sendKeys(Keys.ENTER);
		System.out.println("P# 1:1문의 화면_[이미지 삭제] 버튼 입력");
		Thread.sleep(3000);
		
		
		MobileElement 문의유형드롭다운 = driver.get().findElementByXPath("//*[@id=\"__next\"]/div[3]/div[1]/button");
		wait.until(ExpectedConditions.visibilityOf(문의유형드롭다운)).sendKeys(Keys.ENTER);
		System.out.println("P# 1:1문의 화면_문의유형 드롭다운 선택");
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
		
		driver.get().context("NATIVE_APP");
		Thread.sleep(3000);
		
		MobileElement 공지사항버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]");
		wait.until(ExpectedConditions.visibilityOf(공지사항버튼)).sendKeys(Keys.ENTER);
		System.out.println("P# 설정 화면_[공지사항] 진입");

		
		Thread.sleep(3000);
		MobileElement 공지사항항목선택 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]");
		wait.until(ExpectedConditions.visibilityOf(공지사항항목선택)).sendKeys(Keys.ENTER);
		System.out.println("P# 공지사항 화면_공지사항 항목 진입");
		
		
		Thread.sleep(3000);
		MobileElement 공지사항상세화면X버튼 = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[1]/div/button/svg");
		wait.until(ExpectedConditions.visibilityOf(공지사항상세화면X버튼)).sendKeys(Keys.ENTER);
		System.out.println("P# 공지사항 화면_공지사항 상세화면 [X] 버튼 입력 ");
				
				
		Thread.sleep(3000);
		MobileElement 공지사항목록화면Back버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button");
		wait.until(ExpectedConditions.visibilityOf(공지사항목록화면Back버튼)).sendKeys(Keys.ENTER);
		System.out.println("P# 공지사항 화면_[Back]버튼 입력");

		Thread.sleep(3000);
		MobileElement 약관및정책진입 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]");
		wait.until(ExpectedConditions.visibilityOf(약관및정책진입)).sendKeys(Keys.ENTER);
		System.out.println("P# 설정 화면_약관 및 정책 진입");
		
		Thread.sleep(3000);
		MobileElement 서비스이용약관진입 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView");
		wait.until(ExpectedConditions.visibilityOf(서비스이용약관진입)).sendKeys(Keys.ENTER);
		System.out.println("P# 약관 및 정책 화면_서비스 이용약관 진입");

		//@ 여기까지 진행. 근데 진행하다보니 해당 부분 context 변경 구간 적용 안되어 있어서.. 다시 생각해보니.. 설정 부분은 자동화 전략 다시 수립 필요할 듯..
		//@ 이유 : 웹뷰 <-> 네이티브 변환 구간이 너무 많음. 계속해서 변환하면서 테스트 할 필요성이 있는지.. 직접 하는게 자동화 보다 훨씬 빠를 것으로 예상됨 
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
