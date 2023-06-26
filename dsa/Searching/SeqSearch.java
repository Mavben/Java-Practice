// 선형 검색(Linear Search)

package day02_Searching;

import java.util.Scanner;

public class SeqSearch {
	
	// seqSearch 메서드는 배열 a, 배열의 길이 n, 찾을 값 key를 매개변수로 받습니다.
	static int seqSearch(int[] a, int n, int key) {
		
		// 배열의 인덱스를 나타내는 변수입니다. 초기값은 0입니다.
		int i = 0;
		
	/* 
		while 루프를 사용하여 선형 검색을 수행합니다:
			i가 n과 같아지면 검색 실패로 -1을 반환합니다.
			a[i]가 key와 같으면 해당 인덱스 i를 반환합니다.
			i를 1 증가시킵니다.
	*/
		while(true) {
			if(i == n) 
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}
	}

	// main 메서드는 프로그램의 진입점입니다.
	public static void main(String[] args) {
		
		// Scanner 클래스를 사용하여 사용자로부터 입력을 받을 stdIn 객체를 생성합니다.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		
	/* 
		 변수 및 배열 초기화 : 
			num: 요솟수를 저장하는 변수입니다.
			x: 입력된 요솟값을 저장하는 배열입니다.
	*/
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		// seqSearch 메서드를 호출하여 배열 x, 요솟수 num, 검색할 값 ky를 전달하고, 반환된 결과를 idx에 저장합니다.
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}
