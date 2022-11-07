package Hanwhatribes_automation;

import java.net.MalformedURLException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class _7_Eventtribes extends _0_Automation_Main {
	
	public static void Eventtribes() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Event_tribes 진행>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		
		Thread.sleep(2000); 
		MobileElement 이벤트탭 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]");
		wait.until(ExpectedConditions.visibilityOf(이벤트탭)).click();
		System.out.println("P# 메인화면_이벤트 탭 입력");
		
	
	}

}
