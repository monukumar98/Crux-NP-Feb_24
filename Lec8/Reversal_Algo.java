package Lec8;

public class Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int k = 3;
		Rotate(arr, k);
	}

	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
	}

}
