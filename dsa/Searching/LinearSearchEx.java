package day02_Searching;

public class LinearSearchEx {

	// linearSearch 메서드는 숫자들이 들어있는 배열에서 특정한 숫자를 찾는 메서드입니다. 
	// 이 메서드는 int[] arr과 int target이라는 두 개의 입력값을 받습니다.
	
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return 1;
			}
		}
		return -1;
	}
	
	/*
	 	main 메서드는 Java 프로그램의 진입점(entry point)입니다. 프로그램이 실행되면 가장 먼저 main 메서드가 호출됩니다.
		main 메서드에서는 검색 대상 배열(arr), 검색할 값(target)을 설정하고, linearSearch 메서드를 호출하여 검색을 수행합니다.
		검색 결과(index)에 따라 적절한 메시지를 출력합니다.
	*/
	
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 7, 4};
		
		int target = 7;
		
		int index = linearSearch(arr, target);
		if(index != -1) {
			System.out.println("값이 배열의 인덱스 " + index + "에 있습니다.");
		} else {
        System.out.println("값이 배열에 없습니다.");
		
		}
	}
}
