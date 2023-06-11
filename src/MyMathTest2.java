package object;

class MyMath2 {
	long a, b;
	
	long add() 		{ return a + b; } // a,b는 인스턴스변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	static long		add(long a, long b) { return a + b; } // a,b는 지역변수
	static long		subtract(long a, long b)   { return a - b; }
	static long		multiply(long a, long b)   { return a * b; }
	static double	divide(double a, double b) { return a / b; }
}

class MyMathTest2 {

	public static void main(String[] args) {
		// 클래스 메서드는 인스턴스 생성 없이 클래스이름.메서드이름으로 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.add(200L, 100L));
		
		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메서드는 객체생성 후에만 호출 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}

/*	
	< 인스턴스메서드 >
		인스턴스 생성 후 '참조변수.메서드이름()'으로 호출
		인스턴스 멤버와 관련된 작업 메서드
		메서드 내에서 인스턴스변수 사용 가능

	< static메서드 >
		객체 생성 없이 '클래스이름.메서드이름()'으로 호출
		인스턴스 멤버와 관련 없는 작업
		메서드 내에서 인스턴스변수 사용 불가
*/