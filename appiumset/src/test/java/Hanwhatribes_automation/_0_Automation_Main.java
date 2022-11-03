package Hanwhatribes_automation;


import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;



public class _0_Automation_Main extends _1_Deviceinfo{
	

	
	@Test
	public static void main(/* String[] args */) {
	
		_2_Onboarding a02 = new _2_Onboarding();
		_3_SignUp a03 = new _3_SignUp();
		_4_MyTribes a04 = new _4_MyTribes();
		_5_Tribeslist a05 = new _5_Tribeslist();
		_6_Eventtribes a06 = new _6_Eventtribes();
		_7_Tribesdetail a07 = new _7_Tribesdetail();
		_8_Settings a08 = new _8_Settings();
		_9_Logout a09 = new _9_Logout();

		int count = 0;
		
		
		try {
			_2_Onboarding.onboarding();
			_3_SignUp.SignUp();
			for(int i = 1; true; i = i++) {

				count = count + i;
			
				if( count <= 999) {
					System.out.println(" <<<<< " + count + " 번째 반복 시작합니다.>>>> ");
				
				}else if(count == 999) {
					System.out.println( count-1 + "번째 반복 완료 후 종료합니다.");
					break;
					
				}
				_4_MyTribes.MyTribes();
				_5_Tribeslist.Tribeslist();
				_6_Eventtribes.Eventtribes();
				_7_Tribesdetail.Tribesdetail();
				_8_Settings.settings();
				_9_Logout.Logout();
				
			}
		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();	
		}
		
	}

		
		
		
}
		 
		
		
		