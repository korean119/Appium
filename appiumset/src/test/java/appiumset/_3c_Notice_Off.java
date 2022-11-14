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
				// 고기, 뭉티기-강남, 회, 조개구이, 양

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
					String OS알림켜기타이틀2 = "기기알림이 꺼져있어요! 알림을 켜서 소식을 받으세요";
					
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
				
				System.out.println(" 정상동작 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				driver.get().close();
				
				
				여기까지가 OS권한 */
				
				MobileElement OS알림켜기버튼 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View");
				OS알림켜기버튼.click();
				System.out.println(" OS[알림 켜기] 버튼 입력 ");
				Thread.sleep(3000);
				
				
												
				
				
				
				
				
				MobileElement 서비스알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View");
				알림설정.click(); 
				System.out.println(" 알림설정 탭 입력 ");
				
				Thread.sleep(3000);
				
				
				


	}
}

