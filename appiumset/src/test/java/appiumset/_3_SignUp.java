 package appiumset;
  
  import java.net.MalformedURLException; 
  import java.util.Set; 
  import io.appium.java_client.MobileElement;
  
  

  public class _3_SignUp extends AppiumDriverManager { 
	  public static void SignUp() throws MalformedURLException, InterruptedException {

  
		  System.out.println("<SignUp 진행>>");
	
		MobileElement kakao = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("카카오 클릭 완료");
		Thread.sleep(3000);              

	
		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			Thread.sleep(3000);
			driver.get().findElementByXPath("//*[@id=\"mArticle\"]/div/div/div[2]/form/button")
			.click();
			System.out.println("카카오 계속하기 클릭 완료 ");
			
			
			System.out.println("컨펌팝업 확인"); 
			
			driver.get().context("NATIVE_APP");
			Thread.sleep(3000);
			
	  }
  }
  
  