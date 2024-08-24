package Lec42;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Min_Diff(boys, girls, 0, 0));
	}

	public static int Min_Diff(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 67879797;
		}
		int s = Math.abs(boys[i] - girls[j]) + Min_Diff(boys, girls, i + 1, j + 1);
		int r = Min_Diff(boys, girls, i, j + 1);
		return Math.min(s, r);

	}
}
