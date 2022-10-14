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



//aa
public class Hanwhatribes2 implements Runnable {
	
	static AppiumDriver<MobileElement> driver;
	
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	
    
     //OpenApp open = new OpenApp(null, null);
	static Deviceinfo a001 = new Deviceinfo();
	static Deviceinfo2 a002 = new Deviceinfo2();
	Onboarding a02 = new Onboarding();
	Tribeslist a03 = new Tribeslist();
	Tribesdetail a04 = new Tribesdetail();
	Tribeshome a05 = new Tribeshome();
	Settings a06 = new Settings();
	Eventtribes a07 = new Eventtribes();
	Logout a08 = new Logout();
    

	
    private void openAppAndPerformSomeActions() {
    	int count = 0;
    	
    	try {
			
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
				a05.tribeshome();
				a06.settings();
				a07.Eventtribes();
				a08.Logout();
			}
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
		}
    }
    
	public static void main(String[] args) {

		try {
			a001.Deviceinfo();
			a002.Deviceinfo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Runnable r = new Hanwhatribes2(); //device id of first mobile device
        //Runnable r2 = new a002.Deviceinfo(); //device id of second mobile device
        new Thread(r).start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		openAppAndPerformSomeActions();
		
	}

		
		
		
}
		 
		
		
		