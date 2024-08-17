package Lec41;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[coin.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coin, amount, 0, dp));
	}

	public static int Coin_ChangeBU(int[] coin, int amount) {
		int[][] dp = new int[coin.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {// row
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {// coin
			for (int am = 1; am < dp[0].length; am++) {// amount
				int c = coin[i - 1];// c coin ka value hai
				int inc = 0, exc = 0;
				if (am >= c) {
					inc = dp[i][am - c];
				}
				exc = dp[i - 1][am];
				dp[i][am] = inc + exc;

			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

	public static int Coin_Change(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[idx][amount] != -1) {
			return dp[idx][amount];
		}
		int inc = 0, exc = 0;
		if (amount >= coin[idx]) {
			inc = Coin_Change(coin, amount - coin[idx], idx, dp);
		}
		exc = Coin_Change(coin, amount, idx + 1, dp);
		return dp[idx][amount] = inc + exc;
	}

}
