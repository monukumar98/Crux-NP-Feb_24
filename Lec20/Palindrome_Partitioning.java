package Lec20;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(str, ll,ans);
		System.out.println(ans);

	}

	public static void Partitioning(String str, List<String> ll,List<List<String>> ans ) {
		if (str.length() == 0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String s = str.substring(0, i);
			if (isPalindromic(s) == true) {
				ll.add(s);
				Partitioning(str.substring(i), ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

	public static boolean isPalindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
