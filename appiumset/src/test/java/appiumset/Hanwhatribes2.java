package appiumset;

// github token : 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
// https://jigneshparmar.com/blog/appium-capture-screenshot-and-read-the-text-from-the-imageocr
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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

import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



//a
public class Hanwhatribes2 {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
	
		
		Deviceinfo a01 = new Deviceinfo();
		Ondoarding a02 = new Ondoarding();
		Trinbeslist a03 = new Trinbeslist();
		Tribesdetail a04 = new Tribesdetail();

		int count = 0;
		
		
		try {
			a01.Deviceinfo();
			a02.onboarding();
			
		for(int i = 1; true; i = i++) {

			count = count + i;
			
			if( count <= 100) {
				System.out.println(" <<<<< " + count + " 번째 반복 시작합니다.>>>> ");
				
			}else if(count == 101) {
				System.out.println( count-1 + "번째 반복 완료 후 종료합니다.");
				break;
				
			}
			a03.tribeslist();
			a04.tribesdetail();
			tribeshome();
			settings();
			eventtribes();
			logout();
			}
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
			
			}
		}

		
		public static void tribeshome() throws MalformedURLException, InterruptedException  {

			
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
		
		}
		 
		
		
		