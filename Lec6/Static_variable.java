package Lec6;

public class Static_variable {
	static int val = 100;

	public static void main(String[] args) {

		System.out.println("Hey");
		int a = 7;
		int b = 9;
//	int ans=Add(a, b);// Fun calling
//	System.out.println(ans);
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println(val);
		System.out.println("Bye");
	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val = 90;
		Static_variable.val = Static_variable.val - 5;
		return c;
	}

}
