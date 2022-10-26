package appiumset;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class _2_Onboarding extends AppiumDriverManager { 
	
	
	public static void onboarding() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<onboarding 진행>>");
		
		MobileElement arrow = driver.get().findElementByAccessibilityId("화살표");
		arrow.click();
		System.out.println("온보딩 1 클릭 ");
		Thread.sleep(2000);
		
		
		System.out.println("온보딩 2 클릭 ");
		arrow.click();
		Thread.sleep(3000);
		
		
		System.out.println("온보딩 3 클릭 ");
		arrow.click();
		Thread.sleep(3000);

//		AppiumDriverManager.removeDriver();
	}


	
}

