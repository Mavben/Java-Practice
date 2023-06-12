package object;

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과:"	+ mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과:"	+ mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과:"	+ mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과:"	+ mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}
}

class MyMath3 {
	int add(int a, int b ) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.println("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) { 
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

/*
 	메서드 오버로딩(method overloading)
 		한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
 		
 		조건 :
 			1. 메서드 이름이 같아야 한다.
 			2. 매개변수의 개수 또는 타입이 달라야 한다.
 			3. 반환 타입은 상관 없다.
 			
*/