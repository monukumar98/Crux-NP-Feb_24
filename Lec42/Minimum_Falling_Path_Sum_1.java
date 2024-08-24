package Lec42;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -100000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, pathsum(arr, 0, i, dp));
		}
	}

	public static int pathsum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cc < 0 || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -100000000) {
			return dp[cr][cc];
		}
		int dl = pathsum(arr, cr + 1, cc - 1, dp);
		int dr = pathsum(arr, cr + 1, cc + 1, dp);
		int d = pathsum(arr, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(d, Math.min(dr, dl)) + arr[cr][cc];
	}
}





