package ch07;

public class Television {
	
	int channel;
	int volume;
//	final : 초기화 이후 절대 변경되지 않는 변수
//	최대 및 최소 값 지정
	final int MaxChannel = 15;
	final int MinChannel = 1;
	final int MaxVolume = 25;
	final int MinVolume = 0;

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		if(channel > 15) {
			this.channel = 1;
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
		else if(channel < 1) {
			this.channel = 15;
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
		else {
			System.out.println(channel + "번 채널로 변경합니다.");
		}
	}
	
//	채널을 최대 채널보다 크게 되면 최소 채널로 변경
	void channelUp() {
		channel++;
		if(channel > 15) {
			this.channel = 1;
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}
	}
	
	void channelDown() {
		channel--;
		if(channel < 1) {
			this.channel = 15;
			System.out.println(this.channel + "번 채널로 변경합니다.");
		}	
	}
	
	void changeVolume(int volume) {
		this.volume = volume;
		if(this.volume > 25) {
			this.volume = 25;
			System.out.println("최대 볼륨입니다.\n현재 볼륨 " + this.volume);
		}
		else if(this.volume < 0) {
			this.volume = 0;
			System.out.println("최소 볼륨입니다.\n현재 볼륨 " + this.volume);
		}
		else {
			System.out.println("\n현재 볼륨 " + volume);
		}
	}
	
	void volumeUp() {
		volume++;
		if(volume > 25) {
			this.volume = 25;
			System.out.println("최대 볼륨입니다.\n현재 볼륨 " + volume);
		}
		else { 
			System.out.println("볼륨을 1 올립니다.\n현재 볼륨 " + volume);
		}
	}
	
	void volumeDown() {
		volume--;
		if(volume < 0) {
			this.volume = 0;
			System.out.println("최소 볼륨입니다.\n현재 볼륨 " + volume);
		}
		else {
			System.out.println("볼륨을 1 내립니다.\n현재 볼륨 " + volume);
		}
	}
}

















