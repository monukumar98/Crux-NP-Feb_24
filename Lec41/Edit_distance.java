package Lec41;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "FOOD";
		String s2 = "MONEY";
		System.out.println(Min_Ops(s1, s2, 0, 0));

	}

	public static int Min_Ops(String s1, String s2, int i, int j) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = Min_Ops(s1, s2, i + 1, j + 1);
		} else {
			int D = Min_Ops(s1, s2, i + 1, j);
			int I = Min_Ops(s1, s2, i, j + 1);
			int R = Min_Ops(s1, s2, i + 1, j + 1);
			ans = 1 + Math.min(I, Math.min(D, R));
		}
		return ans;
	}
}
