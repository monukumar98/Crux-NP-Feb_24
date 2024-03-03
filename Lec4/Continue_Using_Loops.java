package Lec4;

public class Continue_Using_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 5; i++) {
//			if (i == 2) {
//				continue;
//			}
//			System.out.println(i);
//		}
		int i = 1;
		while (i <= 5) {

			if (i == 2) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
