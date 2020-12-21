package ch07;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int r = 10;
//		
//		Calculator cal = new Calculator();
//		System.out.println("원 면적 : " + cal.areaCircle(r));
//		System.out.println();
//		
//		Computer com = new Computer();
//		System.out.println("원 면적 : " + com.areaCircle(r));
		
		Computer com = new Computer();
		
		com.plus(10, 20);
		com.minus(20, 10);
		com.multi(3, 10);
		com.divide(300, 10);
	}

}
