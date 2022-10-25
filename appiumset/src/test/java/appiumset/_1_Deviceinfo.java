package appiumset;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _1_Deviceinfo extends AppiumDriverManager {
	
	
	
	
	
	
	
	
//	private AppiumDriver<MobileElement> driver;

	@Parameters({"device", "apppackage", "appActivity","platformVersion","appiumServer" , "systemPort", "platformName"})
	@BeforeMethod
    public void Deviceinfo(String device, String apppackage, String appActivity, String platformVersion, String appiumServer, String systemPort, String platformName) throws MalformedURLException, InterruptedException  {
		
		
		
		
		
		
//		AppiumDriver<MobileElement> driver = AppiumDriverManager.getDriver();
//		AppiumDriver<MobileElement> driver;
		
		System.out.println("****************************************");
		System.out.println("Setting up device and desired capabilities");
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability("deviceName", device);
		cap.setCapability("udid", device);
		cap.setCapability("systemPort", systemPort);

		//cap.setCapability("deviceName", "Galaxy S8");
		//cap.setCapability("udid", "ce0617163a36ce2401");
	
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);
	

		cap.setCapability("appPackage", apppackage);
		cap.setCapability("appActivity", appActivity);
	
		cap.setCapability("automationName", "UiAutomator2");

		cap.setCapability("noReset","false");
		cap.setCapability("FullReset","true");
	
		cap.setCapability("APP_WAIT_ACTIVITY", "*");

		//cap.setCapability("browserName", "Chrome");
	
		//@ 이건 뭐하는거지
		//cap.setCapability("skipUnlock","true");
	
		//
		cap.setCapability("autowebview","false");
	

		//@ 데이터 속도 최고 느리게 , 적용 되는지는 잘 모르겠음
		//cap.setCapability("networkSpeed", "gsm");
	
		//@ 권한을 자동으로 결정하고 설치 시 앱에 부여 합니다
		//cap.setCapability("ATUO_GRANT_REMISSIONS", "true");
	
		//@ 버전 체크 후 설치, 재설치 판단 -- fail 버전 같을 시 재설치 안함
			//cap.setCapability("enforceAppinstall", "fail");
		
		//@ 앱을 초기화 할지 안할지 설정 -- true 기본값 -- 준오 근데 잘 되는지는 안봤음
		//cap.setCapability("autoLaunch", "true");
	
		// @갤럭시 플립
		//cap.setCapability("udid", "192.168.0.121:5550");
	
		// @갤럭시 폴드
		//cap.setCapability("udid", "192.168.0.85:5551");
	
	

		//URL url = new URL("http://0.0.0.0:4720/wd/hub/");
		
		//@ 준오 로컬 호스트 전용
		URL url = new URL(appiumServer);
	
		driver = new AppiumDriver<MobileElement>(url, cap);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		AppiumDriverManager.removeDriver();
		
		
    }
	
	
	@AfterMethod
	public void tearDown() {
		if (AppiumDriverManager.getDriver() != null)
			AppiumDriverManager.getDriver().quit();
			AppiumDriverManager.removeDriver();
	}
}
