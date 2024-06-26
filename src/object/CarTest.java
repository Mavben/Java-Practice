package object;

class Car {
	String color;
	String gearType;
	int door;
	
	/* 생성자에서 다른 생성자를 호출하기 - this(), this
		1. 생성자의 이름으로 클래스이름 대신 this를 사용한다.
		2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
	*/
	
	Car(String color) {
		this(color, "auto", 4); // 
		door = 5;
	}
	
	Car() {}
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
		
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

	}
}
