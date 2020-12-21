package ch07;

// CellPhone 클래스를 상속 받음 
public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
//	부모 클래스인 CellPhone 에서 상속받은 메서드, 상속받은 메서드는 이미 구현되어 있기 때문에 자식 클래스가 구현
//	할 필요가 없음
	
//	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
