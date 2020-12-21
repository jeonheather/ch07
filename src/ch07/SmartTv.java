package ch07;

public class SmartTv extends Television {
	String url = "";
	
	void turnOnInternet() {
		System.out.println("웹서핑 시작");
	}
	
	void turnOffInternet() {
		System.out.println("웹서핑 종료");
	}
	
	void changeUrl(String url) {
		this.url = url;
		System.out.println("웹 사이트의 주소를 " + url + "으로 변경합니다.");
	}
	
	void turnOnYoutube() {
		System.out.println("유투브를 시작합니다.");
	}
	
	void turnOffYoutube() {
		System.out.println("유투브를 종료합니다.");
	}
}
