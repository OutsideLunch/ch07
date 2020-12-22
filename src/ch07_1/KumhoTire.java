package ch07_1;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire의 수명 : " + (maxRotation - accumlatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
