package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire ();
		myCar.backRightTire = new KumhoTire ();
		
		myCar.run();

	}

}
