package Lec17;

public class Count_Seqsequnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+count(ques, ""));
		// System.out.println(c);

	}

//	static int c = 0;
	public static int count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x=count(ques.substring(1), ans);
		int y=count(ques.substring(1), ans + ch);
		return x+y;

	}
//	public static void count(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.println(ans);
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		count(ques.substring(1), ans);
//		count(ques.substring(1), ans + ch);
//
//	}

}
