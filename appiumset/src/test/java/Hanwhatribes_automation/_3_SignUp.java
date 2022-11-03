 package Hanwhatribes_automation;
  
  import java.net.MalformedURLException; 
  import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
  
  

  public class _3_SignUp extends AppiumDriverManager { 

	  public static void SignUp() throws MalformedURLException, InterruptedException {

		  System.out.println("<SignUp 진행>>");
		  
		  Thread.sleep(2000);

		  WebDriverWait wait = new WebDriverWait(driver.get(), 10);
	
//		  WebElement 애플로시작하기버튼 = driver.get().findElementByAccessibilityId("Apple로 계속하기 로고");
	
		  
//		  TouchAction t = new TouchAction(driver.get());
//	        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(애플로시작하기버튼)).withTapsCount(2))
//	        System.out.println("터치를 하는겨 ?"); 
	        
	        
	        
//		  TouchActions action = new TouchActions(driver.get());
//		  action.doubleClick(애플로시작하기버튼);
//		  System.out.println("터치를 하는겨 ?"); 
		  


		  MultiTouchAction doubletap = new MultiTouchAction(driver.get());
		  
		    doubletap.add(new TouchAction(driver.get())
		            .tap(TapOptions.tapOptions().withPosition(PointOption.point(210, 2199))
		                    .withPosition(PointOption.point(899, 2181))
		                    .withTapsCount(1)));
		    doubletap.perform();
		    System.out.println("터치를 하는겨 ?"); 
		    
		    doubletap.add(new TouchAction(driver.get())
			            .tap(TapOptions.tapOptions()
			                    .withPosition(PointOption.point(499, 2181))
			                    .withTapsCount(1)));
		    doubletap.perform();
		    
		    
		    System.out.println("터치를 하는겨 ?"); 
		    doubletap.add(new TouchAction(driver.get())
		            .tap(TapOptions.tapOptions()
		            		.withPosition(PointOption.point(610, 2199))
		                    .withTapsCount(1)));
		    doubletap.perform();
		    
		    MultiTouchAction doubletap1 = new MultiTouchAction(driver.get());
		    doubletap1.add(new TouchAction(driver.get())
		            .tap(TapOptions.tapOptions()
		                    .withPosition(PointOption.point(899, 2181))
		                    .withTapsCount(2)));
		    System.out.println("터치를 하는123123123132겨 ?"); 
		    doubletap1.perform();
		  
		  
//		   Thread.sleep(2000);
//		  Set<String> contextNames = driver.get().getContextHandles();
//		  for (String contextName : contextNames) {
//			  System.out.println(contextName); }
//		  Thread.sleep(6000);
//	
//		  driver.get().context((String) contextNames.toArray()[1]);
//		  Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
//		  System.out.println("S# Context WebView로 변경");  
//		
//		  
//		  MobileElement 로고 = driver.get().findElementByXPath("//button[@id='sign-in']");
//		 
//		  if (로고.isDisplayed())
//			{System.out.println("로고 있네");
//		
//			}else{
//				System.out.println("토스트 팝업 없음 -- 이슈");  //@ xpath.isDisplayed로 하면 xpath 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 
//				driver.get().close();
//			}
//			
//		  
//		  driver.get().context("NATIVE_APP");
//		  System.out.println("S# Context NATIVE로 변경"); 
//		  
//		  Thread.sleep(3000);
//		  driver.get().navigate().back();
		  
		  
		  
		  MobileElement 카카오로시작하기버튼 = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
		  wait.until(ExpectedConditions.visibilityOf(카카오로시작하기버튼)).click();      
		  System.out.println("P# 로그인&회원가입 화면_[카카오 시작하기 로고] 버튼 입력");
		  Thread.sleep(3000);

		  
		  Set<String> contextNames = driver.get().getContextHandles();
		  for (String contextName : contextNames) {
			  System.out.println(contextName); }
			
	
		  driver.get().context((String) contextNames.toArray()[1]);
		  Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
		  System.out.println("S# Context WebView로 변경");  
		
		 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mArticle\"]/div/div/div[2]/form/button"))).click();    
		  System.out.println("P# 로그인&회원가입 화면_[카카오 계속하기 클릭] 버튼 입력");

		  
		  driver.get().context("NATIVE_APP");
		  System.out.println("S# Context NATIVE로 변경"); 
		  Thread.sleep(3000);
			
	  }

  }
  
  