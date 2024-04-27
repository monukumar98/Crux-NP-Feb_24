package Lec17;

public class Permutation_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (Conatins(ques, i + 1, ch)==true) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

	}

	public static boolean Conatins(String ques, int i, char ch) {

		for (int j = i; j < ques.length(); j++) {
			if (ques.charAt(j) == ch) {
				return false;
			}
		}
		return true;
	}

}
