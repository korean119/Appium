# Qa


< wireless 설치 방법 >  
cmd 실행  
//포트 추가  
adb tcpip 5555  
//와이파이ip주소:포트번호 연결  
adb connect 192.168.0.130:5555  
//자바 코드에 추가  
cap.setCapability("udid", "192.168.0.130:5555");  
  
