package object;

class Data1 {
	int value;
	Data1() {}
}

class Data2 {
	int value;
	
	Data2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(0);

	}
}