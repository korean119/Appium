package appiumset;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



//aa
public class Hanwhatribes2 implements Runnable {
	
	static String port;
	static String udid;
	static String version;
	
	public Hanwhatribes2(String port, String udid, String version) {
		this.port = port;
		this.udid = udid;
		this.version = version;
	}
	
	
	static AppiumDriver<MobileElement> driver;
	
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	
    
     //OpenApp open = new OpenApp(null, null);
	static Deviceinfo a001 = new Deviceinfo(port, udid, version);
	//static Deviceinfo2 a002 = new Deviceinfo2();
	static Onboarding a02 = new Onboarding();
	static Tribeslist a03 = new Tribeslist();
	static Tribesdetail a04 = new Tribesdetail();
	static Tribeshome a05 = new Tribeshome();
	static Settings a06 = new Settings();
	static Eventtribes a07 = new Eventtribes();
	static Logout a08 = new Logout();
    

	

	private void openAppAndPerformSomeActions() {
    	int count = 0;
    	
    	try {
    		a001.Deviceinfo();
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
		
		
		Runnable r1 = new Hanwhatribes2("4723", "192.168.0.100:5555", "12"); //device id of first mobile device
		Runnable r2 = new Hanwhatribes2("5000", "192.168.0.130:5556", "11");
        //Runnable r2 = new a002.Deviceinfo(); //device id of second mobile device
        new Thread(r1).start();
        new Thread(r2).start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		openAppAndPerformSomeActions();
		
	}

		
		
		
}
		 
		
		
		