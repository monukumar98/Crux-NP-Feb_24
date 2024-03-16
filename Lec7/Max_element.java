package Lec7;

public class Max_element {
	public static void main(String[] args) {
		// Integer.MAX_VALUE--> 2^31 -1
		int[] arr = { 1, 34, 56, 78, 11, -7, 90 };
		System.out.println(Max1(arr));

	}

	public static int Max2(int[] arr) {
		int max = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			max =Math.max(max, arr[i]);
		}
		return max;
	}

	public static int Max1(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}
}
