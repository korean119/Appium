package appiumset;

// github token : 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

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Set;
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
			eventtribes();
			logout();
	
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();		
		break;
		}
	}
	

	public static void hanwhatribes() throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy Z Filp3 5G");
		cap.setCapability("udid", "R3CRB0JNBQA");
	
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		cap.setCapability("appPackage", "com.hanwha.lifeplus.tribes.app.qa");
		cap.setCapability("appActivity", "com.hanwha.lifeplus.presentation.ui.HomeActivity");
		cap.setCapability("automationName", "UiAutomator2");
	
		cap.setCapability("noReset","true");
		cap.setCapability("FullReset","false");
		
		//cap.setCapability("browserName", "Chrome");
		
		//@ 이건 뭐하는거지
		//cap.setCapability("skipUnlock","true");
		
		//
		cap.setCapability("autowebview","true");
		

		//@ 데이터 속도 최고 느리게 , 적용 되는지는 잘 모르겠음
		//cap.setCapability("networkSpeed", "gsm");
		
		//@ 권한을 자동으로 결정하고 설치 시 앱에 부여 합니다
		//cap.setCapability("ATUO_GRANT_REMISSIONS", "true");
		
		//@ 버전 체크 후 설치, 재설치 판단 -- fail 버전 같을 시 재설치 안함
		//cap.setCapability("enforceAppinstall", "fail");
		
		//@ 앱을 초기화 할지 안할지 설정 -- true 기본값 -- 준오 근데 잘 되는지는 안봤음
		//cap.setCapability("autoLaunch", "true");
		
		// @갤럭시 플립
		//cap.setCapability("udid", "192.168.0.121:5550");
		
		// @갤럭시 폴드
		//cap.setCapability("udid", "192.168.0.85:5551");
		
		
	
		//URL url = new URL("http://0.0.0.0:4720/wd/hub/");
		
		//@ 준오 로컬 호스트 전용
		URL url = new URL("http://localhost:4720/wd/hub/");
		
		
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
		
	
		public static void onboarding() throws MalformedURLException, InterruptedException  {
			/*
		MobileElement arrow = driver.findElementByAccessibilityId("화살표");
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(1000);
		System.out.println("온보딩 버튼 클릭 완료 ");

		*/
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
			
			new TouchAction(driver)
			.longPress(PointOption.point(550, 1340))
			.waitAction()
			.moveTo(PointOption.point(550, 60))
			.release()
			.perform();
			
			System.out.println("스크롤 동작");
			Thread.sleep(2000);
			
			
			//MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			//        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
			//         ".scrollIntoView(new UiSelector().text(\"뮤직\"))"));
			//Thread.sleep(2000);
			
			//요소 찾기
			//MobileElement elementOne = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
			//MobileElement elementTwo = (MobileElement) driver.findElementByClassName("SomeClassName");

			driver.findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[4]")
			.click(); 
			System.out.println("뮤직 트라이브 진입");


			MobileElement tribesin = driver.findElementByAccessibilityId("arrow beside text in button");
			tribesin.click();
			System.out.println("[입장하기] 버튼 입력 ");
			
			WebElement ele2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");

			new TouchAction(driver)
			.press(PointOption.point(550, 1140))
			.waitAction()
			.moveTo(PointOption.point(550, 60))
			.release()
			.perform();
			Thread.sleep(2000);
			System.out.println("스크롤 동작");
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView")
			.click(); 
			System.out.println("[자세히 보기] 버튼 입력");
			Thread.sleep(3000);
		
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("[시작하기] 버튼 입력");
			Thread.sleep(5000);
			
			/* @@ 트라이브 미가입 후 미션 시도시 컨펌 팝업 컨텍스트 찾은 후 선택
			 * 하지만 컨텍스트가 Array 로 찾아서 나올 경우 순서가 랜덤이라 if 로 확정으로 WEBVIEW_com.hanwha.lifeplus.tribes.app.qa 를 선택 해야함 
			 
			Set<String> contextNames = driver.getContextHandles();
			
			
			for (String contextName : contextNames) {
			    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
			}
		
			driver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1
		
			MobileElement myText = driver.findElement(By.cssSelector("//div[@id=\"notification\"]/section/div[2]/div/div[2]/button[1]"));
			myText.click(); 
			
			System.out.println("[ddd");
			
			
			Thread.sleep(3000);
		
			driver.context("NATIVE_APP");
			
			
			String myText1 = driver.findElementByCssSelector("//div[@id=\\\"notification\\\"]/section/div[2]/div/div[2]/button[1]")
			.click(); 
			System.out.println("[ddd");
			Thread.sleep(3000);
			
			*/
			
			//@ 가끔 시작하기 버튼이 안눌리는 문제가 있음;;;
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button[2]")
			//.click(); 
			//System.out.println("우측 상단 [X] 버튼 입력");
			//Thread.sleep(4000);
			
			
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")
			//.click(); 
			//System.out.println("[시작하기] 버튼 입력");
			//Thread.sleep(4000);
	
			
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
			Thread.sleep(4000);
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
			
		
			MobileElement notification = driver.findElementByAccessibilityId("notification in TopBar");
			notification.click(); 
			System.out.println("알림함");

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
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView[1]")
			.click(); 
			System.out.println("[종료] 탭 입력");
			Thread.sleep(2000);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(4000);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
			.click(); 
			System.out.println("당첨확률 바텀시트 [x]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(4000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
			.click(); 
			System.out.println("당첨확률 바텀시트 [확인]버튼 입력");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[6]")
			.click(); 
			System.out.println("종료 [당첨 확률] 버튼 입력 -> 당첨확률 바텀시트 출력");
			Thread.sleep(4000);
			
			
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
		
		
		
		public static void eventtribes() throws MalformedURLException, InterruptedException  {

		
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
		
		}
		
		
			public static void logout() throws MalformedURLException, InterruptedException  {

		
				MobileElement settings3 = driver.findElementByAccessibilityId("setting in TopBar");
				settings3.click();
				System.out.println("설정 입력3");
	
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]/android.widget.TextView")
				.click(); 
				System.out.println("로그아웃");

				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
				.click(); 
				System.out.println("컨펌 팝업 나가기 ");
				
			}
	
		//driver.rotate(new DeviceRotation(10, 10, 10));
		
		//driver.rotate(ScreenOrientation.LANDSCAPE);
	
		//DesiredCapabilities desiredCapabilities = new DesiredCapabilities();m
		//desiredCapabilities.setCapability("deviceOrientation", "landscape");
		
		//System.out.println("앱 종료");
	
		
		
		// 어떻게 루프 시켜야 할지 판단해야함 
		}

	