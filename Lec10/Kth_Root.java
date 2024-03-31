package Lec10;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 189;
		int k = 4;
		System.out.println(Kth(n, k));

	}

	public static int Kth(int n, int k) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
