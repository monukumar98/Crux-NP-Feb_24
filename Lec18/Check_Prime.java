package Lec18;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean check(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}

			div++;
		}
		return true;

	}
}
