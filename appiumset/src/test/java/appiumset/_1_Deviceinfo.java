package appiumset;

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

		cap.setCapability("noReset","true"); //캐시와 같은 앱 데이터 제거
		cap.setCapability("FullReset","false"); // 앱 제거 -> 온보딩부터 출력
		cap.setCapability("autoGrantPermissions", "true");// 자동 권한 부여 
		
		cap.setCapability("APP_WAIT_ACTIVITY", "*");
		cap.setCapability("autowebview","false");
	
		//@ 데이터 속도 최고 느리게 -- 준오 적용 되는지는 잘 모르겠음
		//cap.setCapability("networkSpeed", "gsm");
	
		//@ 권한을 자동으로 결정하고 설치 시 앱에 부여 합니다 -- 준오 적용되는지는 잘 모르게음
		cap.setCapability("autoGrantPermissions", "true");
	
		//@ 버전 체크 후 설치, 재설치 판단 -- fail 버전 같을 시 재설치 안함
		//cap.setCapability("enforceAppinstall", "fail");
		
		//@ 앱을 초기화 할지 안할지 설정 -- true 기본값 -- 준오 근데 잘 되는지는 안봤음
		//cap.setCapability("autoLaunch", "true");
	
		URL url = new URL(appiumServer);
	
		setDriver(new AppiumDriver<MobileElement>(url, cap));
	
		
		//driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		
	//	AppiumDriverManager.removeDriver();
		
	}
    }
	
/*
 * @AfterMethod public void tearDown() { if (AppiumDriverManager.getDriver() !=
 * null) AppiumDriverManager.getDriver().quit(); //
 * AppiumDriverManager.removeDriver(); } }
 */