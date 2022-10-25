package appiumset;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



//aa
public class _0_Automation_Main extends _1_Deviceinfo{
	
	
	
	
	@Test
	public static void main(/* String[] args */) {
	
		
		
//		AppiumDriver<MobileElement> driver = null;
//		
//		driver = AppiumDriverManager.getDriver();
		

		
		_1_Deviceinfo a01 = new _1_Deviceinfo();
		_2_Ondoarding a02 = new _2_Ondoarding();
		_3_Tribeslist a03 = new _3_Tribeslist();
		_4_Tribesdetail a04 = new _4_Tribesdetail();
		_5_Tribeshome a05 = new _5_Tribeshome();
		_6_Settings a06 = new _6_Settings();
		_7_Eventtribes a07 = new _7_Eventtribes();
		_8_Logout a08 = new _8_Logout();

		int count = 0;
		
		
		try {
//			a01.Deviceinfo();
			a02.onboarding();
			
			for(int i = 1; true; i = i++) {

				count = count + i;
			
				if( count <= 3) {
					System.out.println(" <<<<< " + count + " 번째 반복 시작합니다.>>>> ");
				
				}else if(count == 4) {
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

		
		
		
}
		 
		
		
		