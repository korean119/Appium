package appiumset;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class _7_Settings extends _0_Automation_Main {
	
	public static void settings() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<< Settings 진행>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 20);
		
		
		MobileElement settings2 = driver.get().findElementByAccessibilityId("setting in TopBar");
		settings2.click();
		System.out.println("설정 입력2");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.TextView")
		.click(); 
		System.out.println("설정 > 자주 묻는 질문");
		
		
		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); }
			
	
		driver.get().context((String) contextNames.toArray()[1]);
		Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
		System.out.println("S# 트라이브 홈 화면_혜택 상세 화면 Context WebView로 변경");  
	
		
		MobileElement 일대일문의하기버튼 = driver.get().findElementByXPath("//a[@id='inquiry-in-faq']");
		wait.until(ExpectedConditions.visibilityOf(일대일문의하기버튼)).sendKeys(Keys.ENTER);
		System.out.println("일대일문의하기버튼"); 
		Thread.sleep(3000);
		
		
		MobileElement 나의문의하기내역버튼 = driver.get().findElementByXPath("//button[@id='inquiry-list-tab']");
		wait.until(ExpectedConditions.visibilityOf(나의문의하기내역버튼)).sendKeys(Keys.ENTER);  
		System.out.println("나의문의하기내역버튼"); 
		Thread.sleep(3000);
		
		
		MobileElement 일대일문의버튼 = driver.get().findElementByXPath("//button[@id='inquiry-tab']");
		wait.until(ExpectedConditions.visibilityOf(일대일문의버튼)).sendKeys(Keys.ENTER); 
		System.out.println("일대일문의버튼"); 
		Thread.sleep(3000);
		
		
		MobileElement 사진첨부하기 = driver.get().findElementByXPath("//label[@id='add-inquiry-photo']");
		wait.until(ExpectedConditions.visibilityOf(사진첨부하기)).sendKeys(Keys.ENTER); 
		System.out.println("사진첨부하기"); 
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);
		
		
		MobileElement 문의등록완료팝업 = driver.get().findElementByXPath("//button[@id='문의 접수 완료o']");
		wait.until(ExpectedConditions.visibilityOf(사진첨부하기)).sendKeys(Keys.ENTER); 
		System.out.println("사진첨부하기"); 
		
		
		
		

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
