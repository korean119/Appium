package appiumset;

import java.net.MalformedURLException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _3c_Notice_Off extends _0_Automation_Main {
	
	public static void Notice_Off() throws MalformedURLException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
//------------------------------------------------------------------
		
				System.out.println("<<< Notice_off 진행 >>>");
				
				// default: OS알림 Off 상태 
	
				MobileElement 설정버튼 = driver.get().findElementByAccessibilityId("setting in TopBar");
				wait.until(ExpectedConditions.visibilityOf(설정버튼)).click();    
				System.out.println(" [설정]버튼 입력 ");
				
				Thread.sleep(3000);
				
				MobileElement 알림설정 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.view.View");
				알림설정.click(); 
				System.out.println(" 알림설정 탭 입력 ");
				
				Thread.sleep(3000);
				
				//------------ 여기부터 OS권한
				if(driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView")
						.isDisplayed()){
					
					System.out.println(" OS 알림 출력 타이틀 출력 확인 ");
					
					MobileElement OS알림켜기텍스트 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView");
					String OS알림켜기타이틀1 = OS알림켜기텍스트.getText();
					String OS알림켜기타이틀2 = "기기알림이 꺼져있어요!\n" + "알림을 켜서 소식을 받으세요";
					
					System.out.println("출력된 OS 알림 켜기 타이틀 : " + OS알림켜기타이틀1);
					
					if(OS알림켜기타이틀1.equals(OS알림켜기타이틀2)) {
						
						System.out.println(" OS 알림 켜기 타이틀 비교 결과 : 일치");
						Thread.sleep(3000);
						
					}else {
					
					System.out.println(" OS 알림 켜기 타이틀 비교 결과 : 불일치");
					driver.get().close();
					}	
					
				}else {
					
					System.out.println(" OS 알림 출력 타이틀 미출력 -> 이슈 ");
					driver.get().close();
					
				}
				
				
				if(driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View")
						.isDisplayed()) {
					
					System.out.println(" OS[알림 켜기] 버튼 출력 확인 ");
					Thread.sleep(3000);
					
				}else {
					System.out.println(" OS[알림 켜기] 버튼 미출력 -> 이슈");
					driver.get().close();
					
				}
				
				MobileElement OS알림켜기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View");
				OS알림켜기버튼.click();
				System.out.println(" OS[알림 켜기] 버튼 입력 > 애플리케이션 정보 화면 진입");
				Thread.sleep(3000);
				
				MobileElement 앱알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
				앱알림.click();
				System.out.println(" 앱 알림 화면 진입 ");
				Thread.sleep(3000);
				
				MobileElement 알림스위치 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout");
				알림스위치.click();
				System.out.println(" 알림 표시 스위치 On ");
				Thread.sleep(3000);
				
				driver.get().navigate().back();
				System.out.println("S# 트라이브 목록 화면_안드로이드 H/K Back");
				Thread.sleep(2000);
				
				driver.get().navigate().back();
				System.out.println("S# 트라이브 목록 화면_안드로이드 H/K Back");
				Thread.sleep(2000);
				
			//	여기까지가 OS권한 종료
				
				//* 서비스 알림 영역
				MobileElement 서비스알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View");
				서비스알림.click(); 
				System.out.println(" 서비스 알림 입력 ");
				Thread.sleep(3000);
				
				MobileElement 기본알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[1]");
				MobileElement 트라이브알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[2]");

				if(기본알림.getAttribute("checked").equals("true")) {
					
					System.out.println("기본 알림 스위치 활성화 확인");
					기본알림.click();
					System.out.println(" 기본 알림 스위치 Off ");
					Thread.sleep(1000);
					
				}else {
					
					System.out.println("기본 알림 스위치 비활성화 확인");
					Thread.sleep(1000);
					
				}
			
				if(트라이브알림.getAttribute("checked").equals("true")) {
					
					System.out.println("트라이브 알림 스위치 활성화 확인");
					트라이브알림.click();
					System.out.println(" 트라이브 알림 스위치 Off ");
					Thread.sleep(1000);
					
				}else {
					
					System.out.println("트라이브 알림 스위치 비활성화 확인");
					Thread.sleep(1000);
					
				}
				
				MobileElement back_UpbuttoninTopBar = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back_UpbuttoninTopBar.click();
				System.out.println("P# [Back] 버튼 입력"); 
				Thread.sleep(1000);
				//서비스 알림 영역 종료
				
				//혜택 및 이벤트 알림 영역
				MobileElement 혜택및이벤트알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.view.View");
				혜택및이벤트알림.click(); 
				System.out.println(" 혜택 및 이벤트 알림 입력 ");
				Thread.sleep(3000);
				
				MobileElement 야간알림제한 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
				MobileElement 마수동 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]");
				MobileElement 개인정보수집및이용동의 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]");
				
				
				if(야간알림제한.getAttribute("checked").equals("true")) {
					
					System.out.println("야간 알림 제한 스위치 활성화 확인");
					야간알림제한.click();
					System.out.println(" 야간 알림 제한 스위치 Off ");
					Thread.sleep(1000);
					
				}else {
					
					System.out.println("야간 알림 제한 스위치 비활성화 확인");
					Thread.sleep(1000);
					
				} 
				
				
			/* 혜택 및 이벤트 알림, 개인정보 수집 및 이용 동의 -> xpath가 switch가 아닌 Textview로 되어있어 on/off 변경 시 속성 값의 변경이 안 잡힘
			 추후에 수정 된다면 해당 코드 사용 예정
			 
				if(마수동.getAttribute("checked").equals("true")) {
					
					System.out.println("혜택 및 이벤트 알림 스위치 활성화 확인");
					마수동.click();
					System.out.println(" 혜택 및 이벤트 알림 스위치 Off ");
					Thread.sleep(2000);
					
					MobileElement 끄기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
					끄기버튼.click(); 
					System.out.println(" 혜택 및 이벤트 알림 [끄기] 버튼 입력");
					Thread.sleep(1000);
					
					MobileElement 확인버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼.click(); 
					System.out.println(" 철회팝업 [확인] 버튼 입력");
					Thread.sleep(1000);

				}else {
					
					System.out.println(" 혜택 및 이벤트 알림 스위치 비활성화 확인");
					Thread.sleep(1000);
			
				} 
				
				if(개인정보수집및이용동의.getAttribute("checked").equals("true")) {
										
					System.out.println("개인정보 수집 및 이용 동의 스위치 활성화 확인");
					개인정보수집및이용동의.click();
					System.out.println(" 개인정보 수집 및 이용 동의 스위치 Off ");
					Thread.sleep(1000);
					
					MobileElement 철회하기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View");
					개인정보수집및이용동의.click(); 
					System.out.println("개인정보 수집 및 이용 동의 [철회하기] 버튼 입력");
					Thread.sleep(1000);
					
					MobileElement 확인버튼1 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼1.click(); 
					System.out.println(" 철회팝업 [확인] 버튼 입력");
					Thread.sleep(1000);
					
				}else {
					
					System.out.println(" 개인정보 수집 및 이용 동의 스위치 비활성화 확인 ");
					Thread.sleep(1000);
					
				}
				
				혜택 및 이벤트 알림, 개인정보 수집 및 이용 동의 */
				
				//혜택 및 이벤트 알림, 개인정보 수집 및 이용 동의 -> xpath 문제로 해당 코드 임시 사용
				마수동.click();
				System.out.println(" 혜택 및 이벤트 알림 스위치 입력 ");
				Thread.sleep(2000);
				
				if(!driver.get().findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button")
						.isEmpty()) {
					
					System.out.println(" 알림 동의 팝업 출력 ");
					MobileElement 확인버튼1 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼1.click();
					System.out.println(" [확인] 버튼 입력 ");
					Thread.sleep(2000);
					
					마수동.click();
					System.out.println(" 혜택 및 이벤트 알림 스위치 입력 ");
					Thread.sleep(2000);
					
					MobileElement 끄기버튼1 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
					끄기버튼1.click(); 
					System.out.println("[끄기] 버튼 입력");
					Thread.sleep(2000);
					
					MobileElement 확인버튼2 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼2.click();
					System.out.println(" [확인] 버튼 입력 ");
					Thread.sleep(2000);
					
				}else {
				
				MobileElement TextView = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[1]");
				System.out.println("출력된 값 : " + TextView.getText());
				
				String 문자열 = TextView.getText();
				
				switch(문자열) {
				
				case "다양한 혜택을 받기 위해서\n" + "약관 동의가 필요해요" :
					
					System.out.println(" 약관 동의 바텀시트 출력 > 혜택 및 이벤트 알림 스위치 비활성화 확인");
					Thread.sleep(2000);
				    									
					MobileElement 시트닫기 = driver.get().findElementByAccessibilityId("시트 닫기");
					시트닫기.click();
					System.out.println(" 약관 동의 바텀시트 닫기 "); 
					Thread.sleep(2000);
					
					break;
					
				case "혜택 및 이벤트 알림을 끄시겠습니까?" : 
					
					System.out.println(" 혜택 및 이벤트 알림 종료 바텀시트 출력 ");
					Thread.sleep(1000);
					
					MobileElement 끄기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
					끄기버튼.click(); 
					System.out.println("[끄기] 버튼 입력");
					Thread.sleep(1000);
				
					MobileElement 확인버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼.click(); 
					System.out.println("[확인] 버튼 입력");
					Thread.sleep(1000);
					
					System.out.println(" 혜택 및 이벤트 알림 스위치 비활성화 ");
					Thread.sleep(1000);
					
					break;
					
					}
				}
				
				개인정보수집및이용동의.click();
				System.out.println(" 개인정보 수집 및 이용 동의 스위치 입력 ");
				Thread.sleep(2000);
				
				MobileElement TextView1 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[1]");
				System.out.println("출력된 값 : " + TextView1.getText());
				String 문자열1 = TextView1.getText();
				String 비교문자열 = "다양한 혜택을 받기 위해서\n" + "약관 동의가 필요해요";
				
				if(문자열1.equals(비교문자열)) {
					
					System.out.println(" 약관 동의 바텀시트 출력 > 혜택 및 이벤트 알림 스위치 비활성화 확인");
					Thread.sleep(2000);
				    									
					MobileElement 시트닫기 = driver.get().findElementByAccessibilityId("시트 닫기");
					시트닫기.click();
					System.out.println(" 약관 동의 바텀시트 닫기 "); 
					Thread.sleep(2000);
					
				}else {
					System.out.println("개인정보 수집 및 이용 동의 바텀시트 출력");
					Thread.sleep(1000);
					
					MobileElement 철회하기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View");
					철회하기버튼.click(); 
					System.out.println(" [철회하기] 버튼 입력");
					Thread.sleep(1000);
					
					MobileElement 확인버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.Button");
					확인버튼.click();
					System.out.println(" [확인] 버튼 입력 ");
					Thread.sleep(1000);
				}
				
				
				MobileElement back_UpbuttoninTopBar1 = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back_UpbuttoninTopBar1.click();
				System.out.println("P# [Back] 버튼 입력 > 알림 설정 진입");
				Thread.sleep(1000);
				MobileElement back_UpbuttoninTopBar2 = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back_UpbuttoninTopBar2.click();
				System.out.println("P# [Back] 버튼 입력 > 설정 화면 진입");
				Thread.sleep(1000);
				MobileElement back_UpbuttoninTopBar3 = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back_UpbuttoninTopBar3.click();
				System.out.println("P# [Back] 버튼 입력 > MY트라이브 진입");
				Thread.sleep(1000);
				
				MobileElement 트라이브목록탭 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
				트라이브목록탭.click();
				System.out.println("P# 메인화면_트라이브 목록 탭");
				
				new TouchAction(driver.get()) 
				.longPress(PointOption.point(550, 1340))
				.waitAction() 
				.moveTo(PointOption.point(550, 60)) 
				.release() 
				.perform();
				System.out.println("S# 트라이브 목록 화면_스크롤 동작"); Thread.sleep(3000);
				 
				MobileElement 뮤직트라이브 = driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]");
				뮤직트라이브.click();
				System.out.println("골프 트라이브 진입");
				Thread.sleep(3000);
				
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
				
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
											
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")))
				.click();    
				System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
				Thread.sleep(3000);
				
				Set<String> contextNames1 = driver.get().getContextHandles();
				for (String contextName : contextNames1) {
					System.out.println(contextName); }
					
			
				driver.get().context((String) contextNames1.toArray()[1]);
				Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용
				System.out.println("S# Context WebView로 변경");
				Thread.sleep(3000);
				
				MobileElement 알림받기 = driver.get().findElementByXPath("//button[@aria-label='알림받기']");
				wait.until(ExpectedConditions.visibilityOf(알림받기)).sendKeys(Keys.ENTER);
				System.out.println(" 알림받기 아이콘 입력");
				Thread.sleep(3000);

				driver.get().context("NATIVE_APP");
				System.out.println("S# Context NATIVE로 변경");
				Thread.sleep(3000);
				
				if(driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")
						.isDisplayed()) {
					
					System.out.println(" 약관 동의 바텀시트 출력 확인 ");
					Thread.sleep(2000);
					
					MobileElement x버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
					x버튼.click();
					System.out.println(" [X] 버튼 입력 ");
					Thread.sleep(2000);
					
				}else {
					
					System.out.println(" 약관 동의 바텀시트 미출력 > 이슈 ");
					driver.get().close();
				}
				
				Set<String> contextNames2 = driver.get().getContextHandles();
				for (String contextName : contextNames2) {
					System.out.println(contextName); }
					
			
				driver.get().context((String) contextNames2.toArray()[1]);
				Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용
				System.out.println("S# Context WebView로 변경");
				Thread.sleep(3000);
												
				MobileElement 시작하기버튼 = driver.get().findElementByXPath("//button[@id='mission-start-in-benefit']");
				wait.until(ExpectedConditions.visibilityOf(시작하기버튼)).sendKeys(Keys.ENTER);
				System.out.println("시작하기 버튼 입력");
				Thread.sleep(3000);
				

				if(driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div[2]/div/div")
						.isDisplayed()) {
					
					System.out.println(" 약관 동의 바텀시트 출력 확인 ");
					Thread.sleep(2000);
					
					MobileElement x버튼 = driver.get().findElementByXPath("//button[@aria-label='약관 동의 닫기']");
					x버튼.click();
					System.out.println(" [X] 버튼 입력 ");
					Thread.sleep(2000);
					
				}else {
					
					System.out.println(" 약관 동의 바텀시트 미출력 > 이슈 ");
					driver.get().close();
				}
						
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
				
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
				
				MobileElement 알림받기버튼 = driver.get().findElementByXPath("//*[@id='requent-alarm-in-benefit']");
				wait.until(ExpectedConditions.visibilityOf(알림받기버튼)).sendKeys(Keys.ENTER);
				System.out.println("시작하기 버튼 입력");
				Thread.sleep(3000);
				
				driver.get().context("NATIVE_APP");
				System.out.println("S# Context NATIVE로 변경");
				Thread.sleep(3000);
				
				if(driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")
						.isDisplayed()) {
					
					System.out.println(" 약관 동의 바텀시트 출력 확인 ");
					Thread.sleep(2000);
					
					MobileElement x버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
					x버튼.click();
					System.out.println(" [X] 버튼 입력 ");
					Thread.sleep(2000);
					
				}else {
					
					System.out.println(" 약관 동의 바텀시트 미출력 > 이슈 ");
					driver.get().close();
				}
				
				driver.get().navigate().back();
				System.out.println("S# 트라이브 목록 화면_안드로이드 H/K Back");
				Thread.sleep(2000);
				
				MobileElement back버튼 = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back버튼.click();
				System.out.println(" Back 버튼 입력 > 트라이브 목록 화면 진입"); 
				Thread.sleep(2000);

			
				System.out.println(" << Notice_Off 종료 >>");


	}
}

