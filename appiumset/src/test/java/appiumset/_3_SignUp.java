/*
 * package appiumset;
 * 
 * import java.net.MalformedURLException; import java.util.Set; import
 * io.appium.java_client.MobileElement;
 * 
 * 
 * public class _3_SignUp extends _0_Automation_Main { public static void
 * SignUp() throws MalformedURLException, InterruptedException {
 * 
 * System.out.println("<< Sing UP 진행>>");
 * 
 * MobileElement kakao =
 * driver.get().findElementByAccessibilityId("카카오로 시작하기 로고"); kakao.click();
 * System.out.println("카카오 클릭 완료"); Thread.sleep(3000);
 * 
 * driver.get().
 * findElementsByXPath("//a[contains(@aria-labelby, 'lbl-agree-all'");
 * System.out.println("전체 동의하기 선택");
 * 
 * Set<String> contextNames = driver.get().getContextHandles(); for (String
 * contextName : contextNames) { System.out.println(contextName); }
 * 
 * driver.get().context((String) contextNames.toArray()[1]);
 * System.out.println("웹뷰 진입");
 * 
 * driver.get().
 * findElementsByXPath("//a[contains(@aria-labelby, 'lbl-agree-all'");
 * System.out.println("전체 동의하기 선택");
 * 
 * driver.get().findElementByCssSelector("#acceptButton");
 * System.out.println("이거 되니,,,?");
 * 
 * Thread.sleep(3000);
 * 
 * System.out.println("컨펌팝업 확인");
 * 
 * driver.get().context("NATIVE_APP"); Thread.sleep(3000);
 * 
 * 
 * MobileElement kakao = driver.findElementByAccessibilityId("카카오로 시작하기 로고");
 * kakao.click(); System.out.println("카카오 클릭 완료");
 * 
 * 
 * }
 * 
 * }
 */
