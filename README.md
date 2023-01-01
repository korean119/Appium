# 유용하게 사용 되는 명령어 및 정보 

< Webview 디버깅 >   
chrome://inspect  
  
< wireless 설치 방법 >  
cmd 실행  
//포트 추가  
adb tcpip 5555  
//와이파이ip주소:포트번호 연결  
adb connect 192.168.0.130:5555  
//코드에 추가  
cap.setCapability("udid", "192.168.0.130:5555");  
  
< Device 변경으로 연결 되지 않을 때  >  
adb uninstall io.appium.uiautomator2.server  
adb uninstall io.appium.uiautomator2.server.test  

* 아래 이슈의 주범  
  org.openqa.selenium.WebDriverException: Connection refused: no further information  
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'  
System info: host: 'DESKTOP-H9VDVB7', ip: '192.168.0.83', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '17.0.4.1'  
Driver info: driver.version: AppiumDriver  
