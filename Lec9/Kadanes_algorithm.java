package Lec9;

public class Kadanes_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -6, 4, -1, 7 };
		System.out.println(Max_Sum(arr));

	}

	public static int Max_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum += arr[i];
			ans = Math.max(ans, curr_sum);
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return ans;

	}

}
