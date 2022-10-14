package appiumset;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class Logout extends Hanwhatribes2 {
	public void Logout() throws MalformedURLException, InterruptedException {
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

