// 확장 for문

package day01_Array;

public class CloneArray {

	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		
		for(int i = 0; i < a.length; i++) 
			System.out.println("a[" + i + "] = " + a[i]);
		
		double sum = 0;
		
		// 확장 for문
		// 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔한다.
		for(double i: a)
			sum += i;
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}
