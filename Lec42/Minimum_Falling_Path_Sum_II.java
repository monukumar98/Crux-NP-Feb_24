package Lec42;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
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
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -100000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < arr[0].length; col++) {
			if (col == cc) {
				continue;
			}
			ans = Math.min(ans, pathsum(arr, cr + 1, col, dp));
		}
		return dp[cr][cc]=ans + arr[cr][cc];

	}

}
