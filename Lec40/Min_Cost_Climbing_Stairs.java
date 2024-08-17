package Lec40;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		System.out.println(minCost(arr));
	}

	public static int minCost(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = arr[1];
		for (int i = 2; i < dp.length; i++) {
			int f = dp[i - 1];
			int s = dp[i - 2];
			dp[i] = arr[i] + Math.min(f, s);
		}
		return Math.min(dp[dp.length - 2], dp[dp.length - 1]);

	}
}
