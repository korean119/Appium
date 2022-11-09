 package Hanwhatribes_automation;
  
  import java.net.MalformedURLException; 
  import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;

  
  public class _3_SignUp extends AppiumDriverManager { 

	  public static void SignUp() throws MalformedURLException, InterruptedException {

		  System.out.println("<<<<<<< SignUp 진행 >>>>>>>");

		  WebDriverWait wait = new WebDriverWait(driver.get(), 10);
	
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
  
  
  /* 더블터치 

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
		  */
  
  