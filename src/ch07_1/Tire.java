package ch07_1;

public class Tire {
	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
//	자손 클래스에서 super(매개변수, ...) 생성자를 통하여 호출되는 Tire 클래스의 부모
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumlatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크");
			return false;
		}
	}
}
