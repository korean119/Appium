 package appiumset;
  
  import java.net.MalformedURLException; 
  import java.util.Set; 
  import io.appium.java_client.MobileElement;
  
  

  public class _3_SignUp extends AppiumDriverManager { 
	  public static void SignUp() throws MalformedURLException, InterruptedException {

		  System.out.println("<SignUp 진행>>");
		  
	
		MobileElement kakao = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("P# 로그인&회원가입 화면_[카카오 시작하기 로고] 버튼 입력");
		Thread.sleep(3000);              

	
		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
			System.out.println("S# Context WebView로 변경"); 
			Thread.sleep(3000);
			driver.get().findElementByXPath("//*[@id=\"mArticle\"]/div/div/div[2]/form/button")
			.click();
			System.out.println("P# 로그인&회원가입 화면_[카카오 계속하기 클릭] 버튼 입력");

			driver.get().context("NATIVE_APP");
			System.out.println("S# Context NATIVE로 변경"); 
			Thread.sleep(3000);
			
	  }
  }
  
  