
  package appiumset;
  
  import java.net.MalformedURLException; import java.util.Set; import
  io.appium.java_client.MobileElement;
  
  
  public class _3_SignUp extends AppiumDriverManager { public static void
  SignUp() throws MalformedURLException, InterruptedException {
  
	  // @ 갤럭시 9에서 Context 전환하지 않으면 버튼 입력 되지 않아 전체 스크립트에 Context 변경 추가
		MobileElement kakao = driver.get().findElementByAccessibilityId("카카오로 시작하기 로고");
		kakao.click();
		System.out.println("카카오 클릭 완료");
		Thread.sleep(3000);              

		Set<String> contextNames = driver.get().getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); }
			
		driver.get().context((String) contextNames.toArray()[1]);
			System.out.println("웹뷰 진입"); 
			
			driver.get().findElementByXPath("//*[@id=\"mArticle\"]/div/div/div[2]/form/button")
			.click();
			System.out.println("카카오 계속하기 클릭 완료 ");
			Thread.sleep(3000);
			
			System.out.println("컨펌팝업 확인"); 
			
			driver.get().context("NATIVE_APP");
			Thread.sleep(3000);
		
  }
  }
  