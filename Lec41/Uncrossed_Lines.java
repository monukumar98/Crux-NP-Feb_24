package Lec41;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 7, 1, 7, 5 };
		int[] arr2 = { 1, 9, 2, 5, 1 };
		System.out.println(LCSBU(arr1, arr2));

	}

	public static int LCSBU(int[] text1, int[] text2) {
		int[][] dp = new int[text2.length + 1][text1.length + 1];
		for (int i = 1; i < dp.length; i++) {// text2
			for (int j = 1; j < dp[0].length; j++) {// text1
				if (text1[j - 1] == text2[i - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];// up
					int s = dp[i][j - 1];// left
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}
}
