package Lec23;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 2, 1, 2 };
		int a=0;
		for (int i = 0; i < arr.length; i++) {
			a=a^arr[i];
		}
		System.out.println(a);
	}

}
