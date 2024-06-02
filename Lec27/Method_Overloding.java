package Lec27;

public class Method_Overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(7, 8));
		System.out.println(add(7, 8, 9));
		System.out.println(add(7, 8, 78.9));
		System.out.println(add("hey", 2, 3, 4, 5, 6, 7, 8, 8, 9, 11, 12, 12, 3, 4));

	}

//	public static void add(int a, int b) {
//		System.out.println(a + b);
//	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(String s, int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
