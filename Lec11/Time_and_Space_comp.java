package Lec11;

public class Time_and_Space_comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 897979;
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);

//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)

			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// O(log(N))
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N))
			n /= 2;
		}
	}

}







