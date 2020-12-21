package ch07;

public class IPTV extends Television {
//	문제1 ) Television 클래스를 상속받아 IPTV라는 클래스를 생성하고, IPTV 고유의 기능으로 VOD 채널을
//	볼수있는 프로그램을 작성하세요.
//	조건 1. VOD 채널을 저장하는 멤버 변수 필요
//	조건 2. VOD 채널을 변경하는 메서드 필요
	String VOD;
	int VODChannel;
	
	void turnOnVOD() {
		System.out.println("VOD를 켭니다.");
	}
	
	void changeVODChannel(int VODChannel) {
		this.VODChannel = VODChannel;
		VODChannel++;
		System.out.println("VODChannel " + VODChannel + "번 채널로 변경합니다.");
	}
	
	void VODChannelUP() {
		this.VODChannel = VODChannel;
		VODChannel++;
		System.out.println("VODChannel " + VODChannel + "번 채널로 변경합니다.");
	}
	
	void VODChannelDown() {
		this.VODChannel = VODChannel;
		VODChannel--;
		System.out.println("VODChannel " + VODChannel + "번 채널로 변경합니다.");
	}
	
	void turnOffVOD() {
		System.out.println("VOD를 끕니다.");
	}
	
}
