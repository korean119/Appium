package appiumset;

import java.net.MalformedURLException;
import java.util.Set;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _4_Tribesdetail extends _0_Automation_Main {
	public static void tribesdetail() throws MalformedURLException, InterruptedException  {
		
		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();
		
		System.out.println("<<Tribes_detail 진행>>");

		driver.findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[5]")
		.click();
		System.out.println("뮤직 트라이브 진입");
		
		
		if (driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
				.isDisplayed())
		{System.out.println("토스트 팝업 존재");
		
		MobileElement toastView = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView");
		String text = toastView.getText();
		System.out.println(toastView.getText()); 	
		}else{
			System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
			driver.close();
		Thread.sleep(2000);
		}
			

		new TouchAction(driver)
		.longPress(PointOption.point(550, 1600))
		.waitAction()
		.moveTo(PointOption.point(550, 60))
		.release()
		.perform();
		System.out.println("스크롤 동작");
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("[자세히 보기] 버튼 입력");
		Thread.sleep(3000);

		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[시작하기] 버튼 입력");
		Thread.sleep(3000);
		

		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); }
		//if((contextName.contains("WEBVIEW_com.hanwha.lifeplus.tribes.app.qa"))) {
			
			driver.context((String) contextNames.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			MobileElement tribesinconfirm = driver.findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button[1]");
			tribesinconfirm .click();
			System.out.println("컨펌팝업 확인"); 
			
			driver.context("NATIVE_APP");
			Thread.sleep(3000);
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[시작하기] 버튼 입력");
		Thread.sleep(3000);
		
		
		Set<String> contextNames1 = driver.getContextHandles();
		for (String contextName1 : contextNames1) {
		    System.out.println(contextName1); }
		//if((contextName1.contains("WEBVIEW_com.hanwha.lifeplus.tribes.app.qa"))) {
			
			driver.context((String) contextNames1.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			
			MobileElement tribesinconfirm1 = driver.findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button[2]");
			tribesinconfirm1 .click();
			System.out.println("컨펌팝업 확인"); 
			
			driver.context("NATIVE_APP");

			Thread.sleep(3000);
		
		

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button[2]")
		.click(); 
		System.out.println("우측 상단 [X] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
		.click(); 
		System.out.println("[시작하기] 버튼 입력");
		Thread.sleep(3000);

		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View")
		.click(); 
		System.out.println("[사진 업로드하기(1장)] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);

		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("[사진 올리기)] 버튼 입력");
		Thread.sleep(4000);
		
		
		Set<String> contextNames2 = driver.getContextHandles();
		for (String contextName2 : contextNames2) {
		    System.out.println(contextName2); }
		//if((contextName2.contains("WEBVIEW_com.hanwha.lifeplus.tribes.app.qa"))) {
			
			driver.context((String) contextNames2.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			
			MobileElement imagedone = driver.findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button");
			imagedone .click();
			System.out.println("미션 완료 팝업 입력"); 
			
			driver.context("NATIVE_APP");

			Thread.sleep(3000);
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button[2]")
		.click(); 
		System.out.println("우측 상단 [X] 버튼 입력");
		Thread.sleep(3000);
		

		driver.navigate().back();
		System.out.println("안드로이드 H/K Back");
		Thread.sleep(2000);
		
		
		MobileElement back = driver.findElementByAccessibilityId("Up button in TopBar");
		back.click();
		System.out.println("TopBar Back"); 
		Thread.sleep(2000);
		
		
		
	}
		
	
}
