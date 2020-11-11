package org.springframework.samples.petclinic;

public class Car {

	int x;

	protected Car(int y) {
		x = y;
	}

	String Volvo = "Volvo";

	String Audi = "Audi";

	String Toyota = "Toyota";

	static void Method(String a) {
		System.out.println("인자는 : " + a + "입니다");
	}

	public void fullexcel() {
		System.out.println("풀악셀 발동");
	}

	public void speed(int maxSpeed) {
		System.out.println("최고 속력 : " + maxSpeed);
	}

}
