package day01_Array;

import java.util.Scanner;

/*
 * cardConv 메서드:
		cardConv 메서드는 정수 x, 기수 r, 문자 배열 d를 매개변수로 받습니다.
	메서드 내에서 사용되는 변수와 기능은 다음과 같습니다:
		digits: 변환된 숫자의 자릿수를 저장하는 변수입니다.
		dchar: 각 자릿수에 대응하는 문자를 저장한 문자열입니다. 예를 들어, dchar.charAt(0)은 0에 대응하는 문자 '0'을 반환합니다.

	do-while 루프를 사용하여 변환 작업을 수행합니다:
	x를 r로 나눈 나머지에 해당하는 문자를 d 배열에 저장합니다.
	x를 r로 나눈 몫으로 갱신합니다.
	x가 0이 아닐 때까지 위 과정을 반복합니다.
	for 루프를 사용하여 d 배열의 요소를 역순으로 정렬합니다.
	변환된 숫자의 자릿수인 digits를 반환합니다.
	
	main 메서드:
		main 메서드는 프로그램의 진입점입니다.

	Scanner 클래스를 사용하여 사용자로부터 입력을 받을 stdIn 객체를 생성합니다.

	변수와 배열 초기화:
		no: 변환할 음이 아닌 정수를 저장하는 변수입니다.
		cd: 변환할 진수를 저장하는 변수입니다.
		dno: 변환된 숫자의 자릿수를 저장하는 변수입니다.
		retry: 프로그램을 다시 실행할지 여부를 저장하는 변수입니다.
		cno: 변환된 숫자를 저장할 문자 배열입니다.

	프로그램의 동작:
		"10진수를 기수 변환합니다."를 출력합니다.

		do-while 루프를 사용하여 변환 작업을 반복합니다:
			do-while 루프를 사용하여 음이 아닌 정수를 입력받습니다. 입력한 값이 0보다 작으면 다시 입력을 요청합니다.
			do-while 루프를 사용하여 변환할 진수를 입력받습니다. 입력한 값이 2보다 작거나 36보다 크면 다시 입력을 요청합니다.
			cardConv 메서드를 호출하여 no를 cd 진수로 변환하고, 변환된 자릿수를 dno에 저장하고, 변환된 숫자를 cno 배열에 저장합니다.
			변환 결과를 출력합니다.
			"한 번 더 할까요? (1. 예/0. 아니요): "를 출력하고, 1 또는 0을 입력받아 retry 변수에 저장합니다.

		사용자가 1을 입력하면 프로그램을 다시 실행하고, 0을 입력하면 프로그램을 종료합니다.
 */

public class CardConv {
	
	static int cardConv(int x, int r, char[] d) {
	
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				 System.out.print("어떤 진수로 변환할까요? (2-36): ");
				    cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로 ");
			for(int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1. 예/0. 아니요): ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
