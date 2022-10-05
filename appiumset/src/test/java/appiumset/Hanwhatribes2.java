package appiumset;

// github token : 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

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Hanwhatribes2 {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
	
		while(true)
		try {
			hanwhatribes();
			onboarding();
			tribeslist();
			tribeshome();
			settings();
	
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();		
		break;
		}
	}
	

	public static void hanwhatribes() throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability("deviceName", "Galaxy Z Filp3 5G");
		//cap.setCapability("udid", "R3CRB0JNBQA");
		
		//cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		cap.setCapability("appPackage", "com.hanwha.lifeplus.tribes.app.qa");
		cap.setCapability("appActivity", "com.hanwha.lifeplus.presentation.ui.HomeActivity");
		cap.setCapability("automationName", "UiAutomator2");
	
		cap.setCapability("noReset","false");
		cap.setCapability("FullReset","true");
		
		//@ 이건 뭐하는거지
		cap.setCapability("skipUnlock","true");
		
		//
		cap.setCapability("autowebview","true");
		
		//@ 데이터 속도 최고 느리게 , 적용 되는지는 잘 모르겠음
		cap.setCapability("networkSpeed", "gsm");
		
		//@ 권한을 자동으로 결정하고 설치 시 앱에 부여 합니다
		//cap.setCapability("ATUO_GRANT_REMISSIONS", "true");
		
		//@ 버전 체크 후 설치, 재설치 판단 -- fail 버전 같을 시 재설치 안함
		cap.setCapability("enforceAppinstall", "fail");
		
		//@ 앱을 초기화 할지 안할지 설정 -- true 기본값 -- 준오 근데 잘 되는지는 안봤음
		cap.setCapability("autoLaunch", "true");
		
		// @갤럭시 플립
		// cap.setCapability("udid", "192.168.0.121:5550");
		
		// @갤럭시 폴드
		//cap.setCapability("udid", "192.168.0.85:5551");
		
		URL url = new URL("http://0.0.0.0:4720/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
		
	
		public static void onboarding() throws MalformedURLException, InterruptedException  {
			
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		System.out.println("온보딩 버튼 클릭 완료 ");

		
		MobileElement kakao = driver.findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("카카오 클릭 완료");
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
		.click();
		System.out.println("카카오 계속하기 클릭 완료 ");
		Thread.sleep(3000);
		
		
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
				.click();	
				System.out.println("트라이브 목록 탭");
	
		}

		public static void tribeslist() throws MalformedURLException, InterruptedException  {
			
			/*
			WebElement ele01 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");

			int centerX = ele01.getRect().x + (ele01.getSize().width/2);
			double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);
			double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);
			//Type of Pointer Input
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
			//Creating Sequence object to add actions
			Sequence swipe = new Sequence(finger,1);
			//Move finger into starting position
			swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));
			//Finger comes down into contact with screen
			swipe.addAction(finger.createPointerDown(0));
			//Finger moves to end position
			swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
			        PointerInput.Origin.viewport(),centerX, (int)endY));
			//Get up Finger from Srceen
			swipe.addAction(finger.createPointerUp(0));

			//Perform the actions
			driver.perform(Arrays.asList(swipe));
			Thread.sleep(3000);
			*/
			
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
			         ".scrollIntoView(new UiSelector().text(\"뮤직\"))"));
			Thread.sleep(2000);
			
			//요소 찾기
			//MobileElement elementOne = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
			//MobileElement elementTwo = (MobileElement) driver.findElementByClassName("SomeClassName");

			driver.findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]")
			.click(); 
			System.out.println("뮤직 트라이브 진입");


			MobileElement tribesin = driver.findElementByAccessibilityId("arrow beside text in button");
			tribesin.click();
			System.out.println("[입장하기] 버튼 입력 ");
			
			WebElement ele2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");

			int center2X = ele2.getRect().x + (ele2.getSize().width/2);
			double start2Y = ele2.getRect().y + (ele2.getSize().height * 0.9);
			double end2Y = ele2.getRect().y + (ele2.getSize().height * 0.1);
			//Type of Pointer Input
			PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH,"finger2");
			//Creating Sequence object to add actions
			Sequence swipe2 = new Sequence(finger2,1);
			//Move finger into starting position
			swipe2.addAction(finger2.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),center2X,(int)start2Y));
			//Finger comes down into contact with screen
			swipe2.addAction(finger2.createPointerDown(0));
			//Finger moves to end position
			swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(700),
			        PointerInput.Origin.viewport(),center2X, (int)end2Y));
			//Get up Finger from Srceen
			swipe2.addAction(finger2.createPointerUp(0));
			//Perform the actions
			driver.perform(Arrays.asList(swipe2));
			Thread.sleep(3000);
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView")
			.click(); 
			System.out.println("[자세히 보기] 버튼 입력");
			Thread.sleep(3000);
		
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("[시작하기] 버튼 입력");
			Thread.sleep(3000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button[2]")
			.click(); 
			System.out.println("우측 상단 [X] 버튼 입력");
			Thread.sleep(3000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("[시작하기] 버튼 입력");
			Thread.sleep(3000);
	
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
			.click(); 
			System.out.println("[사진 업로드하기(1장)] 버튼 입력");
			Thread.sleep(3000);
			
			
			//driver.findElementByXPath("android.widget.LinearLayout[@content-desc=\"Screenshot_20220927_144436_QA_.jpg, 156KB, 9월 27일\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")
			//.click(); 
			//System.out.println("이미지 선택");
			//Thread.sleep(3000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
			.click(); 
			System.out.println("[갤러리)] 버튼 입력");
			Thread.sleep(3000);
			
			
			driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
			.click(); 
			System.out.println("이미지 선택");
			Thread.sleep(3000);

			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
			.click(); 
			System.out.println("[사진 올리기)] 버튼 입력");
			Thread.sleep(3000);
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("안드로이드 H/K Back");
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("안드로이드 H/K Back");
			
			
			MobileElement back = driver.findElementByAccessibilityId("Up button in TopBar");
			back.click();
			System.out.println("TopBar Back"); 
	
			
		}
		
		
		
		public static void tribeshome() throws MalformedURLException, InterruptedException  {

			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
			.click(); 
			System.out.println("트라이브 홈 탭");
			Thread.sleep(2000);
		
			
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
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
			.click(); 
			System.out.println("당첨확률 바텀시트 [x]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("당첨확률 바텀시트 [확인]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("진행중 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(2000);
			
			
			MobileElement sheetclose = driver.findElementByAccessibilityId("시트 닫기");
			sheetclose.click(); 
			System.out.println("바텀시트 시트 닫기(외부터치)");
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView[1]")
			.click(); 
			System.out.println("[종료] 탭 입력");
			Thread.sleep(2000);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(2000);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
			.click(); 
			System.out.println("당첨확률 바텀시트 [x]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("당첨확률 바텀시트 [확인]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(2000);
			
			
			MobileElement sheetclose1 = driver.findElementByAccessibilityId("시트 닫기");
			sheetclose1.click(); 
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
			
			
		}
		
		
		
		public static void settings() throws MalformedURLException, InterruptedException  {
			
	
			MobileElement settings = driver.findElementByAccessibilityId("setting in TopBar");
			settings.click(); 
			System.out.println("설정 입력");
		
		
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

			//WebElement yagannoti = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
			//if (yagannoti.isEnabled()) {
				//	System.out.println("활성화임");
				//	}else {yagannoti.click();
				//	Thread.sleep(3000);
		
				
			//@ 여기에 토글 off 일 경우 if 문 걸어야
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
		
		}
		
		/*
		
			driver.findElementByXPath
			("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
			.click();	
			System.out.println("트라이브 목록 탭");
		
		
		// @ 뮤직 트라이브 찾을 때 까지 스크롤 -- 근데 스크롤이 정확하지 않아서 xpaht 값이 꼬일 때가 있음 
		MobileElement findmusic1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		         ".scrollIntoView(new UiSelector().text(\"뮤직\"))"));
		System.out.println("뮤직 찾기 스크롤");
		Thread.sleep(3000);

		
		// @ 좌표가 절대값이 아니라 기기별로 차이 가 날 수도 있을 듯 
		driver.findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]")
		.click(); 
		System
		.out.println("런닝(2) 트라이브 진입");
		
		
		// @ 뮤직 트라이브 찾을 때 까지 스크롤 -- 근데 스크롤이정확하지 않아서 xpaht 값이 꼬일 때가 있음 
				MobileElement findjasae = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
				         ".scrollIntoView(new UiSelector().text(\"QA\"))"));
				System.out.println("자세 찾기 스크롤");
				Thread.sleep(3000);
				
				
				
		 
		driver.findElementByXPath("(/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View")
		.click(); 
		System
		.out.println("[자세히 보기 >] 버튼 입력");				
				
				
		MobileElement engmo = (MobileElement) driver.findElementByClassName("응모전");
		String elText = engmo.getText();
		back.click();
				
				
		MobileElement notification = driver.findElementByAccessibilityId("notification in TopBar");
		notification.click(); 
		System.out.println("알림함");

		
		
		/*
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
		.click();
		System.out.println("트라이브 홈 탭 ");
		
		MobileElement settings = driver.findElementByAccessibilityId("setting in TopBar");
		settings.click(); 
		System.out.println("설정 입력");
				
		MobileElement back = driver.findElementByAccessibilityId("Up button in TopBar");
		back.click();
		System.out.println("설정 -> Back key"); 
		
		MobileElement notification = driver.findElementByAccessibilityId("notification in TopBar");
		notification.click(); 
		System.out.println("알림함");

		MobileElement back2 = driver.findElementByAccessibilityId("Up button in TopBar");
		back2.click(); 
		System.out.println("알림함 -> Back key"); 
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("트라이브 둘러보기");

		driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]")
		.click(); 
		System.out.println("이벤트 탭");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView")
		.click();
		System.out.println("진행 예정");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.TextView")
		.click();
		System.out.println("종료");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
		.click(); 
		System.out.println("트라이브 홈 탭 ");
		
		MobileElement settings2 = driver.findElementByAccessibilityId("setting in TopBar");
		settings2.click();
		System.out.println("설정 입력2");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView\r\n")
		.click(); 
		System.out.println("설정 -> 회원정보 관리");
		
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
		
		MobileElement back3 = driver.findElementByAccessibilityId("Up button in TopBar");
		back3.click(); 
		System.out.println("회원정보 관리 Back key"); 
		
		MobileElement back4 = driver.findElementByAccessibilityId("Up button in TopBar");
		back4.click();
		System.out.println("설정 Back key"); 
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")
		.click();
		System.out.println("트라이브 둘러보기");
		
		// 트라이브가 이미 가입 상태라면? if 처리 필요
		driver.findElementByXPath("	(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[4]")
		.click(); 
		System.out.println("뮤직 트라이브 진입");
		
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		         ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button\r\n")
		.click(); 
		System.out.println("트라이브 가입");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView\r\n")
		.click(); 
		System.out.println("단순응모 자세히 보기(QA 단순응모");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button\r\n")
		.click(); 
		System.out.println("응모하기");
		// 토스트 팝업 나왔는지 확인 가능해야함 
		
		MobileElement back6 = driver.findElementByAccessibilityId("Up button in TopBar");
		back6.click();
		System.out.println("트라이브 Back key"); 
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\r\n")
		.click(); 
		System.out.println("자세히보기(QA 함동규 미션)");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
		.click(); 
		System.out.println("사진 업로드 )");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
		.click(); 
		System.out.println("사진 업로드 하기 -> 라이브러리");
		
		driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20220927_144436_QA_.jpg, 156KB, 9월 27일\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("라이브러리 선택 ");

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
		.click(); 
		System.out.println("라이브러리 사진 올리기 ");
		// 미션 성공 팝업 체크 필요 
		
	
		
		MobileElement treibesout = driver.findElementByAccessibilityId("out in TopBar");
		treibesout.click(); 
		System.out.println("트라이브 아웃");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
		.click(); 
		System.out.println("컨펌 팝업 나가기");
		
		MobileElement back5 = driver.findElementByAccessibilityId("Up button in TopBar");
		back5.click();
		System.out.println("트라이브 Back key"); 
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
		.click(); 
		System.out.println("트라이브 홈 탭 ");
		
		MobileElement settings3 = driver.findElementByAccessibilityId("setting in TopBar");
		settings3.click();
		System.out.println("설정 입력3");
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]/android.widget.TextView")
		.click(); 
		System.out.println("로그아웃");

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
		.click(); 
		System.out.println("컨펌 팝업 나가기 ");
	
		//driver.rotate(new DeviceRotation(10, 10, 10));
		
		//driver.rotate(ScreenOrientation.LANDSCAPE);
		
		
		*/
		
		
		//DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		//desiredCapabilities.setCapability("deviceOrientation", "landscape");
		
		//System.out.println("앱 종료");
	
		
		
		// 어떻게 루프 시켜야 할지 판단해야함 
		}

	