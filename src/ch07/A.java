package ch07;

public class A {
//	protected 를 상용하면 상속 받은 객체만 사용할수 있음(외부 패키지에서는 사용할수 없음)
//	접근 제어자가 protected로 적용된 멤버 변수
	protected String field;

//	접근 제어자가 protected로 적용된 생성자
	protected A() {
		
	}
	
//	접근 제어자가 protected로 적용된 멤버 메서드
	protected void method() {
		
	}
}
