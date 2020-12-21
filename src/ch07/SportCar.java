package ch07;

public class SportCar extends Car {
	
	@Override
	public void speedUp() {
		speed = speed + 10;
	}
	
//	Car 클래스의 stop() 메서드가 final 을 사용하기 때문에 오버라이딩이 되지 않음
//	@Override
//	public void stop() {
//		
//	}
}
