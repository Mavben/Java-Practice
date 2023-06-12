package object;

class StaticBlockTest {

	static int[] arr = new int[10]; // 명시적 초기화를 통해 배열 arr을 생성한다.

	// 클래스 초기화 블럭 - 배열의 각 요소들을 random()을 사용해서 임의의 값으로 채우도록 한다.
	static {
		for(int i=0;i<arr.length;i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"] :" + arr[i]);
		}
	}
}

/*
	< 변수의 초기화 >
		변수를 선언하고 처음으로 값을 저장하는 것
        가능하면 선언과 동시에 적절한 값으로 초기화하는 것이 바람직하다.
           
		멤버변수는 초기화를 하지 않아도 변수의 자료형에 맞는 기본값으로 초기화가 이루어지므로 초기화하지 않아도 되지만,
		지역변수는 사용하기 전에 반드시 초기화해야 한다.

	< 멤버변수의 초기화 방법 >
		1. 명시적 초기화(explicit initialization) : 대입 연산자
		2. 생성자(constructor)
		3. 초기화 블럭(initialization block)
			- 인스턴스 초기화 블럭 : {}
			  ▶ 초기화순서 : 기본값 -> 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자
			- 클래스 초기화 블럭 : static {}
			  ▶ 초기화순서 : 기본값 -> 명시적초기화 -> 클래스 초기화 블럭
*/