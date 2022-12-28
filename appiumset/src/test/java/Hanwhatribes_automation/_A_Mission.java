package Hanwhatribes_automation;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class _A_Mission extends _0_Automation_Main {

	public static void Mission() throws MalformedURLException, InterruptedException {
		
		System.out.println("<<< Mission 진행 >>>");
		

		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		
				//my 트라이브 입장> 바텀시트 출력

				MobileElement Sheetclose = driver.get().findElementByAccessibilityId("시트 닫기");
				wait.until(ExpectedConditions.visibilityOf(Sheetclose)).click();    
				System.out.println("P# 메인화면_시트 닫기 동작");
				
				//트라이브 목록
				Thread.sleep(3000);
				MobileElement 트라이브목록탭 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
				트라이브목록탭.click();
				System.out.println("P# 메인화면_트라이브 목록 탭");
				
				//골프 트라이브 진입	
				  new TouchAction(driver.get()) .longPress(PointOption.point(550, 1340))
				  .waitAction() .moveTo(PointOption.point(550, 60)) .release() .perform();
				  System.out.println("S# 트라이브 목록 화면_스크롤 동작"); Thread.sleep(3000);
				 				
				MobileElement 뮤직트라이브 = driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[2]");
				뮤직트라이브.click();
				System.out.println("골프 트라이브 진입");
				Thread.sleep(3000);	
							
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
				
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 20))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")))
				.click();    
				System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
				Thread.sleep(3000);
				
				//------------------혜택 상세
				
				Set<String> contextNames1 = driver.get().getContextHandles();
				for (String contextName : contextNames1) {
					System.out.println(contextName); }
					
			
				driver.get().context((String) contextNames1.toArray()[1]);
				Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용
				System.out.println("S# Context WebView로 변경");
				Thread.sleep(3000);
				
				new TouchAction(driver.get())
				.longPress(PointOption.point(550, 1600))
				.waitAction()
				.moveTo(PointOption.point(550, 300))
				.release()
				.perform();
				System.out.println("스크롤 동작");
				Thread.sleep(2000);

				//미션 타입 별 응모 조건문
				//친구 초대 미션의 경우 미션 응모 직후의 확인점 필요함
			
				for(int i = 1; i<=3; i++ ) {
					
					MobileElement 시작하기버튼 = driver.get().findElementByXPath("//button[@id='mission-start-in-benefit']");
					wait.until(ExpectedConditions.visibilityOf(시작하기버튼)).sendKeys(Keys.ENTER);
					System.out.println("시작하기 버튼 입력");
					Thread.sleep(3000);
					
					MobileElement str = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[2]/div[1]/div[1]");
			
					String 문자열 = str.getText();
					
					switch(문자열) {
					
					case "꼭 확인해주세요!" :
						
						System.out.println("친구초대 미션 진입");
						
						MobileElement 초대하기버튼 = driver.get().findElementByXPath("//*[@id='invite-in-mission']");
						
						if(초대하기버튼.isEnabled()) {
							
							System.out.println("[초대하기] 버튼 활성화 확인");
							
							Thread.sleep(2000);
							
						}else {
							
							System.out.println("[초대하기] 버튼 비활성화 확인");
							
							driver.get().close();
						}
						
						wait.until(ExpectedConditions.visibilityOf(초대하기버튼)).sendKeys(Keys.ENTER);
						
						System.out.println("[초대하기] 버튼 입력");
						
						Thread.sleep(2000);
												
						/*if(driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout").isDisplayed()) {

							System.out.println("공유하기 팝업 출력 확인");
							
							Thread.sleep(2000);
						}else {
							
							System.out.println("공유하기 팝업 미출력 이슈");
							
							driver.get().close();				
													
						} OS 팝업으로 종료하는 경우*/
						
						
						new TouchAction(driver.get())
						.press(PointOption.point(550, 1500))						
						.release()
						.perform();
						System.out.println("공유하기 팝업 닫기");
						Thread.sleep(2000);
						
						MobileElement xButton1 = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[1]/div/button");
						wait.until(ExpectedConditions.visibilityOf(xButton1)).sendKeys(Keys.ENTER);
						System.out.println("[X] 버튼 입력");
						Thread.sleep(2000);
						
						System.out.println("혜택상세 화면으로 복귀");
						
						break;
						
					case "이렇게 올려주세요" : 
						
						System.out.println("사진 업로드 미션 진입");
						
						MobileElement 사진업로드버튼 = driver.get().findElementByXPath("//*[@id='image-upload-in-mission']");
						
						if(사진업로드버튼.isEnabled()) {
							
							System.out.println("[사진 업로드 하기] 버튼 활성화 확인");
							
							Thread.sleep(2000);
																				
						}else {
							
							System.out.println("[사진 업로드 하기] 버튼 비활성화 이슈");
							
							driver.get().close();
						}
						
						MobileElement 가이드이미지 = driver.get().findElement(MobileBy.AndroidUIAutomator(
								  "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().flingBackward()"));
								  
						wait.until(ExpectedConditions.visibilityOf(사진업로드버튼)).click();
						
						System.out.println("[사진 업로드 하기] 버튼 입력");
						
						Thread.sleep(2000);
						
						driver.get().context("NATIVE_APP");
						
						MobileElement 갤러리 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView");
						wait.until(ExpectedConditions.visibilityOf(갤러리)).click();
						System.out.println("[갤러리] 버튼 입력");
						Thread.sleep(3000);
						
						
						MobileElement 이미지선택 = driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView"); 
						wait.until(ExpectedConditions.visibilityOf(이미지선택)).click();
						System.out.println("이미지 선택");
						Thread.sleep(3000);
						
						MobileElement 사진올리기버튼 = driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView"); 
						wait.until(ExpectedConditions.visibilityOf(사진올리기버튼)).click();
						System.out.println("[사진 올리기] 버튼 입력");
						Thread.sleep(3000);
						
						Set<String> contextNames = driver.get().getContextHandles();
						for (String contextName : contextNames) {
							System.out.println(contextName); }
							
					
						driver.get().context((String) contextNames.toArray()[1]);
						System.out.println("S# Context WebView로 변경");
						Thread.sleep(3000);
						
						if(driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div\r\n").isDisplayed()) {

							System.out.println("미션 완료 팝업 출력 확인");
							
							Thread.sleep(3000);
							
							}else {
								
								System.out.println("미션 완료 팝업 미출력 이슈");
								
								driver.get().close();				
														
							}
							
							MobileElement 확인버튼1 = driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button");
							wait.until(ExpectedConditions.visibilityOf(확인버튼1)).sendKeys(Keys.ENTER);
							System.out.println("미션 완료 팝업 [확인] 버튼 입력");
							Thread.sleep(2000);
							
							MobileElement xButton2 = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[1]/div/button");
							wait.until(ExpectedConditions.visibilityOf(xButton2)).sendKeys(Keys.ENTER);
							System.out.println("[X] 버튼 입력");
							Thread.sleep(2000);
							
							System.out.println("혜택상세 화면으로 복귀");
							
							break;
						
						
					default : 
						
						System.out.println("투표 미션 진입");
						
						MobileElement 투표결과보기버튼 = driver.get().findElementByXPath("//*[@id='poll-result-in-mission']");
						
						if(투표결과보기버튼.isEnabled()) {
							
							System.out.println("버튼 활성화 이슈");
							
							driver.get().close();
							
						}else {
							
							System.out.println("버튼 비활성화 확인");
							
							Thread.sleep(2000);
						}
					
						MobileElement 투표항목1 = driver.get().findElementByXPath("//label[@aria-label='투표항목1']");
						wait.until(ExpectedConditions.visibilityOf(투표항목1)).click();
						System.out.println("투표항목 1 입력"); 
						Thread.sleep(1000);
										
						MobileElement 투표항목2 = driver.get().findElementByXPath("//label[@aria-label='투표항목2']");
						wait.until(ExpectedConditions.visibilityOf(투표항목2)).click();
						System.out.println("투표항목 2 입력");
						Thread.sleep(1000);

						wait.until(ExpectedConditions.visibilityOf(투표항목1)).click();
						System.out.println("투표항목 1 재입력"); 	
						Thread.sleep(1000);
						
						wait.until(ExpectedConditions.visibilityOf(투표항목2)).click();
						System.out.println("투표항목 2 재입력"); 
						Thread.sleep(1000);
										
						if(투표결과보기버튼.isEnabled()) {
							
							System.out.println("버튼 활성화 확인");
							
							Thread.sleep(2000);
							
						}else {
							
							System.out.println("버튼 비활성화 이슈");
							
							driver.get().close();
							
						}
										
						MobileElement 투표항목결과보기 = driver.get().findElementByXPath("//*[@id=\"poll-result-in-mission\"]");
						wait.until(ExpectedConditions.visibilityOf(투표항목결과보기)).click();
						System.out.println("[투표결과보기] 버튼 입력");
						
						Thread.sleep(2000);
						
						if(driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div\r\n").isDisplayed()) {

						System.out.println("미션 완료 팝업 출력 확인");
						
						Thread.sleep(3000);
						
						}else {
							
							System.out.println("미션 완료 팝업 미출력 이슈");
							
							driver.get().close();				
													
						}
						
						MobileElement 확인버튼2 = driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button");
						wait.until(ExpectedConditions.visibilityOf(확인버튼2)).sendKeys(Keys.ENTER);
						System.out.println("미션 완료 팝업 [확인] 버튼 입력");
						Thread.sleep(2000);
						
						MobileElement xButton3 = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[1]/div/button");
						wait.until(ExpectedConditions.visibilityOf(xButton3)).sendKeys(Keys.ENTER);
						System.out.println("[X] 버튼 입력");
						Thread.sleep(2000);
						
						System.out.println("혜택상세 화면으로 복귀");
						
						break;
					}
					
				
			}
			
				
				//@@ 이후에 사용 할 샘플코드 작성
				
				/*
				String tkfkd = "포토갤러리";
		
				MobileElement eel = driver.get().findElement(MobileBy.AndroidUIAutomator(
				  "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
				  + ".scrollTextIntoView(new UiSelector().text(\"포토갤러리\"))")); 
				
		
				System.out.println("AAA");
				Thread.sleep(2000);
				  
				
				  MobileElement eel2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
				  "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
				  + ".scrollIntoView(new UiSelector().textContains(\"포토갤러리\"))")); 
				 				  
				  System.out.println("BBB");
				  Thread.sleep(2000);
				 
				//*[@id='benefit-faq']
				  MobileElement erer = driver.get().findElementByXPath("//*[@id=\"__next\"]/div[1]/div[4]/h4");
						String ererText = erer.getText();
				
				System.out.println(ererText);
				Thread.sleep(2000);
				
				if(tkfkd.equals(ererText)) {
					System.out.println("True");
				}else {
					System.out.println("False");
				}
				
				*/
				
				//assertEquals("러닝 트라이브에서 알려주는 Tips",ererText);
				
				
			
				//이거 팁스
				//MobileElement erer = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[2]");

				//이거 혜택
				//MobileElement erer = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[3]");

				
			// 러닝 트라이브에서 알려주는 Tips
			// 11월 러닝 트라이브만의 핫한 혜택
			//	.flingToEnd()  이거 넣으면 0 = 중간, 1= 끝까지 감
				
					
					
				 /*MobileElement eel3 = (MobileElement) driver.get().findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
					         ".scrollIntoView(new UiSelector().text(\"러닝 트라이브에서 알려주는 Tips\"))"));
				 System.out.println("C");
			
				MobileElement eel = driver.get().findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
						".scrollIntoView(new UiSelector().text (\"러닝 트라이브에서 알려주는 Tips\"))"));
				 System.out.println("A");
				 
				 
				 MobileElement eel2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
							".scrollIntoView(new UiSelector().text (\"러닝 트라이브에서 알려주는 Tips\"))"));
				 System.out.println("B");
		
			
			  String el = "러닝 트라이브에서 알려주는 Tips";
			  MobileElement element = driver.get().findElement(MobileBy.AndroidUIAutomator(
			  "new UiScrollable(new UiSelector().scrollable(true)" +
			  ".scrollIntoView(new UiSelector().text(\"" + el + "\"))"));
			  
			  System.out.println("A");
			  
			  String e2 = "러닝 트라이브에서 알려주는 Tips";
			  MobileElement element2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
			  "new UiScrollable(new UiSelector().scrollable(true).instance(1))" +
			  ".scrollIntoView(new UiSelector().text(\"" + el + "\"))"));
			  
			  System.out.println("B");*/
			 
				   

				//*[@id='benefit-faq']
				
				
			/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")))
				.click();    
				System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
				Thread.sleep(3000);*/
				
				
	

		
				//*[@id='benefit-faq']
				
				//MobileElement dff = driver.get().findElementByXPath("//*[@id='benefit-faq']");
				
				
				/*
				 * MobileElement element = (MobileElement)
				 * driver.get().findElement(MobileBy.AndroidUIAutomator(
				 * "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)"
				 * + ".scrollIntoView(new UiSelector().text(\"유의사항 및 FAQ\"))"));
				 */
				
				
				
				
				
				
				
				
				
				
				
				/*
				 * while(dff.isDisplayed()) {
				 * 
				 * new TouchAction(driver.get()) .longPress(PointOption.point(550, 1600))
				 * .waitAction() .moveTo(PointOption.point(550, 20)) .release() .perform();
				 * System.out.println("스크롤 동작"); Thread.sleep(2000);
				 * 
				 * if(dff.isDisplayed()) { break; }else { continue; }
				 * 
				 * }
				 */
				
				


	}


}		

/* 미션 타입을 버튼 종류로 분류 -----------------


if(driver.get().findElementByXPath("//*[@id='poll-result-in-mission']").isDisplayed()) {
	
	MobileElement 투표결과보기 = driver.get().findElementByXPath("//*[@id='poll-result-in-mission']");
	
	if(투표결과보기.isEnabled()) {
		
		System.out.println("버튼 활성화 이슈");
		
		driver.get().close();
		
	}else {
		
		System.out.println("버튼 비활성화 확인");
		
		Thread.sleep(2000);
	}

	MobileElement 투표항목1 = driver.get().findElementByXPath("//label[@aria-label='투표항목1']");
	wait.until(ExpectedConditions.visibilityOf(투표항목1)).click();
	System.out.println("투표항목 1 입력"); 
					
	MobileElement 투표항목2 = driver.get().findElementByXPath("//label[@aria-label='투표항목2']");
	wait.until(ExpectedConditions.visibilityOf(투표항목2)).click();
	System.out.println("투표항목 2 입력"); 					

	wait.until(ExpectedConditions.visibilityOf(투표항목1)).click();
	System.out.println("투표항목 1 입력"); 			
	
	wait.until(ExpectedConditions.visibilityOf(투표항목2)).click();
	System.out.println("투표항목 2 입력"); 
					
	if(투표결과보기.isEnabled()) {
		
		System.out.println("버튼 활성화 확인");
		
		Thread.sleep(2000);
		
	}else {
		
		System.out.println("버튼 비활성화 이슈");
		
		driver.get().close();
		
	}
					
	MobileElement 투표항목결과보기 = driver.get().findElementByXPath("//*[@id=\"poll-result-in-mission\"]");
	wait.until(ExpectedConditions.visibilityOf(투표항목결과보기)).click();
	System.out.println("투표항몽결과보기");
	
	Thread.sleep(2000);
	
	if(driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div\r\n").isDisplayed()) {

	System.out.println("미션 완료 팝업 출력 확인");
	
	Thread.sleep(3000);
	
	}else {
		
		System.out.println("미션 완료 팝업 미출력 이슈");
		
		driver.get().close();				
								
	}
	
	MobileElement 확인버튼 = driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button");
	wait.until(ExpectedConditions.visibilityOf(확인버튼)).sendKeys(Keys.ENTER);
	System.out.println("미션 완료 팝업 [확인] 버튼 입력");
	Thread.sleep(2000);
	
	MobileElement xButton = driver.get().findElementByXPath("//*[@id=\"portal\"]/section/div/div/div[1]/div/button");
	wait.until(ExpectedConditions.visibilityOf(xButton)).sendKeys(Keys.ENTER);
	System.out.println("미션 완료 팝업 [확인] 버튼 입력");
	Thread.sleep(2000);

//
}else if(driver.get().findElementByXPath("//*[@id='image-upload-in-mission']").isDisplayed()) {
	
	System.out.println("사진업로드 버튼 확인");
	
}else {	

	MobileElement 초대하기버튼 = driver.get().findElementByXPath("//*[@id='invite-in-mission']");
	
	if (초대하기버튼.isDisplayed()) {
		System.out.println("초대하기 버튼 확인");
	}
	
	
		
	
}
--------------------------------------- 여기까지 버튼으로 분류	*/


/* --------------포토갤러리 스와이프 기능-> 추후에 기능 사용 시 해당 코드 참고하여 수정 필요

String tkfkd = "포토갤러리";

MobileElement eel = driver.get().findElement(MobileBy.AndroidUIAutomator(
  "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
  + ".scrollTextIntoView(new UiSelector().text(\"포토갤러리\"))")); 


System.out.println("AAA");
Thread.sleep(2000);
  

  MobileElement eel2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
  "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
  + ".scrollIntoView(new UiSelector().textContains(\"포토갤러리\"))")); 
 				  
  System.out.println("BBB");
  Thread.sleep(2000);
 
//*[@id='benefit-faq']
  MobileElement erer = driver.get().findElementByXPath("//*[@id=\"__next\"]/div[1]/div[4]/h4");
		String ererText = erer.getText();

System.out.println(ererText);
Thread.sleep(2000);

if(tkfkd.equals(ererText)) {
	System.out.println("True");
}else {
	System.out.println("False");
}

*/

//assertEquals("러닝 트라이브에서 알려주는 Tips",ererText);



//이거 팁스
//MobileElement erer = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[2]");

//이거 혜택
//MobileElement erer = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[3]");


// 러닝 트라이브에서 알려주는 Tips
// 11월 러닝 트라이브만의 핫한 혜택
//	.flingToEnd()  이거 넣으면 0 = 중간, 1= 끝까지 감

	
	
 /*MobileElement eel3 = (MobileElement) driver.get().findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
	         ".scrollIntoView(new UiSelector().text(\"러닝 트라이브에서 알려주는 Tips\"))"));
 System.out.println("C");

MobileElement eel = driver.get().findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		".scrollIntoView(new UiSelector().text (\"러닝 트라이브에서 알려주는 Tips\"))"));
 System.out.println("A");
 
 
 MobileElement eel2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
			".scrollIntoView(new UiSelector().text (\"러닝 트라이브에서 알려주는 Tips\"))"));
 System.out.println("B");


String el = "러닝 트라이브에서 알려주는 Tips";
MobileElement element = driver.get().findElement(MobileBy.AndroidUIAutomator(
"new UiScrollable(new UiSelector().scrollable(true)" +
".scrollIntoView(new UiSelector().text(\"" + el + "\"))"));

System.out.println("A");

String e2 = "러닝 트라이브에서 알려주는 Tips";
MobileElement element2 = driver.get().findElement(MobileBy.AndroidUIAutomator(
"new UiScrollable(new UiSelector().scrollable(true).instance(1))" +
".scrollIntoView(new UiSelector().text(\"" + el + "\"))"));

System.out.println("B");*/

   
//*[@id='benefit-faq']


/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")))
.click();    
System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
Thread.sleep(3000);*/


//*[@id='benefit-faq']

//MobileElement dff = driver.get().findElementByXPath("//*[@id='benefit-faq']");


/*
 * MobileElement element = (MobileElement)
 * driver.get().findElement(MobileBy.AndroidUIAutomator(
 * "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)"
 * + ".scrollIntoView(new UiSelector().text(\"유의사항 및 FAQ\"))"));
 */


/*
 * while(dff.isDisplayed()) {
 * 
 * new TouchAction(driver.get()) .longPress(PointOption.point(550, 1600))
 * .waitAction() .moveTo(PointOption.point(550, 20)) .release() .perform();
 * System.out.println("스크롤 동작"); Thread.sleep(2000);
 * 
 * if(dff.isDisplayed()) { break; }else { continue; }
 * 
 * }
 */