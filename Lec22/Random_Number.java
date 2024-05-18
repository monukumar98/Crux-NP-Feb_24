package Lec22;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int si = 10;
//		int hi = 100;
//		Random rn = new Random();
//		for (int i = 0; i < 10; i++) {
//
//			int v = rn.nextInt(hi - si + 1) + si;
//			System.out.println(v);
//		}
		int si = 0;
		int hi = 9;
		Random rn = new Random();
		for (int i = 0; i < 6; i++) {

			int v = rn.nextInt(hi - si + 1) + si;
			System.out.print(v);
		}

	}

}
