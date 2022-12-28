package Hanwhatribes_automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _1_Deviceinfo extends AppiumDriverManager {
	
	@Parameters({"device", "apppackage", "appActivity","platformVersion","appiumServer" , "systemPort", "platformName"})
	@BeforeMethod
    public void Deviceinfo(String device, String apppackage, String appActivity, String platformVersion, String appiumServer, String systemPort, String platformName) throws MalformedURLException, InterruptedException  {
		
		System.out.println("****************************************");
		System.out.println("Setting up device and desired capabilities");
		
		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability("deviceName", device);
		cap.setCapability("udid", device);
		cap.setCapability("systemPort", systemPort);
	
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);
	
		cap.setCapability("appPackage", apppackage);
		cap.setCapability("appActivity", appActivity);
	
		cap.setCapability("automationName", "UiAutomator2");

		cap.setCapability("noReset","false"); // 캐시와 같은 앱 데이터 제거
		cap.setCapability("FullReset","false"); // true -> 온보딩부터 출력
		cap.setCapability("autoGrantPermissions", "true");// 자동 권한 부여 
		
		cap.setCapability("APP_WAIT_ACTIVITY", "*");
		cap.setCapability("autowebview","false");
	
		//@ 데이터 속도 최고 느리게
		//cap.setCapability("networkSpeed", "gsm");
	
		//@ 버전 체크 후 설치, 재설치 판단 -- fail 버전 같을 시 재설치 안함
		//cap.setCapability("enforceAppinstall", "fail");
		
		//@ 앱을 초기화 할지 안할지 설정 -- true 기본값
		//cap.setCapability("autoLaunch", "true");
	
		URL url = new URL(appiumServer);
	
		setDriver(new AppiumDriver<MobileElement>(url, cap));
	
		
		//@@암시작 대기 
		//driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
}
	