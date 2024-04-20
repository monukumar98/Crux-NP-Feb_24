package Lec15;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 6, 3, 5, 3, 7 };
		int item = 3;
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item, int i) {
		if (arr.length == i) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return Index(arr, item, i + 1);
	}

}
