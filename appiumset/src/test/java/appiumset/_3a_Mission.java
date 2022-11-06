package appiumset;

import java.net.MalformedURLException;
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

public class _3a_Mission extends _0_Automation_Main {

	public static void Mission() throws MalformedURLException, InterruptedException {
		
		System.out.println("<<< Mission 진행 >>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 10);
		//----------------바텀시트
				MobileElement Sheetclose = driver.get().findElementByAccessibilityId("시트 닫기");
				wait.until(ExpectedConditions.visibilityOf(Sheetclose)).click();    
				System.out.println("P# 메인화면_시트 닫기 동작");
				
		//----------------바텀시트
				
				Thread.sleep(3000);
				MobileElement 트라이브목록탭 = driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
				트라이브목록탭.click();
				System.out.println("P# 메인화면_트라이브 목록 탭");
				
				
				  new TouchAction(driver.get()) .longPress(PointOption.point(550, 1340))
				  .waitAction() .moveTo(PointOption.point(550, 60)) .release() .perform();
				  System.out.println("S# 트라이브 목록 화면_스크롤 동작"); Thread.sleep(3000);
				 
				
	
				MobileElement 뮤직트라이브 = driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[1]");
				뮤직트라이브.click();
				System.out.println("러닝 트라이브 진입");
				Thread.sleep(3000);
			//------------------- 골프 진입
			
				String tkfkd = "러닝 트라이브에서 알려주는 Tips";
				
				try {
					MobileElement eel = driver.get().findElement(MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().flingBackward()" +
							".scrollIntoView(new UiSelector().text(\"러닝 트라이브에서 알려주는 Tips\"))"));
			
					//aa
					System.out.println("AAA");
					
					
				} catch (InvalidSelectorException e) {
				   
				}
					
			// 러닝 트라이브에서 알려주는 Tips
			// 11월 러닝 트라이브만의 핫한 혜택
			//	.flingToEnd()  이거 넣으면 0 = 중간, 1= 끝까지 감
				System.out.println("AAA");
					
					
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

