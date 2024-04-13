package Lec13;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    the sky   is       blue       ";
		System.out.println(s);
		System.out.println(Reverse(s));

	}

	public static String Reverse(String s) {

		s = s.trim();
		String[] a = s.split("\s+");
		// System.out.println(Arrays.toString(a));
		String ans = "";
		for (int i = a.length - 1; i >= 0; i--) {
			ans = ans + a[i] + " ";
		}
		return ans.trim();

	}

}
