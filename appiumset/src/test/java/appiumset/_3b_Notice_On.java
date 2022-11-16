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

public class _3b_Notice_On extends _0_Automation_Main{
	
	public static void Notice_On() throws MalformedURLException, InterruptedException {
		
		System.out.println("<<< 노티 b 진행 >>>");
		
		System.out.println(" a l");
		Thread.sleep(3000);
		
		
		
		// 서비스 알림 --------------------
		MobileElement 기본알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[1]");
		MobileElement 트라이브알림 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch[2]");

		
		if(기본알림.isSelected()) {
			
			System.out.println("기본 알림 스위치 활성화 확인");
			Thread.sleep(1000);
			
		}else {
			
			System.out.println("기본 알림 스위치 비활성화 확인");
			기본알림.click();
			System.out.println(" 기본 알림 스위치 On ");
			Thread.sleep(1000);
			
		}
	
		if(트라이브알림.isSelected()) {
			
			System.out.println("트라이브 알림 스위치 활성화 확인");
			Thread.sleep(1000);
			
		}else {
			
			System.out.println("트라이브 알림 스위치 비활성화 확인");
			트라이브알림.click();
			System.out.println(" 트라이브 알림 스위치 On ");
			Thread.sleep(1000);
			
		}
		// 서비스 알림 끝 -------------------
		
		
	}

}
