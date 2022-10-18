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
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



//aa
public class _1_Appstart extends _2_Deviceinfo {
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void Appstart() throws InterruptedException, NullPointerException, NoSuchElementException {
	
		
		
		_3_Onboarding a03 = new _3_Onboarding();
		_4_Tribeslist a04 = new _4_Tribeslist();
		_5_Tribesdetail a05 = new _5_Tribesdetail();
		_6_Tribeshome a06 = new _6_Tribeshome();
		_7_Settings a07 = new _7_Settings();
		_8_Eventtribes a08 = new _8_Eventtribes();
		_9_Logout a09 = new _9_Logout();

		int count = 0;
		
		
		try {
			a03.onboarding();
			
			for(int i = 1; true; i = i++) {

				count = count + i;
			
				if( count <= 100) {
					System.out.println(" <<<<< " + count + " 번째 반복 시작합니다.>>>> ");
				
				}else if(count == 101) {
					System.out.println( count-1 + "번째 반복 완료 후 종료합니다.");
					break;
					
				}
				a04.tribeslist();
				a05.tribesdetail();
				a06.tribeshome();
				a07.settings();
				a08.Eventtribes();
				a09.Logout();
			}
			
			driver.quit();
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
		}
	}

		
		
		
}
		 
		
		
		