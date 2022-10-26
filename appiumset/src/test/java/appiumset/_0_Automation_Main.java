package appiumset;


import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class _0_Automation_Main extends _1_Deviceinfo{
	

	
	@Test
	public static void main(/* String[] args */) {
	
//		AppiumDriver<MobileElement> driver = null;
//		
//		driver = AppiumDriverManager.getDriver();
		
		_2_Ondoarding a02 = new _2_Ondoarding();
		//_3_SignUp a03 = new _3_SignUp();
		//_4_Tribeslist a04 = new _4_Tribeslist();
		//_5_Tribesdetail a05 = new _5_Tribesdetail();
		//_6_Tribeshome a06 = new _6_Tribeshome();
		_7_Settings a07 = new _7_Settings();
		_8_Eventtribes a08 = new _8_Eventtribes();
		_9_Logout a09 = new _9_Logout();

		int count = 0;
		
		
		try {
			a02.onboarding();
			//a03.SignUp();
			for(int i = 1; true; i = i++) {

				count = count + i;
			
				if( count <= 3) {
					System.out.println(" <<<<< " + count + " 번째 반복 시작합니다.>>>> ");
				
				}else if(count == 4) {
					System.out.println( count-1 + "번째 반복 완료 후 종료합니다.");
					break;
					
				}
				//a04.tribeslist();
				//a05.tribesdetail();
				//a06.tribeshome();
				a07.settings();
				a08.Eventtribes();
				a09.Logout();
			}
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
		}
		
	}

		
		
		
}
		 
		
		
		