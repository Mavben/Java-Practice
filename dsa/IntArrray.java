// Basic of Array

package day01_Array;

public class IntArrray {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
	}
}