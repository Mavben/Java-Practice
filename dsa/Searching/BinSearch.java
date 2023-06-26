// 이진 검색(Binary Search)

package day02_Searching;

import java.util.Scanner;

public class BinSearch {
	
	// 이진 검색 메서드
	// 5. binSearch 메서드를 호출하여 이진 검색을 수행한다.
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 가장 왼쪽 인덱스 pl
		int pr = n - 1; // 가장 오른쪽 인덱스 pr
		
		do {
			int pc = (pl + pr) / 2; // 중간 인덱스
			
			if(a[pc] == key) // 중간 값과 검색할 값이 일치하면
				return pc; // 해당 인덱스 반환
			else if(a[pc] < key) // 중간 값이 검색할 값보다 작으면
				pl = pc + 1; // 왼쪽 범위를 업데이트하여 오른쪽 절반 탐색
			else
				pr = pc - 1; // 중간 값이 검색할 값보다 크면 오른쪽 범위를 업데이트하여 왼쪽 절반 탐색
		} while(pl  <= pr); // 탐색 범위가 역전되기 전까지 반복
		
		return -1; // 검색 실패 : 검색할 값이 배열에 존재하지 않으면 -1 반환
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		
		// 1. 요솟수(num)를 입력받는다. 사용자로부터 정수를 입력받아 해당 값을 변수 num에 저장하는 구문이다.
		int num = stdIn.nextInt();
		// 2. 크기가 num인 정수 배열 x를 생성한다.
		int[] x = new int[num];
		
		// 3. 배열을 오름차순으로 입력받는다.
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i = 0; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while(x[i] < x[i - 1]);
		}
		// 4. 검색할 값을 사용자로부터 입력받는다.
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}

}
