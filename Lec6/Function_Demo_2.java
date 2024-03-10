package Lec6;

public class Function_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 7;
		int b = 9;
//		int ans=Add(a, b);// Fun calling
//		System.out.println(ans);
		System.out.println(Add(a, b));
		System.out.println("Bye");
	}

	public static int Add(int a, int b) {
		int c = a + b;

		return c - sub(b, c);
	}

	public static int sub(int a, int b) {
		int c = a - b;

		return c;
	}

}
