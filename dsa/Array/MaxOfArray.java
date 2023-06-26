// 배열에서 최댓값 구하기

package day01_Array;

import java.util.Scanner;

public class MaxOfArray {

	/*
		maxOf 메서드:
			이 메서드는 입력된 배열에서 최댓값을 찾아 반환하는 역할을 한다. 
	*/	
	static int maxOf(int[] a) {
		
		// 1. int 타입의 배열 a를 매개변수로 받는다.
		//    max 변수를 배열의 첫 번째 요소로 초기화한다.
		
		int max = a[0];
		// 2. 반복문을 사용하여 배열의 각 요소를 순회한다. 
		// 	  인덱스 i는 1부터 시작하여 배열의 끝까지 반복한다.
		
		for(int i = 1; i < a.length; i++)
			// 3. 반복문 내부에서 현재 요소 a[i]가 max보다 큰지 확인한다. 만약 그렇다면 max 값을 a[i]로 갱신한다.
			//	  반복문이 종료되면 최댓값인 max를 반환한다.
			
			if(a[i] > max)
				max = a[i];
		
		return max;
	}

	/*
	 	main 메서드:
			프로그램의 실행 진입점이다.
	*/
	public static void main(String[] args) {
		
		// 1. Scanner 클래스를 사용하여 사용자로부터 입력을 받기 위한 stdIn 객체를 생성한다.
		Scanner stdIn = new Scanner(System.in);
		
		// 2. 사용자에게 "키의 최댓값을 구합니다."라는 메시지를 출력한다.
		System.out.println("키의 최댓값을 구합니다.");
		
		// 3. 사용자로부터 사람 수를 입력받기 위해 "사람수: "를 출력하고, 입력된 값을 num 변수에 저장한다.
		System.out.print("사람수: ");
		int num = stdIn.nextInt();
		
		// 4. height라는 이름의 int 배열을 생성하고, 길이를 num으로 설정한다.
		int[] height = new int[num];
		
		// 5. 반복문을 사용하여 배열의 각 인덱스에 대해 사용자로부터 키 값을 입력받는다. 
		//	  입력된 값은 height 배열의 해당 인덱스에 저장된다.
		for(int i = 0; i < num; i++) {
			System.out.print("height[" + i + "]:");
			height[i] = stdIn.nextInt();
		}
		
		// 6. 최종적으로 "최댓값은 [최댓값]"이라는 메시지를 출력하여 찾은 최댓값을 보여준다. 
		//	  이때 maxOf 메서드를 호출하여 배열 height에서 최댓값을 구한다.
		System.out.println("최댓값은" + maxOf(height) + "입니다.");
	}		
}

