package Lec12;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
		// row
		System.out.println(arr.length);
		// col;
		System.out.println(arr[0].length);

	}

}
