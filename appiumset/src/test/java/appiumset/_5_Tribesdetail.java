package appiumset;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class _5_Tribesdetail extends _0_Automation_Main {
	public static void tribesdetail() throws MalformedURLException, InterruptedException  {
		
		System.out.println("<<Tribes_detail 진행>>");
		
		WebDriverWait wait = new WebDriverWait(driver.get(), 20);
		
		
		driver.get().findElementByXPath("(//android.view.View[@content-desc=\"블랙 투명 레이어\"])[5]")
		.click();
		System.out.println("뮤직 트라이브 진입");
		Thread.sleep(3000);
		
		/*
		 * if (driver.get().findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView")
		 * .isDisplayed()) { System.out.println("토스트 팝업 존재");
		 * 
		 * MobileElement toastView = driver.get().findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.TextView"
		 * ); String text = toastView.getText();
		 * System.out.println(toastView.getText());
		 * 
		 * }else{ System.out.println("토스트 팝업 없음 -- 이슈"); //@ xpath.isDisplayed로 하면 xpath
		 * 자체가 없는걸로 인식되어 fail 됨 = else 미출력 후 에러 상태 driver.get().close();
		 * Thread.sleep(2000); }
		 */
			

		new TouchAction(driver.get())
		.longPress(PointOption.point(550, 1600))
		.waitAction()
		.moveTo(PointOption.point(550, 20))
		.release()
		.perform();
		System.out.println("스크롤 동작");
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")))
		.click();    
		System.out.println("P# 트라이브 홈 화면_[자세히 보기] 버튼 입력");
		Thread.sleep(3000);
		
		
		
		driver.get().findElementsByXPath("//button[(@aria-label, '혜택 공유하기')]");
				 System.out.println("P# 트라이브 홈 화면_혜택 공유하기 버튼 입력"); 
				 Thread.sleep(3000);
				 
				 
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(("//button[(@aria-label, '혜택 공유하기')]"));
				
				
			
				
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@aria-label, '혜택 공유하기')]"))).click();
		// System.out.println("P# 트라이브 홈 화면_혜택 공유하기 버튼 입력"); 

		
		Set<String> contextNames = driver.get().getContextHandles();
		  for (String contextName : contextNames) {
			  System.out.println(contextName); }
			
	
		  driver.get().context((String) contextNames.toArray()[1]);
		  Thread.sleep(3000); // context 변경 할 시간 필요하기 떄문에 sleep 사용 
		  System.out.println("S# 트라이브 홈 화면_혜택 상세 화면 Context WebView로 변경");  
		
		 
			 driver.get().findElementsByXPath("//a[contains(@tpye, 'button, @aria-label, '혜택 공유하기')]");
			 System.out.println("P# 트라이브 홈 화면_혜택 공유하기 버튼 입력"); 

		Thread.sleep(3000);
			

		
		  driver.get().context("NATIVE_APP");
		  System.out.println("S# Context NATIVE로 변경"); 
		  Thread.sleep(3000);
	
		
		////////////////////////
		
		
	
		// 로그 나오는거임
		 //driver.get().findElementsByXPath("//a[contains(@aria-label, '혜택 공유하기')]");
		 //System.out.println("P# 트라이브 홈 화면_혜택 공유하기 버튼 입력"); 
		 //Thread.sleep(3000);
		  
		
		 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")))
		.click(); 
		System.out.println("[시작하기] 버튼 입력");
		Thread.sleep(3000);
		
		
		
		/*
		 * Set<String> contextNames = driver.get().getContextHandles(); for (String
		 * contextName : contextNames) { System.out.println(contextName); }
		 * 
		 * 
		 * driver.get().context((String) contextNames.toArray()[1]); Thread.sleep(3000);
		 * // context 변경 할 시간 필요하기 떄문에 sleep 사용
		 * System.out.println("S# Context WebView로 변경");
		 * 
		 * 
		 * driver.get().
		 * findElementByXPath("button[@type='button' and @aria-label='트라이브 입장 취소']").
		 * click(); System.out.println("ㅇㅂㅈ웆배ㅑ웆ㅂ웁쟈ㅐ웆뱌ㅐㅜ야ㅐㅈㅂ");
		 * 
		 * 
		 * driver.get().context("NATIVE_APP");
		 * System.out.println("S# Context NATIVE로 변경"); Thread.sleep(3000);
		 */
		

		  driver.get().findElementsByCssSelector("[aria-label='트라이브 입장 취소']");
		  
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@aria-label, '트라이브 입장 취소')]")));
		System.out.println("ㅇㅂㅈ웆배ㅑ웆ㅂ웁쟈ㅐ웆뱌ㅐㅜ야ㅐㅈㅂ");
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@aria-label, '트라이브 입장 취소')]")));
	
		
		
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View/android.view.View/android.widget.Button")))
		.click(); 
		System.out.println("[시작하기] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementsByXPath("//a[contains(@aria-label, '트라이브 입장 확인')]");
		System.out.println("P# 트라이브 홈 화면_트라이브 입장 컨펍 팝업 [취소] 버튼 입력");
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View")
		.click(); 
		System.out.println("[사진 업로드하기(1장)] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		.click(); 
		System.out.println("[갤러리] 버튼 입력");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"버튼\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
		.click(); 
		System.out.println("이미지 선택");
		Thread.sleep(3000);

		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")
		.click(); 
		System.out.println("[사진 올리기)] 버튼 입력");
		Thread.sleep(4000);
		
		
		Set<String> contextNames2 = driver.get().getContextHandles();
		for (String contextName2 : contextNames2) {
		    System.out.println(contextName2); }
			
		driver.get().context((String) contextNames2.toArray()[1]);
		System.out.println("웹뷰 진입"); 
			
		MobileElement imagedone = driver.get().findElementByXPath("//*[@id=\"notification\"]/section/div[2]/div/div[2]/button");
		imagedone .click();
		System.out.println("미션 완료 팝업 입력"); 
			
		driver.get().context("NATIVE_APP");
		Thread.sleep(3000);
		
		
		driver.get().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button[2]")
		.click(); 
		System.out.println("우측 상단 [X] 버튼 입력");
		Thread.sleep(3000);
		

		driver.get().navigate().back();
		System.out.println("안드로이드 H/K Back");
		Thread.sleep(2000);
		
		
		MobileElement back = driver.get().findElementByAccessibilityId("Up button in TopBar");
		back.click();
		System.out.println("TopBar Back"); 
		Thread.sleep(2000);
		
		}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}