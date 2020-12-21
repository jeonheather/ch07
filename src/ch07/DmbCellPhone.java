package ch07;
// CellPhone 클래스를 상속받음
public class DmbCellPhone extends CellPhone {
	//DmbCellPhone에는 model, color 멤버 변수가 존재하지 않음
	//멤버변수 model과 color는 CellPhone 클래스에서 상속받아 DmbCellPhone 클래스
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다,.");
	
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
