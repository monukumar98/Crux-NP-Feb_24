package Lec13;

public class Length_Wise_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}

	}

}
