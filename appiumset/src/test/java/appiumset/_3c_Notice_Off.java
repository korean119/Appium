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
				
				//OS알림 Off 상태
				// 고기, 뭉티기-강남, 회, 조개구이, 양o

				MobileElement 설정버튼 = driver.get().findElementByAccessibilityId("setting in TopBar");
				wait.until(ExpectedConditions.visibilityOf(설정버튼)).click();    
				System.out.println(" [설정]버튼 입력 ");
				
				Thread.sleep(3000);
				
				MobileElement 알림설정 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.view.View");
				알림설정.click(); 
				System.out.println(" 알림설정 탭 입력 ");
				
				Thread.sleep(3000);
				
				/*------------ 여기부터 OS권한
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
				
				여기까지가 OS권한 */
				
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
				
				MobileElement 혜택및이벤트알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.view.View");
				혜택및이벤트알림.click(); 
				System.out.println(" 혜택 및 이벤트 알림 입력 ");
				Thread.sleep(3000);
				
				MobileElement 야간알림제한 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
				MobileElement 마수동 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]");
				MobileElement 개인정보수집및이용동의 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]");
				
				/* 야간알림제한 -> 다른 동작에 영향이 없어 일단 주석 처리
				if(야간알림제한.getAttribute("checked").equals("true")) {
					
					System.out.println("야간 알림 제한 스위치 활성화 확인");
					야간알림제한.click();
					System.out.println(" 야간 알림 제한 스위치 Off ");
					Thread.sleep(1000);
					
				}else {
					
					System.out.println("야간 알림 제한 스위치 비활성화 확인");
					Thread.sleep(1000);
					
				} 
				야간알림제한 */ 
			/* 혜택 및 이벤트 알림, 개인정보 수집 및 이용 동의 -> xpath가 switch가 아닌 Textview로 되어있어 on/off 변경 시 속성 값의 변경이 안 잡힘
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
				
				MobileElement back_UpbuttoninTopBar1 = driver.get().findElementByAccessibilityId("Up button in TopBar");
				back_UpbuttoninTopBar.click();
				System.out.println("P# [Back] 버튼 입력");
				
				System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
				


	}
}

