package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _7_Eventtribes extends _0_Automation_Main {
	
	public void Eventtribes() throws MalformedURLException, InterruptedException  {

		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver(); 
		
		System.out.println("<<Event_tribes 진행>>");
		
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

}
