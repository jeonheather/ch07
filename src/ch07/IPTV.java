package ch07;

public class IPTV extends Television {
	//문제1 Television 클래스를 상속받아 IpTV라는 클래스를 생성하고, IPtv 고유의 기능으로 VOD 채널을 볼 수 있는 프로그램 작성
	// 조건1 VOD 채널을 저장하는 멤버 변수 필요
	// 조건2 VOD 채널을 변경하는 메서드 필요
	
	
	
	
	String url= "";
//	IPTV의 멤버 변수
	int vodChannel;
	
//	생성자를 사용하여 기본값 입력
//	
//	IPTV(){
//		vodChannel = 101;
//		channel = 1;
//		volume = 0;
//	}
//	
//	void changeVodChannel (int vodChannel) {
//		
//		void vodChannelUp() {
//			if (vodChannel < 100 || vodChannel > 200) {
//				vodChannel = 101;
//				System.out.println("vod 채널을 101번으로 변경합니다.");
//			}
//		
//			else {
//				vodChannel++;
//				System.out.println("vod채널을 " + vodChannel + "번으로 변경합니다.");
//			}
//		}	
//		
//	
//		void vodChannelDown( ) {
//			if (vodChannel < 100 || vodChannel > 200) {
//				vodChannel = 199;
//				System.out.println("vod 채널을 199번으로 변경합니다.");
//			}
//		
//			else {
//				vodChannel++;
//				System.out.println("vod채널을 " + vodChannel + "번으로 변경합니다.");
//				
//		}
//	}
//
//			

	
	void turnOnMovie() {
		System.out.println("영화채널을 켭니다.");
	}
	
	void turnOffMovie() {
		System.out.println("영화채널을 끕니다.");
	}
	
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
	
	void turnOnNetflix() {
		System.out.println("넷플릭스를 켭니다.");
	}
	
	void turnOffNetflix() {
		System.out.println("넷플릭스를 끕니다.");
	}
}
