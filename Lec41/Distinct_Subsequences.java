package Lec41;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String coin = "rabbbit";
		String amount = "rabbit";
		System.out.println(count_Subsequences(coin, amount, 0, 0));
	}

// i--> coin  j--> amount
	public static int count_Subsequences(String coin, String amount, int i, int j) {
		if (j == amount.length()) {
			return 1;
		}
		if (i == coin.length()) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (amount.charAt(j) == coin.charAt(i)) {
			inc = count_Subsequences(coin, amount, i + 1, j + 1);
		}
		exc = count_Subsequences(coin, amount, i + 1, j);
		return inc + exc;
	}
}
